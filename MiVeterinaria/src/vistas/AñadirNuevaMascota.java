package vistas;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class AñadirNuevaMascota extends javax.swing.JFrame {
   
    private ExpertoAdministrarVeterinaria expertoVeterinaria;
  
    public AñadirNuevaMascota() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpAñadirNuevaMascota = new javax.swing.JPanel();
        jlAñadirNuevaMascota = new javax.swing.JLabel();
        jlAlias = new javax.swing.JLabel();
        jlEspecie = new javax.swing.JLabel();
        jlRaza = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlFechaNacimiento = new javax.swing.JLabel();
        jlColorPelo = new javax.swing.JLabel();
        jbAñadirMascota = new javax.swing.JButton();
        jtfAlias = new javax.swing.JTextField();
        jtfEspecie = new javax.swing.JTextField();
        jtfRaza = new javax.swing.JTextField();
        jtfSexo = new javax.swing.JTextField();
        jtfColorPelo = new javax.swing.JTextField();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAñadirNuevaMascota.setBackground(new java.awt.Color(153, 204, 255));
        jpAñadirNuevaMascota.setMaximumSize(new java.awt.Dimension(800, 600));
        jpAñadirNuevaMascota.setMinimumSize(new java.awt.Dimension(800, 600));
        jpAñadirNuevaMascota.setPreferredSize(new java.awt.Dimension(800, 600));

        jlAñadirNuevaMascota.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlAñadirNuevaMascota.setText("-AÑADIR NUEVA MASCOTA-");

        jlAlias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlAlias.setText("Alias");

        jlEspecie.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlEspecie.setText("Especie");

        jlRaza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlRaza.setText("Raza");

        jlSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlSexo.setText("Sexo");

        jlFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlFechaNacimiento.setText("Fecha Nacimiento");

        jlColorPelo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlColorPelo.setText("Color Pelo");

        jbAñadirMascota.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbAñadirMascota.setText("Añadir Mascota");
        jbAñadirMascota.setToolTipText("");
        jbAñadirMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirMascotaActionPerformed(evt);
            }
        });

        jtfAlias.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfEspecie.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfRaza.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfSexo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfColorPelo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jDateFechaNacimiento.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAñadirNuevaMascotaLayout = new javax.swing.GroupLayout(jpAñadirNuevaMascota);
        jpAñadirNuevaMascota.setLayout(jpAñadirNuevaMascotaLayout);
        jpAñadirNuevaMascotaLayout.setHorizontalGroup(
            jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAñadirNuevaMascotaLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jlAñadirNuevaMascota)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpAñadirNuevaMascotaLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAñadirNuevaMascotaLayout.createSequentialGroup()
                            .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlRaza)
                                .addComponent(jlFechaNacimiento)
                                .addComponent(jlSexo))
                            .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpAñadirNuevaMascotaLayout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jtfRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAñadirNuevaMascotaLayout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfColorPelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jpAñadirNuevaMascotaLayout.createSequentialGroup()
                            .addComponent(jlAlias)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAñadirNuevaMascotaLayout.createSequentialGroup()
                            .addComponent(jlEspecie)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlColorPelo))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAñadirNuevaMascotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbAñadirMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jpAñadirNuevaMascotaLayout.setVerticalGroup(
            jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAñadirNuevaMascotaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlAñadirNuevaMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlias)
                    .addComponent(jtfAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEspecie))
                .addGap(18, 18, 18)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRaza))
                .addGap(18, 18, 18)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSexo))
                .addGap(20, 20, 20)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlFechaNacimiento)
                    .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlColorPelo)
                    .addComponent(jtfColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jpAñadirNuevaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAñadirMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAñadirNuevaMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAñadirNuevaMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAñadirMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirMascotaActionPerformed
        
        try{
            String alias = jtfAlias.getText();
            String especie = jtfEspecie.getText();
            String raza = jtfRaza.getText();
            String sexo = jtfSexo.getText();
            String colorPelo = jtfColorPelo.getText();
            Date fechaNacimiento = jDateFechaNacimiento.getDate();
            java.sql.Date fechaEnSql = new java.sql.Date(fechaNacimiento.getTime());  

            if(camposVacios() == true){
                JOptionPane.showMessageDialog(rootPane,"Complete todos los campos","Campos incompletos",JOptionPane.ERROR_MESSAGE);  
            }
            else {
                expertoVeterinaria.registrarMascota(especie, alias, sexo, raza, colorPelo,fechaEnSql);
                MisMascotas misMascotas = new MisMascotas();
                ArrayList<String> mascotas =expertoVeterinaria.listarMascotas();
                misMascotas.setExpertoVeterinaria(expertoVeterinaria);
                misMascotas.setMisMascotas(mascotas);
                misMascotas.setVisible(true);
                this.setVisible(false);
                this.dispose();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Complete todos los campos","Fecha incompleta",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAñadirMascotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MisMascotas misMascotas = new MisMascotas();
        ArrayList<String> mascotas =expertoVeterinaria.listarMascotas();
        misMascotas.setExpertoVeterinaria(expertoVeterinaria);
        misMascotas.setMisMascotas(mascotas);
        misMascotas.setVisible(true);
        this.setVisible(false);
        this.dispose();
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
            java.util.logging.Logger.getLogger(AñadirNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirNuevaMascota().setVisible(true);
            }
        });
    }

    public boolean camposVacios(){
        String alias = jtfAlias.getText();
        String especie = jtfEspecie.getText();
        String raza = jtfRaza.getText();
        String sexo = jtfSexo.getText();
        String colorPelo = jtfColorPelo.getText();
        
        return alias.isEmpty() || especie.isEmpty()  || raza.isEmpty() || sexo.isEmpty() || colorPelo.isEmpty();
    }
    
    public ExpertoAdministrarVeterinaria getExpertoVeterinaria() {
        return expertoVeterinaria;
    }

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JButton jbAñadirMascota;
    private javax.swing.JLabel jlAlias;
    private javax.swing.JLabel jlAñadirNuevaMascota;
    private javax.swing.JLabel jlColorPelo;
    private javax.swing.JLabel jlEspecie;
    private javax.swing.JLabel jlFechaNacimiento;
    private javax.swing.JLabel jlRaza;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JPanel jpAñadirNuevaMascota;
    private javax.swing.JTextField jtfAlias;
    private javax.swing.JTextField jtfColorPelo;
    private javax.swing.JTextField jtfEspecie;
    private javax.swing.JTextField jtfRaza;
    private javax.swing.JTextField jtfSexo;
    // End of variables declaration//GEN-END:variables
}
