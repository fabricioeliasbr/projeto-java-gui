/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJavaGUI;

/**
 *
 * @author LABORATORIO_INFO
 */
public class JFMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFMenuPrincipal
     */
    public JFMenuPrincipal() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnAdmin = new javax.swing.JButton();
        btnGerProdutos = new javax.swing.JButton();
        btnGerForn = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNF = new javax.swing.JButton();
        btnFinancas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/pessoa.png"))); // NOI18N
        btnAdmin.setText("Administradores");
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmin.setPreferredSize(new java.awt.Dimension(75, 25));
        btnAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 135, 115));

        btnGerProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/produto.png"))); // NOI18N
        btnGerProdutos.setText("Gerenciar produtos");
        btnGerProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerProdutos.setPreferredSize(new java.awt.Dimension(75, 25));
        btnGerProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGerProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 135, 115));

        btnGerForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/fornecedores.png"))); // NOI18N
        btnGerForn.setText("Gerenciar fornecedores");
        btnGerForn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerForn.setPreferredSize(new java.awt.Dimension(75, 25));
        btnGerForn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGerForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerFornActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 135, 115));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setPreferredSize(new java.awt.Dimension(75, 25));
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 135, 115));

        btnNF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/nf.png"))); // NOI18N
        btnNF.setText("Gerar NF");
        btnNF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNF.setPreferredSize(new java.awt.Dimension(75, 25));
        btnNF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNFActionPerformed(evt);
            }
        });
        getContentPane().add(btnNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 135, 115));

        btnFinancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/grafico.png"))); // NOI18N
        btnFinancas.setText("Fiinanças");
        btnFinancas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinancas.setInheritsPopupMenu(true);
        btnFinancas.setPreferredSize(new java.awt.Dimension(75, 25));
        btnFinancas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFinancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 135, 115));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/sairsistema.png"))); // NOI18N
        btnVoltar.setText("Sair do sistema");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVoltar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 460, 45));

        setSize(new java.awt.Dimension(496, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void run() {
        new JFLogin().setVisible(true);
        new JFGerenciarProdutos().setVisible(true);
    }    

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
            //Criando a instância janela
            JFLogin abrir = new JFLogin();
            //Abrindo a janela
            abrir.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnGerProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerProdutosActionPerformed
        // TODO add your handling code here:
        //Criando a instância janela
        JFGerenciarProdutos abrir = new JFGerenciarProdutos();
        //Abrindo a janela
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGerProdutosActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnFinancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinancasActionPerformed

    private void btnGerFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerFornActionPerformed

    private void btnNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNFActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnFinancas;
    private javax.swing.JButton btnGerForn;
    private javax.swing.JButton btnGerProdutos;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNF;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
