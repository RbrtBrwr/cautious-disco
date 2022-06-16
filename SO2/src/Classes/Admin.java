/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ponsa
 */
public class Admin extends Thread{
    
    //
    
    private final Skynet jarvis;
    private final Queue level1;
    private final Queue level2;
    private final Queue level3;
    private final Queue reinforce;
    private boolean flag;
    
    public Admin(Skynet jarvis, Queue level1, Queue level2, Queue level3, Queue reinforce){
        this.jarvis = jarvis;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.reinforce = reinforce;
        this.flag = false;
    }
    
    public void checkQueue(Queue queue){
        while(!queue.isEmpty()){
            if(jarvis.getPhone1() != null){
                jarvis.setPhone1(queue.DQ());
            } else{
                jarvis.setPhone2(queue.DQ());
                this.flag = true;
                break;
            }
        } 
    }
    
    public void checkQueues(){
        checkQueue(this.level1);
        if(this.flag){
            this.flag = false;
            return;
        }
        checkQueue(this.level2);
        if(this.flag){
            this.flag = false;
            return;
        }
        checkQueue(this.level3);
        
    }
    
    
    //Encolar en cola nivel 1, nivel 2 o nivel 3
    public void queuePhone(Phone phone){
        if (phone.getTrophies() <= 1999) {
            this.level3.NQ(phone);
        } else if (phone.getTrophies() > 1999 && phone.getTrophies() < 3000){
            this.level2.NQ(phone);
        } else {
            this.level1.NQ(phone);
        }
    }
    
    //Encolar en refuerzo
    public void queueReinforce(Phone phone){
        this.reinforce.NQ(phone);
    }
    
    @Override
    public void run(){
        while(true){
           checkQueues();
        }
    }
    
}
