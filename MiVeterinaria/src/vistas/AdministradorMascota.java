package vistas;
import DTO.DTOinfoMascota;
import DTO.DTOtratamiento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;
/**
 *
 * @author mauri
 * 
 */

public class AdministradorMascota extends javax.swing.JFrame {

    private ExpertoAdministrarVeterinaria expertoVeterinaria;
    DTOinfoMascota dtoInfoMascota ;
   
    public AdministradorMascota() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpAdministradorMascota = new javax.swing.JPanel();
        jlAdministradorMascota = new javax.swing.JLabel();
        jlAliasMascota = new javax.swing.JLabel();
        jbRealizarTratamiento = new javax.swing.JButton();
        jbListar = new javax.swing.JButton();
        jbDarBaja = new javax.swing.JButton();
        jlEspecie = new javax.swing.JLabel();
        jlFecNac = new javax.swing.JLabel();
        jlPesoMedio = new javax.swing.JLabel();
        jlRaza = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbVolverAMisMascotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAdministradorMascota.setBackground(new java.awt.Color(153, 204, 255));
        jpAdministradorMascota.setMaximumSize(new java.awt.Dimension(800, 600));
        jpAdministradorMascota.setMinimumSize(new java.awt.Dimension(800, 600));

        jlAdministradorMascota.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlAdministradorMascota.setText("-ADMINISTRADOR MASCOTA-");

        jlAliasMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAliasMascota.setOpaque(true);

        jbRealizarTratamiento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbRealizarTratamiento.setText("Realizar Tratamiento");
        jbRealizarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarTratamientoActionPerformed(evt);
            }
        });

        jbListar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbListar.setText("Listar Visitas de Mascota");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        jbDarBaja.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbDarBaja.setText("Dar de Baja Mascota");
        jbDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarBajaActionPerformed(evt);
            }
        });

        jlEspecie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEspecie.setOpaque(true);

        jlFecNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlFecNac.setOpaque(true);

        jlPesoMedio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlPesoMedio.setOpaque(true);

        jlRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlRaza.setOpaque(true);

        jlSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlSexo.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/hotel-de-mascotas-.png"))); // NOI18N

        jbVolverAMisMascotas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolverAMisMascotas.setText("Volver a Mis Mascotas");
        jbVolverAMisMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverAMisMascotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAdministradorMascotaLayout = new javax.swing.GroupLayout(jpAdministradorMascota);
        jpAdministradorMascota.setLayout(jpAdministradorMascotaLayout);
        jpAdministradorMascotaLayout.setHorizontalGroup(
            jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdministradorMascotaLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jlAdministradorMascota)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(jpAdministradorMascotaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbRealizarTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDarBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVolverAMisMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdministradorMascotaLayout.createSequentialGroup()
                        .addGroup(jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlPesoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlAliasMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdministradorMascotaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );
        jpAdministradorMascotaLayout.setVerticalGroup(
            jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdministradorMascotaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlAdministradorMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpAdministradorMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAdministradorMascotaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlAliasMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlPesoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jlEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdministradorMascotaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRealizarTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jbListar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jbDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbVolverAMisMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAdministradorMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAdministradorMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRealizarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarTratamientoActionPerformed
        
        DTOtratamiento dto = expertoVeterinaria.buscarTratamientosActivos();
        
        
        if (dto == null){
            NuevoTratamiento nuevoTratamiento = new NuevoTratamiento();
            nuevoTratamiento.setExpertoVeterinaria(expertoVeterinaria);
            nuevoTratamiento.setDtoInfoMascota(dtoInfoMascota);
            nuevoTratamiento.setVisible(true);
            this.setVisible(false);
            dispose();
        }else{
            TratamientoActivo tratamientoActivo = new TratamientoActivo();
            tratamientoActivo.setExpertoVeterinaria(expertoVeterinaria);
            tratamientoActivo.setDto(dto);
            tratamientoActivo.setVisible(true);
            this.setVisible(false);
            dispose();
        }
         
    }//GEN-LAST:event_jbRealizarTratamientoActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        SeleccionarTipoDeTratamiento seleccionarTipoTratamiento = new SeleccionarTipoDeTratamiento();
        ArrayList<String> nombresTipoTratamiento = expertoVeterinaria.listarVisitas();
        seleccionarTipoTratamiento.setExpertoVeterinaria(expertoVeterinaria);
        seleccionarTipoTratamiento.setListaTipoTratamientos(nombresTipoTratamiento);
        seleccionarTipoTratamiento.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarBajaActionPerformed
       int desicion = JOptionPane.showConfirmDialog(null,"Estas seguro que deseas eliminar a "+expertoVeterinaria.getExpertoMascota().getAliasMascotaActual()+" ?","Eliminar Mascota",JOptionPane.YES_NO_OPTION);
       
        if(desicion == 0){
           expertoVeterinaria.borrarMascota();
           ArrayList<String> mascotas = expertoVeterinaria.listarMascotas();
           MisMascotas misMascotas = new MisMascotas();
           misMascotas.setExpertoVeterinaria(expertoVeterinaria);
           misMascotas.setMisMascotas(mascotas);
           misMascotas.setVisible(true);
           this.setVisible(false);
           dispose();
        }
    }//GEN-LAST:event_jbDarBajaActionPerformed

    private void jbVolverAMisMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverAMisMascotasActionPerformed
        ArrayList<String> mascotas = expertoVeterinaria.listarMascotas();   
        MisMascotas misMascotas = new MisMascotas();
        misMascotas.setExpertoVeterinaria(expertoVeterinaria);
        misMascotas.setMisMascotas(mascotas);
        misMascotas.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbVolverAMisMascotasActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorMascota().setVisible(true);
            }
        });
    }

    

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
        
        
        
    }

    public DTOinfoMascota getDto() {
        return dtoInfoMascota;
    }

    public void setDto(DTOinfoMascota dto) {
        this.dtoInfoMascota = dto;
        
        jlAliasMascota.setText("Nombre de la mascota: "+dtoInfoMascota.getAlias());
        jlEspecie.setText("Especie: "+dtoInfoMascota.getEspecie());
        jlFecNac.setText("Fecha nacimiento: "+dtoInfoMascota.getFecNac().toString());
        jlPesoMedio.setText("Peso promedio: "+dtoInfoMascota.getPesoMedio()+" Kg");
        jlRaza.setText("Raza: "+dtoInfoMascota.getRaza());
        jlSexo.setText("Sexo: "+dtoInfoMascota.getSexo());
        
 
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbDarBaja;
    private javax.swing.JButton jbListar;
    private javax.swing.JButton jbRealizarTratamiento;
    private javax.swing.JButton jbVolverAMisMascotas;
    private javax.swing.JLabel jlAdministradorMascota;
    private javax.swing.JLabel jlAliasMascota;
    private javax.swing.JLabel jlEspecie;
    private javax.swing.JLabel jlFecNac;
    private javax.swing.JLabel jlPesoMedio;
    private javax.swing.JLabel jlRaza;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JPanel jpAdministradorMascota;
    // End of variables declaration//GEN-END:variables
}
