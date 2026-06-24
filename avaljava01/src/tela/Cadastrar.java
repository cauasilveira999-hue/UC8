package tela;

import javax.swing.table.*;
import javax.swing.JOptionPane;
import banco.Aluno;
import banco.BancoSimulado;


public class Cadastrar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Aluno.class.getName());

    private int idSelecionado = 0;
    
    private void limparCampos() {

    TXTnome.setText("");
    TXTturma.setText("");
    TXTemail.setText("");
   

    idSelecionado = 0;

    TXTnome.requestFocus();
}

    public void carregarAlunos () {
        DefaultTableModel modelo = new DefaultTableModel();
        
       
        modelo.addColumn("Nome");
        modelo.addColumn("Turma");
        modelo.addColumn("Email");
        
         for (Aluno aluno : BancoSimulado.alunos) {
               modelo.addRow(new Object[]{
            aluno.getId(),
            aluno.getNome(),
            aluno.getTurma(),
            aluno.getEmail()
                       });
         }

        
        // abrir o BD ou abrir uma Array e carregar os dados por um "for"
        tabelaAlunos.setModel(modelo);
        
        Aluno aluno = new Aluno();
    };
    
    public Cadastrar() {
        initComponents();
        carregarAlunos();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        BTNadicionar = new javax.swing.JButton();
        BTNexcluir = new javax.swing.JButton();
        TXTnome = new javax.swing.JTextField();
        TXTturma = new javax.swing.JTextField();
        TXTemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Alunos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlunos);

        BTNadicionar.setText("Adicionar");
        BTNadicionar.addActionListener(this::BTNadicionarActionPerformed);

        BTNexcluir.setText("Excluir");
        BTNexcluir.addActionListener(this::BTNexcluirActionPerformed);

        TXTnome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        TXTturma.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));

        TXTemail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTemail)
                    .addComponent(TXTnome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTturma, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNadicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNadicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNexcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNadicionarActionPerformed
 if (TXTnome.getText().isEmpty() ||
        TXTturma.getText().isEmpty() ||
        TXTemail.getText().isEmpty()) {

        JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
      
        return;       
}
 
    Aluno aluno = new Aluno();
     
    aluno.setNome(TXTnome.getText());
    aluno.setTurma(TXTturma.getText());
    aluno.setEmail(TXTemail.getText());

    BancoSimulado.alunos.add(aluno);

    Aluno.idAluno++;

    JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!");
    
    carregarAlunos();
    limparCampos();
    
    


    }//GEN-LAST:event_BTNadicionarActionPerformed

    private void BTNexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexcluirActionPerformed
       
        if (idSelecionado == 0) {
        JOptionPane.showMessageDialog(null, "Selecione um produto na tabela.");
        return;
    }

    int resposta = JOptionPane.showConfirmDialog(
        null,
        "Deseja realmente excluir este produto?",
        "Confirmar exclusão",
        JOptionPane.YES_NO_OPTION
    );

    if (resposta == JOptionPane.YES_OPTION) {

        for (Aluno aluno : BancoSimulado.alunos) {

            if (aluno.getId() == idSelecionado) {

                BancoSimulado.alunos.remove(aluno);

                JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!");

                carregarAlunos();
                limparCampos();

                idSelecionado = 0;

                break; 
            }
        }
    }
    }//GEN-LAST:event_BTNexcluirActionPerformed

    private void tabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunosMouseClicked
        int linha = tabelaAlunos.getSelectedRow();

    if (linha >= 0) {

              idSelecionado = Integer.parseInt(
                      tabelaAlunos.getValueAt(linha, 0).toString()
              );
    }//GEN-LAST:event_tabelaAlunosMouseClicked
    }
    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNadicionar;
    private javax.swing.JButton BTNexcluir;
    private javax.swing.JTextField TXTemail;
    private javax.swing.JTextField TXTnome;
    private javax.swing.JTextField TXTturma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAlunos;
    // End of variables declaration//GEN-END:variables
};
