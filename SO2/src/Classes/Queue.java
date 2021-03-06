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
    private int size;
//    Esta es la vaina para contar que no se me quede el pana ahi esperando siempre
    private int headCounter;
    
    public QNode getHead(){
        return this.head;
    }
    
//    TODO Esto tiene que retornar el tipo que vaya a guardar, pero no se lo que es todavia asi que int mientras, deberia ser null lo que regresa si falla
    public Phone DQ(){
        Phone output = null;
        if (!this.isEmpty()){
            output = this.head.getPhone();
            

            if (this.head.getNext() == null){
                this.tail = this.head = null;
            } else {
                this.head = this.head.getNext();
                if (this.head.getNext() == null){
                    this.tail = this.head;
                }
            }
        }
        headCounter = 0;
        size--;
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
        size++;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public void updateHeadCounter(){
        if (!this.isEmpty()){
            this.headCounter++;
        }
    }
    
    public int getSize(){
        return this.size;
    }
    
    public int getHeadCounter(){
        return this.headCounter;
    }

    public void resetHeadCounter(){
        this.headCounter = 0;
    }

    public void checkOut(){
        QNode temp = this.head;
        while (temp != null){
            temp = temp.getNext();
        }
    }
    
    public String getPrintable(){
        String output = "";
        QNode temp = this.head;
        while (temp != null){
            output += temp.getPhone().getModel() + " " + temp.getPhone().getID() + "\n";
            temp = temp.getNext();
        }
        return output;
    }
    
    public String[] getList(){
        String[] output = new String[75];
        QNode temp = this.head;
        int i = 0;
        while (temp != null && i < 75){
            output[i] = temp.getPhone().getModel() + " " + temp.getPhone().getID();
            temp = temp.getNext();
            i++;
        }
        return output;
    }
    public String[] getListHor(){
        String[] output = new String[75];
        QNode temp = this.head;
        int i = 0;
        while (temp != null && i < 75){
            output[i] = temp.getPhone().getModel() + " - " + temp.getPhone().getID() + " || ";
            temp = temp.getNext();
            i++;
        }
        return output;
    }
    

}
