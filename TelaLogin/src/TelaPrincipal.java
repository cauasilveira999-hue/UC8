
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCadastroCliente = new javax.swing.JMenuItem();
        itemCadastroProduto = new javax.swing.JMenuItem();
        itemCadastroServico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemConsultaCliente = new javax.swing.JMenuItem();
        itemConsultaProduto = new javax.swing.JMenuItem();
        itemConsultaServico = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelBotoes.setBackground(new java.awt.Color(0, 0, 0));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novo.png.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Criar novo cadastro");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar cadastro");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excluir.png.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir cadastro");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        desktopPrincipal.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemCadastroCliente.setText("Cliente");
        itemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroClienteActionPerformed(evt);
            }
        });
        jMenu1.add(itemCadastroCliente);

        itemCadastroProduto.setText("Produto");
        itemCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCadastroProduto);

        itemCadastroServico.setText("Serviço");
        itemCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroServicoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCadastroServico);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemConsultaCliente.setText("Cliente");
        itemConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(itemConsultaCliente);

        itemConsultaProduto.setText("Produto");
        itemConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(itemConsultaProduto);

        itemConsultaServico.setText("Serviço");
        itemConsultaServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaServicoActionPerformed(evt);
            }
        });
        jMenu2.add(itemConsultaServico);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatorio");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Serviço");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Janela");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Minimizar todas");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Restaurar todas");
        jMenu4.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Organizar em grade");
        jMenu4.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Organizar em cascata");
        jMenu4.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Organizar lado a lado");
        jMenu4.add(jCheckBoxMenuItem5);

        jMenuItem4.setText("Fechar todas");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroClienteActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo cadastro de cliente");
        
        TelaCliente tela = new TelaCliente();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_itemCadastroClienteActionPerformed

    private void itemCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroProdutoActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo cadastro de produto");
        TelaProduto tela = new TelaProduto();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_itemCadastroProdutoActionPerformed

    private void itemConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaClienteActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo consulta de cliente");
        TelaConsultaCliente tela = new TelaConsultaCliente();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_itemConsultaClienteActionPerformed

    private void itemConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaProdutoActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo consulta de produto");
        TelaConsultaProduto tela = new TelaConsultaProduto();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_itemConsultaProdutoActionPerformed

    private void itemCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroServicoActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo cadastro de serviço");
        TelaServico tela = new TelaServico();
        desktopPrincipal.add(tela);
        tela.setVisible(true);

    }//GEN-LAST:event_itemCadastroServicoActionPerformed

    private void itemConsultaServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaServicoActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo consulta de serviço");
        TelaConsultaServico tela = new TelaConsultaServico();
        desktopPrincipal.add(tela);
        tela.setVisible(true);

    }//GEN-LAST:event_itemConsultaServicoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        JOptionPane.showMessageDialog(this, "Novo registro");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        JOptionPane.showMessageDialog(this, "Registro salvo");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        JOptionPane.showMessageDialog(this, "Registro excluido");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo relatorio de cliente");
        RelatorioCliente tela = new RelatorioCliente();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo relatorio de produto");
        RelatorioProduto tela = new RelatorioProduto();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(this, "Abrindo relatorio de serviço");
        RelatorioServico tela = new RelatorioServico();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenuItem itemCadastroCliente;
    private javax.swing.JMenuItem itemCadastroProduto;
    private javax.swing.JMenuItem itemCadastroServico;
    private javax.swing.JMenuItem itemConsultaCliente;
    private javax.swing.JMenuItem itemConsultaProduto;
    private javax.swing.JMenuItem itemConsultaServico;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel painelBotoes;
    // End of variables declaration//GEN-END:variables
}
