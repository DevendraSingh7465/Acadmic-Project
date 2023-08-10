import java.io.*;



import javax.swing.JOptionPane;

/**
 *
 * @author deven
 */
public class main_page extends javax.swing.JFrame {

    /**
     * Creates new form main_page
     */
    public main_page() {
        
        initComponents();
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
        mainpage_display_username = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logout_btn1 = new javax.swing.JButton();
        profile_btn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        entered_amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        withdraw_amount = new javax.swing.JButton();
        despoit_amount = new javax.swing.JButton();
        display_current_balance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Banking App");
        setBackground(new java.awt.Color(120, 69, 166));
        setMaximumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 151, 101));
        jPanel1.setPreferredSize(new java.awt.Dimension(363, 500));

        mainpage_display_username.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        mainpage_display_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpage_display_username.setLabelFor(mainpage_display_username);
        mainpage_display_username.setText("display user");
        mainpage_display_username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("New offers coming soon...");

        logout_btn1.setBackground(new java.awt.Color(251, 223, 208));
        logout_btn1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        logout_btn1.setText(" Logout ");
        logout_btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        logout_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn1ActionPerformed(evt);
            }
        });

        profile_btn1.setBackground(new java.awt.Color(242, 151, 101));
        profile_btn1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        profile_btn1.setText("PROFILE");
        profile_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(logout_btn1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(mainpage_display_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(profile_btn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel4)
                    .addContainerGap(111, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(profile_btn1)
                .addGap(64, 64, 64)
                .addComponent(mainpage_display_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(logout_btn1)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(jLabel4)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 151, 101));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Future Banking");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("Current Balance : $");

        entered_amount.setBackground(new java.awt.Color(251, 223, 208));
        entered_amount.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        entered_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entered_amountActionPerformed(evt);
            }
        });
        entered_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                entered_amountKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setText("Enter Amount : $");

        withdraw_amount.setBackground(new java.awt.Color(242, 151, 101));
        withdraw_amount.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        withdraw_amount.setText("Withdraw Amount");
        withdraw_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_amountActionPerformed(evt);
            }
        });

        despoit_amount.setBackground(new java.awt.Color(242, 151, 101));
        despoit_amount.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        despoit_amount.setText("Deposit Amount");
        despoit_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despoit_amountActionPerformed(evt);
            }
        });

        display_current_balance.setBackground(new java.awt.Color(255, 255, 255));
        display_current_balance.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        display_current_balance.setForeground(new java.awt.Color(242, 151, 101));
        display_current_balance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        display_current_balance.setText("00.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entered_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(despoit_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdraw_amount)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(display_current_balance))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display_current_balance))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(entered_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(despoit_amount)
                .addGap(29, 29, 29)
                .addComponent(withdraw_amount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    double balance = 0;
    
    private void entered_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entered_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entered_amountActionPerformed
    
    private void logout_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn1ActionPerformed
        signinframe sf1 = new signinframe();
        dispose();
        sf1.setVisible(true);
    }//GEN-LAST:event_logout_btn1ActionPerformed

    private void despoit_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despoit_amountActionPerformed
        int amount = Integer.parseInt(entered_amount.getText());
        if(amount<0){
            JOptionPane.showMessageDialog(this,"Amount must be positive");
        }
        else {
            balance = balance + amount ;
            String s = String.valueOf(balance);
            display_current_balance.setText(s);
            JOptionPane.showMessageDialog(this,"Amount Credited");
            entered_amount.setText(null);
        }


    }//GEN-LAST:event_despoit_amountActionPerformed

    private void withdraw_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_amountActionPerformed
        double amount = Double.parseDouble(entered_amount.getText());
        if(amount<0){
            JOptionPane.showMessageDialog(this,"Amount must be positive");
        }
        else if(amount>balance){
            JOptionPane.showMessageDialog(this,"Invalid Amount");
        }
        else {
            balance = balance - amount ;
            String s = String.valueOf(balance);
            display_current_balance.setText(s);
            //System.out.println("-"+balance);
            JOptionPane.showMessageDialog(this,"Amount Debited");
            entered_amount.setText(null);
        }
    }//GEN-LAST:event_withdraw_amountActionPerformed

    private void entered_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entered_amountKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_entered_amountKeyTyped

    private void profile_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_btn1ActionPerformed
        personal_info pi = new personal_info();
        FileReader fr;
        try{    
            fr = new FileReader("SigninDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine()) != null){
                String s21 [] = line.split("\\$");
                pi.profile_display_name.setText(s21[0]);
                pi.profile_display_gender.setText(s21[1]);
                pi.profile_display_username.setText(s21[3]);
                pi.profile_display_mobileno.setText(s21[2]);
            }

        }catch(Exception e){}
        dispose();
        pi.setVisible(true);
    }//GEN-LAST:event_profile_btn1ActionPerformed


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
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_page().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton despoit_amount;
    public javax.swing.JLabel display_current_balance;
    private javax.swing.JTextField entered_amount;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout_btn1;
    public javax.swing.JLabel mainpage_display_username;
    private javax.swing.JButton profile_btn1;
    private javax.swing.JButton withdraw_amount;
    // End of variables declaration//GEN-END:variables
}