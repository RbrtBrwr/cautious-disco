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
    final int TRANSITION_TIME = 1000;
    
    private Phone phone_1;
    private Phone phone_2;
    private String stauts;
    
    public Skynet(){
        this.stauts = "Booting";
        try {
            Thread.sleep(TRANSITION_TIME);
        } catch (InterruptedException ex) {
            Logger.getLogger(Skynet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPhones(){
        this.stauts = "Prepping";
        phone_1 = new Phone("AQUI LE PIDO AL ADMIN QUE SAQUE UN TELEFONO DE PLANTA 1");
        phone_2 = new Phone("AQUI LE PIDO AL ADMIN QUE SAQUE UN TELEFONO DE PLANTA 2");
        try {
            Thread.sleep(TRANSITION_TIME);
        } catch (InterruptedException ex) {
            Logger.getLogger(Skynet.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.stauts = "FIGHT";
        
    }

    public void decideFuture(){
        this.stauts = "FIGHT";
        double prob = Math.random();
        if (prob > 0.6){
            duel();
        } else if (prob > 0.33){
            empate();
        } else {
            refuerzo();
        }
    }
    
    public Phone duel(){
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

        // No se si hacer return o llamo la funcion del administrador aqui para que meta el ganador en la cola de ganadores y deseche el otro
        if (firstPhoneWin > secondPhoneWin) {
            return phone_1;
        } else {
            return phone_2;
        }
        
    }

    public void empate(){
        // Entra el administrador y mete ambos telefonos de vuelta a sus respectivas colas
        System.out.println("EMPATE");
    }

    public void refuerzo(){
        // Entra el administrador y mete a los telefonos en las colas de refuerzo de sus respectivas plantas
        System.out.println("REFUERZO");
    }
}
