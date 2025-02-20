/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteInterfaceVisual;

import PacoteInterfaceVisual.Usuario.Extrato;
import PacoteInterfaceVisual.Usuario.Usuario;
import PacoteRegraDeNegocio.ValidarInformacoesUsuario;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CaioFSX
 */
public class PaginaConsultarExtratoTabela extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public PaginaConsultarExtratoTabela() {
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
        VerificarExtratoTitulo = new javax.swing.JTextField();
        BotaoVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaConsultaExtrato = new javax.swing.JTable();
        CampoInserirIntervaloInicio = new javax.swing.JFormattedTextField();
        CampoInserirIntervaloFim = new javax.swing.JFormattedTextField();
        BotaoFiltrarIntervalo = new javax.swing.JButton();
        BotaoGerarPDF = new javax.swing.JButton();

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

        VerificarExtratoTitulo.setEditable(false);
        VerificarExtratoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        VerificarExtratoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VerificarExtratoTitulo.setText("Deseja Verificar seu Extrato?");
        VerificarExtratoTitulo.setBorder(null);
        VerificarExtratoTitulo.setFocusable(false);
        VerificarExtratoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarExtratoTituloActionPerformed(evt);
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

        TabelaConsultaExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TabelaConsultaExtrato);

        try {
            CampoInserirIntervaloInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoInserirIntervaloInicio.setToolTipText("Digite a data de inicio do intervalo");
        CampoInserirIntervaloInicio.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        try {
            CampoInserirIntervaloFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoInserirIntervaloFim.setToolTipText("Digite a data de término do intervalo");
        CampoInserirIntervaloFim.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        BotaoFiltrarIntervalo.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        BotaoFiltrarIntervalo.setText("filtrar intervalo");
        BotaoFiltrarIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarIntervaloActionPerformed(evt);
            }
        });

        BotaoGerarPDF.setText("Gerar PDF");
        BotaoGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelHOMELayout = new javax.swing.GroupLayout(JPanelHOME);
        JPanelHOME.setLayout(JPanelHOMELayout);
        JPanelHOMELayout.setHorizontalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                .addContainerGap(569, Short.MAX_VALUE)
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelHOMELayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                                        .addComponent(CampoInserirIntervaloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoInserirIntervaloFim, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoFiltrarIntervalo))
                                    .addComponent(VerificarExtratoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHOMELayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoGerarPDF))))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelHOMELayout.setVerticalGroup(
            JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHOMELayout.createSequentialGroup()
                .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IconeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(PerguntasFrequentes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGerarPDF))
                    .addGroup(JPanelHOMELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VerificarExtratoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPanelHOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoInserirIntervaloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoInserirIntervaloFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoFiltrarIntervalo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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

    private void VerificarExtratoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarExtratoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerificarExtratoTituloActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PaginaHome p1 = new PaginaHome();
        p1.setVisible(true);
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoFiltrarIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarIntervaloActionPerformed
        // TODO add your handling code here:
        Extrato.setFiltroIntervaloInicio(CampoInserirIntervaloInicio.getText());
        Extrato.setFiltroIntervaloTermino(CampoInserirIntervaloFim.getText());
        try {
            ValidarInformacoesUsuario v1 = new ValidarInformacoesUsuario();
            v1.filtrarExtrato();

        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        if (Extrato.isFiltroIntervaloValido()) {
            PaginaConsultarExtratoTabela p1 = new PaginaConsultarExtratoTabela();
            DefaultTableModel dtm1 = (DefaultTableModel) p1.getTabelaConsultaExtrato().getModel();

            System.out.println(dtm1);
            Object[] colunaDataHorario = new Object[Extrato.getDataExtratoLista().size()];
            Object[] colunaDescricao = new Object[Extrato.getDescricaoExtratoLista().size()];
            Object[] colunaValor = new Object[Extrato.getValorExtratoLista().size()];
            Object[] colunaTipo = new Object[Extrato.getTipoCreditoDebitoExtratoLista().size()];

            for (int x = 0; x < Extrato.getDataExtratoLista().size(); x++) {
                colunaDataHorario[x] = Extrato.getDataExtratoLista().get(x);
            }
            for (int x = 0; x < Extrato.getDescricaoExtratoLista().size(); x++) {
                colunaDescricao[x] = Extrato.getDescricaoExtratoLista().get(x);
            }
            for (int x = 0; x < Extrato.getValorExtratoLista().size(); x++) {
                colunaValor[x] = Extrato.getValorExtratoLista().get(x);
            }
            for (int x = 0; x < Extrato.getTipoCreditoDebitoExtratoLista().size(); x++) {
                colunaTipo[x] = Extrato.getTipoCreditoDebitoExtratoLista().get(x);
            }

            //Extrato.getDataExtratoLista().size();
            dtm1.addColumn("data_horario", colunaDataHorario);
            dtm1.addColumn("descricao", colunaDescricao);
            dtm1.addColumn("valor", colunaValor);
            dtm1.addColumn("tipo", colunaTipo);

            Extrato.getDataExtratoLista().removeAll(Extrato.getDataExtratoLista());
            Extrato.getDescricaoExtratoLista().removeAll(Extrato.getDescricaoExtratoLista());
            Extrato.getValorExtratoLista().removeAll(Extrato.getValorExtratoLista());
            Extrato.getTipoCreditoDebitoExtratoLista().removeAll(Extrato.getTipoCreditoDebitoExtratoLista());
            this.dispose();
            p1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar extrato no intervalo inserido!", "Banco JAVA", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_BotaoFiltrarIntervaloActionPerformed

    private void BotaoGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarPDFActionPerformed
        // TODO add your handling code here:
        if (TabelaConsultaExtrato.getRowCount() > 0) {
            BufferedImage img = new BufferedImage(TabelaConsultaExtrato.getWidth(), TabelaConsultaExtrato.getHeight() + TabelaConsultaExtrato.getTableHeader().getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = img.createGraphics();
            TabelaConsultaExtrato.getTableHeader().paint(g2d);
            g2d.translate(0, TabelaConsultaExtrato.getTableHeader().getHeight());
            TabelaConsultaExtrato.paint(g2d);
            g2d.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                //CRIANDO O LOGO DO PDF
                URL urlLogoJava = getClass().getClassLoader().getResource("images/logoBancoJava.PNG");
                //URL urlDocumentoExtrato = getClass().getClassLoader().getResource("documents/ExtratoDe" + Usuario.getNome() + ".pdf");
                Image logoBancoJava = Image.getInstance(urlLogoJava);
                ImageIO.write(img, "png", baos);
                byte[] bytesImagem = baos.toByteArray();
                Image imagemPdf = Image.getInstance(bytesImagem);
                LocalDateTime dataAgora = LocalDateTime.now();
                DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));
                ValidarInformacoesUsuario v1 = new ValidarInformacoesUsuario();
                v1.consultarNomeUsuario();
                Document document = new Document(PageSize.A4);
                File diretorioDocuments = new File("documents");
                if (!diretorioDocuments.exists()) {
                    diretorioDocuments.mkdirs(); // Criar o diretorio documents
                }
                PdfWriter.getInstance(document, new FileOutputStream("documents/ExtratoDe" + Usuario.getNome() + ".pdf"));
                document.open();
                document.add(logoBancoJava);
                document.add(imagemPdf);
                document.add(new Paragraph("Extrato Bancário de " + Usuario.getNome() + " emitido em:" + f1.format(dataAgora)));
                document.close();
                v1.enviarExtratoPeloEmail();
                if (Usuario.getUsuarioValido()) {
                    JOptionPane.showMessageDialog(null, "Seu Extrato foi enviado para seu e-mail, confira agora!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um problema ao enviar o seu extrato para o seu e-mail!", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (DocumentException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar um PDF de extrato, pois seu extrato está vazio", "BANCO JAVA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BotaoGerarPDFActionPerformed
    public javax.swing.JTable getTabelaConsultaExtrato() {
        return TabelaConsultaExtrato;
    }

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
            java.util.logging.Logger.getLogger(PaginaConsultarExtratoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaConsultarExtratoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaConsultarExtratoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaConsultarExtratoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaginaConsultarExtratoTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFiltrarIntervalo;
    private javax.swing.JButton BotaoGerarPDF;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JFormattedTextField CampoInserirIntervaloFim;
    private javax.swing.JFormattedTextField CampoInserirIntervaloInicio;
    private javax.swing.JLabel IconeLogo;
    private javax.swing.JPanel JPanelHOME;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PerguntasFrequentes;
    private javax.swing.JTable TabelaConsultaExtrato;
    private javax.swing.JTextField VerificarExtratoTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
