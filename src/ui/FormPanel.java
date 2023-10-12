
package ui;

import java.awt.CardLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Enumeration;
import javax.imageio.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import model.UserPanel;

public class FormPanel extends javax.swing.JPanel {
private JPanel rightPanel;
   

   
    public FormPanel(JPanel inPane) {
        initComponents();
        this.rightPanel=inPane;
        submitButton.setEnabled(false);
     
    }
    private static String sfn;
    private static String sln ;
    private static String sage;
    private static String sgen;
    private static String seml;
    private static String sptype;
    private static String smsg;
    private static Icon proImg;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dobLabel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        fNameInvalid = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        lNameInvalid = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        ageInvalid = new javax.swing.JLabel();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        notSayRadio = new javax.swing.JRadioButton();
        emailTextField = new javax.swing.JTextField();
        emailInvalid = new javax.swing.JLabel();
        patientComboBox = new javax.swing.JComboBox<>();
        patientInvalid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        genderInvalid = new javax.swing.JLabel();
        msgInvalid = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        imgButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        dobInvalid = new javax.swing.JLabel();

        dobLabel.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setBackground(new java.awt.Color(204, 204, 255));
        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setText("Customer Registration Form");

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        ageLabel.setText("Age:");

        genderLabel.setText("Gender:");

        emailLabel.setText("E-mail:");

        countryLabel.setText("Patient Type:");

        messageLabel.setText("Message:");

        fNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameTextFieldKeyTyped(evt);
            }
        });

        fNameInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        fNameInvalid.setForeground(new java.awt.Color(255, 0, 51));

        lNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyTyped(evt);
            }
        });

        lNameInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lNameInvalid.setForeground(new java.awt.Color(255, 0, 51));

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });

        ageInvalid.setBackground(new java.awt.Color(204, 204, 255));
        ageInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        ageInvalid.setForeground(new java.awt.Color(255, 0, 51));

        buttonGroup1.add(femaleRadio);
        femaleRadio.setText("Female");

        buttonGroup1.add(maleRadio);
        maleRadio.setText("Male");

        buttonGroup1.add(notSayRadio);
        notSayRadio.setText("Prefer not to say");

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
        });
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyTyped(evt);
            }
        });

        emailInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        emailInvalid.setForeground(new java.awt.Color(255, 0, 51));

        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In-Patient", "Out Patient", "New Patient" }));
        patientComboBox.setSelectedIndex(-1);
        patientComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                patientComboBoxFocusLost(evt);
            }
        });
        patientComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientComboBoxActionPerformed(evt);
            }
        });
        patientComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patientComboBoxKeyReleased(evt);
            }
        });

        patientInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        patientInvalid.setForeground(new java.awt.Color(255, 0, 51));

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        messageTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                messageTextAreaFocusGained(evt);
            }
        });
        messageTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                messageTextAreaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(messageTextArea);

        jLabel2.setText("Please upload Photo");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        genderInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        genderInvalid.setForeground(new java.awt.Color(255, 0, 51));

        msgInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        msgInvalid.setForeground(new java.awt.Color(255, 0, 51));

        picLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imgButton.setText("Choose Image");
        imgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Date Of Birth:");

        dobInvalid.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout dobLabelLayout = new javax.swing.GroupLayout(dobLabel);
        dobLabel.setLayout(dobLabelLayout);
        dobLabelLayout.setHorizontalGroup(
            dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dobLabelLayout.createSequentialGroup()
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dobLabelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel)
                            .addComponent(lNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel)
                            .addComponent(emailLabel)
                            .addComponent(countryLabel)
                            .addComponent(messageLabel)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(115, 115, 115)
                        .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dobLabelLayout.createSequentialGroup()
                                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(dobInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(dobLabelLayout.createSequentialGroup()
                                    .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(patientInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))
                                .addGroup(dobLabelLayout.createSequentialGroup()
                                    .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                        .addComponent(fNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(dobLabelLayout.createSequentialGroup()
                                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ageInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dobLabelLayout.createSequentialGroup()
                                    .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(dobLabelLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(emailTextField))
                                        .addComponent(jScrollPane1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(msgInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(dobLabelLayout.createSequentialGroup()
                                    .addComponent(femaleRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(maleRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notSayRadio)
                                    .addGap(38, 38, 38)
                                    .addComponent(genderInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                            .addGroup(dobLabelLayout.createSequentialGroup()
                                .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(imgButton))))
                    .addGroup(dobLabelLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(titleLabel))
                    .addGroup(dobLabelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(submitButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        dobLabelLayout.setVerticalGroup(
            dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dobLabelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addGap(44, 44, 44)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameLabel))
                .addGap(18, 18, 18)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lNameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel)
                    .addComponent(ageInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dobLabelLayout.createSequentialGroup()
                        .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(femaleRadio)
                            .addComponent(maleRadio)
                            .addComponent(notSayRadio))
                        .addGap(23, 23, 23)
                        .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailLabel)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dobLabelLayout.createSequentialGroup()
                        .addComponent(genderInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(emailInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(countryLabel)
                        .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dobLabelLayout.createSequentialGroup()
                        .addComponent(msgInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dobLabelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(dobLabelLayout.createSequentialGroup()
                                .addGroup(dobLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(imgButton))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addComponent(submitButton)
                        .addGap(21, 21, 21))
                    .addGroup(dobLabelLayout.createSequentialGroup()
                        .addComponent(messageLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextFieldKeyReleased
         sfn = fNameTextField.getText();
        boolean bflag=sfn.matches("^[A-Z ]*");
        if(bflag)
        {
            fNameInvalid.setVisible(false);
        }
        else
        {
            fNameInvalid.setText("Please enter only alphabets");
            fNameInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_fNameTextFieldKeyReleased

    private void fNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_fNameTextFieldKeyTyped

    private void lNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyReleased
         sln = lNameTextField.getText();
        boolean bflag=sln.matches("^[A-Z ]*");
        if(bflag)
        {
            lNameInvalid.setVisible(false);
        }
        else
        {
            lNameInvalid.setText("Please enter only alphabets");
            lNameInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_lNameTextFieldKeyReleased

    private void lNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_lNameTextFieldKeyTyped

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
          sage = ageTextField.getText();
        boolean bageflag = sage.matches("^[0-9]*");
        if(bageflag)
        {
            ageInvalid.setVisible(false);
        }
        else
        {
            ageInvalid.setText("Please enter only digits");
            ageInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_ageTextFieldKeyReleased

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        boolean bgenderflag = femaleRadio.isSelected() ||maleRadio.isSelected() ||notSayRadio.isSelected() ;
        if(bgenderflag)
        {
            genderInvalid.setVisible(false);

        }
        else
        {
            genderInvalid.setText("Please choose one");
            genderInvalid.setVisible(true);
        }
        Date dob=dateField.getDate();
        Date currentDate= new Date();
        // LocalDateTime currentDate = LocalDateTime.now();
        if(currentDate.before(dob)){
            dobInvalid.setText("Please enter a date before current date");
            dobInvalid.setVisible(true);   
        }
        else 
            dobInvalid.setVisible(false);
        
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
          seml = emailTextField.getText();
        boolean bemlflag = seml.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        if(bemlflag)
        {
            emailInvalid.setVisible(false);
        }
        else
        {
            emailInvalid.setText("Please enter a valid email address");
            emailInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void emailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isUpperCase(keych))
        {
            evt.setKeyChar(Character.toLowerCase(keych));
        }
    }//GEN-LAST:event_emailTextFieldKeyTyped

    private void patientComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patientComboBoxFocusLost
        int scntryflg = patientComboBox.getSelectedIndex();
        if(scntryflg!=-1)
        {
            patientInvalid.setVisible(false);
        }
        else
        {
            patientInvalid.setText("Please choose one");
            patientInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_patientComboBoxFocusLost

    private void patientComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientComboBoxActionPerformed
        checkinputs();
    }//GEN-LAST:event_patientComboBoxActionPerformed

    private void patientComboBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientComboBoxKeyReleased
         sptype= (String) patientComboBox.getSelectedItem();
        checkinputs();
    }//GEN-LAST:event_patientComboBoxKeyReleased

    private void messageTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageTextAreaFocusGained
        int scntryflg = patientComboBox.getSelectedIndex();
        if(scntryflg!=-1)
        {
            patientInvalid.setVisible(false);
            String msg= messageTextArea.getText();
            if(msg.isBlank()){
                msgInvalid.setText("Please type the message");
                msgInvalid.setVisible(true);
            }
            else{
                msgInvalid.setVisible(false);
            }

        }
        else
        {
            patientInvalid.setText("Please choose one");
            patientInvalid.setVisible(true);
        }
    }//GEN-LAST:event_messageTextAreaFocusGained

    private void messageTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTextAreaKeyReleased
        checkinputs();
    }//GEN-LAST:event_messageTextAreaKeyReleased

    private void messageTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTextAreaKeyTyped
          smsg= messageTextArea.getText();
        if(smsg.isBlank()){
            msgInvalid.setText("Please type the message");
            msgInvalid.setVisible(true);
        }
        else{
            msgInvalid.setVisible(false);
        }
    }//GEN-LAST:event_messageTextAreaKeyTyped

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
      
        checkinputs();
        JOptionPane.showMessageDialog(null, "Submitted Successfully");
        
        UserPanel newUserPanel= new UserPanel();
        newUserPanel.setFirstName(fNameTextField.getText());
        newUserPanel.setLastName(lNameTextField.getText());
        newUserPanel.setAge(ageTextField.getText());
        newUserPanel.setDOB(dateField.getDate());
        newUserPanel.setGender(getSelectedButtonText(buttonGroup1));
        newUserPanel.setEmail(emailTextField.getText());
        newUserPanel.setPatientType((String) patientComboBox.getSelectedItem());
        newUserPanel.setMsg(messageTextArea.getText());
        newUserPanel.setPic(picLabel.getIcon());
       
        
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setUserPanel(newUserPanel);
        topFrame.viewButton.setEnabled(true);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void imgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        try {
            ImageIcon imageicon=new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(filename))));//get the image from file chooser and scale it to match JLabel size
            picLabel.setIcon(imageicon);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        checkinputs();
    }//GEN-LAST:event_imgButtonActionPerformed

    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
    Graphics2D g2d = (Graphics2D) bi.createGraphics();
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(img, 0, 0, w, h, null);
    g2d.dispose();
    return bi;
}
    public void checkinputs(){
        boolean bemlflag = emailTextField.getText().matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        boolean bageflag = ageTextField.getText().matches("^[0-9]*");
        boolean blnflag=lNameTextField.getText().matches("^[A-Z ]*");
        boolean bflag=fNameTextField.getText().matches("^[A-Z ]*");
        boolean bgenderflag = femaleRadio.isSelected() ||maleRadio.isSelected() ||notSayRadio.isSelected() ;
        int scntryflg = patientComboBox.getSelectedIndex();
        String smsg= messageTextArea.getText();
         Icon proImg= picLabel.getIcon();
        if(bemlflag && bageflag && blnflag && bflag && bgenderflag && !smsg.isBlank() && !(scntryflg==-1) && (proImg!=null))
        {
            submitButton.setEnabled(true);
        }
        else{
            submitButton.setEnabled(false);          
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageInvalid;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel countryLabel;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel dobInvalid;
    private javax.swing.JPanel dobLabel;
    private javax.swing.JLabel emailInvalid;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fNameInvalid;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderInvalid;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton imgButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNameInvalid;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel msgInvalid;
    private javax.swing.JRadioButton notSayRadio;
    private javax.swing.JComboBox<String> patientComboBox;
    private javax.swing.JLabel patientInvalid;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private String getSelectedButtonText(ButtonGroup buttonGroup1) {
          for (Enumeration buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = (AbstractButton) buttons.nextElement();

        if (button.isSelected()) {
            return button.getText();
        }
    }

    return null;
    }
}

