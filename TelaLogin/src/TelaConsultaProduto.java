import modelo.Produto;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class TelaConsultaProduto extends javax.swing.JInternalFrame {

    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaConsultaProduto.class.getName());

    private int idSelecionado = 0;
    
    private void limparCampos() {

    TXTdescricao.setText("");
    TXTvalor.setText("");
    TXTquantidade.setText("");
    TXTpesquisar.setText("");

    idSelecionado = 0;

    TXTdescricao.requestFocus();
}
    
    private void carregarProdutos() {

    String pesquisa =
            TXTpesquisar.getText().toLowerCase();

    DefaultTableModel modelo =
            new DefaultTableModel();

    modelo.addColumn("ID");
    modelo.addColumn("Descrição");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto : BancoUsuario.produtos) {

         boolean encontrou = false;

        if (RBdescricao.isSelected()) {

            if (produto.getDescricao()
                    .toLowerCase()
                    .contains(pesquisa)) {

                encontrou = true;
            }

        } else if (RBid.isSelected()) {

            try {

                int idPesquisado =
                        Integer.parseInt(pesquisa);

                if (produto.getId()
                        == idPesquisado) {

                    encontrou = true;
                }

            } catch (NumberFormatException e) {

                encontrou = false;
            }
        }

        if (encontrou) {

            modelo.addRow(new Object[]{
                produto.getId(),
                produto.getDescricao(),
                produto.getValor(),
                produto.getQuantidade()
            });
        }
    }
    
     
    tabelaProdutos.setModel(modelo);

}
    
    public TelaConsultaProduto() {
        initComponents();
        
         carregarProdutos();

    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RBdescricao = new javax.swing.JRadioButton();
        RBid = new javax.swing.JRadioButton();
        TXTpesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TXTdescricao = new javax.swing.JTextField();
        TXTvalor = new javax.swing.JTextField();
        TXTquantidade = new javax.swing.JTextField();
        BTNadicionar = new javax.swing.JButton();
        BTNeditar = new javax.swing.JButton();
        BTNexcluir = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutos);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        buttonGroup1.add(RBdescricao);
        RBdescricao.setText("Descrição");

        buttonGroup1.add(RBid);
        RBid.setText("Codigo");

        jButton1.setText("Pesquisar");

        TXTdescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        TXTdescricao.addActionListener(this::TXTdescricaoActionPerformed);

        TXTvalor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));
        TXTvalor.addActionListener(this::TXTvalorActionPerformed);

        TXTquantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));
        TXTquantidade.addActionListener(this::TXTquantidadeActionPerformed);

        BTNadicionar.setText("Adicionar");
        BTNadicionar.addActionListener(this::BTNadicionarActionPerformed);

        BTNeditar.setText("Editar");
        BTNeditar.addActionListener(this::BTNeditarActionPerformed);

        BTNexcluir.setText("Excluir");
        BTNexcluir.addActionListener(this::BTNexcluirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBdescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBid)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTdescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTvalor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTpesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTquantidade, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(BTNadicionar)
                            .addComponent(BTNeditar)
                            .addComponent(BTNexcluir))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBdescricao)
                    .addComponent(RBid))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNeditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNexcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdescricaoActionPerformed

    private void TXTvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTvalorActionPerformed

    private void TXTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTquantidadeActionPerformed

    private void BTNadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNadicionarActionPerformed

    if (TXTdescricao.getText().isEmpty()
            || TXTvalor.getText().isEmpty()
            || TXTquantidade.getText().isEmpty()) {

        JOptionPane.showMessageDialog(
                null,
                "Preencha todos os campos.");

        return;
    }

    Produto produto = new Produto();

    produto.setId(BancoUsuario.idProduto);
    produto.setDescricao(TXTdescricao.getText());
    produto.setValor(
            Double.parseDouble(TXTvalor.getText()));
    produto.setQuantidade(
            Integer.parseInt(TXTquantidade.getText()));

    BancoUsuario.produtos.add(produto);

    BancoUsuario.idProduto++;

    JOptionPane.showMessageDialog(
            null,
            "Produto adicionado com sucesso!");

    carregarProdutos();
    limparCampos();
    
    
}    }//GEN-LAST:event_BTNadicionarActionPerformed

    private void BTNeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNeditarActionPerformed

    private void BTNexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNexcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNadicionar;
    private javax.swing.JButton BTNeditar;
    private javax.swing.JButton BTNexcluir;
    private javax.swing.JRadioButton RBdescricao;
    private javax.swing.JRadioButton RBid;
    private javax.swing.JTextField TXTdescricao;
    private javax.swing.JTextField TXTpesquisar;
    private javax.swing.JTextField TXTquantidade;
    private javax.swing.JTextField TXTvalor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
