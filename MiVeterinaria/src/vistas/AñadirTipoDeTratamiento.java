package vistas;

import veterinaria.expertos.ExpertoAgregarTipoTratamiento;

/**
 *
 * @author mauri
 * 
 */
public class AñadirTipoDeTratamiento extends javax.swing.JFrame {

    ExpertoAgregarTipoTratamiento expertoAgregarTipoTratamiento = new ExpertoAgregarTipoTratamiento();
    private String nombreTipoTratamiento = "null";
    
    public AñadirTipoDeTratamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpAñadirTipoTratamiento = new javax.swing.JPanel();
        jlAñadirTipoTratamiento = new javax.swing.JLabel();
        jlNombreTipoTratamiento = new javax.swing.JLabel();
        jtfNombreTipoTratamiento = new javax.swing.JTextField();
        jbAñadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAñadirTipoTratamiento.setBackground(new java.awt.Color(153, 204, 255));
        jpAñadirTipoTratamiento.setMaximumSize(new java.awt.Dimension(800, 600));
        jpAñadirTipoTratamiento.setMinimumSize(new java.awt.Dimension(800, 600));

        jlAñadirTipoTratamiento.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlAñadirTipoTratamiento.setText("-AÑADIR TIPO DE TRATAMIENTO-");

        jlNombreTipoTratamiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlNombreTipoTratamiento.setText("Nombre del Tipo de Tratamiento");

        jtfNombreTipoTratamiento.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jbAñadir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbAñadir.setText("Añadir");
        jbAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Volver a Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAñadirTipoTratamientoLayout = new javax.swing.GroupLayout(jpAñadirTipoTratamiento);
        jpAñadirTipoTratamiento.setLayout(jpAñadirTipoTratamientoLayout);
        jpAñadirTipoTratamientoLayout.setHorizontalGroup(
            jpAñadirTipoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAñadirTipoTratamientoLayout.createSequentialGroup()
                .addGroup(jpAñadirTipoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAñadirTipoTratamientoLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jpAñadirTipoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNombreTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAñadirTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAñadirTipoTratamientoLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jtfNombreTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAñadirTipoTratamientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jbAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jpAñadirTipoTratamientoLayout.setVerticalGroup(
            jpAñadirTipoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAñadirTipoTratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAñadirTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jlNombreTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfNombreTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jpAñadirTipoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAñadirTipoTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAñadirTipoTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirActionPerformed
        nombreTipoTratamiento = jtfNombreTipoTratamiento.getText();
        expertoAgregarTipoTratamiento.agregarTipoTratamiento(nombreTipoTratamiento);
        VeterinariaMenuPrincipal veterinariaMenuPrincipal = new VeterinariaMenuPrincipal();
        veterinariaMenuPrincipal.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbAñadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VeterinariaMenuPrincipal veterinariaMenuPrincipal = new VeterinariaMenuPrincipal();
        veterinariaMenuPrincipal.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(AñadirTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirTipoDeTratamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jbAñadir;
    private javax.swing.JLabel jlAñadirTipoTratamiento;
    private javax.swing.JLabel jlNombreTipoTratamiento;
    private javax.swing.JPanel jpAñadirTipoTratamiento;
    private javax.swing.JTextField jtfNombreTipoTratamiento;
    // End of variables declaration//GEN-END:variables
}
