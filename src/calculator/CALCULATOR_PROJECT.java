/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AL AMIN
 */

public class CALCULATOR_PROJECT extends javax.swing.JFrame {
    //Global variable Declaration 
    Connection conn;
    PreparedStatement ps=null;
    ResultSet rs=null;
    double num1;
    double num2;
    double result;
    String operations;
    
        
    public CALCULATOR_PROJECT() {
        initComponents();
        dbConnection();
    }
    
    void dbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/calculator","root","");
            //JOptionPane.showMessageDialog(null, "connection success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Check Your Database Server");
            lblError.setText("Please Check Your Database Server");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        btnBackspace = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnSubstruction = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnSummation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhistory = new javax.swing.JTable();
        btnModulas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator (MD. AL AMIN LU,CSE 1912029001)");
        setResizable(false);

        display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        btnBackspace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackspace.setText("Backspace");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeven.setText("7");
        btnSeven.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnMultiplication.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnSubstruction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubstruction.setText("-");
        btnSubstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubstructionActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnSummation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSummation.setText("+");
        btnSummation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummationActionPerformed(evt);
            }
        });

        btnHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHistory.setText("History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        tblhistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "History"
            }
        ));
        tblhistory.setToolTipText("dfdfdf");
        jScrollPane1.setViewportView(tblhistory);

        btnModulas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModulas.setText("%");
        btnModulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModulasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Design and Developed By MD. AL AMIN Leading University, CSE, ID: 1912029001");

        lblError.setBackground(new java.awt.Color(255, 51, 51));
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnMultiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnSubstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btnModulas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnSummation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(display))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnModulas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSummation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3))
        );

        getAccessibleContext().setAccessibleDescription("Hi This is MD. AL AMIN \nNow I'm Studying in Computer Science and Engineering at Leading University Sylhet and Software Engineer Institute of Information and Communication Technology, BUET.\nMobile: 01521461489\nEmail: aminspicse@gmail.com\nFacebook: facebook.com/amin.spicse");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnSeven.getText());
        } else {
            Enternumber = display.getText() + btnSeven.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnEight.getText());
        } else {
            Enternumber = display.getText() + btnEight.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnNine.getText());
        } else {
            Enternumber = display.getText() + btnNine.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnFour.getText());
        } else {
            Enternumber = display.getText() + btnFour.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnFive.getText());
        } else {
            Enternumber = display.getText() + btnFive.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnSix.getText());
        } else {
            Enternumber = display.getText() + btnSix.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnOne.getText());
        } else {
            Enternumber = display.getText() + btnOne.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnTwo.getText());
        } else {
            Enternumber = display.getText() + btnTwo.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnThree.getText());
        } else {
            Enternumber = display.getText() + btnThree.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        String Enternumber = display.getText();
        if (Enternumber == "") {
            display.setText(btnZero.getText());
        } else {
            Enternumber = display.getText() + btnZero.getText();
            display.setText(Enternumber);
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
      if(!display.getText().contains(".")){
          display.setText(display.getText() + btnDot.getText());
      }  
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        display.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
       String Backspace=null;
       if(display.getText().length() > 0){
           StringBuilder strB=new StringBuilder(display.getText());
           strB.deleteCharAt(display.getText().length() - 1);
           Backspace=strB.toString();
           display.setText(Backspace);
       }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
      num1=Double.parseDouble(display.getText());
      display.setText("");
      operations="/";
      
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
      num1=Double.parseDouble(display.getText());
      display.setText("");
      operations="*";
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnSubstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubstructionActionPerformed
      num1=Double.parseDouble(display.getText());
      display.setText("");
      operations="-";
    }//GEN-LAST:event_btnSubstructionActionPerformed

    private void btnSummationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummationActionPerformed
      num1=Double.parseDouble(display.getText());
      display.setText("");
      operations="+";
    }//GEN-LAST:event_btnSummationActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        String answer;
        num2=Double.parseDouble(display.getText());
        Library lib = new Library();
        //System.out.println(lib.calculation(10,20));
        answer = String.format("%.2f", lib.calculation(num1, operations, num2));
        display.setText(answer);
        //System.out.println(answer);
        
        //System.out.println(num1+""+operations+""+num2+"="+result);
        String sql = "insert into data(operation)values(?)";
        String HISTORY = String.valueOf(num1)+" "+operations+" "+String.valueOf(num2)+" = "+answer;
        System.out.println(HISTORY);
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, HISTORY);
            ps.executeUpdate();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(btnClear, "Something wrong to Execute Query");
        }
        
        History();
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
       
      History();
       
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void btnModulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModulasActionPerformed
        // TODO add your handling code here:
      num1=Double.parseDouble(display.getText());
      display.setText("");
      operations="%";
    }//GEN-LAST:event_btnModulasActionPerformed

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
            java.util.logging.Logger.getLogger(CALCULATOR_PROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR_PROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR_PROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR_PROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULATOR_PROJECT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnModulas;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSubstruction;
    private javax.swing.JButton btnSummation;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTable tblhistory;
    // End of variables declaration//GEN-END:variables

    public void History(){
    
        String sql = "Select * from data order by id desc limit 10";
        DefaultTableModel tm = (DefaultTableModel) tblhistory.getModel();
        tm.setRowCount(0);
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Object o[] = {rs.getString("operation")};
                tm.addRow(o);
                System.out.println(rs.getString("operation"));
                
            }
            //tblhistory.add(btnClear, rs);
            tblhistory.addNotify();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Something Wrong in Database"+ex);
        }
    }
}
