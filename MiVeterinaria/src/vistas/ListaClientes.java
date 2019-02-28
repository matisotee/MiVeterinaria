package vistas;
import DTO.DTOcliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import veterinaria.expertos.ExpertoAdministrarCliente;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class ListaClientes extends javax.swing.JFrame {

    private ExpertoAdministrarVeterinaria expertoVeterinaria;
    private ArrayList<DTOcliente> dto = new ArrayList<DTOcliente>();
    private DefaultTableModel modelo = new DefaultTableModel(){
       @Override
       public boolean isCellEditable(int filas,int columnas){
         if(columnas == 2){
            return true; 
         }else{
             return false;
         }  
       }
    };

    public ListaClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        armaCabeceraTabla();
        this.setResizable(false);
    }
    
    public void armaCabeceraTabla(){
    
         //Titulos de Columnas
        
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("NOMBRE");
        columnas.add("DNI");
  
        for(Object it:columnas){
        
           modelo.addColumn(it);
        }
        jtListaClientes.setModel(modelo);
    }
       
    public void llenarDatos(){
        for(DTOcliente i:dto){
            modelo.addRow(new Object[]{i.getNombreApellido(),i.getDni()});
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpListaClientes = new javax.swing.JPanel();
        jspListaClientes = new javax.swing.JScrollPane();
        jtListaClientes = new javax.swing.JTable();
        jbRegistrarNuevoCliente = new javax.swing.JButton();
        jbContinuar = new javax.swing.JButton();
        jlClientes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jpListaClientes.setBackground(new java.awt.Color(153, 204, 255));
        jpListaClientes.setMaximumSize(new java.awt.Dimension(800, 600));
        jpListaClientes.setPreferredSize(new java.awt.Dimension(800, 600));

        jtListaClientes.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "1", "2"
            }
        ));
        jtListaClientes.setRowHeight(25);
        jtListaClientes.getTableHeader().setReorderingAllowed(false);
        jtListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaClientesMouseClicked(evt);
            }
        });
        jspListaClientes.setViewportView(jtListaClientes);

        jbRegistrarNuevoCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbRegistrarNuevoCliente.setText("Registrar Nuevo Cliente");
        jbRegistrarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarNuevoClienteActionPerformed(evt);
            }
        });

        jbContinuar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbContinuar.setText("Continuar");
        jbContinuar.setMaximumSize(new java.awt.Dimension(177, 23));
        jbContinuar.setMinimumSize(new java.awt.Dimension(177, 23));
        jbContinuar.setPreferredSize(new java.awt.Dimension(177, 23));
        jbContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuarActionPerformed(evt);
            }
        });

        jlClientes.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlClientes.setText("-CLIENTES-");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Buscar nuevamente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/lista-de-usuarios.png"))); // NOI18N

        javax.swing.GroupLayout jpListaClientesLayout = new javax.swing.GroupLayout(jpListaClientes);
        jpListaClientes.setLayout(jpListaClientesLayout);
        jpListaClientesLayout.setHorizontalGroup(
            jpListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaClientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbRegistrarNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jbContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jpListaClientesLayout.createSequentialGroup()
                .addGroup(jpListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListaClientesLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(jlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpListaClientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jspListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jpListaClientesLayout.setVerticalGroup(
            jpListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaClientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jpListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrarNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(jpListaClientes);
        jpListaClientes.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarNuevoClienteActionPerformed
        CrearNuevoCliente crearNuevoCliente = new CrearNuevoCliente();
        crearNuevoCliente.setExpertoVeterinaria(expertoVeterinaria);
        crearNuevoCliente.setDto(dto);
        crearNuevoCliente.setVisible(true);
        this.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_jbRegistrarNuevoClienteActionPerformed

    private void jbContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuarActionPerformed
        if(jtListaClientes.getSelectedRow()>=0){
            int fila = jtListaClientes.getSelectedRow();
            int columna =1;
            int dni = (Integer)jtListaClientes.getValueAt(fila, columna);
            expertoVeterinaria.seleccionarCliente(dni);
            AdministradorCliente adminCliente = new AdministradorCliente();
            adminCliente.setExpertoVeterinaria(expertoVeterinaria);
            adminCliente.setVisible(true);
            this.setVisible(false);  
            dispose();
        }
    }//GEN-LAST:event_jbContinuarActionPerformed

    private void jtListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtListaClientesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarCliente buscarCliente = new BuscarCliente();
        buscarCliente.setVisible(true);
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
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
        
        
        
    }
    
   

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;
    }

    public ArrayList<DTOcliente> getDto() {
        return dto;
    }

    public void setDto(ArrayList<DTOcliente> dto) {
        this.dto = dto;
        llenarDatos();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbContinuar;
    private javax.swing.JButton jbRegistrarNuevoCliente;
    private javax.swing.JLabel jlClientes;
    private javax.swing.JPanel jpListaClientes;
    private javax.swing.JScrollPane jspListaClientes;
    private javax.swing.JTable jtListaClientes;
    // End of variables declaration//GEN-END:variables
}
