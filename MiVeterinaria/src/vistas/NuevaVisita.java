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
public class NuevaVisita extends javax.swing.JFrame {
    
    private ExpertoAdministrarVeterinaria expertoVeterinaria; 
    DTOinfoMascota dtoInfoMascota;
  
    public NuevaVisita() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNuevaVisita = new javax.swing.JPanel();
        jlNuevaVisita = new javax.swing.JLabel();
        jlPeso = new javax.swing.JLabel();
        jlDetalles = new javax.swing.JLabel();
        jtfDetalles = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jbCrearVisita = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpNuevaVisita.setBackground(new java.awt.Color(153, 204, 255));
        jpNuevaVisita.setMaximumSize(new java.awt.Dimension(800, 600));
        jpNuevaVisita.setMinimumSize(new java.awt.Dimension(800, 600));

        jlNuevaVisita.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlNuevaVisita.setText("-NUEVA VISITA-");

        jlPeso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlPeso.setText("Peso");

        jlDetalles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDetalles.setText("Detalles");

        jtfDetalles.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDetallesActionPerformed(evt);
            }
        });

        jtfPeso.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesoActionPerformed(evt);
            }
        });
        jtfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesoKeyTyped(evt);
            }
        });

        jbCrearVisita.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbCrearVisita.setText("Crear Visita");
        jbCrearVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearVisitaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/carpeta-simbolo-de-agregar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("(KG)");

        javax.swing.GroupLayout jpNuevaVisitaLayout = new javax.swing.GroupLayout(jpNuevaVisita);
        jpNuevaVisita.setLayout(jpNuevaVisitaLayout);
        jpNuevaVisitaLayout.setHorizontalGroup(
            jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaVisitaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpNuevaVisitaLayout.createSequentialGroup()
                        .addComponent(jlDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jpNuevaVisitaLayout.createSequentialGroup()
                        .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaVisitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaVisitaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(jlNuevaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaVisitaLayout.createSequentialGroup()
                        .addComponent(jbCrearVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))))
        );
        jpNuevaVisitaLayout.setVerticalGroup(
            jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaVisitaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNuevaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jpNuevaVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPeso)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jbCrearVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNuevaVisita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNuevaVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDetallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDetallesActionPerformed

    private void jtfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesoActionPerformed

    private void jbCrearVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearVisitaActionPerformed
     
        if(camposVacios() == true){
            JOptionPane.showMessageDialog(rootPane,"Ingrese todos los campos de manera correcta","ERROR",JOptionPane.ERROR_MESSAGE);  
        }
        else{
            String detalles = jtfDetalles.getText();
            String aux = jtfPeso.getText();
            double peso = Double.parseDouble(aux);
            expertoVeterinaria.realizarVisita(detalles,peso);
            TratamientoActivo tratamientoActivo = new TratamientoActivo();
            tratamientoActivo.setExpertoVeterinaria(expertoVeterinaria);
            DTOtratamiento dto = expertoVeterinaria.buscarTratamientosActivos();
            tratamientoActivo.setDto(dto);
            tratamientoActivo.setExpertoVeterinaria(expertoVeterinaria);
            tratamientoActivo.setVisible(true);
            this.setVisible(false);
            dispose();   
        }            
    }//GEN-LAST:event_jbCrearVisitaActionPerformed

    private void jtfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar letras en el peso de la mascota, por favor, ingrese el peso de manera correcta");
        }
    }//GEN-LAST:event_jtfPesoKeyTyped

    public boolean camposVacios(){
       String detalles = jtfDetalles.getText();
       String peso = jtfPeso.getText();
       return detalles.isEmpty() || peso.isEmpty();
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
            java.util.logging.Logger.getLogger(NuevaVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaVisita().setVisible(true);
            }
        });
    }

    public void setDtoInfoMascota(DTOinfoMascota dtoInfoMascota) {
        this.dtoInfoMascota = dtoInfoMascota;
    }

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbCrearVisita;
    private javax.swing.JLabel jlDetalles;
    private javax.swing.JLabel jlNuevaVisita;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JPanel jpNuevaVisita;
    private javax.swing.JTextField jtfDetalles;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
