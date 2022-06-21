/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rober
 */
public class Main {

    public static Skynet Kitagawa = new Skynet();
    public static Interfaz interfaz = new Interfaz();
    public static Queue marketReady;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        interfaz.setVisible(true);
        interfaz.addWindowListener(new java.awt.event.WindowAdapter() {
            
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (interfaz.running){
                    try {
                        saveData();
                    } catch (NullPointerException ex){
                        System.out.println("QUE NO SIRVE DIJE! QUE TOXIC@!");
                    }
                    
                }
                System.exit(0);
            }
        });
        
    }
    
    public static void start(){

        Kitagawa.start();
    }
    
    public static void reset(){
        Kitagawa = new Skynet();
    }
    
    public static void saveData(){
        appendToFile(saveStatistics());
        appendToFile(saveRun());
    }
    
    public static Map saveStatistics(){
        try {
            QNode temp = marketReady.getHead();
            int counter10 = 0;
            int counterPro = 0;
            Map<String, Integer> map = new HashMap<>();

            while (temp != null){
                if(temp.getPhone().getModel() == "Xperia Pro-I"){
                    counterPro++;
                } else{
                    counter10++;
                }
                temp = temp.getNext();
            }
            map.put("Xperia Pro-I ", counterPro);
            map.put("Xperia 10 III ", counter10);
            return map;
            
        } catch (NullPointerException ex){
            System.out.println("AHHH NOOOO ESO NO SIRVE SI NO CORRES EL PROGRAMA LOKILLO");
        }
        
        return null;
    }
    
    public static String saveRun(){
        try {
            QNode temp = marketReady.getHead();
            String output ="--------------------------NEW RUN-------------------------------\n";
            while (temp != null){
                output += temp.getPhone().getModel() + " - ID:" + temp.getPhone().getID() + "\n";
                temp = temp.getNext();
            }
            return output;
            
        } catch (NullPointerException ex){
            System.out.println("AHHH NOOOO ESO NO SIRVE SI NO CORRES EL PROGRAMA LOKILLO");
        }
        
        return null;
    }
    
    public static void appendToFile(Map map) {
        try {
            FileWriter myWriter = new FileWriter("winners.txt", true);
            myWriter.append("\n" + map.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
    public static void appendToFile(String info) {
        try {
            FileWriter myWriter = new FileWriter("runs.txt", true);
            myWriter.append(saveRun());
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
    
    
   
    
    
    
}
