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
    QNode head = null;
    QNode tail = null;
    
//    TODO Esto tiene que retornar el tipo que vaya a guardar, pero no se lo que es todavia asi que int mientras, deberia ser null lo que regresa si falla
    public int DQ(){
        int output = -1;
        if (!this.isEmpty()){
            output = this.head.info;
            
            this.head = this.head.next;
            
            if (this.head.next == null){
                this.tail = null;
            }
        }
        return output;
    }
    
//    TODO Esto tiene que retornar el tipo que vaya a guardar, pero no se lo que es todavia asi que int mientras    
    public void NQ(int thing){
        QNode newNode = new QNode(thing);
        
        if (this.isEmpty()){
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
}
