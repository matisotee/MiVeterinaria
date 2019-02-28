package vistas;
import javax.swing.JOptionPane;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;
import veterinaria.modelo.Cliente;

/**
 *
 * @author mauri
 * 
 */
public class EditarDatosCliente extends javax.swing.JFrame {

    
    private ExpertoAdministrarVeterinaria expertoVeterinaria;
    private Cliente clienteActual;
    
    public EditarDatosCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void llenarCampos(){
        jtfDNI.setText(""+clienteActual.getDni());
        jtfDNI.setEditable(false);
        jtfNombreYApellido.setText(""+clienteActual.getNombreApellido());
        jtfDireccion.setText(""+clienteActual.getDireccion());
        jtfTelefono.setText(""+clienteActual.getTelefono());
        jtfResponsable.setText(""+clienteActual.getResponsable2());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEditarDatosCliente = new javax.swing.JPanel();
        jlEditarDatosCliente = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlNombreYApellido = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlResponsable = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfNombreYApellido = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfResponsable = new javax.swing.JTextField();
        jbActualizarDatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpEditarDatosCliente.setBackground(new java.awt.Color(153, 204, 255));
        jpEditarDatosCliente.setMaximumSize(new java.awt.Dimension(800, 600));
        jpEditarDatosCliente.setMinimumSize(new java.awt.Dimension(800, 600));

        jlEditarDatosCliente.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlEditarDatosCliente.setText("-EDITAR DATOS CLIENTE-");

        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDNI.setText("DNI");

        jlNombreYApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlNombreYApellido.setText("Nombre y Apellido");

        jlDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDireccion.setText("Direccion");

        jlTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTelefono.setText("Telefono");

        jlResponsable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlResponsable.setText("Responsable");
        jlResponsable.setToolTipText("");

        jtfDNI.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDNIKeyTyped(evt);
            }
        });

        jtfNombreYApellido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfNombreYApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreYApellidoKeyTyped(evt);
            }
        });

        jtfDireccion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoKeyTyped(evt);
            }
        });

        jtfResponsable.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfResponsableKeyTyped(evt);
            }
        });

        jbActualizarDatos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbActualizarDatos.setText("Actualizar Datos");
        jbActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarDatosActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/carpeta.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Volver Administrador Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEditarDatosClienteLayout = new javax.swing.GroupLayout(jpEditarDatosCliente);
        jpEditarDatosCliente.setLayout(jpEditarDatosClienteLayout);
        jpEditarDatosClienteLayout.setHorizontalGroup(
            jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarDatosClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfNombreYApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEditarDatosClienteLayout.createSequentialGroup()
                        .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDNI)
                            .addComponent(jlNombreYApellido)
                            .addComponent(jlDireccion)
                            .addComponent(jlTelefono)
                            .addComponent(jlResponsable))
                        .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEditarDatosClienteLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditarDatosClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfResponsable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditarDatosClienteLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditarDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jlEditarDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditarDatosClienteLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jbActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        jpEditarDatosClienteLayout.setVerticalGroup(
            jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEditarDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreYApellido)
                    .addComponent(jtfNombreYApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlResponsable)
                    .addComponent(jtfResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jpEditarDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEditarDatosCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEditarDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarDatosActionPerformed
        if(camposVacios() == true){
            JOptionPane.showMessageDialog(rootPane,"Ingrese todos los campos de manera correcta","Campos incompletos",JOptionPane.ERROR_MESSAGE);  
        }
        else{
            int desicion = JOptionPane.showConfirmDialog(null,"¿Estas seguro que deseas actualizar los datos?","Actualizar Cliente",JOptionPane.YES_NO_OPTION);
            if(desicion == 0){
                String x = jtfDNI.getText();
                int dni = Integer.parseInt(x);
                String y = jtfTelefono.getText();
                long telefono = Long.parseLong(y);
                expertoVeterinaria.actualizarCliente(dni, jtfNombreYApellido.getText(), jtfDireccion.getText(), jtfResponsable.getText(),telefono); 
                AdministradorCliente adminCliente = new AdministradorCliente();
                adminCliente.setVisible(true);
                adminCliente.setExpertoVeterinaria(expertoVeterinaria);
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_jbActualizarDatosActionPerformed

    private void jtfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDNIKeyTyped

    }//GEN-LAST:event_jtfDNIKeyTyped

    private void jtfNombreYApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreYApellidoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
             getToolkit().beep();
             evt.consume();
             JOptionPane.showMessageDialog(rootPane, "No puedes ingresar numeros en tu nombre, por favor ingrese los datos de manera correcta");
        }
    }//GEN-LAST:event_jtfNombreYApellidoKeyTyped

    private void jtfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
             getToolkit().beep();
             evt.consume();
             JOptionPane.showMessageDialog(rootPane, "No puedes ingresar letras en tu numero de telefono, por favor ingrese el numero de manera correcta");
        }
    }//GEN-LAST:event_jtfTelefonoKeyTyped

    private void jtfResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfResponsableKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
             getToolkit().beep();
             evt.consume();
             JOptionPane.showMessageDialog(rootPane, "No puedes ingresar numeros en el nombre de la segunda persona a cargo, por favor ingrese los datos de manera correcta");
        }
    }//GEN-LAST:event_jtfResponsableKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdministradorCliente adminCliente = new AdministradorCliente();
        adminCliente.setExpertoVeterinaria(expertoVeterinaria);
        adminCliente.setVisible(true);
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
            java.util.logging.Logger.getLogger(EditarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarDatosCliente().setVisible(true);
            }
        });
    }
    
    public boolean camposVacios(){
        String nombreApellido = jtfNombreYApellido.getText();
        String direccion = jtfDireccion.getText();
        String responsable2 = jtfResponsable.getText();
        String telefono = jtfTelefono.getText();
        return nombreApellido.isEmpty() || direccion.isEmpty() || responsable2.isEmpty() || telefono.isEmpty() ;
    }

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
        llenarCampos();
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbActualizarDatos;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlEditarDatosCliente;
    private javax.swing.JLabel jlNombreYApellido;
    private javax.swing.JLabel jlResponsable;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JPanel jpEditarDatosCliente;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombreYApellido;
    private javax.swing.JTextField jtfResponsable;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
