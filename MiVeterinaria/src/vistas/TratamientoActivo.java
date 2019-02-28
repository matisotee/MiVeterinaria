package vistas;

import DTO.DTOinfoMascota;
import DTO.DTOtratamiento;
import javax.swing.JOptionPane;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class TratamientoActivo extends javax.swing.JFrame {

    private ExpertoAdministrarVeterinaria expertoVeterinaria; 
    DTOtratamiento dto;
    
    
    
    
    public TratamientoActivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTratamientoActivo = new javax.swing.JPanel();
        jlTratamientoActivo = new javax.swing.JLabel();
        jlTipoTratamiento = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jbFinalizar = new javax.swing.JButton();
        jbContinuar = new javax.swing.JButton();
        jlTipoDeTratamiento = new javax.swing.JLabel();
        jlDescripcionDeTratamiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbVolverAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpTratamientoActivo.setBackground(new java.awt.Color(153, 204, 255));

        jlTratamientoActivo.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlTratamientoActivo.setText("-TRATAMIENTO ACTIVO-");

        jlTipoTratamiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTipoTratamiento.setText("Tipo de Tratamiento");

        jlDescripcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDescripcion.setText("Descripcion");

        jbFinalizar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbFinalizar.setText("Finalizar Tratamiento");
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });

        jbContinuar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbContinuar.setText("Continuar Tratamiento");
        jbContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuarActionPerformed(evt);
            }
        });

        jlTipoDeTratamiento.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlTipoDeTratamiento.setOpaque(true);

        jlDescripcionDeTratamiento.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlDescripcionDeTratamiento.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/lista-de-salud-del-perro.png"))); // NOI18N

        jbVolverAdministrador.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolverAdministrador.setText("Ir a Administrador Mascota");
        jbVolverAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTratamientoActivoLayout = new javax.swing.GroupLayout(jpTratamientoActivo);
        jpTratamientoActivo.setLayout(jpTratamientoActivoLayout);
        jpTratamientoActivoLayout.setHorizontalGroup(
            jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addGroup(jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                                .addComponent(jlDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlDescripcionDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jlTipoDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104))
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jlTratamientoActivo)
                        .addGap(184, 184, 184))
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addComponent(jlTipoTratamiento)
                        .addContainerGap(517, Short.MAX_VALUE))))
            .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbVolverAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jpTratamientoActivoLayout.setVerticalGroup(
            jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                .addGroup(jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jlTratamientoActivo))
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jlTipoTratamiento))
                    .addGroup(jpTratamientoActivoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jlTipoDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlDescripcionDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jpTratamientoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVolverAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTratamientoActivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTratamientoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuarActionPerformed
        NuevaVisita nuevaVisita = new NuevaVisita();
        nuevaVisita.setExpertoVeterinaria(expertoVeterinaria);
        nuevaVisita.setVisible(true);
        this.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_jbContinuarActionPerformed

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
       
       int desicion = JOptionPane.showConfirmDialog(null,"Estas seguro que deseas finalizar el tratamiento?","Finzalizar tratamiento",JOptionPane.YES_NO_OPTION);
       
       if (desicion ==  0){
          expertoVeterinaria.finalizarTratamiento(false);
          AdministradorMascota adminMascota = new AdministradorMascota();
          adminMascota.setExpertoVeterinaria(expertoVeterinaria);
          DTOinfoMascota dto =expertoVeterinaria.buscarMascota(expertoVeterinaria.getExpertoMascota().getAliasMascotaActual());
          adminMascota.setDto(dto);
          adminMascota.setVisible(true);
          this.setVisible(false);
          dispose(); 
         }
  
    }//GEN-LAST:event_jbFinalizarActionPerformed

    private void jbVolverAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverAdministradorActionPerformed
        AdministradorMascota adminMascota = new AdministradorMascota();
        adminMascota.setExpertoVeterinaria(expertoVeterinaria);
        DTOinfoMascota dtoInfoMascota = expertoVeterinaria.buscarMascota(expertoVeterinaria.getExpertoMascota().getAliasMascotaActual());
        adminMascota.setDto(dtoInfoMascota);
        adminMascota.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVolverAdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(TratamientoActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TratamientoActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TratamientoActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TratamientoActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TratamientoActivo().setVisible(true);
            }
        });
    }

    

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
    }

    public DTOtratamiento getDto() {
        return dto;
    }

    public void setDto(DTOtratamiento dto) {
        this.dto = dto;
        jlTipoDeTratamiento.setText(dto.getTipoTratamiento());
        jlDescripcionDeTratamiento.setText(dto.getDescripcion());
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbContinuar;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JButton jbVolverAdministrador;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlDescripcionDeTratamiento;
    private javax.swing.JLabel jlTipoDeTratamiento;
    private javax.swing.JLabel jlTipoTratamiento;
    private javax.swing.JLabel jlTratamientoActivo;
    private javax.swing.JPanel jpTratamientoActivo;
    // End of variables declaration//GEN-END:variables
}
