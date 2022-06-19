/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rober
 */
public class Skynet {
//    Esto es para que se vean mas estados que solo el de jugar clash
    final int TRANSITION_TIME = 100;
    private int waitTime = 1000;
    
    private final Admin admin;
    private Phone phone_1;
    private Phone phone_2;
    private String stauts;
    
    public Skynet(){
        this.admin = new Admin();
        this.stauts = "Booting";
//        Main.interfaz.setAIStatus(this.stauts);
        try {
            Thread.sleep(TRANSITION_TIME);
        } catch (InterruptedException ex) {
            Logger.getLogger(Skynet.class.getName()).log(Level.SEVERE, null, ex);
        }

        getPhones();
    }
    
    
    public void getPhones(){
        this.stauts = "Prepping";
        Main.interfaz.setSkynetStatus(stauts);
        Phone [] phones = admin.getPhones();
        phone_1 = phones[0];
        phone_2 = phones[1];
        Main.interfaz.setPhone1(phone_1.getModel() + phone_1.getID());
        Main.interfaz.setPhone2(phone_2.getModel() + phone_2.getID());
        System.out.println(phone_1.getModel() + phone_1.getID() + " vs " + phone_2.getModel() + phone_2.getID());
        try {
            Thread.sleep(TRANSITION_TIME);
        } catch (InterruptedException ex) {
            Logger.getLogger(Skynet.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.stauts = "FIGHT";
        Main.interfaz.setSkynetStatus(stauts);
        decideFuture();
    }

    public void decideFuture(){
        double prob = Math.random();
        if (prob > 0.6){
            duel();
        } else if (prob > 0.33){
            empate();
        } else {
            reinforce();
        }
    }
    
    public void duel(){
        
        int firstPhonePower = phone_1.getPower();
        int secondPhonePower = phone_2.getPower();

        int totalPower = firstPhonePower + secondPhonePower;

        double firstPhoneChance = (double) firstPhonePower / totalPower;

        int firstPhoneWin = 0;
        int secondPhoneWin = 0;

        for (int i = 0; i < 5; i++) {
            if (Math.random() < firstPhoneChance) {
                firstPhoneWin++;
            } else {
                secondPhoneWin++;
            }
        }
        // Aqui hago la espera para lo que se tardan los telefonos en competir
        waitTime();

        // No se si hacer return o llamo la funcion del administrador aqui para que meta el ganador en la cola de ganadores y deseche el otro
        if (firstPhoneWin > secondPhoneWin) {
            admin.registerWinner(phone_1);
            Main.interfaz.setResult("<html>GANADOR: " + "<br>" + phone_1.getModel() + phone_1.getID() + "</html>");
            System.out.println(phone_1.getModel() + phone_1.getID() + " wins");
        } else {
            admin.registerWinner(phone_2);
            Main.interfaz.setResult("<html>GANADOR: " + "<br>" + phone_2.getModel() + phone_2.getID() + "</html>");
            System.out.println(phone_2.getModel() + phone_2.getID() + " wins");
        }
        
        getPhones();
        
    }

    public void empate(){
        // Entra el administrador y mete ambos telefonos de vuelta a sus respectivas colas
        waitTime();
        Main.interfaz.setResult("EMPATE");
//        System.out.println("EMPATE");
        admin.draw(phone_1, phone_2);
        getPhones();
    }

    public void reinforce(){
        // Entra el administrador y mete a los telefonos en las colas de refuerzo de sus respectivas plantas
        waitTime();
        Main.interfaz.setResult("REFUERZO");
//        System.out.println("REFUERZO");
        admin.reinforce(phone_1, phone_2);
        getPhones();
    }

    public void waitTime(){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(Skynet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateWaitTime(int newTime){
        this.waitTime = newTime;
    }
}
