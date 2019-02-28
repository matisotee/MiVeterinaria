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

public class BuscarCliente extends javax.swing.JFrame {
    
    private ExpertoAdministrarVeterinaria expertoVeterinaria;
    ArrayList<DTOcliente> dto = new ArrayList<DTOcliente>();
    public String nombreApellido = null;
   
    public BuscarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBuscarCliente = new javax.swing.JPanel();
        jlBuscarCliente = new javax.swing.JLabel();
        jlIngrese = new javax.swing.JLabel();
        jtfIngrese = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBuscarCliente.setBackground(new java.awt.Color(153, 204, 255));
        jpBuscarCliente.setMinimumSize(new java.awt.Dimension(0, 0));
        jpBuscarCliente.setPreferredSize(new java.awt.Dimension(400, 300));

        jlBuscarCliente.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlBuscarCliente.setText("-BUSCAR CLIENTE-");

        jlIngrese.setBackground(new java.awt.Color(153, 204, 255));
        jlIngrese.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlIngrese.setText("Ingrese Nombre y Apellido de Cliente o Responsable a Cargo");
        jlIngrese.setOpaque(true);

        jtfIngrese.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtfIngrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIngreseActionPerformed(evt);
            }
        });
        jtfIngrese.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIngreseKeyTyped(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setMaximumSize(new java.awt.Dimension(151, 27));
        jbBuscar.setMinimumSize(new java.awt.Dimension(151, 27));
        jbBuscar.setPreferredSize(new java.awt.Dimension(151, 27));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/lupa-en-un-usuario.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Volver a Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarClienteLayout = new javax.swing.GroupLayout(jpBuscarCliente);
        jpBuscarCliente.setLayout(jpBuscarClienteLayout);
        jpBuscarClienteLayout.setHorizontalGroup(
            jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarClienteLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jlBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarClienteLayout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addGroup(jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(304, 304, 304))
        );
        jpBuscarClienteLayout.setVerticalGroup(
            jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jlIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIngreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIngreseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIngreseActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        nombreApellido = jtfIngrese.getText();
        expertoVeterinaria= new ExpertoAdministrarVeterinaria();
        dto = expertoVeterinaria.buscarClientes(nombreApellido);
        
        ListaClientes listaClientes = new ListaClientes();
        listaClientes.setExpertoVeterinaria(expertoVeterinaria);
        listaClientes.setDto(dto);
        listaClientes.setVisible(true);
        this.setVisible(false); 
        dispose();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtfIngreseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIngreseKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar numeros para buscar un cliente, por favor ingrese los datos de manera correcta");
        }
    }//GEN-LAST:event_jtfIngreseKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       VeterinariaMenuPrincipal veterinariaMenuPrincipal = new VeterinariaMenuPrincipal();
       veterinariaMenuPrincipal.setVisible(true);
       dispose();
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
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JLabel jlBuscarCliente;
    private javax.swing.JLabel jlIngrese;
    private javax.swing.JPanel jpBuscarCliente;
    private javax.swing.JTextField jtfIngrese;
    // End of variables declaration//GEN-END:variables
}
