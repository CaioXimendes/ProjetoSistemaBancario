/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteInterfaceVisual;

import PacoteInterfaceVisual.Usuario.Boleto;
import PacoteInterfaceVisual.Usuario.ListaDeBancos;
import PacoteInterfaceVisual.Usuario.Usuario;
import PacoteRegraDeNegocio.ValidarInformacoesUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CaioFSX
 */
public class PaginaPagar extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public PaginaPagar() {
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
        AlterarEmailTitulo = new javax.swing.JTextField();
        BotaoGerarBoletoDeposito = new javax.swing.JButton();
        PagamentoBoletoTitulo = new javax.swing.JTextField();
        BotaoPagarViaBoleto = new javax.swing.JButton();
        BotaoVoltar = new javax.swing.JButton();
        CampoInserirCodigoBoletoFORMATADO = new javax.swing.JFormattedTextField();
        CampoInserirQuantiaDeposito = new javax.swing.JTextField();

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

        AlterarEmailTitulo.setEditable(false);
        AlterarEmailTitulo.setBackground(new java.awt.Color(255, 255, 255));
        AlterarEmailTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AlterarEmailTitulo.setText("Depósito via Boleto");
        AlterarEmailTitulo.setBorder(null);
        AlterarEmailTitulo.setFocusable(false);
        AlterarEmailTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarEmailTituloActionPerformed(evt);
            }
        });

        BotaoGerarBoletoDeposito.setBackground(new java.awt.Color(204, 0, 0));
        BotaoGerarBoletoDeposito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoGerarBoletoDeposito.setForeground(new java.awt.Color(255, 255, 255));
        BotaoGerarBoletoDeposito.setText("Gerar boleto de depósito");
        BotaoGerarBoletoDeposito.setBorderPainted(false);
        BotaoGerarBoletoDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarBoletoDepositoActionPerformed(evt);
            }
        });

        PagamentoBoletoTitulo.setEditable(false);
        PagamentoBoletoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        PagamentoBoletoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PagamentoBoletoTitulo.setText("Pagamento via Boleto");
        PagamentoBoletoTitulo.setBorder(null);
        PagamentoBoletoTitulo.setFocusable(false);
        PagamentoBoletoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentoBoletoTituloActionPerformed(evt);
            }
        });

        BotaoPagarViaBoleto.setBackground(new java.awt.Color(204, 0, 0));
        BotaoPagarViaBoleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoPagarViaBoleto.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPagarViaBoleto.setText("Pagar Via Boleto");
        BotaoPagarViaBoleto.setToolTipText("");
        BotaoPagarViaBoleto.setBorderPainted(false);
        BotaoPagarViaBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPagarViaBoletoActionPerformed(evt);
            }
        });

        BotaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoVoltar.setBorderPainted(false);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        try {
            CampoInserirCodigoBoletoFORMATADO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############################################")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoInserirCodigoBoletoFORMATADO.setToolTipText("inserir codigo boleto");

        CampoInserirQuantiaDeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoInserirQuantiaDepositoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPanelHOMELayout = new javax.swing.GroupLayout(JPanelHOME);
        JPanelHOME.setLayout(JPanelHOMELayout);
        JPanelHOMELayout.setHorizontalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(CampoInserirCodigoBoletoFORMATADO, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoPagarViaBoleto))
                            .addComponent(PagamentoBoletoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addComponent(CampoInserirQuantiaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoGerarBoletoDeposito)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlterarEmailTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        JPanelHOMELayout.setVerticalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(AlterarEmailTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoGerarBoletoDeposito)
                    .addComponent(CampoInserirQuantiaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(PagamentoBoletoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPagarViaBoleto)
                    .addComponent(CampoInserirCodigoBoletoFORMATADO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void AlterarEmailTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarEmailTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarEmailTituloActionPerformed

    private void BotaoGerarBoletoDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarBoletoDepositoActionPerformed
        // TODO add your handling code here:

        System.out.println(CampoInserirQuantiaDeposito.getText());
        double variavel = 0;
        long variavelLong = 0;
        variavel = Double.parseDouble(CampoInserirQuantiaDeposito.getText());
        variavelLong = Math.round(variavel * 100);
        Boleto.setValorBoleto(variavelLong);
        System.out.println(Boleto.getValorBoleto());
        CampoInserirQuantiaDeposito.setText(null);
        ValidarInformacoesUsuario v1 = new ValidarInformacoesUsuario();
        v1.gerarBoletoDeposito();
        if (Usuario.getUsuarioValido()) {
            JOptionPane.showMessageDialog(null, "E-mail com o código do Boleto Bancário Enviado!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Houve uma falha, Entre em contato com o setor de TI do BANCO JAVA!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            v1.enviarCodigoBoletoEmail();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_BotaoGerarBoletoDepositoActionPerformed

    private void PagamentoBoletoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentoBoletoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagamentoBoletoTituloActionPerformed

    private void BotaoPagarViaBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPagarViaBoletoActionPerformed
        // TODO add your handling code here:
        Boleto.setCodigoBoleto(CampoInserirCodigoBoletoFORMATADO.getText());
        System.out.println(CampoInserirCodigoBoletoFORMATADO.getText());
        ValidarInformacoesUsuario v1 = new ValidarInformacoesUsuario();
        try {
            v1.consultarSaldo();
            v1.verificarBoleto();
            v1.consultarListaDeBancos();
            //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ABAIXO> ========
            if (Boleto.getCodigoBanco().equals("999")) {
                if (ListaDeBancos.isCodigoValido()) {
                    if (Boleto.getDataValidadeBoletoValida()) {
                        v1.realizarPagamentoBoleto();
                        JOptionPane.showMessageDialog(null, "Pagamento de R$: " + (Boleto.getValorBoleto() / 100.0) + " realizado via Boleto Bancário, Instituição Financeira: " + ListaDeBancos.getNomeBanco() + "Data de validade: " + Boleto.getDataValidadeBoleto(), "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este boleto está com a data vencida! Data de validade:" + Boleto.getDataValidadeBoleto(), "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Banco desconhecido da nossa base de dados!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ACIMA> ========
                if ((Boleto.getValorBoleto() / 100.00) <= Usuario.getSaldo()) {
                    if (ListaDeBancos.isCodigoValido()) {
                        if (Boleto.getDataValidadeBoletoValida()) {
                            v1.realizarPagamentoBoleto();
                            JOptionPane.showMessageDialog(null, "Pagamento de R$: " + (Boleto.getValorBoleto() / 100.0) + " realizado via Boleto Bancário, Instituição Financeira: " + ListaDeBancos.getNomeBanco() + "Data de validade: " + Boleto.getDataValidadeBoleto(), "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Este boleto está com a data vencida! Data de validade:" + Boleto.getDataValidadeBoleto(), "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Banco desconhecido da nossa base de dados!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ABAIXO> ========
                } else if (!Boleto.getCodigoBanco().equals("999")) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para o pagamento!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                }
                //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ACIMA> ========
            }

        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        System.out.println(Boleto.getCodigoBanco() + "\n" + Boleto.getFatorVencimento() + "\n" + Boleto.getValorBoleto());

    }//GEN-LAST:event_BotaoPagarViaBoletoActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaHome p1 = new PaginaHome();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void CampoInserirQuantiaDepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoInserirQuantiaDepositoKeyTyped
        // TODO add your handling code here:
        char caractere = evt.getKeyChar();
        if (caractere == '.' && CampoInserirQuantiaDeposito.getText().contains(".")) {
            evt.consume();
        }
        if (!Character.isDigit(caractere)) {
            if (!(caractere == '.')) {
                evt.consume();
            }
        }
        if (CampoInserirQuantiaDeposito.getText().length() == 4) {
            if (!CampoInserirQuantiaDeposito.getText().contains(".")) {
                evt.setKeyChar('.');
            }
        }
        if (CampoInserirQuantiaDeposito.getText().length() > 6) {
            evt.consume();
        }
    }//GEN-LAST:event_CampoInserirQuantiaDepositoKeyTyped

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
            java.util.logging.Logger.getLogger(PaginaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaginaPagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlterarEmailTitulo;
    private javax.swing.JButton BotaoGerarBoletoDeposito;
    private javax.swing.JButton BotaoPagarViaBoleto;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JFormattedTextField CampoInserirCodigoBoletoFORMATADO;
    private javax.swing.JTextField CampoInserirQuantiaDeposito;
    private javax.swing.JLabel IconeLogo;
    private javax.swing.JPanel JPanelHOME;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PagamentoBoletoTitulo;
    private javax.swing.JTextField PerguntasFrequentes;
    // End of variables declaration//GEN-END:variables
}
