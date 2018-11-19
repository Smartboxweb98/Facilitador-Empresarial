/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.AtualizaDia;
import controle.AtualizadoHora;
import controle.ConnectionConsulta;
import controle.ControleLoginUsuario;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloLoginUsuario;
import modelo.ModeloTabela;
import modelo.Usuario;

/**
 *
 * @author vinicius
 */
public class AgendaTelefonica extends javax.swing.JFrame {

    
    ConnectionConsulta conecta = new ConnectionConsulta();
    Usuario mod = new Usuario();
    ModeloLoginUsuario modelo = new ModeloLoginUsuario();
    ControleLoginUsuario control = new ControleLoginUsuario();
    /**
     * Creates new form AgendaTelefonica
     */
    public AgendaTelefonica() {
        initComponents();
        AtualizadoHora.start(jLabelHora);  
        AtualizaDia.start(jLabelData);
        conecta.conectaBanco();
        preenchertabela("select * from telefones order by id");
        conecta.desconecta();
        jTableTelefone.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTelefone = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldObs = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton2 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableTelefone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTelefoneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTelefone);

        jLabel1.setText("Empresa/Pessoa:");

        jTextFieldEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresaKeyPressed(evt);
            }
        });

        jLabel2.setText("Cliente/Pessoa:");

        jTextFieldCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldClienteKeyPressed(evt);
            }
        });

        jLabel3.setText("Celular/Tel:");

        jTextFieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelefoneKeyPressed(evt);
            }
        });

        jLabel4.setText("Telefone:");

        jTextFieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCelularKeyPressed(evt);
            }
        });

        jLabel5.setText("Dados adicionais:");

        jTextFieldObs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldObsKeyPressed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Agenda ");

        jLabelHora.setText("Hora");

        jLabelData.setText("Data");

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        jTextFieldId.setEnabled(false);

        jLabel8.setText("Usuário:");

        jTextFieldUsuario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCliente)
                                    .addComponent(jTextFieldEmpresa)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldObs))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396)
                        .addComponent(jLabel6)
                        .addGap(240, 240, 240)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHora)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelData))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1223, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTelefoneMouseClicked
        // TODO add your handling code here:
        
        String id = ""+jTableTelefone.getValueAt(jTableTelefone.getSelectedRow(), 0);
        conecta.conectaBanco();
        conecta.executaSQL("select * from telefones where id='"+ id +"'");
        
        try {
        conecta.rs.first();
        //jTextFieldId.setText(String.valueOf(conecta.rs.getInt("IdEntrevistas")));
        //jTextFieldId.setText(String.valueOf(conecta.rs.getInt("id")));
        jTextFieldEmpresa.setText(conecta.rs.getString("empresa"));
        jTextFieldCliente.setText(conecta.rs.getString("cliente"));
        jTextFieldTelefone.setText(conecta.rs.getString("telefone"));
        jTextFieldCelular.setText(conecta.rs.getString("celular"));
        jTextFieldObs.setText(conecta.rs.getString("dados"));
        jTextFieldId.setText(conecta.rs.getString("id"));
//        jTextFieldCargo.setText(conecta.rs.getString("Cargo"));   
//        jTextFieldUsuario.setText(conecta.rs.getString("Usuario")); 
//        jComboBoxCompareceu.setSelectedItem(conecta.rs.getString("Compareceu"));
//        jComboBoxCorrigiu.setSelectedItem(conecta.rs.getString("Corrigiu"));
//        jComboBoxRetorno.setSelectedItem(conecta.rs.getString("Retorno"));
        conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jTableTelefoneMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(jTextFieldTelefone.getText().equals("")){JOptionPane.showMessageDialog(null,"Descreva pelo menos um telefone ou celular!");}
else{
        try{
            conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("insert into telefones (empresa,cliente,telefone,celular,dados)values (?,?,?,?,?)");
        pst.setString(1,jTextFieldEmpresa.getText());
        pst.setString(2,jTextFieldCliente.getText());
        pst.setString(3,jTextFieldTelefone.getText());
        pst.setString(4,jTextFieldCelular.getText());
        pst.setString(5,jTextFieldObs.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"Salvo com sucesso");
        preenchertabela("select * from telefones order by id");
        //preenchertabela("select * from usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");
       conecta.desconecta();
        } catch (SQLException ex) {                        
            JOptionPane.showMessageDialog(rootPane,"Erro na Inserção!\n Erro: "+ex);
        }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            conecta.conectaBanco();
            PreparedStatement pst = conecta.conn.prepareStatement("update telefones set empresa= ?, cliente=?, telefone=?, celular=?, dados=? where id=?");
            pst.setString(1,jTextFieldEmpresa.getText());
            pst.setString(2,jTextFieldCliente.getText());
            pst.setString(3,jTextFieldTelefone.getText());
            pst.setString(4,jTextFieldCelular.getText());
            pst.setString(5,jTextFieldObs.getText());
            pst.setInt(6,Integer.parseInt(jTextFieldId.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");
            preenchertabela("select * from telefones order by id");
        //    preenchertabela("select * from usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");
        conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
//        mod.setId(Integer.parseInt(jTextFieldId.getText()));
//        mod.setEmpresa(jTextFieldEmpresa.getText());
//        mod.setCliente(jTextFieldCliente.getText());
//        mod.setPermissao((String)jComboBoxPermissao.getSelectedItem());
//        mod.setPermissao((String)jComboBoxDest1.getSelectedItem());
//        mod.setPermissao((String)jComboBoxDest2.getSelectedItem());
//        mod.setPermissao((String)jComboBoxDepart.getSelectedItem());
//        control.excluir(mod);
//        jTextFieldCod.setText("");
//        jTextFieldLogin.setText("");
//        jTextFieldNome.setText("");
//        jPasswordFieldConfSenha1.setText("");
//        jPasswordFieldSenha1.setText("");
//        jButtonSalvar.setEnabled(!true);
//        jTextFieldLogin.setEnabled(!true);
//        jTextFieldNome.setEnabled(!true);      
//        jPasswordFieldConfSenha1.setEnabled(!true);        
//        jPasswordFieldSenha1.setEnabled(!true);        
//        jButtonNovo.setEnabled(!false);
//        jButtonCancelar.setEnabled(!true); 
//        preenchertabela("select * from login order by nome");
//        conecta.desconecta();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      
            mod.setPesquisa(jTextFieldEmpresa.getText());
            preenchertabela("select * from telefones where empresa like '%" + jTextFieldEmpresa.getText() + "%'");
          
        }
    }//GEN-LAST:event_jTextFieldEmpresaKeyPressed

    private void jTextFieldTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            mod.setPesquisa(jTextFieldTelefone.getText());
            preenchertabela("select * from telefones where telefone like '%" + jTextFieldTelefone.getText() + "%'");
           
        }
    }//GEN-LAST:event_jTextFieldTelefoneKeyPressed

    private void jTextFieldCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelularKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldCelular.getText());
            preenchertabela("select * from telefones where celular like '%" + jTextFieldCelular.getText() + "%'");
          
        }
    }//GEN-LAST:event_jTextFieldCelularKeyPressed

    private void jTextFieldClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
       
            mod.setPesquisa(jTextFieldCliente.getText());
            preenchertabela("select * from telefones where cliente like '%" + jTextFieldCliente.getText() + "%'");
         
        }
    }//GEN-LAST:event_jTextFieldClienteKeyPressed

    private void jTextFieldObsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldObsKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
       
            mod.setPesquisa(jTextFieldCliente.getText());
            preenchertabela("select * from telefones where dados like '%" + jTextFieldObs.getText() + "%'");
         
        }
    }//GEN-LAST:event_jTextFieldObsKeyPressed

    /**
     * @param args the command line arguments
     */
    
    public void preenchertabela(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"ID","EMPRESA","CLIENTE","TELEFONE","CELULAR","DADOS"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first();      
        do{
          dados.add(new Object[]{conecta.rs.getInt("id"),conecta.rs.getString("empresa"),conecta.rs.getString("cliente"),conecta.rs.getString("telefone"),conecta.rs.getString("celular"),conecta.rs.getString("dados")});
        }while(conecta.rs.next());
        conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe dados cadastrados!");
        }
        
      
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableTelefone.setModel(modelo);
        jTableTelefone.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableTelefone.getColumnModel().getColumn(0).setResizable(false);
        jTableTelefone.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTableTelefone.getColumnModel().getColumn(1).setResizable(false);
        jTableTelefone.getColumnModel().getColumn(2).setPreferredWidth(220);
        jTableTelefone.getColumnModel().getColumn(2).setResizable(false);
        jTableTelefone.getColumnModel().getColumn(3).setPreferredWidth(145);
        jTableTelefone.getColumnModel().getColumn(3).setResizable(false);
        jTableTelefone.getColumnModel().getColumn(4).setPreferredWidth(145);
        jTableTelefone.getColumnModel().getColumn(4).setResizable(false);
        jTableTelefone.getColumnModel().getColumn(5).setPreferredWidth(750);
        jTableTelefone.getColumnModel().getColumn(5).setResizable(false);
        jTableTelefone.getTableHeader().setReorderingAllowed(true);
        jTableTelefone.setAutoResizeMode(jTableTelefone.AUTO_RESIZE_OFF);
        jTableTelefone.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
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
            java.util.logging.Logger.getLogger(AgendaTelefonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaTelefonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaTelefonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaTelefonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaTelefonica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonExcluir;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTelefone;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldObs;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
public void recebendo(String recebe){
        jTextFieldUsuario.setText(recebe);
    }   
}
