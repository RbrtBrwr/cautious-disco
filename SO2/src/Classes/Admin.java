/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ponsa
 */
public class Admin{

    private final Planta planta1;
    private final Planta planta2;
    private final Queue marketReady;
    private int tracker = 0;
    private int productionCounter = 0;
    
    public Admin(){
        this.planta1 = new Planta();
        this.planta2 = new Planta();
        this.marketReady = new Queue();
        startingPhones();
    }

    public Phone[] getPhones(){
        Phone[] phones = new Phone[2];
        phones[0] = this.planta1.getPhone();
        phones[1] = this.planta2.getPhone();
        
        System.out.println("======================" + tracker + "========================");
        tracker++;

        planta1.updateQueues();
        planta2.updateQueues();


        Main.interfaz.updateQueues(planta1, planta2);
        productionCounter++;
        if (productionCounter == 1){
            productionCounter = 0;
            
            if (Math.random() <= .70){
                newPhones();
                System.out.println("cree telefonos");
            } else {
                System.out.println("no cree nada");
            }
        }
        if (phones[0] == null || phones[1] == null){
            System.out.println("NO HAY TELEFONOS LASKDUJFHLKUIASJDHFJKLASDHFJKLHK");
            return getPhones();
        } else {
            return phones;   
        }

    }

    public void registerWinner(Phone phone){
        this.marketReady.NQ(phone);
    }

    public void reinforce(Phone phone1, Phone phone2){
        if (phone1.getModel() == "Xperia Pro-I"){
            this.planta1.reinforcePhone(phone1);
            this.planta2.reinforcePhone(phone2);
        }
        else{
            this.planta1.reinforcePhone(phone2);
            this.planta2.reinforcePhone(phone1);
        }
    }

    public void draw(Phone phone1, Phone phone2){
        if (phone1.getModel() == "Xperia Pro-I"){
            this.planta1.queuePhone(phone1);
            this.planta2.queuePhone(phone2);
        }
        else{
            this.planta1.queuePhone(phone2);
            this.planta2.queuePhone(phone1);
        }
    }

    public void startingPhones(){
        for (int i = 0; i < 2; i++){
            this.planta1.queuePhone(new Phone("Xperia Pro-I"));
            this.planta2.queuePhone(new Phone("Xperia 10 III"));
        }
    }

    public void newPhones(){

        this.planta1.queuePhone(new Phone("Xperia Pro-I"));
        this.planta2.queuePhone(new Phone("Xperia 10 III"));

    }
}
