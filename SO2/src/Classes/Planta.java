/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author rober
 */
public class Planta {
    private final Queue priority1;
    private final Queue priority2;
    private final Queue priority3;
    private final Queue reinforce;


    Planta(){
        this.priority1 = new Queue();
        this.priority2 = new Queue();
        this.priority3 = new Queue();
        this.reinforce = new Queue();
    }

    public Phone getPhone(){
        // Si la cola de prioridad mas alta tiene telefonos, updateo los counters de las de menor prioridad y retorno el telefono
        if (!this.priority1.isEmpty()){
            this.priority2.updateHeadCounter();
            this.priority3.updateHeadCounter();
            return this.priority1.DQ();
        } else if (!this.priority2.isEmpty()){
            this.priority3.updateHeadCounter();
            return this.priority2.DQ();
        // } else if (!this.priority3.isEmpty()){
        } else {
            return this.priority3.DQ();
        }
        // Aqui me podria retornar null si todos los telefonos estan en la cola de reinforce, pero no se si es necesario hacer algo al respecto
    }
    
    //Encolar en cola nivel 1, nivel 2 o nivel 3
    public void queuePhone(Phone phone){
        switch (phone.getPriority()){
            case 1:
                this.priority1.NQ(phone);
                break;
            case 2:
                this.priority2.NQ(phone);
                break;
            case 3:
                this.priority3.NQ(phone);
                break;
        }
    }

    public void reinforcePhone(Phone phone){
        this.reinforce.NQ(phone);
    }

    public void updateQueues(){
        Phone temp;
        if (this.priority2.getHeadCounter() >= 8){
            temp = this.priority2.DQ();
            this.priority2.resetHeadCounter();
            temp.promote();
            this.queuePhone(temp);
        }

        if (this.priority3.getHeadCounter() >= 8){
            temp = this.priority3.DQ();
            this.priority3.resetHeadCounter();
            temp.promote();
            this.queuePhone(temp);
        }

        if (Math.random() < 0.4){
            if (!this.reinforce.isEmpty()){
                temp = this.reinforce.DQ();
                this.queuePhone(temp);
            }
        }
        
        checkAll();
    }

    public void checkAll(){
        System.out.println("Priority 1");
        this.priority1.checkOut();
        System.out.println("\nPriority 2");
        this.priority2.checkOut();
        System.out.println("\nPriority 3");
        this.priority3.checkOut();
        System.out.println("\nReinforce");
        this.reinforce.checkOut();
    }
    
    public String get1(){
        return this.priority1.getOut();
    }
    public String get2(){
        return this.priority2.getOut();
    }
    public String get3(){
        return this.priority3.getOut();
    }
    public String getReinf(){
        return this.reinforce.getOut();
    }
}


