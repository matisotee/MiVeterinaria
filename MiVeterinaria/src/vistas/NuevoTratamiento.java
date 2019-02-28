package vistas;

import DTO.DTOinfoMascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class NuevoTratamiento extends javax.swing.JFrame {

    
    private ExpertoAdministrarVeterinaria expertoVeterinaria; 
    ArrayList<String> listaTipoTratamientos = new ArrayList<>();
    DTOinfoMascota dtoInfoMascota;
    
    
    public NuevoTratamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void llenarComboBox(){
        listaTipoTratamientos = expertoVeterinaria.buscarListaDeTipoTratamiento();
        
        for(String tipoTratamiento:listaTipoTratamientos){
            jcbTipoDeTratamiento.addItem(tipoTratamiento);
         }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpNuevoTratamiento = new javax.swing.JPanel();
        jlNuevoTratamiento = new javax.swing.JLabel();
        jlTipoDeTratamiento = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jlImporte = new javax.swing.JLabel();
        jbCrearTratamiento = new javax.swing.JButton();
        jcbTipoDeTratamiento = new javax.swing.JComboBox<>();
        jtfDescripcion = new javax.swing.JTextField();
        jtfImporte = new javax.swing.JTextField();
        jbVolverAdministradorMascota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpNuevoTratamiento.setBackground(new java.awt.Color(153, 204, 255));
        jpNuevoTratamiento.setMaximumSize(new java.awt.Dimension(800, 600));
        jpNuevoTratamiento.setMinimumSize(new java.awt.Dimension(800, 600));
        jpNuevoTratamiento.setPreferredSize(new java.awt.Dimension(800, 600));

        jlNuevoTratamiento.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlNuevoTratamiento.setText("-NUEVO TRATAMIENTO-");

        jlTipoDeTratamiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTipoDeTratamiento.setText("Tipo de Tratamiento");

        jlDescripcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDescripcion.setText("Descripcion");

        jlImporte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlImporte.setText("Importe");

        jbCrearTratamiento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbCrearTratamiento.setText("Crear Tratamiento");
        jbCrearTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearTratamientoActionPerformed(evt);
            }
        });

        jcbTipoDeTratamiento.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jcbTipoDeTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoDeTratamientoActionPerformed(evt);
            }
        });

        jtfDescripcion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfImporte.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImporteActionPerformed(evt);
            }
        });
        jtfImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfImporteKeyTyped(evt);
            }
        });

        jbVolverAdministradorMascota.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolverAdministradorMascota.setText("Volver a Administrador de Mascota");
        jbVolverAdministradorMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverAdministradorMascotaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("$");

        javax.swing.GroupLayout jpNuevoTratamientoLayout = new javax.swing.GroupLayout(jpNuevoTratamiento);
        jpNuevoTratamiento.setLayout(jpNuevoTratamientoLayout);
        jpNuevoTratamientoLayout.setHorizontalGroup(
            jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoTratamientoLayout.createSequentialGroup()
                .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoTratamientoLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jlNuevoTratamiento))
                    .addGroup(jpNuevoTratamientoLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcion)
                            .addComponent(jlTipoDeTratamiento)
                            .addGroup(jpNuevoTratamientoLayout.createSequentialGroup()
                                .addComponent(jlImporte)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoTratamientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbTipoDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoTratamientoLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jbVolverAdministradorMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCrearTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jpNuevoTratamientoLayout.setVerticalGroup(
            jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoTratamientoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlNuevoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTipoDeTratamiento))
                .addGap(82, 82, 82)
                .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlImporte)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jpNuevoTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCrearTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jbVolverAdministradorMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNuevoTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNuevoTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoDeTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoDeTratamientoActionPerformed

    }//GEN-LAST:event_jcbTipoDeTratamientoActionPerformed

    private void jbCrearTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearTratamientoActionPerformed

        if(camposVacios() == true){
          JOptionPane.showMessageDialog(rootPane,"Complete todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);    
        }
        else{
            String tipoTratamiento =(String)jcbTipoDeTratamiento.getSelectedItem();
            String descripcion = jtfDescripcion.getText();
            String aux = jtfImporte.getText();
            double importe = Double.parseDouble(aux);

            expertoVeterinaria.guardarNuevoTratamiento(tipoTratamiento, descripcion, true, importe);

            NuevaVisita nuevaVisita = new NuevaVisita();
            nuevaVisita.setExpertoVeterinaria(expertoVeterinaria);
            nuevaVisita.setDtoInfoMascota(dtoInfoMascota);
            nuevaVisita.setVisible(true);
            this.setVisible(false);
            dispose(); 
        }
    }//GEN-LAST:event_jbCrearTratamientoActionPerformed

    private void jtfImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfImporteActionPerformed

    private void jbVolverAdministradorMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverAdministradorMascotaActionPerformed
       AdministradorMascota adminMascota = new AdministradorMascota();
       adminMascota.setExpertoVeterinaria(expertoVeterinaria);
       adminMascota.setDto(dtoInfoMascota);
       adminMascota.setVisible(true);
       dispose();
    }//GEN-LAST:event_jbVolverAdministradorMascotaActionPerformed

    private void jtfImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfImporteKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
             getToolkit().beep();
             evt.consume();
             JOptionPane.showMessageDialog(rootPane, "No puedes ingresar letras en el importe, por favor, ingrese el importe de manera correcta");
        }
    }//GEN-LAST:event_jtfImporteKeyTyped

    
    public boolean camposVacios(){
        String descripcion = jtfDescripcion.getText();
        String importe = jtfImporte.getText();
        return descripcion.isEmpty() || importe.isEmpty() ;    
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
            java.util.logging.Logger.getLogger(NuevoTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoTratamiento().setVisible(true);
            }
        });
    }

    public void setDtoInfoMascota(DTOinfoMascota dtoInfoMascota) {
        this.dtoInfoMascota = dtoInfoMascota;
    }

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
        llenarComboBox();
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCrearTratamiento;
    private javax.swing.JButton jbVolverAdministradorMascota;
    private javax.swing.JComboBox<String> jcbTipoDeTratamiento;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlImporte;
    private javax.swing.JLabel jlNuevoTratamiento;
    private javax.swing.JLabel jlTipoDeTratamiento;
    private javax.swing.JPanel jpNuevoTratamiento;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfImporte;
    // End of variables declaration//GEN-END:variables
}
