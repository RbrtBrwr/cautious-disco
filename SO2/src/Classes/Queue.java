/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author rober
 */
public class Queue {
    private QNode head = null;
    private QNode tail = null;
//    Esta es la vaina para contar que no se me quede el pana ahi esperando siempre
    private int headCounter;
    
//    TODO Esto tiene que retornar el tipo que vaya a guardar, pero no se lo que es todavia asi que int mientras, deberia ser null lo que regresa si falla
    public Phone DQ(){
        Phone output = null;
        if (!this.isEmpty()){
            output = this.head.getPhone();
            
            this.head = this.head.getNext();
            
            if (this.head.getNext() == null){
                this.tail = null;
            }
        }
        headCounter = 0;
        return output;
    }
    
//    TODO Esto tiene que retornar el tipo que vaya a guardar, pero no se lo que es todavia asi que int mientras    
    public void NQ(Phone phone){
        QNode newNode = new QNode(phone);
        
        if (this.isEmpty()){
            this.head = this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public void updateHeadCounter(){
        if (!this.isEmpty()){
            this.headCounter++;
        }
    }
}
