/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author rober
 */
public class Phone {
    private final String model;
    private final String ID = makeUniqueID();
    private int trophyCount = 0;
    private int epic = 0;
    private int rare = 0;
    private int normal = 0;
    private int power;
    
    final double SCREEN_FAIL = 0.75;
    final double PIN_FAIL = 0.84;
    final double CAMERA_FAIL = 0.80;
    final double BUTTON_FAIL = 0.85;
    
    Phone(String model){
        this.model = model;
 
        calculateTrophies();
        calculateCards();
        calculatePower();
    }
    
    private void calculateTrophies(){
        switch(this.model){
            case "Xperia Pro-I":
                for (int i = 0; i < 4; i++){
                    if (Math.random() < CAMERA_FAIL){
                        this.trophyCount += 360;
                    }
                }
                for (int i = 0; i < 2; i++){
                    if (Math.random() < SCREEN_FAIL){
                        this.trophyCount += 360;
                    }
                }
                for (int i = 0; i < 3; i++){
                    if (Math.random() < BUTTON_FAIL){
                        this.trophyCount += 360;
                    }
                }
                if (Math.random() < PIN_FAIL){
                    this.trophyCount += 360;
                }
                break;
               
                
            case "Xperia 10 III":
                for (int i = 0; i < 2; i++){
                    if (Math.random() < CAMERA_FAIL){
                        this.trophyCount += 600;
                    }
                }
                
                if (Math.random() < SCREEN_FAIL){
                    this.trophyCount += 600;
                }
                
                for (int i = 0; i < 2; i++){
                    if (Math.random() < BUTTON_FAIL){
                        this.trophyCount += 600;
                    }
                }
                
                if (Math.random() < PIN_FAIL){
                    this.trophyCount += 600;
                }
                break;

            default:
                for (int i = 0; i < 2; i++){
                    if (Math.random() < CAMERA_FAIL){
                        this.trophyCount += 600;
                    }
                }
                
                if (Math.random() < SCREEN_FAIL){
                    this.trophyCount += 600;
                }
                
                for (int i = 0; i < 2; i++){
                    if (Math.random() < BUTTON_FAIL){
                        this.trophyCount += 600;
                    }
                }
                
                if (Math.random() < PIN_FAIL){
                    this.trophyCount += 600;
                }
                break;
        }
    }
    
    private void calculateCards(){
        for (int i = 0; i < 8; i++){
            double prob = Math.random();
            if (prob > 0.85 && epic < 4){
                this.epic++;
            } else if (prob > 0.50 && rare < 5){
                this.rare++;
            } else {
                this.normal++;
            }
        }
    }
    
    private void calculatePower(){
        this.power = 3 * epic + 2 * rare + normal;
    }
    
    public int getPower(){
        return this.power;
    }
    
    public int getTrophies(){
        return this.trophyCount;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void promote(){
        this.trophyCount += 1000;
    }
     
    private String makeUniqueID(){
        String id = "";
        for (int i = 0; i < 4; i++){
            id += (int)(Math.random() * 10);
        }
        return id;
    }

    public int getPriority() {
        if (this.trophyCount > 2999){
            return 1;
        } else if (this.trophyCount > 1999){
            return 2;
        } else {
            return 3;
        } 
    }
}
