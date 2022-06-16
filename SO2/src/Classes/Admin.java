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
    
    //
    
    private final Skynet jarvis;
    private final Queue level1Plant1;
    private final Queue level1Plant2;
    private final Queue level2Plant1;
    private final Queue level2Plant2;
    private final Queue level3Plant1;
    private final Queue level3Plant2;
    private final Queue plant1Reinforce;
    private final Queue plant2Reinforce;
    private boolean flag;
    
    public Admin(Skynet jarvis, Queue level1Plant1, Queue level1Plant2, Queue level2Plant1, Queue level2Plant2, Queue level3Plant1, Queue level3Plant2, Queue plant1Reinforce, Queue plant2Reinforce){
        this.jarvis = jarvis;
        this.level1Plant1 = level1Plant1;
        this.level1Plant2 = level1Plant2;
        this.level2Plant1 = level2Plant1;
        this.level2Plant2 = level2Plant2;
        this.level3Plant1 = level3Plant1;
        this.level3Plant2 = level3Plant2;
        this.plant1Reinforce = plant1Reinforce;
        this.plant2Reinforce = plant2Reinforce;
        this.flag = false;
    }
    
    
    //Encolar en cola nivel 1, nivel 2 o nivel 3
    public void queuePhone(Phone phone){
        if(phone.getModel() == "Xperia Pro-I"){
        if (phone.getTrophies() <= 1999) {
            this.level3Plant1.NQ(phone);
        } else if (phone.getTrophies() > 1999 && phone.getTrophies() < 3000){
            this.level2Plant1.NQ(phone);
        } else {
            this.level1Plant1.NQ(phone);
        }
        } else{
            if (phone.getTrophies() <= 1999) {
            this.level3Plant2.NQ(phone);
        } else if (phone.getTrophies() > 1999 && phone.getTrophies() < 3000){
            this.level2Plant2.NQ(phone);
        } else {
            this.level1Plant2.NQ(phone);
        }
        }
    }
    
    //Chequear cola nivel 2 planta1
    public void checkQueue2Plant1(Queue queue){
        if(queue.getHeadCounter() == 8){
            this.level1Plant1.NQ(queue.DQ());
        }
    }
    
    //Chequear cola nivel 2 planta 2
    public void checkQueue2Plant2(Queue queue){
        if(queue.getHeadCounter() == 8){
            this.level1Plant2.NQ(queue.DQ());
        }
    }
    
    //Chequear cola nivel 3 planta 1
    public void checkQueue3Plant1(Queue queue){
        if(queue.getHeadCounter() == 8){
            this.level2Plant1.NQ(queue.DQ());
        }
    }
    
    //Chequear cola nivel 3 planta 2
    public void checkQueue3Plant2(Queue queue){
        if(queue.getHeadCounter() == 8){
            this.level2Plant2.NQ(queue.DQ());
        }
    }

    public void updateQueues(Queue queue2Plant1, Queue queue2Plant2, Queue queue3Plant1, Queue queue3Plant2){
        checkQueue2Plant1(queue2Plant1);
        checkQueue2Plant2(queue2Plant2);
        checkQueue3Plant1(queue3Plant1);
        checkQueue3Plant2(queue3Plant2);
        
    }
    
}
