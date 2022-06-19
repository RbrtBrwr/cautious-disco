/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Classes;



/**
 *
 * @author ponsa
 */
public class Interfaz extends javax.swing.JFrame {
    

    

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }
    
    public void updateQueues(Planta planta1, Planta planta2){
        updatePriority1Planta1(planta1);
        updatePriority2Planta1(planta1);
        updatePriority3Planta1(planta1);
        updateReinforcementPlanta1(planta1);
        updatePriority1Planta2(planta2);
        updatePriority2Planta2(planta2);
        updatePriority3Planta2(planta2);
        updateReinforcementPlanta2(planta2);
    }
    
    public void setResult(String battleResult){
        result.setText(battleResult);
    }
    
    public void setSkynetStatus(String status){
        skynetStatus.setText(status);
    }
    
    public void setPhone1(String phone){
        phone1.setText(phone);
    }
    
    public void setPhone2(String phone){
        phone2.setText(phone);
    }
    
    public void updatePriority1Planta1(Planta planta){
        
        Queue cola = planta.getPriority1();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getPriority1().getSize(); i++) {
            switch(i){
                case 0:
                    Queue1Plant1Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    Queue1Plant1Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    Queue1Plant1Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    Queue1Plant1Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    Queue1Plant1Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    Queue1Plant1Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   Queue1Plant1Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    Queue1Plant1Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updatePriority1Planta2(Planta planta){
        
        Queue cola = planta.getPriority1();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getPriority1().getSize(); i++) {
            switch(i){
                case 0:
                    Queue1Plant2Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    Queue1Plant2Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    Queue1Plant2Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    Queue1Plant2Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    Queue1Plant2Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    Queue1Plant2Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   Queue1Plant2Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    Queue1Plant2Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updatePriority2Planta1(Planta planta){
        
        Queue cola = planta.getPriority2();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getPriority2().getSize(); i++) {
            switch(i){
                case 0:
                    Queue2Plant1Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    Queue2Plant1Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    Queue2Plant1Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    Queue2Plant1Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    Queue2Plant1Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    Queue2Plant1Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   Queue2Plant1Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    Queue2Plant1Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updatePriority2Planta2(Planta planta){
        
        Queue cola = planta.getPriority2();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getPriority2().getSize(); i++) {
            switch(i){
                case 0:
                    Queue2Plant2Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    Queue2Plant2Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    Queue2Plant2Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    Queue2Plant2Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    Queue2Plant2Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    Queue2Plant2Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   Queue2Plant2Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    Queue2Plant2Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updatePriority3Planta1(Planta planta){
        
        Queue cola = planta.getPriority3();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getPriority3().getSize(); i++) {
            switch(i){
                case 0:
                    Queue3Plant1Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    Queue3Plant1Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    Queue3Plant1Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    Queue3Plant1Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    Queue3Plant1Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    Queue3Plant1Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   Queue3Plant1Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    Queue3Plant1Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updatePriority3Planta2(Planta planta){
        
        Queue cola = planta.getPriority3();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getPriority3().getSize(); i++) {
            switch(i){
                case 0:
                    Queue3Plant2Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    Queue3Plant2Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    Queue3Plant2Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    Queue3Plant2Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    Queue3Plant2Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    Queue3Plant2Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   Queue3Plant2Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    Queue3Plant2Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updateReinforcementPlanta1(Planta planta){
        
        Queue cola = planta.getReinforcement();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getReinforcement().getSize(); i++) {
            switch(i){
                case 0:
                    reinforcementPlant1Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    reinforcementPlant1Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    reinforcementPlant1Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    reinforcementPlant1Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    reinforcementPlant1Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    reinforcementPlant1Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   reinforcementPlant1Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    reinforcementPlant1Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
    public void updateReinforcementPlanta2(Planta planta){
        
        Queue cola = planta.getReinforcement();
        QNode current = cola.getHead();
        
        
        for (int i = 0; i < planta.getReinforcement().getSize(); i++) {
            switch(i){
                case 0:
                    reinforcementPlant2Position0.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                 case 1:
                    reinforcementPlant2Position1.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 2:
                    reinforcementPlant2Position2.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 3:
                    reinforcementPlant2Position3.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 4:
                    reinforcementPlant2Position4.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 5:
                    reinforcementPlant2Position5.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 6:
                   reinforcementPlant2Position6.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
                    
                    case 7:
                    reinforcementPlant2Position7.setText("<html>" + current.getPhone().getID() + "<br>"+ current.getPhone().getModel() + "</html>");
                    break;
            }
            current = current.getNext();
        }
        
        
    }
    
//    public void setAIStatus(String status){
//        Level1QueuePlant1.setText(status);
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Queue1Plant1 = new javax.swing.JPanel();
        Queue1Plant1Position0 = new javax.swing.JLabel();
        Queue1Plant1Position1 = new javax.swing.JLabel();
        Queue1Plant1Position2 = new javax.swing.JLabel();
        Queue1Plant1Position3 = new javax.swing.JLabel();
        Queue1Plant1Position4 = new javax.swing.JLabel();
        Queue1Plant1Position5 = new javax.swing.JLabel();
        Queue1Plant1Position6 = new javax.swing.JLabel();
        Queue1Plant1Position7 = new javax.swing.JLabel();
        Queue1Plant2 = new javax.swing.JPanel();
        Queue1Plant2Position0 = new javax.swing.JLabel();
        Queue1Plant2Position1 = new javax.swing.JLabel();
        Queue1Plant2Position2 = new javax.swing.JLabel();
        Queue1Plant2Position3 = new javax.swing.JLabel();
        Queue1Plant2Position4 = new javax.swing.JLabel();
        Queue1Plant2Position5 = new javax.swing.JLabel();
        Queue1Plant2Position6 = new javax.swing.JLabel();
        Queue1Plant2Position7 = new javax.swing.JLabel();
        Queue2Plant1 = new javax.swing.JPanel();
        Queue2Plant1Position0 = new javax.swing.JLabel();
        Queue2Plant1Position1 = new javax.swing.JLabel();
        Queue2Plant1Position2 = new javax.swing.JLabel();
        Queue2Plant1Position3 = new javax.swing.JLabel();
        Queue2Plant1Position4 = new javax.swing.JLabel();
        Queue2Plant1Position5 = new javax.swing.JLabel();
        Queue2Plant1Position6 = new javax.swing.JLabel();
        Queue2Plant1Position7 = new javax.swing.JLabel();
        Queue2Plant2 = new javax.swing.JPanel();
        Queue2Plant2Position0 = new javax.swing.JLabel();
        Queue2Plant2Position1 = new javax.swing.JLabel();
        Queue2Plant2Position2 = new javax.swing.JLabel();
        Queue2Plant2Position3 = new javax.swing.JLabel();
        Queue2Plant2Position4 = new javax.swing.JLabel();
        Queue2Plant2Position5 = new javax.swing.JLabel();
        Queue2Plant2Position6 = new javax.swing.JLabel();
        Queue2Plant2Position7 = new javax.swing.JLabel();
        Queue3Plant1 = new javax.swing.JPanel();
        Queue3Plant1Position0 = new javax.swing.JLabel();
        Queue3Plant1Position1 = new javax.swing.JLabel();
        Queue3Plant1Position2 = new javax.swing.JLabel();
        Queue3Plant1Position3 = new javax.swing.JLabel();
        Queue3Plant1Position4 = new javax.swing.JLabel();
        Queue3Plant1Position5 = new javax.swing.JLabel();
        Queue3Plant1Position6 = new javax.swing.JLabel();
        Queue3Plant1Position7 = new javax.swing.JLabel();
        Queue3Plant2 = new javax.swing.JPanel();
        Queue3Plant2Position0 = new javax.swing.JLabel();
        Queue3Plant2Position1 = new javax.swing.JLabel();
        Queue3Plant2Position2 = new javax.swing.JLabel();
        Queue3Plant2Position3 = new javax.swing.JLabel();
        Queue3Plant2Position4 = new javax.swing.JLabel();
        Queue3Plant2Position5 = new javax.swing.JLabel();
        Queue3Plant2Position6 = new javax.swing.JLabel();
        Queue3Plant2Position7 = new javax.swing.JLabel();
        Plant2Title = new javax.swing.JPanel();
        Plant2 = new javax.swing.JLabel();
        Plant1Title = new javax.swing.JPanel();
        Plant1 = new javax.swing.JLabel();
        SKYNET = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SkynetStatus = new javax.swing.JPanel();
        skynetStatus = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();
        result = new javax.swing.JLabel();
        reinforcementPlant1 = new javax.swing.JPanel();
        reinforcementPlant1Position0 = new javax.swing.JLabel();
        reinforcementPlant1Position1 = new javax.swing.JLabel();
        reinforcementPlant1Position2 = new javax.swing.JLabel();
        reinforcementPlant1Position3 = new javax.swing.JLabel();
        reinforcementPlant1Position4 = new javax.swing.JLabel();
        reinforcementPlant1Position5 = new javax.swing.JLabel();
        reinforcementPlant1Position6 = new javax.swing.JLabel();
        reinforcementPlant1Position7 = new javax.swing.JLabel();
        reinforcementPlant2 = new javax.swing.JPanel();
        reinforcementPlant2Position0 = new javax.swing.JLabel();
        reinforcementPlant2Position1 = new javax.swing.JLabel();
        reinforcementPlant2Position2 = new javax.swing.JLabel();
        reinforcementPlant2Position3 = new javax.swing.JLabel();
        reinforcementPlant2Position4 = new javax.swing.JLabel();
        reinforcementPlant2Position5 = new javax.swing.JLabel();
        reinforcementPlant2Position6 = new javax.swing.JLabel();
        reinforcementPlant2Position7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nivel1Text = new javax.swing.JLabel();
        phone1Name = new javax.swing.JPanel();
        phone1 = new javax.swing.JLabel();
        vs = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        phone2Name = new javax.swing.JPanel();
        phone2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Queue1Plant1Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant1Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant1Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Queue1Plant1Layout = new javax.swing.GroupLayout(Queue1Plant1);
        Queue1Plant1.setLayout(Queue1Plant1Layout);
        Queue1Plant1Layout.setHorizontalGroup(
            Queue1Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Queue1Plant1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Queue1Plant1Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant1Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        Queue1Plant1Layout.setVerticalGroup(
            Queue1Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Queue1Plant1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Queue1Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Queue1Plant1Position1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant1Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Queue1Plant1);
        Queue1Plant1.setBounds(10, 90, 490, 70);

        Queue1Plant2Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue1Plant2Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue1Plant2Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Queue1Plant2Layout = new javax.swing.GroupLayout(Queue1Plant2);
        Queue1Plant2.setLayout(Queue1Plant2Layout);
        Queue1Plant2Layout.setHorizontalGroup(
            Queue1Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Queue1Plant2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Queue1Plant2Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue1Plant2Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Queue1Plant2Layout.setVerticalGroup(
            Queue1Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Queue1Plant2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Queue1Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Queue1Plant2Position1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue1Plant2Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Queue1Plant2);
        Queue1Plant2.setBounds(710, 90, 490, 70);

        Queue2Plant1Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant1Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant1Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Queue2Plant1Layout = new javax.swing.GroupLayout(Queue2Plant1);
        Queue2Plant1.setLayout(Queue2Plant1Layout);
        Queue2Plant1Layout.setHorizontalGroup(
            Queue2Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Queue2Plant1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Queue2Plant1Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant1Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Queue2Plant1Layout.setVerticalGroup(
            Queue2Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Queue2Plant1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Queue2Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Queue2Plant1Position6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Queue2Plant1Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Queue2Plant1);
        Queue2Plant1.setBounds(10, 300, 490, 70);

        Queue2Plant2Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue2Plant2Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue2Plant2Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Queue2Plant2Layout = new javax.swing.GroupLayout(Queue2Plant2);
        Queue2Plant2.setLayout(Queue2Plant2Layout);
        Queue2Plant2Layout.setHorizontalGroup(
            Queue2Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Queue2Plant2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Queue2Plant2Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue2Plant2Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Queue2Plant2Layout.setVerticalGroup(
            Queue2Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Queue2Plant2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Queue2Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Queue2Plant2Position1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue2Plant2Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Queue2Plant2);
        Queue2Plant2.setBounds(710, 300, 490, 70);

        Queue3Plant1Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant1Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Queue3Plant1Layout = new javax.swing.GroupLayout(Queue3Plant1);
        Queue3Plant1.setLayout(Queue3Plant1Layout);
        Queue3Plant1Layout.setHorizontalGroup(
            Queue3Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Queue3Plant1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Queue3Plant1Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant1Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Queue3Plant1Layout.setVerticalGroup(
            Queue3Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Queue3Plant1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Queue3Plant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Queue3Plant1Position6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant1Position7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Queue3Plant1);
        Queue3Plant1.setBounds(10, 380, 490, 70);

        Queue3Plant2Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Queue3Plant2Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue3Plant2Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Queue3Plant2Layout = new javax.swing.GroupLayout(Queue3Plant2);
        Queue3Plant2.setLayout(Queue3Plant2Layout);
        Queue3Plant2Layout.setHorizontalGroup(
            Queue3Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Queue3Plant2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Queue3Plant2Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Queue3Plant2Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Queue3Plant2Layout.setVerticalGroup(
            Queue3Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Queue3Plant2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Queue3Plant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Queue3Plant2Position6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Queue3Plant2Position7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Queue3Plant2);
        Queue3Plant2.setBounds(710, 380, 490, 70);

        Plant2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plant2.setText("PLANTA 2");

        javax.swing.GroupLayout Plant2TitleLayout = new javax.swing.GroupLayout(Plant2Title);
        Plant2Title.setLayout(Plant2TitleLayout);
        Plant2TitleLayout.setHorizontalGroup(
            Plant2TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Plant2TitleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Plant2)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Plant2TitleLayout.setVerticalGroup(
            Plant2TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Plant2TitleLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Plant2)
                .addContainerGap())
        );

        jPanel1.add(Plant2Title);
        Plant2Title.setBounds(900, 20, 100, 30);

        Plant1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plant1.setText("PLANTA 1");

        javax.swing.GroupLayout Plant1TitleLayout = new javax.swing.GroupLayout(Plant1Title);
        Plant1Title.setLayout(Plant1TitleLayout);
        Plant1TitleLayout.setHorizontalGroup(
            Plant1TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Plant1TitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Plant1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Plant1TitleLayout.setVerticalGroup(
            Plant1TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Plant1TitleLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Plant1)
                .addContainerGap())
        );

        jPanel1.add(Plant1Title);
        Plant1Title.setBounds(240, 20, 100, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SKYNET");

        javax.swing.GroupLayout SKYNETLayout = new javax.swing.GroupLayout(SKYNET);
        SKYNET.setLayout(SKYNETLayout);
        SKYNETLayout.setHorizontalGroup(
            SKYNETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SKYNETLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        SKYNETLayout.setVerticalGroup(
            SKYNETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKYNETLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(SKYNET);
        SKYNET.setBounds(560, 10, 100, 30);

        skynetStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout SkynetStatusLayout = new javax.swing.GroupLayout(SkynetStatus);
        SkynetStatus.setLayout(SkynetStatusLayout);
        SkynetStatusLayout.setHorizontalGroup(
            SkynetStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkynetStatusLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(skynetStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        SkynetStatusLayout.setVerticalGroup(
            SkynetStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkynetStatusLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(skynetStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(SkynetStatus);
        SkynetStatus.setBounds(560, 40, 100, 50);

        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(resultPanel);
        resultPanel.setBounds(560, 240, 120, 60);

        reinforcementPlant1Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant1Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant1Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout reinforcementPlant1Layout = new javax.swing.GroupLayout(reinforcementPlant1);
        reinforcementPlant1.setLayout(reinforcementPlant1Layout);
        reinforcementPlant1Layout.setHorizontalGroup(
            reinforcementPlant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reinforcementPlant1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(reinforcementPlant1Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant1Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        reinforcementPlant1Layout.setVerticalGroup(
            reinforcementPlant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reinforcementPlant1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reinforcementPlant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reinforcementPlant1Position6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant1Position7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(reinforcementPlant1);
        reinforcementPlant1.setBounds(10, 460, 490, 70);

        reinforcementPlant2Position0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reinforcementPlant2Position7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reinforcementPlant2Position7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout reinforcementPlant2Layout = new javax.swing.GroupLayout(reinforcementPlant2);
        reinforcementPlant2.setLayout(reinforcementPlant2Layout);
        reinforcementPlant2Layout.setHorizontalGroup(
            reinforcementPlant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reinforcementPlant2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reinforcementPlant2Position0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinforcementPlant2Position7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        reinforcementPlant2Layout.setVerticalGroup(
            reinforcementPlant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reinforcementPlant2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reinforcementPlant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reinforcementPlant2Position6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reinforcementPlant2Position7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(reinforcementPlant2);
        reinforcementPlant2.setBounds(710, 460, 490, 70);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nivel 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(590, 320, 50, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nivel 3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(590, 400, 50, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Refuerzo");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(590, 480, 60, 30);

        nivel1Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel1Text.setText("Nivel 1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nivel1Text)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nivel1Text)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(590, 100, 50, 30);

        phone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout phone1NameLayout = new javax.swing.GroupLayout(phone1Name);
        phone1Name.setLayout(phone1NameLayout);
        phone1NameLayout.setHorizontalGroup(
            phone1NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phone1NameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phone1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        phone1NameLayout.setVerticalGroup(
            phone1NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phone1NameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phone1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(phone1Name);
        phone1Name.setBounds(430, 180, 120, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("vs");

        javax.swing.GroupLayout vsLayout = new javax.swing.GroupLayout(vs);
        vs.setLayout(vsLayout);
        vsLayout.setHorizontalGroup(
            vsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        vsLayout.setVerticalGroup(
            vsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(vs);
        vs.setBounds(590, 180, 50, 30);

        phone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout phone2NameLayout = new javax.swing.GroupLayout(phone2Name);
        phone2Name.setLayout(phone2NameLayout);
        phone2NameLayout.setHorizontalGroup(
            phone2NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phone2NameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phone2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        phone2NameLayout.setVerticalGroup(
            phone2NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phone2NameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phone2, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(phone2Name);
        phone2Name.setBounds(670, 180, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Classes/Images/portada_sono-bisque-doll-31.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1210, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Plant1;
    private javax.swing.JPanel Plant1Title;
    private javax.swing.JLabel Plant2;
    private javax.swing.JPanel Plant2Title;
    private javax.swing.JPanel Queue1Plant1;
    private javax.swing.JLabel Queue1Plant1Position0;
    private javax.swing.JLabel Queue1Plant1Position1;
    private javax.swing.JLabel Queue1Plant1Position2;
    private javax.swing.JLabel Queue1Plant1Position3;
    private javax.swing.JLabel Queue1Plant1Position4;
    private javax.swing.JLabel Queue1Plant1Position5;
    private javax.swing.JLabel Queue1Plant1Position6;
    private javax.swing.JLabel Queue1Plant1Position7;
    private javax.swing.JPanel Queue1Plant2;
    private javax.swing.JLabel Queue1Plant2Position0;
    private javax.swing.JLabel Queue1Plant2Position1;
    private javax.swing.JLabel Queue1Plant2Position2;
    private javax.swing.JLabel Queue1Plant2Position3;
    private javax.swing.JLabel Queue1Plant2Position4;
    private javax.swing.JLabel Queue1Plant2Position5;
    private javax.swing.JLabel Queue1Plant2Position6;
    private javax.swing.JLabel Queue1Plant2Position7;
    private javax.swing.JPanel Queue2Plant1;
    private javax.swing.JLabel Queue2Plant1Position0;
    private javax.swing.JLabel Queue2Plant1Position1;
    private javax.swing.JLabel Queue2Plant1Position2;
    private javax.swing.JLabel Queue2Plant1Position3;
    private javax.swing.JLabel Queue2Plant1Position4;
    private javax.swing.JLabel Queue2Plant1Position5;
    private javax.swing.JLabel Queue2Plant1Position6;
    private javax.swing.JLabel Queue2Plant1Position7;
    private javax.swing.JPanel Queue2Plant2;
    private javax.swing.JLabel Queue2Plant2Position0;
    private javax.swing.JLabel Queue2Plant2Position1;
    private javax.swing.JLabel Queue2Plant2Position2;
    private javax.swing.JLabel Queue2Plant2Position3;
    private javax.swing.JLabel Queue2Plant2Position4;
    private javax.swing.JLabel Queue2Plant2Position5;
    private javax.swing.JLabel Queue2Plant2Position6;
    private javax.swing.JLabel Queue2Plant2Position7;
    private javax.swing.JPanel Queue3Plant1;
    private javax.swing.JLabel Queue3Plant1Position0;
    private javax.swing.JLabel Queue3Plant1Position1;
    private javax.swing.JLabel Queue3Plant1Position2;
    private javax.swing.JLabel Queue3Plant1Position3;
    private javax.swing.JLabel Queue3Plant1Position4;
    private javax.swing.JLabel Queue3Plant1Position5;
    private javax.swing.JLabel Queue3Plant1Position6;
    private javax.swing.JLabel Queue3Plant1Position7;
    private javax.swing.JPanel Queue3Plant2;
    private javax.swing.JLabel Queue3Plant2Position0;
    private javax.swing.JLabel Queue3Plant2Position1;
    private javax.swing.JLabel Queue3Plant2Position2;
    private javax.swing.JLabel Queue3Plant2Position3;
    private javax.swing.JLabel Queue3Plant2Position4;
    private javax.swing.JLabel Queue3Plant2Position5;
    private javax.swing.JLabel Queue3Plant2Position6;
    private javax.swing.JLabel Queue3Plant2Position7;
    private javax.swing.JPanel SKYNET;
    private javax.swing.JPanel SkynetStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nivel1Text;
    private javax.swing.JLabel phone1;
    private javax.swing.JPanel phone1Name;
    private javax.swing.JLabel phone2;
    private javax.swing.JPanel phone2Name;
    private javax.swing.JPanel reinforcementPlant1;
    private javax.swing.JLabel reinforcementPlant1Position0;
    private javax.swing.JLabel reinforcementPlant1Position1;
    private javax.swing.JLabel reinforcementPlant1Position2;
    private javax.swing.JLabel reinforcementPlant1Position3;
    private javax.swing.JLabel reinforcementPlant1Position4;
    private javax.swing.JLabel reinforcementPlant1Position5;
    private javax.swing.JLabel reinforcementPlant1Position6;
    private javax.swing.JLabel reinforcementPlant1Position7;
    private javax.swing.JPanel reinforcementPlant2;
    private javax.swing.JLabel reinforcementPlant2Position0;
    private javax.swing.JLabel reinforcementPlant2Position1;
    private javax.swing.JLabel reinforcementPlant2Position2;
    private javax.swing.JLabel reinforcementPlant2Position3;
    private javax.swing.JLabel reinforcementPlant2Position4;
    private javax.swing.JLabel reinforcementPlant2Position5;
    private javax.swing.JLabel reinforcementPlant2Position6;
    private javax.swing.JLabel reinforcementPlant2Position7;
    private javax.swing.JLabel result;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JLabel skynetStatus;
    private javax.swing.JPanel vs;
    // End of variables declaration//GEN-END:variables


}


