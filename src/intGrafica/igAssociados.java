/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intGrafica;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelBens.associados;
import modelDAO.associadosDAO;

/**
 *
 * @author jou
 */
public class igAssociados extends javax.swing.JInternalFrame {

    /**
     * Creates new form igAssociados
     */
    public igAssociados() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tableAsso.getModel();
        tableAsso.setRowSorter(new TableRowSorter(modelo));
        Readtableas();
    }

    public void Readtableas(){
        DefaultTableModel modelo = (DefaultTableModel) this.tableAsso.getModel();
        modelo.setNumRows(0);
        associadosDAO aDAO = new associadosDAO();
        for (associados a : aDAO.read()) {
            modelo.addRow(new Object[]{
                    
                    
                    a.getId(),
                    a.getNome(),
                    a.getDataNasc(),
                    a.getCpf(),
                    a.getTelefone(),
                    a.getNomeDoPai(),
                    a.getNomeDaMae(),
                    a.getRg(),
                    a.getEmail(),
                    a.getEmpregado(),
                    a.getQtdFIlhos(),
                    
                    
                    
                   
                });
                
            }
        
        
        
    }
    
    public void readTableForDesc(String cpf){
        
        DefaultTableModel modelo = (DefaultTableModel) this.tableAsso.getModel();
        modelo.setNumRows(0);
        associadosDAO aDAO = new associadosDAO();
        for (associados a : aDAO.readForDesc(cpf)) {
            modelo.addRow(new Object[]{
            
                    a.getId(),
                    a.getNome(),
                    a.getDataNasc(),
                    a.getCpf(),
                    a.getTelefone(),
                    a.getNomeDoPai(),
                    a.getNomeDaMae(),
                    a.getRg(),
                    a.getEmail(),
                    a.getEmpregado(),
                    a.getQtdFIlhos(),
        });
        }
        
    }
    
    
    
   
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txtbuscNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAsso = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomedoPai = new javax.swing.JTextField();
        txtNomedaMae = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTrabalho = new javax.swing.JTextField();
        txtFilho = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setTitle("Tela de Associados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Nome");

        txtbuscNome.setToolTipText("");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtbuscNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(txtbuscNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 620, -1));

        tableAsso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DATA NASCIMENTO", "CPF", "TELEFONE", "Nome do Pai", "Nome da Mãe", "RG", "Email", "Trabalha", "Filhos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAsso.getTableHeader().setReorderingAllowed(false);
        tableAsso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAssoMouseClicked(evt);
            }
        });
        tableAsso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableAssoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableAsso);
        if (tableAsso.getColumnModel().getColumnCount() > 0) {
            tableAsso.getColumnModel().getColumn(5).setMinWidth(0);
            tableAsso.getColumnModel().getColumn(5).setMaxWidth(0);
            tableAsso.getColumnModel().getColumn(6).setMinWidth(0);
            tableAsso.getColumnModel().getColumn(6).setMaxWidth(0);
            tableAsso.getColumnModel().getColumn(7).setMinWidth(0);
            tableAsso.getColumnModel().getColumn(7).setMaxWidth(0);
            tableAsso.getColumnModel().getColumn(8).setMinWidth(0);
            tableAsso.getColumnModel().getColumn(8).setMaxWidth(0);
            tableAsso.getColumnModel().getColumn(9).setMinWidth(0);
            tableAsso.getColumnModel().getColumn(9).setMaxWidth(0);
            tableAsso.getColumnModel().getColumn(10).setMinWidth(0);
            tableAsso.getColumnModel().getColumn(10).setMaxWidth(0);
        }

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setText("Data Nascimento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setText("CPF");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel6.setText("RG");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel7.setText("Trabalha atualmente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel8.setText("Filhos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel9.setText("Nome do pai");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel10.setText("Telefone");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, -1));
        jPanel2.add(txtNomedoPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, -1));
        jPanel2.add(txtNomedaMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 290, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 270, -1));

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, -1));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel2.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 150, -1));

        jLabel11.setText("Nome da Mãe");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, -1));

        jLabel12.setText("Email");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));
        jPanel2.add(txtTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 80, -1));
        jPanel2.add(txtFilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, -1));

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Alterar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableAssoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAssoMouseClicked

       if(tableAsso.getSelectedRow() != -1){
           
           txtNome.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 1).toString());
           txtData.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 2).toString());
           txtCpf.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 3).toString());
           txtTel.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 4).toString());
           txtNomedoPai.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 5).toString());
           txtNomedaMae.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 6).toString());
           txtRg.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 7).toString());
           txtEmail.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 8).toString());
           txtTrabalho.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 9).toString());
           txtFilho.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 10).toString());
           
       }

        
    }//GEN-LAST:event_tableAssoMouseClicked

    private void tableAssoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableAssoKeyReleased

            
          if(tableAsso.getSelectedRow() != -1){
           
           txtNome.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 1).toString());
           txtData.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 2).toString());
           txtCpf.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 3).toString());
           txtTel.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 4).toString());
           txtNomedoPai.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 5).toString());
           txtNomedaMae.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 6).toString());
           txtRg.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 7).toString());
           txtEmail.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 8).toString());
           txtTrabalho.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(), 9).toString());
           txtFilho.setText(tableAsso.getValueAt(tableAsso.getSelectedRow(),10).toString());
           
       }





    }//GEN-LAST:event_tableAssoKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

            if(tableAsso.getSelectedRow() != -1){
                associados as = new associados();
                associadosDAO aDAO = new associadosDAO();
                
                
                as.setId((int)tableAsso.getValueAt(tableAsso.getSelectedRow(),0));
                
                    aDAO.delete(as);
                             txtNome.setText("");
        txtData.setText(""); 
        txtRg.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtFilho.setText("");
        txtNomedoPai.setText("");
        txtNomedaMae.setText("");
        txtTel.setText("");
        txtTrabalho.setText("");
        txtNome.requestFocus();
                Readtableas();
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um produto para excluir");
                
            }



    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(tableAsso.getSelectedRow() != -1){
            associados as1 = new associados();
            associadosDAO aDAO = new associadosDAO();
            
            
            as1.setNome(txtNome.getText());
            as1.setDataNasc(txtData.getText());
            as1.setRg(txtRg.getText());
            as1.setCpf(txtCpf.getText());
            as1.setEmail(txtEmail.getText());
            as1.setQtdFIlhos(Integer.parseInt(txtFilho.getText()));
            as1.setNomeDoPai(txtNomedoPai.getText());
            as1.setNomeDaMae(txtNomedaMae.getText());
            as1.setTelefone(txtTel.getText());
            as1.setEmpregado(txtTrabalho.getText());
            as1.setId((int)tableAsso.getValueAt(tableAsso.getSelectedRow(), 0));
            
            aDAO.update(as1);
            
                                 txtNome.setText("");
        txtData.setText(""); 
        txtRg.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtFilho.setText("");
        txtNomedoPai.setText("");
        txtNomedaMae.setText("");
        txtTel.setText("");
        txtTrabalho.setText("");
        txtNome.requestFocus();
                Readtableas();
            
            
        }

        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        readTableForDesc(txtbuscNome.getText());
       
        


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAsso;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFilho;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomedaMae;
    private javax.swing.JTextField txtNomedoPai;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtTrabalho;
    private javax.swing.JTextField txtbuscNome;
    // End of variables declaration//GEN-END:variables
}
