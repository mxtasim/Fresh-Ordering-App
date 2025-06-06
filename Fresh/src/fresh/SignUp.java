/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fresh;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    
    File f = new File("C:\\programming\\Fresh");
    int ln;
    
    /**
     * Creates new form notepad
     */
    public SignUp() {
        
        initComponents();
    }

    void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    void readFile(){
        try {
            FileReader fr = new FileReader(f+"\\logins.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"\\logins.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
    
    void addData(String Username,String Password, String Phone){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }

            if(ln>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            }
            raf.writeBytes("Username:"+Username+ "\r\n");
            raf.writeBytes("Password:"+Password+ "\r\n");
            raf.writeBytes("Phone:"+Phone);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    
    void logic(String Username,String Password){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;i<ln;i+=4){System.out.println("count "+i);
            
                String forUser = raf.readLine().substring(9);
                String forPswd = raf.readLine().substring(9);
                if(Username.equals(forUser) & Password.equals(forPswd)){
                    JOptionPane.showMessageDialog(null, "password matched");
                    break;
                }else if(i==(ln-3)){
                    JOptionPane.showMessageDialog(null, "incorrect username/password");
                    break;
                }
                // if you are using user & passwword without phone
                // then dont forget to replace  k<=2 with k=2 below
                for(int k=1;k<=2;k++){
                    raf.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        tfpassword = new javax.swing.JPasswordField();
        logo_pass = new javax.swing.JLabel();
        logo_number = new javax.swing.JLabel();
        logo_user = new javax.swing.JLabel();
        SignUpBTN = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fresh: Pizza Delivery & More");

        jPanel1.setBackground(new java.awt.Color(144, 12, 63));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        username.setForeground(new java.awt.Color(0, 102, 51));
        username.setText("Enter Your Username");
        jPanel1.add(username);
        username.setBounds(140, 160, 170, 22);

        password.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        password.setForeground(new java.awt.Color(0, 102, 51));
        password.setText("Enter Your Password");
        jPanel1.add(password);
        password.setBounds(140, 210, 170, 22);

        phoneNumber.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(0, 102, 51));
        phoneNumber.setText("Phone Number");
        jPanel1.add(phoneNumber);
        phoneNumber.setBounds(140, 260, 130, 22);

        tfusername.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 51)));
        tfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusernameActionPerformed(evt);
            }
        });
        jPanel1.add(tfusername);
        tfusername.setBounds(460, 160, 160, 20);

        tfphone.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 51)));
        jPanel1.add(tfphone);
        tfphone.setBounds(460, 260, 160, 20);

        tfpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 51)));
        jPanel1.add(tfpassword);
        tfpassword.setBounds(460, 210, 160, 20);

        logo_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-lock-20.png"))); // NOI18N
        jPanel1.add(logo_pass);
        logo_pass.setBounds(120, 210, 20, 20);

        logo_number.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-phone-book-20.png"))); // NOI18N
        logo_number.setText("\n");
        jPanel1.add(logo_number);
        logo_number.setBounds(120, 260, 20, 20);

        logo_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-person-20.png"))); // NOI18N
        jPanel1.add(logo_user);
        logo_user.setBounds(120, 160, 20, 20);

        SignUpBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUpBTN.setText("SIGN UP");
        SignUpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBTNActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpBTN);
        SignUpBTN.setBounds(535, 300, 85, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/background.jpeg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 700, 480);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenu1.setText("Manage");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-info-25.png"))); // NOI18N
        jMenuItem2.setText("About Page");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-customer-support-25.png"))); // NOI18N
        jMenuItem3.setText("Customer Support");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBTNActionPerformed
        if (this.tfusername.getText().isEmpty() || 
                this.tfpassword.getText().isEmpty() ||
                this.tfphone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, 
                    "Please enter all details");
        }
        else {    
            createFolder(); 
            readFile();
            countLines();
            addData(tfusername.getText(),tfpassword.getText(),tfphone.getText());  
            JOptionPane.showMessageDialog(null,"Account have been created!");
        }
    }//GEN-LAST:event_SignUpBTNActionPerformed

    private void tfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusernameActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AboutPage().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CustomerSupport().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpBTN;
    private javax.swing.JLabel background;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo_number;
    private javax.swing.JLabel logo_pass;
    private javax.swing.JLabel logo_user;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JPasswordField tfpassword;
    private javax.swing.JTextField tfphone;
    private javax.swing.JTextField tfusername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
