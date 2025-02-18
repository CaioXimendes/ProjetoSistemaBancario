/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteInterfaceVisual;

import java.awt.Desktop;
import java.net.URL;
import java.net.URI;
/**
 *
 * @author CaioFSX
 */
public class PaginaTermosCondicoes extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public PaginaTermosCondicoes() {
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
        IconeLogo = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        BotaoTermosCondicoes = new javax.swing.JButton();
        PerguntasFrequentes = new javax.swing.JTextField();
        BotaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JPanelHOME.setBackground(new java.awt.Color(255, 255, 255));

        PerfilConfiguracoes.setEditable(false);
        PerfilConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));
        PerfilConfiguracoes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        PerfilConfiguracoes.setText("TODO");
        PerfilConfiguracoes.setBorder(null);
        PerfilConfiguracoes.setFocusable(false);
        PerfilConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
                    Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1Uk-ERLKRKn_tOUjgyjCzYJ7jDpbZUkIc?usp=sharing").toURI());
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        IconeLogo.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\sistema-bancario\\src\\main\\resources\\images\\logoCircular2.png")); // NOI18N
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

        BotaoTermosCondicoes.setBackground(new java.awt.Color(204, 0, 0));
        BotaoTermosCondicoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoTermosCondicoes.setForeground(new java.awt.Color(255, 255, 255));
        BotaoTermosCondicoes.setText("Termos e Condicoes");
        BotaoTermosCondicoes.setBorderPainted(false);
        BotaoTermosCondicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTermosCondicoesActionPerformed(evt);
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
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addComponent(BotaoTermosCondicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                        .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                        .addComponent(PerfilConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))))
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
                .addGap(87, 87, 87)
                .addComponent(PerfilConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                        .addComponent(BotaoTermosCondicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                        .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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

    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeClienteActionPerformed

    private void BotaoTermosCondicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTermosCondicoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoTermosCondicoesActionPerformed

    private void PerguntasFrequentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerguntasFrequentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerguntasFrequentesActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaTermosCondicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaTermosCondicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaTermosCondicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaTermosCondicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaginaTermosCondicoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoTermosCondicoes;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel IconeLogo;
    private javax.swing.JPanel JPanelHOME;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PerfilConfiguracoes;
    private javax.swing.JTextField PerguntasFrequentes;
    // End of variables declaration//GEN-END:variables
}
