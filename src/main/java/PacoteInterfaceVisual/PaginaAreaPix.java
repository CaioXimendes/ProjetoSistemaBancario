/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteInterfaceVisual;

import PacoteInterfaceVisual.Usuario.OperacoesBancarias;
import PacoteInterfaceVisual.Usuario.Usuario;
import PacoteRegraDeNegocio.ValidarInformacoesUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CaioFSX
 */
public class PaginaAreaPix extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public PaginaAreaPix() {
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

        JPanelHOME = new javax.swing.JPanel();
        IconeLogo = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        PerguntasFrequentes = new javax.swing.JTextField();
        TransferenciaPixTitulo = new javax.swing.JTextField();
        BotaoTransferirPix = new javax.swing.JButton();
        ConfirmarSenha4DigitosTitulo = new javax.swing.JTextField();
        BotaoVoltar1 = new javax.swing.JButton();
        BotaoConfirmarPix = new javax.swing.JButton();
        CampoInserirChavePix = new javax.swing.JFormattedTextField();
        CampoInserirQuantiaTransferenciaPix = new javax.swing.JFormattedTextField();
        CampoInserirSenha4Digitos = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JPanelHOME.setBackground(new java.awt.Color(255, 255, 255));

        IconeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCircular2.png"))); // NOI18N
        IconeLogo.setText("jLabel1");

        NomeCliente.setEditable(false);
        NomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        NomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NomeCliente.setText("NomeCliente");
        NomeCliente.setBorder(null);
        NomeCliente.setFocusable(false);
        NomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeClienteActionPerformed(evt);
            }
        });

        PerguntasFrequentes.setEditable(false);
        PerguntasFrequentes.setBackground(new java.awt.Color(255, 255, 255));
        PerguntasFrequentes.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PerguntasFrequentes.setText("Perguntas Frequentes");
        PerguntasFrequentes.setBorder(null);
        PerguntasFrequentes.setFocusable(false);
        PerguntasFrequentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerguntasFrequentesActionPerformed(evt);
            }
        });

        TransferenciaPixTitulo.setEditable(false);
        TransferenciaPixTitulo.setBackground(new java.awt.Color(255, 255, 255));
        TransferenciaPixTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TransferenciaPixTitulo.setText("Transferência via PIX");
        TransferenciaPixTitulo.setBorder(null);
        TransferenciaPixTitulo.setFocusable(false);
        TransferenciaPixTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciaPixTituloActionPerformed(evt);
            }
        });

        BotaoTransferirPix.setBackground(new java.awt.Color(204, 0, 0));
        BotaoTransferirPix.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoTransferirPix.setForeground(new java.awt.Color(255, 255, 255));
        BotaoTransferirPix.setText("Transferir");
        BotaoTransferirPix.setBorderPainted(false);
        BotaoTransferirPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTransferirPixActionPerformed(evt);
            }
        });

        ConfirmarSenha4DigitosTitulo.setEditable(false);
        ConfirmarSenha4DigitosTitulo.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmarSenha4DigitosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ConfirmarSenha4DigitosTitulo.setText("Digite sua senha de 4 dígitos para confirmar a operação:");
        ConfirmarSenha4DigitosTitulo.setBorder(null);
        ConfirmarSenha4DigitosTitulo.setEnabled(false);
        ConfirmarSenha4DigitosTitulo.setFocusable(false);
        ConfirmarSenha4DigitosTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarSenha4DigitosTituloActionPerformed(evt);
            }
        });

        BotaoVoltar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoVoltar1.setText("Voltar");
        BotaoVoltar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoVoltar1.setBorderPainted(false);
        BotaoVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltar1ActionPerformed(evt);
            }
        });

        BotaoConfirmarPix.setBackground(new java.awt.Color(204, 0, 0));
        BotaoConfirmarPix.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoConfirmarPix.setForeground(new java.awt.Color(255, 255, 255));
        BotaoConfirmarPix.setText("Confirmar");
        BotaoConfirmarPix.setBorderPainted(false);
        BotaoConfirmarPix.setEnabled(false);
        BotaoConfirmarPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarPixActionPerformed(evt);
            }
        });

        try {
            CampoInserirChavePix.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoInserirChavePix.setToolTipText("Inserir Chave Pix(CPF)");

        try {
            CampoInserirQuantiaTransferenciaPix.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#*********")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoInserirQuantiaTransferenciaPix.setToolTipText("Inserir Quantia");
        CampoInserirQuantiaTransferenciaPix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoInserirQuantiaTransferenciaPixKeyTyped(evt);
            }
        });

        CampoInserirSenha4Digitos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoInserirSenha4DigitosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPanelHOMELayout = new javax.swing.GroupLayout(JPanelHOME);
        JPanelHOME.setLayout(JPanelHOMELayout);
        JPanelHOMELayout.setHorizontalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addComponent(ConfirmarSenha4DigitosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TransferenciaPixTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addComponent(CampoInserirQuantiaTransferenciaPix, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoInserirChavePix, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoTransferirPix))
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addComponent(CampoInserirSenha4Digitos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoConfirmarPix)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JPanelHOMELayout.setVerticalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(TransferenciaPixTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoTransferirPix)
                    .addComponent(CampoInserirChavePix, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoInserirQuantiaTransferenciaPix, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ConfirmarSenha4DigitosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoConfirmarPix)
                    .addComponent(CampoInserirSenha4Digitos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(BotaoVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(JPanelHOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelHOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeClienteActionPerformed

    private void PerguntasFrequentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerguntasFrequentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerguntasFrequentesActionPerformed

    private void TransferenciaPixTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciaPixTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransferenciaPixTituloActionPerformed

    private void BotaoTransferirPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTransferirPixActionPerformed
        // TODO add your handling code here:
        ValidarInformacoesUsuario v1 = new ValidarInformacoesUsuario();
        try {
            v1.buscarSenha4Digitos();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        }

        ConfirmarSenha4DigitosTitulo.setEnabled(true);
        CampoInserirSenha4Digitos.setEnabled(true);
        BotaoConfirmarPix.setEnabled(true);
        CampoInserirChavePix.setEnabled(false);
        TransferenciaPixTitulo.setEnabled(false);
        CampoInserirQuantiaTransferenciaPix.setEnabled(false);
        BotaoTransferirPix.setEnabled(false);

    }//GEN-LAST:event_BotaoTransferirPixActionPerformed

    private void ConfirmarSenha4DigitosTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarSenha4DigitosTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarSenha4DigitosTituloActionPerformed

    private void BotaoVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltar1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaHome p1 = new PaginaHome();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoVoltar1ActionPerformed

    private void BotaoConfirmarPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarPixActionPerformed
        // TODO add your handling code here:

        OperacoesBancarias.setChavePixCpf(CampoInserirChavePix.getText());
        OperacoesBancarias.setQuantiaTransferencia(Double.parseDouble(CampoInserirQuantiaTransferenciaPix.getText()));

        ValidarInformacoesUsuario v1 = new ValidarInformacoesUsuario();
        try {
            v1.consultarSaldo();
            if (Double.parseDouble(CampoInserirQuantiaTransferenciaPix.getText()) <= Usuario.getSaldo()) {
                if (Integer.parseInt(CampoInserirSenha4Digitos.getText()) == Usuario.getSenha4Digitos()) {
                    v1.transferirViaPix();
                    if (OperacoesBancarias.getChavePixValida()) {
                        JOptionPane.showMessageDialog(null, "Pix de R$ " + OperacoesBancarias.getQuantiaTransferencia() + " realizado para a chave pix: " + OperacoesBancarias.getChavePixCpf(), "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                        ConfirmarSenha4DigitosTitulo.setEnabled(false);
                        CampoInserirSenha4Digitos.setEnabled(false);
                        BotaoConfirmarPix.setEnabled(false);
                        TransferenciaPixTitulo.setEnabled(true);
                        CampoInserirQuantiaTransferenciaPix.setEnabled(true);
                        BotaoTransferirPix.setEnabled(true);
                        TransferenciaPixTitulo.setEnabled(true);
                        CampoInserirChavePix.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não encontramos essa chave pix cadastrada no nosso banco!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                        ConfirmarSenha4DigitosTitulo.setEnabled(false);
                        CampoInserirSenha4Digitos.setEnabled(false);
                        BotaoConfirmarPix.setEnabled(false);
                        TransferenciaPixTitulo.setEnabled(true);
                        CampoInserirQuantiaTransferenciaPix.setEnabled(true);
                        BotaoTransferirPix.setEnabled(true);
                        TransferenciaPixTitulo.setEnabled(true);
                        CampoInserirChavePix.setEnabled(true);
                    }
                } else if (Integer.parseInt(CampoInserirSenha4Digitos.getText()) != Usuario.getSenha4Digitos()) {
                    JOptionPane.showMessageDialog(null, "Senha de 4 dígitos incorreta!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                } else if (Usuario.getSenha4Digitos() == 0) {
                    JOptionPane.showMessageDialog(null, "Você não cadastrou uma senha de 4 dígitos!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a transferência!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                ConfirmarSenha4DigitosTitulo.setEnabled(false);
                CampoInserirSenha4Digitos.setEnabled(false);
                BotaoConfirmarPix.setEnabled(false);
                TransferenciaPixTitulo.setEnabled(true);
                CampoInserirQuantiaTransferenciaPix.setEnabled(true);
                BotaoTransferirPix.setEnabled(true);
                TransferenciaPixTitulo.setEnabled(true);
                CampoInserirChavePix.setEnabled(true);
            }

        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        }


    }//GEN-LAST:event_BotaoConfirmarPixActionPerformed

    private void CampoInserirQuantiaTransferenciaPixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoInserirQuantiaTransferenciaPixKeyTyped
        // TODO add your handling code here:
        char caractere = evt.getKeyChar();
        if(caractere == '.' && CampoInserirQuantiaTransferenciaPix.getText().contains(".")){
            evt.consume();
        }
        if(!Character.isDigit(caractere)){
            if(!(caractere == '.')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_CampoInserirQuantiaTransferenciaPixKeyTyped

    private void CampoInserirSenha4DigitosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoInserirSenha4DigitosKeyTyped
        // TODO add your handling code here:
        char caractere = evt.getKeyChar();
        if (!Character.isDigit(caractere)) {
            evt.consume();
        }
        if (CampoInserirSenha4Digitos.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_CampoInserirSenha4DigitosKeyTyped

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
            java.util.logging.Logger.getLogger(PaginaAreaPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaAreaPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaAreaPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaAreaPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaginaAreaPix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirmarPix;
    private javax.swing.JButton BotaoTransferirPix;
    private javax.swing.JButton BotaoVoltar1;
    private javax.swing.JFormattedTextField CampoInserirChavePix;
    private javax.swing.JFormattedTextField CampoInserirQuantiaTransferenciaPix;
    private javax.swing.JPasswordField CampoInserirSenha4Digitos;
    private javax.swing.JTextField ConfirmarSenha4DigitosTitulo;
    private javax.swing.JLabel IconeLogo;
    private javax.swing.JPanel JPanelHOME;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PerguntasFrequentes;
    private javax.swing.JTextField TransferenciaPixTitulo;
    // End of variables declaration//GEN-END:variables
}
