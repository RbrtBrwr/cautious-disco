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

    public static int sizeOfTest = 1000;
    public static String[] ids = new String[sizeOfTest];
    public static Interfaz interfaz = new Interfaz();
    public static Queue marketReady;
    public static Skynet superInteligenciaArtificialPuroPene = new Skynet();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        interfaz.setVisible(true);
        interfaz.addWindowListener(new java.awt.event.WindowAdapter() {
            
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                writeFile(saveStatistics());
                System.exit(0);
    }
});
        
                superInteligenciaArtificialPuroPene.getPhones();
    }
    
    public static Map saveStatistics(){
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
    }
    
    public static void writeFile(Map map) {
        try {
            FileWriter myWriter = new FileWriter("winners.txt");
            myWriter.write(map.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
   
    
    
    
}
