package com.mycompany.calculadora_interface_java;

public class Principal extends javax.swing.JFrame {

    int total = 0;
    int operacao = 0;
    boolean limpar = true;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        mainSection = new javax.swing.JPanel();
        resultSection = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextPane = new javax.swing.JTextPane();
        buttonSection = new javax.swing.JPanel();
        numberButton1 = new javax.swing.JButton();
        numberButton2 = new javax.swing.JButton();
        numberButton3 = new javax.swing.JButton();
        numberButton4 = new javax.swing.JButton();
        numberButton5 = new javax.swing.JButton();
        numberButton6 = new javax.swing.JButton();
        numberButton7 = new javax.swing.JButton();
        numberButton8 = new javax.swing.JButton();
        numberButton9 = new javax.swing.JButton();
        numberButton0 = new javax.swing.JButton();
        removeLastButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        clearButton.setText("Limpar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(resultTextPane);

        javax.swing.GroupLayout resultSectionLayout = new javax.swing.GroupLayout(resultSection);
        resultSection.setLayout(resultSectionLayout);
        resultSectionLayout.setHorizontalGroup(
            resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(resultSectionLayout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        resultSectionLayout.setVerticalGroup(
            resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        numberButton1.setText("1");
        numberButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton1ActionPerformed(evt);
            }
        });

        numberButton2.setText("2");
        numberButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton2ActionPerformed(evt);
            }
        });

        numberButton3.setText("3");
        numberButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton3ActionPerformed(evt);
            }
        });

        numberButton4.setText("4");
        numberButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton4ActionPerformed(evt);
            }
        });

        numberButton5.setText("5");
        numberButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton5ActionPerformed(evt);
            }
        });

        numberButton6.setText("6");
        numberButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton6ActionPerformed(evt);
            }
        });

        numberButton7.setText("7");
        numberButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton7ActionPerformed(evt);
            }
        });

        numberButton8.setText("8");
        numberButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton8ActionPerformed(evt);
            }
        });

        numberButton9.setText("9");
        numberButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton9ActionPerformed(evt);
            }
        });

        numberButton0.setText("0");
        numberButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButton0ActionPerformed(evt);
            }
        });

        removeLastButton.setText("<");
        removeLastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLastButtonActionPerformed(evt);
            }
        });

        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        divisionButton.setText("/");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setText("*");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonSectionLayout = new javax.swing.GroupLayout(buttonSection);
        buttonSection.setLayout(buttonSectionLayout);
        buttonSectionLayout.setHorizontalGroup(
            buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonSectionLayout.createSequentialGroup()
                .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonSectionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonSectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonSectionLayout.createSequentialGroup()
                        .addComponent(numberButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonSectionLayout.createSequentialGroup()
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeLastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        buttonSectionLayout.setVerticalGroup(
            buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonSectionLayout.createSequentialGroup()
                .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonSectionLayout.createSequentialGroup()
                        .addComponent(numberButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonSectionLayout.createSequentialGroup()
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonSectionLayout.createSequentialGroup()
                                .addComponent(numberButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(buttonSectionLayout.createSequentialGroup()
                                .addComponent(numberButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(buttonSectionLayout.createSequentialGroup()
                                .addComponent(removeLastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainSectionLayout = new javax.swing.GroupLayout(mainSection);
        mainSection.setLayout(mainSectionLayout);
        mainSectionLayout.setHorizontalGroup(
            mainSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        mainSectionLayout.setVerticalGroup(
            mainSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        resultTextPane.setText("");
        limpar = true;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void numberButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton1ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("1");
            limpar = false;
        } else {
            resultTextPane.setText(resultTextPane.getText() + "1");
        }

    }//GEN-LAST:event_numberButton1ActionPerformed

    private void numberButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton2ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("2");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "2");
    }//GEN-LAST:event_numberButton2ActionPerformed

    private void numberButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton3ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("3");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "3");
    }//GEN-LAST:event_numberButton3ActionPerformed

    private void numberButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton4ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("4");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "4");
    }//GEN-LAST:event_numberButton4ActionPerformed

    private void numberButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton5ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("5");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "5");
    }//GEN-LAST:event_numberButton5ActionPerformed

    private void numberButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton6ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("6");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "6");
    }//GEN-LAST:event_numberButton6ActionPerformed

    private void numberButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton7ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("7");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "7");
    }//GEN-LAST:event_numberButton7ActionPerformed

    private void numberButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton8ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("6");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "6");
    }//GEN-LAST:event_numberButton8ActionPerformed

    private void numberButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton9ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("9");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "9");
    }//GEN-LAST:event_numberButton9ActionPerformed

    private void numberButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButton0ActionPerformed
        // TODO add your handling code here:
        if (limpar) {
            resultTextPane.setText("0");
            limpar = false;
        } else
            resultTextPane.setText(resultTextPane.getText() + "0");
    }//GEN-LAST:event_numberButton0ActionPerformed

    private void removeLastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLastButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeLastButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        // Soma
        if (!limpar) {
            operacao = 1;
            total = Integer.parseInt(resultTextPane.getText());
            limpar = true;
        }
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        // Subtração
        if (!limpar) {
            operacao = 2; // Defini qual operação está sendo realizada.
            total = Integer.parseInt(resultTextPane.getText());
            limpar = true;
        }
    }//GEN-LAST:event_minusButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        // Divisão
        if (!limpar) {
            operacao = 4; // Defini qual operação está sendo realizada.
            total = Integer.parseInt(resultTextPane.getText());
            limpar = true;
        }
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        // Multiplicação
        if (!limpar) {
            operacao = 3; // Defini qual operação está sendo realizada.
            total = Integer.parseInt(resultTextPane.getText());
            limpar = true;
        }
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        int valor;
        switch (operacao) {
            case 1:
                valor = Integer.parseInt(resultTextPane.getText());
                total += valor;
                resultTextPane.setText("" + total);
                limpar = true;
                break;
            case 2:
                valor = Integer.parseInt(resultTextPane.getText());
                total -= valor;
                resultTextPane.setText("" + total);
                limpar = true;
                break;
            case 3:
                valor = Integer.parseInt(resultTextPane.getText());
                total *= valor;
                resultTextPane.setText("" + total);
                limpar = true;
                break;
            case 4:
                valor = Integer.parseInt(resultTextPane.getText());
                if (valor != 0) {
                    total /= valor;
                    resultTextPane.setText("" + total);
                    limpar = true;
                } else{
                    resultTextPane.setText("Erro");
                    limpar = true;
                }

                break;
            default:

                break;
        }
    }//GEN-LAST:event_equalsButtonActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonSection;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainSection;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton numberButton0;
    private javax.swing.JButton numberButton1;
    private javax.swing.JButton numberButton2;
    private javax.swing.JButton numberButton3;
    private javax.swing.JButton numberButton4;
    private javax.swing.JButton numberButton5;
    private javax.swing.JButton numberButton6;
    private javax.swing.JButton numberButton7;
    private javax.swing.JButton numberButton8;
    private javax.swing.JButton numberButton9;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton removeLastButton;
    private javax.swing.JPanel resultSection;
    private javax.swing.JTextPane resultTextPane;
    // End of variables declaration//GEN-END:variables
}
