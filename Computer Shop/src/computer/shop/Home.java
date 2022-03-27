/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.shop;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author johnfred
 */
public class Home extends javax.swing.JFrame {
    Connection con = null;
    String sql = "";
    Statement stmt = null;
    ResultSet rs = null;
    JPanel panel = new JPanel();

    /**
     * Creates new form Home
     */
    private int count;
    private int counter;
    
    public Home() {
        initComponents();
        
        newUserBalance.removeAllItems();
        newUserBalance.addItem("30 mins");
        newUserBalance.addItem("1 hr 30 mins");
        newUserBalance.addItem("2 hrs");
        
        balanceBox.removeAllItems();
        balanceBox.addItem("30 mins");
        balanceBox.addItem("1 hr 30 mins");
        balanceBox.addItem("2 hrs");
        
        panel.setLayout(new GridLayout(15,15, 10,10));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.count = 1;
        this.counter = 1;

        PCPanel.add(panel); 
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBalance = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        AccountIDField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        balanceBox = new javax.swing.JComboBox<>();
        SubmitBalance = new javax.swing.JButton();
        AddUserAccount = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        NewAccountID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newUserName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        newUserAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newUserDateOfBirth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newUserAge = new javax.swing.JTextField();
        AddUser = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newAccountPassword = new javax.swing.JPasswordField();
        newUserBalance = new javax.swing.JComboBox<>();
        AddUserMessage = new javax.swing.JOptionPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AddNewPC = new javax.swing.JButton();
        AddNewUserAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        AddBalanceUSer = new javax.swing.JButton();
        PCPanel = new javax.swing.JPanel();

        AddBalance.setResizable(false);
        AddBalance.setSize(new java.awt.Dimension(400, 300));

        jLabel11.setText("Account ID");

        jLabel12.setText("Add Balance");

        balanceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SubmitBalance.setBackground(new java.awt.Color(0, 153, 204));
        SubmitBalance.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBalance.setText("Submit");
        SubmitBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddBalanceLayout = new javax.swing.GroupLayout(AddBalance.getContentPane());
        AddBalance.getContentPane().setLayout(AddBalanceLayout);
        AddBalanceLayout.setHorizontalGroup(
            AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBalanceLayout.createSequentialGroup()
                .addGroup(AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBalanceLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AccountIDField)
                            .addComponent(balanceBox, 0, 194, Short.MAX_VALUE)))
                    .addGroup(AddBalanceLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(SubmitBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        AddBalanceLayout.setVerticalGroup(
            AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBalanceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(AccountIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(AddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(balanceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(SubmitBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        AddUserAccount.setResizable(false);
        AddUserAccount.setSize(new java.awt.Dimension(495, 560));
        AddUserAccount.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AddUserAccountWindowOpened(evt);
            }
        });

        jLabel3.setText("Account ID");

        NewAccountID.setText("-");

        jLabel4.setText("Name");

        newUserAddress.setColumns(20);
        newUserAddress.setRows(5);
        jScrollPane1.setViewportView(newUserAddress);

        jLabel5.setText("Address");

        jLabel6.setText("Date of Birth");

        newUserDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserDateOfBirthActionPerformed(evt);
            }
        });

        jLabel7.setText("yyyy-mm-dd");

        jLabel8.setText("Age");

        newUserAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserAgeActionPerformed(evt);
            }
        });

        AddUser.setBackground(new java.awt.Color(0, 153, 204));
        AddUser.setForeground(new java.awt.Color(255, 255, 255));
        AddUser.setText("Add User");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        jLabel9.setText("Password");

        jLabel10.setText("Add Balance");

        newUserBalance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout AddUserAccountLayout = new javax.swing.GroupLayout(AddUserAccount.getContentPane());
        AddUserAccount.getContentPane().setLayout(AddUserAccountLayout);
        AddUserAccountLayout.setHorizontalGroup(
            AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddUserAccountLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(NewAccountID)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newUserBalance, javax.swing.GroupLayout.Alignment.LEADING, 0, 197, Short.MAX_VALUE)
                        .addComponent(newAccountPassword, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        AddUserAccountLayout.setVerticalGroup(
            AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddUserAccountLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NewAccountID))
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddUserAccountLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(AddUserAccountLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(newAccountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newUserBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(38, 38, 38)))
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(AddUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel2.setText("Computer Shop Management System");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AddNewPC.setBackground(new java.awt.Color(0, 153, 204));
        AddNewPC.setForeground(new java.awt.Color(255, 255, 255));
        AddNewPC.setText("Add new PC");
        AddNewPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewPCActionPerformed(evt);
            }
        });

        AddNewUserAccount.setBackground(new java.awt.Color(0, 153, 204));
        AddNewUserAccount.setForeground(new java.awt.Color(255, 255, 255));
        AddNewUserAccount.setText("Add User Account");
        AddNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewUserAccountActionPerformed(evt);
            }
        });

        jLabel1.setText("John Frederick Cando");

        Exit.setBackground(new java.awt.Color(0, 153, 204));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        AddBalanceUSer.setBackground(new java.awt.Color(0, 153, 204));
        AddBalanceUSer.setForeground(new java.awt.Color(255, 255, 255));
        AddBalanceUSer.setText("Add Balance to User");
        AddBalanceUSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBalanceUSerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddNewUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddNewPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddBalanceUSer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(AddNewPC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddNewUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBalanceUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        PCPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PCPanel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(PCPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PCPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewPCActionPerformed
        // TODO add your handling code here:
        if(this.count <= 105){
            JButton  btn = new JButton("PC-"+counter);
            counter++;
            panel.add(btn);
            panel.revalidate();
            
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_shop","root", "");
                sql = "INSERT INTO pc values('"+count+"', NULL)";
                stmt = con.prepareStatement(sql);
                stmt.execute(sql);
            } catch (Exception e) {
                AddUserMessage.showMessageDialog(this, e.toString());
            }
            count++;
        }
    }//GEN-LAST:event_AddNewPCActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_ExitActionPerformed

    private void AddNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewUserAccountActionPerformed
        // TODO add your handling code here:
        AddUserAccount.show();
    }//GEN-LAST:event_AddNewUserAccountActionPerformed

    private void newUserDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUserDateOfBirthActionPerformed

    private void newUserAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUserAgeActionPerformed

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        // TODO add your handling code here:
        
        int account_id = Integer.parseInt(NewAccountID.getText());
        int balance = 0;
        String uname = newUserName.getText();
        String upass = newAccountPassword.getText();
        String uaddress = newUserAddress.getText();
        String udate_of_birth = newUserDateOfBirth.getText();
        int uage = Integer.parseInt(newUserAge.getText());
        
        String sql2 = "";
        String sql3 = "";
        
        String itemBalance = newUserBalance.getSelectedItem().toString();
        
        if(itemBalance == "30 mins"){
            balance = 1800;
        } else if(itemBalance == "1 hr 30 mins"){
            balance = 5400;
        } else { 
            balance = 7200;
        }
    
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_shop","root", "");
            sql2 = "SELECT user_id FROM user ORDER BY user_id DESC LIMIT 1";
            stmt = con.prepareStatement(sql2);
            rs = stmt.executeQuery(sql2);
        } catch(Exception e){}
        
        try {
            int uid = 0;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_shop","root", "");
            
            if(rs.next()){
                uid = rs.getInt("user_id") + 1;
            }
            
            sql = "INSERT INTO user values('"+uid+"','"+uname+"','"+uaddress+"','"+udate_of_birth+"','"+uage+"')";
            stmt = con.prepareStatement(sql);
            stmt.execute(sql);
            
            sql = "INSERT INTO account values('"+NewAccountID.getText()+"','"+uid+"','"+upass+"','"+balance+"')";
            stmt = con.prepareStatement(sql);
            stmt.execute(sql);               

            //UserBalance jframe set visible false to hide login form after login event
         
            AddUserAccount.setVisible(false);
            AddUserMessage.showMessageDialog(this, "Successfully Added User");
            //launch the user home with balance preview

        }catch(Exception e){
            AddUserMessage.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_AddUserActionPerformed

    private void AddUserAccountWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AddUserAccountWindowOpened
        // TODO add your handling code here:
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_shop","root", "");
            sql = "SELECT account_id FROM account ORDER BY account_id DESC LIMIT 1";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                NewAccountID.setText(""+(rs.getInt("account_id")+1));
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_AddUserAccountWindowOpened

    private void AddBalanceUSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBalanceUSerActionPerformed
        // TODO add your handling code here:
        AddBalance.show();
    }//GEN-LAST:event_AddBalanceUSerActionPerformed

    private void SubmitBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBalanceActionPerformed
        // TODO add your handling code here:
        
        String account_id = AccountIDField.getText();
        String balance = balanceBox.getSelectedItem().toString();
        
        int balance_val = 0;
        if(balance == "30 mins"){
            balance_val = 1800;
        } else if (balance == "1 hr 30 mins") {
           balance_val = 5400;
        } else { 
            balance_val = 7200;
        }
        
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_shop","root", "");
            sql = "UPDATE account SET balance= balance + "+balance_val+" WHERE account_id = '" + account_id +"'";
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate(sql);
            
            AddBalance.setVisible(false);
            AddUserMessage.showMessageDialog(this, "Added Succesfully");
            
        } catch (Exception e) {
            AddUserMessage.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_SubmitBalanceActionPerformed

    private void addPC(){
        JButton  btn = new JButton("PC-"+counter);
        counter++;
        panel.add(btn);
        PCPanel.add(panel);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_shop","root", "");
            sql = "SELECT pc_id FROM pc ORDER BY pc_id DESC LIMIT 1";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                this.count = rs.getInt("pc_id") + 1;
                for(int i = 1; i < count; i++){
                    addPC();
                }
            }
        } catch(Exception e){
            
        } 
    }//GEN-LAST:event_formWindowOpened

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountIDField;
    private javax.swing.JFrame AddBalance;
    private javax.swing.JButton AddBalanceUSer;
    private javax.swing.JButton AddNewPC;
    private javax.swing.JButton AddNewUserAccount;
    private javax.swing.JButton AddUser;
    private javax.swing.JFrame AddUserAccount;
    private javax.swing.JOptionPane AddUserMessage;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel NewAccountID;
    private javax.swing.JPanel PCPanel;
    private javax.swing.JButton SubmitBalance;
    private javax.swing.JComboBox<String> balanceBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField newAccountPassword;
    private javax.swing.JTextArea newUserAddress;
    private javax.swing.JTextField newUserAge;
    private javax.swing.JComboBox<String> newUserBalance;
    private javax.swing.JTextField newUserDateOfBirth;
    private javax.swing.JTextField newUserName;
    // End of variables declaration//GEN-END:variables
}