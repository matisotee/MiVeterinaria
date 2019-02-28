package vistas;


/**
 *
 * @author mauri
 * 
 */
public class VeterinariaMenuPrincipal extends javax.swing.JFrame {
     
    
    
    public VeterinariaMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpVeterinaria = new javax.swing.JPanel();
        jlVeterinaria = new javax.swing.JLabel();
        jbAdministrarClientes = new javax.swing.JButton();
        jbVisitasMismoTratamiento = new javax.swing.JButton();
        jbTratamientosActivos = new javax.swing.JButton();
        jbAñadirTipoTratamiento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 204, 102));
        setName("MenuPrincipal"); // NOI18N

        jpVeterinaria.setBackground(new java.awt.Color(153, 204, 255));
        jpVeterinaria.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jpVeterinaria.setMaximumSize(new java.awt.Dimension(800, 600));
        jpVeterinaria.setMinimumSize(new java.awt.Dimension(800, 600));

        jlVeterinaria.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlVeterinaria.setText("-VETERINARIA-");

        jbAdministrarClientes.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbAdministrarClientes.setText("Administrar Clientes");
        jbAdministrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdministrarClientesActionPerformed(evt);
            }
        });

        jbVisitasMismoTratamiento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVisitasMismoTratamiento.setText("Visitas de un Mismo Tratamiento");
        jbVisitasMismoTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisitasMismoTratamientoActionPerformed(evt);
            }
        });

        jbTratamientosActivos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbTratamientosActivos.setText("Tratamientos Activos");
        jbTratamientosActivos.setBorderPainted(false);
        jbTratamientosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTratamientosActivosActionPerformed(evt);
            }
        });

        jbAñadirTipoTratamiento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbAñadirTipoTratamiento.setText("Añadir Tipo de Tratamiento");
        jbAñadirTipoTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirTipoTratamientoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/Veterinary_symbol.svg.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Design by Equipo 25 Studios");

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/salir-opcion.png"))); // NOI18N
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setContentAreaFilled(false);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SALIR");

        javax.swing.GroupLayout jpVeterinariaLayout = new javax.swing.GroupLayout(jpVeterinaria);
        jpVeterinaria.setLayout(jpVeterinariaLayout);
        jpVeterinariaLayout.setHorizontalGroup(
            jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeterinariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeterinariaLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpVeterinariaLayout.createSequentialGroup()
                                .addGroup(jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbAdministrarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbTratamientosActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbAñadirTipoTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbVisitasMismoTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addGroup(jpVeterinariaLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(276, Short.MAX_VALUE))
                            .addGroup(jpVeterinariaLayout.createSequentialGroup()
                                .addComponent(jlVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(jpVeterinariaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53))))
        );
        jpVeterinariaLayout.setVerticalGroup(
            jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeterinariaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeterinariaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(jpVeterinariaLayout.createSequentialGroup()
                        .addGroup(jpVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpVeterinariaLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(jbAdministrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(jbVisitasMismoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jbTratamientosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbAñadirTipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpVeterinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpVeterinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdministrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdministrarClientesActionPerformed
        BuscarCliente buscarCliente = new BuscarCliente();
        buscarCliente.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbAdministrarClientesActionPerformed

    private void jbVisitasMismoTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisitasMismoTratamientoActionPerformed
        SeleccionarTipoDeTratamiento2 seleccionarTipoDeTratamiento2 = new SeleccionarTipoDeTratamiento2();
        seleccionarTipoDeTratamiento2.setVisible(true);
        this.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_jbVisitasMismoTratamientoActionPerformed

    private void jbTratamientosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamientosActivosActionPerformed
        TratamientosActivosDeLaVeterinaria tratamientosActivosDeLaVeterinaria = new TratamientosActivosDeLaVeterinaria();
        tratamientosActivosDeLaVeterinaria.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbTratamientosActivosActionPerformed

    private void jbAñadirTipoTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirTipoTratamientoActionPerformed
        AñadirTipoDeTratamiento añadirTipoDeTratamiento = new AñadirTipoDeTratamiento();
        añadirTipoDeTratamiento.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbAñadirTipoTratamientoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(VeterinariaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeterinariaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeterinariaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeterinariaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeterinariaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAdministrarClientes;
    private javax.swing.JButton jbAñadirTipoTratamiento;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbTratamientosActivos;
    private javax.swing.JButton jbVisitasMismoTratamiento;
    private javax.swing.JLabel jlVeterinaria;
    private javax.swing.JPanel jpVeterinaria;
    // End of variables declaration//GEN-END:variables
}
