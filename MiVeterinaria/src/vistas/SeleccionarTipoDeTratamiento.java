package vistas;
import java.util.ArrayList;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class SeleccionarTipoDeTratamiento extends javax.swing.JFrame {

    ArrayList<String> listaTipoTratamientos = new ArrayList<>(); 
    ExpertoAdministrarVeterinaria expertoVeterinaria; 
    String nombreTipoTratamiento;
    
    public SeleccionarTipoDeTratamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void llenarComboBox(){
        
        for(String tipoTratamiento:listaTipoTratamientos){
            jcbTipoDeTratamiento.addItem(tipoTratamiento);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSeleccionarTipoDeTratamiento = new javax.swing.JPanel();
        jlSeleccionar = new javax.swing.JLabel();
        jlTipoDeTratamiento = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jcbTipoDeTratamiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpSeleccionarTipoDeTratamiento.setBackground(new java.awt.Color(153, 204, 255));
        jpSeleccionarTipoDeTratamiento.setMaximumSize(new java.awt.Dimension(800, 600));
        jpSeleccionarTipoDeTratamiento.setMinimumSize(new java.awt.Dimension(800, 600));

        jlSeleccionar.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlSeleccionar.setText("-SELECCIONAR TIPO DE TRATAMIENTO-");

        jlTipoDeTratamiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTipoDeTratamiento.setText("Seleccione tipo de Tratamiento");

        jbAceptar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jcbTipoDeTratamiento.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jcbTipoDeTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoDeTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSeleccionarTipoDeTratamientoLayout = new javax.swing.GroupLayout(jpSeleccionarTipoDeTratamiento);
        jpSeleccionarTipoDeTratamiento.setLayout(jpSeleccionarTipoDeTratamientoLayout);
        jpSeleccionarTipoDeTratamientoLayout.setHorizontalGroup(
            jpSeleccionarTipoDeTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSeleccionarTipoDeTratamientoLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jpSeleccionarTipoDeTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSeleccionarTipoDeTratamientoLayout.createSequentialGroup()
                        .addComponent(jlSeleccionar)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSeleccionarTipoDeTratamientoLayout.createSequentialGroup()
                        .addGroup(jpSeleccionarTipoDeTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTipoDeTratamiento)
                            .addGroup(jpSeleccionarTipoDeTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbTipoDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(254, 254, 254))))
        );
        jpSeleccionarTipoDeTratamientoLayout.setVerticalGroup(
            jpSeleccionarTipoDeTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSeleccionarTipoDeTratamientoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlSeleccionar)
                .addGap(123, 123, 123)
                .addComponent(jlTipoDeTratamiento)
                .addGap(28, 28, 28)
                .addComponent(jcbTipoDeTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jbAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSeleccionarTipoDeTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSeleccionarTipoDeTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        ListaDeVisitasDeUnMismoTipo listaDeVisitasDeUnMismoTipo = new ListaDeVisitasDeUnMismoTipo();
        nombreTipoTratamiento =(String)jcbTipoDeTratamiento.getSelectedItem();
        listaDeVisitasDeUnMismoTipo.setNombreTipoTratamiento(nombreTipoTratamiento);
        listaDeVisitasDeUnMismoTipo.setExpertoVeterinaria(expertoVeterinaria);
        listaDeVisitasDeUnMismoTipo.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jcbTipoDeTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoDeTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoDeTratamientoActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionarTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarTipoDeTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarTipoDeTratamiento().setVisible(true);
            }
        });
    }

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;   
    }

    public ArrayList<String> getListaTipoTratamientos() {
        return listaTipoTratamientos;
    }

    public void setListaTipoTratamientos(ArrayList<String> listaTipoTratamientos) {
        this.listaTipoTratamientos = listaTipoTratamientos;
        llenarComboBox();
    }
    
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JComboBox<String> jcbTipoDeTratamiento;
    private javax.swing.JLabel jlSeleccionar;
    private javax.swing.JLabel jlTipoDeTratamiento;
    private javax.swing.JPanel jpSeleccionarTipoDeTratamiento;
    // End of variables declaration//GEN-END:variables
}
