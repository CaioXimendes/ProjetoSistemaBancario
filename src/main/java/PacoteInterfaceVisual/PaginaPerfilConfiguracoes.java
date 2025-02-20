/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteInterfaceVisual;

import PacoteInterfaceVisual.Usuario.Usuario;

/**
 *
 * @author CaioFSX
 */
public class PaginaPerfilConfiguracoes extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public PaginaPerfilConfiguracoes() {
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
        PerfilConfiguracoes = new javax.swing.JTextField();
        BotaoAlterarDados = new javax.swing.JButton();
        IconeLogo = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        BotaoSeguranca = new javax.swing.JButton();
        BotaoDadosPessoais = new javax.swing.JButton();
        PerguntasFrequentes = new javax.swing.JTextField();
        BotaoMeuCartao = new javax.swing.JButton();
        BotaoTermos = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        BotaoExcluirConta = new javax.swing.JButton();
        BotaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JPanelHOME.setBackground(new java.awt.Color(255, 255, 255));

        PerfilConfiguracoes.setEditable(false);
        PerfilConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));
        PerfilConfiguracoes.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PerfilConfiguracoes.setText("PERFIL E CONFIGURAÇÕES");
        PerfilConfiguracoes.setBorder(null);
        PerfilConfiguracoes.setFocusable(false);
        PerfilConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilConfiguracoesActionPerformed(evt);
            }
        });

        BotaoAlterarDados.setBackground(new java.awt.Color(204, 0, 0));
        BotaoAlterarDados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoAlterarDados.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAlterarDados.setText("Alterar Dados");
        BotaoAlterarDados.setBorderPainted(false);
        BotaoAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarDadosActionPerformed(evt);
            }
        });

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

        BotaoSeguranca.setBackground(new java.awt.Color(204, 0, 0));
        BotaoSeguranca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoSeguranca.setForeground(new java.awt.Color(255, 255, 255));
        BotaoSeguranca.setText("Segurança");
        BotaoSeguranca.setBorderPainted(false);
        BotaoSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSegurancaActionPerformed(evt);
            }
        });

        BotaoDadosPessoais.setBackground(new java.awt.Color(204, 0, 0));
        BotaoDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoDadosPessoais.setForeground(new java.awt.Color(255, 255, 255));
        BotaoDadosPessoais.setText("Dados Pessoais");
        BotaoDadosPessoais.setBorderPainted(false);
        BotaoDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDadosPessoaisActionPerformed(evt);
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

        BotaoMeuCartao.setBackground(new java.awt.Color(204, 0, 0));
        BotaoMeuCartao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoMeuCartao.setForeground(new java.awt.Color(255, 255, 255));
        BotaoMeuCartao.setText("Meu Cartão");
        BotaoMeuCartao.setBorderPainted(false);
        BotaoMeuCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMeuCartaoActionPerformed(evt);
            }
        });

        BotaoTermos.setBackground(new java.awt.Color(204, 0, 0));
        BotaoTermos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoTermos.setForeground(new java.awt.Color(255, 255, 255));
        BotaoTermos.setText("Termos e Condicoes");
        BotaoTermos.setBorderPainted(false);
        BotaoTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTermosActionPerformed(evt);
            }
        });

        BotaoSair.setBackground(new java.awt.Color(204, 0, 0));
        BotaoSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoSair.setForeground(new java.awt.Color(255, 255, 255));
        BotaoSair.setText("Sair da conta");
        BotaoSair.setBorderPainted(false);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        BotaoExcluirConta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoExcluirConta.setText("Excluir minha conta");
        BotaoExcluirConta.setBorderPainted(false);
        BotaoExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirContaActionPerformed(evt);
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

        javax.swing.GroupLayout JPanelHOMELayout = new javax.swing.GroupLayout(JPanelHOME);
        JPanelHOME.setLayout(JPanelHOMELayout);
        JPanelHOMELayout.setHorizontalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PerfilConfiguracoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelHOMELayout.createSequentialGroup()
                        .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMeuCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addComponent(BotaoAlterarDados)
                                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(BotaoSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addComponent(BotaoTermos)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BotaoExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        JPanelHOMELayout.setVerticalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PerfilConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoMeuCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoTermos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

    private void PerfilConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilConfiguracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilConfiguracoesActionPerformed

    private void BotaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarDadosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaAlterarDados p1 = new PaginaAlterarDados();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoAlterarDadosActionPerformed

    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeClienteActionPerformed

    private void BotaoSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSegurancaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaSeguranca p1 = new PaginaSeguranca();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoSegurancaActionPerformed

    private void BotaoDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDadosPessoaisActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaDadosPessoais p1 = new PaginaDadosPessoais();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoDadosPessoaisActionPerformed

    private void PerguntasFrequentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerguntasFrequentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerguntasFrequentesActionPerformed

    private void BotaoMeuCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMeuCartaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaMeucartao p1 = new PaginaMeucartao();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoMeuCartaoActionPerformed

    private void BotaoTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTermosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaTermosCondicoes p1 = new PaginaTermosCondicoes();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoTermosActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaInicialCPF p1 = new PaginaInicialCPF();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirContaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaExcluirConta p1 = new PaginaExcluirConta();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoExcluirContaActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaHome p1 = new PaginaHome();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPerfilConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPerfilConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPerfilConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPerfilConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PaginaPerfilConfiguracoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterarDados;
    private javax.swing.JButton BotaoDadosPessoais;
    private javax.swing.JButton BotaoExcluirConta;
    private javax.swing.JButton BotaoMeuCartao;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoSeguranca;
    private javax.swing.JButton BotaoTermos;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel IconeLogo;
    private javax.swing.JPanel JPanelHOME;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PerfilConfiguracoes;
    private javax.swing.JTextField PerguntasFrequentes;
    // End of variables declaration//GEN-END:variables
}
