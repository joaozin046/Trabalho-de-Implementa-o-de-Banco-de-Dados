/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shein_proj;



/* Feito por ...
João Pedro Flausino*/ 

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

public class JCad_Cliente extends javax.swing.JFrame {
    private static JCad_Cliente JCad_Cliente_Unico;
    private static Connection connection;
    
    
    /**
     * Creates new form JCad_Cliente
     */
    public JCad_Cliente(Connection connection) {
        this.connection = connection;
        initComponents();
        fetchData();
        
    }
    
    private void fetchData() {
        String query = "SELECT * FROM Cliente";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);

            // Iterate over the result set and add rows to the table model
            while (resultSet.next()) {
                int id = resultSet.getInt("id_cliente");
                String name = resultSet.getString("nome_cli");
                String address = resultSet.getString("endereco_cli");
                String email = resultSet.getString("email_cli");
                String phone = resultSet.getString("telefone");

                model.addRow(new Object[]{id, name, address, email, phone});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static JCad_Cliente getJCad_Cliente(Connection connection) {
    if (JCad_Cliente_Unico == null) {
        JCad_Cliente_Unico = new JCad_Cliente(connection);
    }
    return JCad_Cliente_Unico;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Salvar_btn = new javax.swing.JButton();
        Excluir_btn = new javax.swing.JButton();
        Editar_btn = new javax.swing.JButton();
        nome_txt = new javax.swing.JTextField();
        Endereco_txt = new javax.swing.JTextField();
        Email_txt = new javax.swing.JTextField();
        telefone_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(34, 40, 49));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "nome", "endereço", "email", "telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Salvar_btn.setText("Salvar");
        Salvar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar_btnActionPerformed(evt);
            }
        });

        Excluir_btn.setText("Excluir");
        Excluir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir_btnActionPerformed(evt);
            }
        });

        Editar_btn.setText("Editar");
        Editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_btnActionPerformed(evt);
            }
        });

        nome_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_txtActionPerformed(evt);
            }
        });

        Endereco_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Endereco_txtActionPerformed(evt);
            }
        });

        Email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_txtActionPerformed(evt);
            }
        });

        telefone_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_txtActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Nome");

        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Endereço");

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Email");

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Telefone");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Endereco_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Salvar_btn)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir_btn)
                        .addGap(18, 18, 18)
                        .addComponent(Editar_btn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Endereco_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar_btn)
                    .addComponent(Excluir_btn)
                    .addComponent(Editar_btn))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_btnActionPerformed
        // TODO add your handling code here:
        String query = "UPDATE cliente SET nome_cli = ?, endereco_cli = ?, email_cli = ?, telefone = ? WHERE id_cliente = ?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter client ID:"));
            String nome_texto,endereco_texto,email_texto,telefone_texto,padrão_regex_email ;
            nome_texto = nome_txt.getText();
            endereco_texto = Endereco_txt.getText();
            email_texto = Email_txt.getText();
            telefone_texto = telefone_txt.getText();
            padrão_regex_email = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
            
            
            boolean validar_email = Pattern.matches(padrão_regex_email, email_texto);
            
            if(validar_email){
                statement.setString(1, nome_texto);
                statement.setString(2, endereco_texto);
                statement.setString(3, email_texto);
                statement.setString(4, telefone_texto);
                statement.setInt(5, id);
            
                statement.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Client Updated !! ");
                
                 fetchData();
            }else{
                 JOptionPane.showMessageDialog(null, "Error adding client: email is not valid !!");
            }
        }catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error adding client: " + ex.getMessage());
        }
    }//GEN-LAST:event_Editar_btnActionPerformed

    private void Excluir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir_btnActionPerformed
        // TODO add your handling code here:
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter client ID to delete:"));
            String query = "DELETE FROM Cliente WHERE id_cliente = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();
            fetchData();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Client deleted successfully");
            } else {
                JOptionPane.showMessageDialog(null,"Client not found");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error deleting client: " + ex.getMessage());
            
            
        
        }
    }//GEN-LAST:event_Excluir_btnActionPerformed

    private void Salvar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar_btnActionPerformed
        // TODO add your handling code here:
        String query = "INSERT INTO Cliente (id_cliente, nome_cli, endereco_cli, email_cli, telefone) " +
                "VALUES (DEFAULT,?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            String nome_texto,endereco_texto,email_texto,telefone_texto,padrão_regex_email ;
            nome_texto = nome_txt.getText();
            endereco_texto = Endereco_txt.getText();
            email_texto = Email_txt.getText();
            telefone_texto = telefone_txt.getText();
            padrão_regex_email = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
            
            
            boolean validar_email = Pattern.matches(padrão_regex_email, email_texto);
            
            if(validar_email){
                statement.setString(1, nome_texto);
                statement.setString(2, endereco_texto);
                statement.setString(3, email_texto);
                statement.setString(4, telefone_texto);
            
                statement.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Added Client !! ");
                
                fetchData();
            }else{
                 JOptionPane.showMessageDialog(null, "Error adding client: email is not valid !!");
            }
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error adding client: " + ex.getMessage());
        }

    }//GEN-LAST:event_Salvar_btnActionPerformed

    private void nome_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_txtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nome_txtActionPerformed

    private void Endereco_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Endereco_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Endereco_txtActionPerformed

    private void Email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_txtActionPerformed

    private void telefone_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_txtActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(JCad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCad_Cliente(connection).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar_btn;
    private javax.swing.JTextField Email_txt;
    private javax.swing.JTextField Endereco_txt;
    private javax.swing.JButton Excluir_btn;
    private javax.swing.JButton Salvar_btn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JTextField telefone_txt;
    // End of variables declaration//GEN-END:variables
}
