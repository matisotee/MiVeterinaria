package vistas;

import DTO.DTOcliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class CrearNuevoCliente extends javax.swing.JFrame {
    
    private ExpertoAdministrarVeterinaria expertoVeterinaria;
    ArrayList<DTOcliente> dto;

 
    public CrearNuevoCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCrearNuevoCliente = new javax.swing.JPanel();
        jlCrearNuevoCliente = new javax.swing.JLabel();
        jlNombreYApellido = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlPersonaACargo = new javax.swing.JLabel();
        jtfNombreYApellido = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfPersonaACargo = new javax.swing.JTextField();
        jbCrearCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbVolverListaClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpCrearNuevoCliente.setBackground(new java.awt.Color(153, 204, 255));
        jpCrearNuevoCliente.setMaximumSize(new java.awt.Dimension(800, 600));
        jpCrearNuevoCliente.setMinimumSize(new java.awt.Dimension(800, 600));
        jpCrearNuevoCliente.setPreferredSize(new java.awt.Dimension(800, 600));

        jlCrearNuevoCliente.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlCrearNuevoCliente.setText("-CREAR NUEVO CLIENTE-");

        jlNombreYApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlNombreYApellido.setText("Nombre y Apellido");

        jlDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDireccion.setText("Direccion");

        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlDNI.setText("DNI");

        jlTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTelefono.setText("Telefono");

        jlPersonaACargo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlPersonaACargo.setText("Segunda Persona a Cargo");

        jtfNombreYApellido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfNombreYApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreYApellidoKeyTyped(evt);
            }
        });

        jtfDireccion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jtfDNI.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDNIKeyTyped(evt);
            }
        });

        jtfTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoKeyTyped(evt);
            }
        });

        jtfPersonaACargo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfPersonaACargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPersonaACargoKeyTyped(evt);
            }
        });

        jbCrearCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbCrearCliente.setText("Crear Cliente");
        jbCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearClienteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/boton-anadir-usuario.png"))); // NOI18N

        jbVolverListaClientes.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolverListaClientes.setText("Volver a lista de Clientes");
        jbVolverListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverListaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCrearNuevoClienteLayout = new javax.swing.GroupLayout(jpCrearNuevoCliente);
        jpCrearNuevoCliente.setLayout(jpCrearNuevoClienteLayout);
        jpCrearNuevoClienteLayout.setHorizontalGroup(
            jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                        .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlPersonaACargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPersonaACargo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                            .addComponent(jlNombreYApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfNombreYApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCrearNuevoClienteLayout.createSequentialGroup()
                            .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(111, 111, 111)
                            .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                        .addComponent(jbVolverListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jbCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jlCrearNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCrearNuevoClienteLayout.setVerticalGroup(
            jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlCrearNuevoCliente))
                    .addGroup(jpCrearNuevoClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombreYApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreYApellido))
                .addGap(45, 45, 45)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPersonaACargo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPersonaACargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jpCrearNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbVolverListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCrearNuevoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCrearNuevoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearClienteActionPerformed
        String x = jtfDNI.getText();
        
        if(dniNoDisponible(x) == true){
            JOptionPane.showMessageDialog(rootPane,"Ya se encuentra registrado un cliente con el DNI ingresado, por favor, ingrese \nel DNI correcto o vuelva a buscar el cliente","DNI invalido",JOptionPane.ERROR_MESSAGE);  
        }
        else {
            if(dniInvalido() == true || camposVacios() == true){ 
                JOptionPane.showMessageDialog(rootPane,"Ingrese todos los campos de manera correcta","Campos incompletos",JOptionPane.ERROR_MESSAGE); 
            }
            else {
               String nombreApellido = jtfNombreYApellido.getText();
               String direccion = jtfDireccion.getText();
               String responsable2 = jtfPersonaACargo.getText();
               long telefono = Long.parseLong(jtfTelefono.getText());
               int dni = Integer.parseInt(x);

               expertoVeterinaria.guardarCliente(nombreApellido, dni, direccion,telefono, responsable2);

               AdministradorCliente adminCliente = new AdministradorCliente();
               adminCliente.setExpertoVeterinaria(expertoVeterinaria);
               adminCliente.setVisible(true);
               this.setVisible(false);
               dispose();
            } 
        }
    }//GEN-LAST:event_jbCrearClienteActionPerformed
  
    
    private void jbVolverListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverListaClientesActionPerformed
       ListaClientes listaClientes = new ListaClientes();
       listaClientes.setExpertoVeterinaria(expertoVeterinaria);
       listaClientes.setDto(dto);
       listaClientes.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbVolverListaClientesActionPerformed

    private void jtfNombreYApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreYApellidoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar numeros en tu nombre, por favor, ingrese el nombre de manera correcta");
        }
    }//GEN-LAST:event_jtfNombreYApellidoKeyTyped

    private void jtfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDNIKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar letras en tu DNI, por favor, ingresa tu numero de manera correcta");
        }
    }//GEN-LAST:event_jtfDNIKeyTyped

    private void jtfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar letras en tu numero de telefono, por favor, ingresalo de manera correcta");
        }
    }//GEN-LAST:event_jtfTelefonoKeyTyped

    private void jtfPersonaACargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPersonaACargoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar numeros en el nombre de la segunda persona a cargo, por favor, ingrese el nombre de manera correcta");
        }
    }//GEN-LAST:event_jtfPersonaACargoKeyTyped

    
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
            java.util.logging.Logger.getLogger(CrearNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNuevoCliente().setVisible(true);
            }
        });
    }
    
    public boolean dniNoDisponible(String aux){
        ArrayList<Integer> dnis = new ArrayList<Integer>();
        dnis=expertoVeterinaria.listaDeDnis();    
        //String aux = jtfDNI.getText();
         
        for(Integer dni:dnis){
           String x = dni.toString();
           
            if(x.equals(aux)){
               return true;
            }
        }
        return false;
    }

    public boolean dniInvalido(){
        String Caracteres = jtfDNI.getText(); 
        return Caracteres.length() > 8 || Caracteres.length() < 7 ;
    }
    
    public boolean camposVacios(){
        String nombreApellido = jtfNombreYApellido.getText();
        String direccion = jtfDireccion.getText();
        String responsable2 = jtfPersonaACargo.getText();
        String dni = jtfDNI.getText();
        String telefono = jtfTelefono.getText();
        return nombreApellido.isEmpty() || direccion.isEmpty() || responsable2.isEmpty() || dni.isEmpty() || telefono.isEmpty() ;
    }
    
    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
    }

    public void setDto(ArrayList<DTOcliente> dto) {
        this.dto = dto;
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCrearCliente;
    private javax.swing.JButton jbVolverListaClientes;
    private javax.swing.JLabel jlCrearNuevoCliente;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombreYApellido;
    private javax.swing.JLabel jlPersonaACargo;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JPanel jpCrearNuevoCliente;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombreYApellido;
    private javax.swing.JTextField jtfPersonaACargo;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
