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
    private  int priority;
    
    QNode(Phone phone){
        this.phone = phone;
        this.priority = phone.getPriority();
    }
    
    public Phone getPhone(){
        return this.phone;
    }
    
    public QNode getNext(){
        return this.next;
    }
    
    public void setNext(QNode next){
        this.next = next;
    }
    
}
