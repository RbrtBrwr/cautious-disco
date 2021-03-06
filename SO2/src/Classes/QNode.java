/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author rober
 */
public class QNode {
//    No se que es lo que vamos a guardar en la cola pero aja
    private Phone phone;
    private QNode next = null;
    private int priority;
    private int plant;

    
    QNode(Phone phone){
        this.phone = phone;
        this.priority = phone.getPriority();
        this.plant = phone.getPlant();
    }
    
    public Phone getPhone(){
        if (this != null){
            return this.phone;
        }
        
        return null;
    }
    
    public QNode getNext(){
        if (this != null){
            return this.next;
        }
        
        return null;
    }
    
    public void setNext(QNode next){
        if (this != null){
            this.next = next;
        }
    }

    public int getPriority(){
        return this.priority;
    }

    public int getPlant(){
        return this.plant;
    }
    
}
