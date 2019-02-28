package vistas;

import java.util.ArrayList;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;


/**
 *
 * @author mauri
 * 
 */
public class AdministradorCliente extends javax.swing.JFrame {
    
    private ExpertoAdministrarVeterinaria expertoVeterinaria;
    private ArrayList<String> mascotas = new ArrayList<String>();

    
    public AdministradorCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpAdministradorCliente = new javax.swing.JPanel();
        jlAdministradorCliente = new javax.swing.JLabel();
        jbMisMascotas = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jlNombreCliente = new javax.swing.JLabel();
        jlDniCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbVolverMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAdministradorCliente.setBackground(new java.awt.Color(153, 204, 255));
        jpAdministradorCliente.setMaximumSize(new java.awt.Dimension(800, 600));
        jpAdministradorCliente.setMinimumSize(new java.awt.Dimension(800, 600));

        jlAdministradorCliente.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlAdministradorCliente.setText("-ADMINISTRADOR CLIENTE-");

        jbMisMascotas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbMisMascotas.setText("Mis Mascotas");
        jbMisMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMisMascotasActionPerformed(evt);
            }
        });

        jbEditar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbEditar.setText("Editar Mis Datos");
        jbEditar.setToolTipText("");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbEliminar.setText("Eliminar Cliente");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jlNombreCliente.setBackground(new java.awt.Color(102, 102, 102));
        jlNombreCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreCliente.setText("                 ");
        jlNombreCliente.setOpaque(true);

        jlDniCliente.setBackground(new java.awt.Color(102, 102, 102));
        jlDniCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlDniCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlDniCliente.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/silueta-de-usuario.png"))); // NOI18N

        jbVolverMenuPrincipal.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolverMenuPrincipal.setText("Volver a Menu Pricipal");
        jbVolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAdministradorClienteLayout = new javax.swing.GroupLayout(jpAdministradorCliente);
        jpAdministradorCliente.setLayout(jpAdministradorClienteLayout);
        jpAdministradorClienteLayout.setHorizontalGroup(
            jpAdministradorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdministradorClienteLayout.createSequentialGroup()
                .addGap(0, 170, Short.MAX_VALUE)
                .addComponent(jlAdministradorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jpAdministradorClienteLayout.createSequentialGroup()
                .addGroup(jpAdministradorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAdministradorClienteLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jpAdministradorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbMisMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbVolverMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpAdministradorClienteLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addGroup(jpAdministradorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAdministradorClienteLayout.setVerticalGroup(
            jpAdministradorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdministradorClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlAdministradorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jpAdministradorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jpAdministradorClienteLayout.createSequentialGroup()
                        .addComponent(jlNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jbMisMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbVolverMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAdministradorCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAdministradorCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMisMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMisMascotasActionPerformed
        mascotas = expertoVeterinaria.listarMascotas();
        MisMascotas misMascotas = new MisMascotas();
        misMascotas.setMisMascotas(mascotas);
        misMascotas.setExpertoVeterinaria(expertoVeterinaria);
        misMascotas.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbMisMascotasActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        EditarDatosCliente editarDatosCliente = new EditarDatosCliente();
        editarDatosCliente.setExpertoVeterinaria(expertoVeterinaria);
        editarDatosCliente.setClienteActual(expertoVeterinaria.getExpertoCliente().getClienteActual());
        editarDatosCliente.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        EliminarCliente eliminarCliente = new EliminarCliente();
        eliminarCliente.setExpertoVeterinaria(expertoVeterinaria);
        eliminarCliente.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbVolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverMenuPrincipalActionPerformed
        VeterinariaMenuPrincipal veterinariaMenuPrincipal = new VeterinariaMenuPrincipal();
        veterinariaMenuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverMenuPrincipalActionPerformed


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
            java.util.logging.Logger.getLogger(AdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorCliente().setVisible(true);
            }
        });
    }
    
    

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
        jlNombreCliente.setText("Nombre: "+expertoVeterinaria.getExpertoCliente().getNombreClienteActual());
        jlDniCliente.setText("DNI: "+expertoVeterinaria.getExpertoCliente().getDniClienteActual());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbMisMascotas;
    private javax.swing.JButton jbVolverMenuPrincipal;
    private javax.swing.JLabel jlAdministradorCliente;
    private javax.swing.JLabel jlDniCliente;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JPanel jpAdministradorCliente;
    // End of variables declaration//GEN-END:variables
}
