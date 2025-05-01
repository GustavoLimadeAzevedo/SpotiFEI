
package view;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroPanel = new javax.swing.JPanel();
        senhaCadastroTxt = new javax.swing.JTextField();
        cadastroButton = new javax.swing.JButton();
        Cadastro = new javax.swing.JLabel();
        nomeCadastro = new javax.swing.JLabel();
        nomeCadastroTxt = new javax.swing.JTextField();
        usuarioCadastro = new javax.swing.JLabel();
        usuarioCadastroTxt = new javax.swing.JTextField();
        senhaCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));

        cadastroPanel.setBackground(new java.awt.Color(0, 0, 0));

        senhaCadastroTxt.setBackground(new java.awt.Color(102, 102, 102));
        senhaCadastroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCadastroTxtActionPerformed(evt);
            }
        });

        cadastroButton.setForeground(new java.awt.Color(0, 204, 0));
        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        Cadastro.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(0, 204, 0));
        Cadastro.setText("CADASTRO");

        nomeCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeCadastro.setForeground(new java.awt.Color(0, 204, 0));
        nomeCadastro.setText("Nome:");

        nomeCadastroTxt.setBackground(new java.awt.Color(102, 102, 102));
        nomeCadastroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCadastroTxtActionPerformed(evt);
            }
        });

        usuarioCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuarioCadastro.setForeground(new java.awt.Color(0, 204, 0));
        usuarioCadastro.setText("Usuário:");

        usuarioCadastroTxt.setBackground(new java.awt.Color(102, 102, 102));
        usuarioCadastroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioCadastroTxtActionPerformed(evt);
            }
        });

        senhaCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaCadastro.setForeground(new java.awt.Color(0, 204, 0));
        senhaCadastro.setText("Senha:");

        javax.swing.GroupLayout cadastroPanelLayout = new javax.swing.GroupLayout(cadastroPanel);
        cadastroPanel.setLayout(cadastroPanelLayout);
        cadastroPanelLayout.setHorizontalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Cadastro))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadastroPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                                        .addComponent(usuarioCadastro)
                                        .addGap(25, 25, 25)
                                        .addComponent(usuarioCadastroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                                        .addComponent(nomeCadastro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeCadastroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadastroPanelLayout.createSequentialGroup()
                                .addComponent(senhaCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(senhaCadastroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(cadastroButton)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        cadastroPanelLayout.setVerticalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Cadastro)
                .addGap(61, 61, 61)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCadastro)
                    .addComponent(nomeCadastroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioCadastro)
                    .addComponent(usuarioCadastroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaCadastro)
                    .addComponent(senhaCadastroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(cadastroButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCadastroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCadastroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCadastroTxtActionPerformed

    private void usuarioCadastroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioCadastroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioCadastroTxtActionPerformed

    private void senhaCadastroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCadastroTxtActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_senhaCadastroTxtActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
       if(nomeCadastroTxt.getText().isEmpty() || usuarioCadastroTxt.getText().isEmpty() || 
       senhaCadastroTxt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    
    this.dispose();
    
    
    Login login = new Login();
    login.setLocationRelativeTo(null); 
    login.setVisible(true);
    }//GEN-LAST:event_cadastroButtonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastro;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JPanel cadastroPanel;
    private javax.swing.JLabel nomeCadastro;
    private javax.swing.JTextField nomeCadastroTxt;
    private javax.swing.JLabel senhaCadastro;
    private javax.swing.JTextField senhaCadastroTxt;
    private javax.swing.JLabel usuarioCadastro;
    private javax.swing.JTextField usuarioCadastroTxt;
    // End of variables declaration//GEN-END:variables
}
