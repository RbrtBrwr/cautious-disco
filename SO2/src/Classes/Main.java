/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

/**
 *
 * @author rober
 */
public class Main {
    public static int sizeOfTest = 1000;
    public static String[] ids = new String[sizeOfTest];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //AI
        Skynet superInteligenciaArtificialPuroPene = new Skynet();
        
        //Colas de prueba
        Queue plant1Level1 = new Queue();
        Queue plant2Level1 = new Queue();
        Queue plant1Level2 = new Queue();
        Queue plant2Level2 = new Queue();
        Queue plant1Level3 = new Queue();
        Queue plant2Level3 = new Queue();
        Queue plant1Reinforce = new Queue();
        Queue plant2Reinforce = new Queue();
        
        //Admin
        Admin admin = new Admin(superInteligenciaArtificialPuroPene, plant1Level1, plant2Level1, plant1Level2, plant2Level2, plant1Level3, plant2Level3, plant1Reinforce, plant2Reinforce);
        
        
        //FLUJO
        
        //Se crean dos telefonos, uno de cada planta
        Phone phone1 = new Phone("Xperia Pro-I");
        Phone phone2 = new Phone("Xperia 10 III");
        
        //El admin agarra los telefonos y los encola en su respectiva cola dependiendo de su nivel
        admin.queuePhone(phone1);
        admin.queuePhone(phone2);
        
        //Gestion de colas
        admin.updateQueues(plant1Level2, plant2Level2, plant1Level3, plant2Level3);
        
        //Enviar telefonos a batallar
        
        
        
        
    }
    
}
