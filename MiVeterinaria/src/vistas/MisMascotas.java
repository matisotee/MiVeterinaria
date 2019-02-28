package vistas;
import DTO.DTOinfoMascota;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import veterinaria.expertos.ExpertoAdministrarCliente;
import veterinaria.expertos.ExpertoAdministrarMascota;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */
public class MisMascotas extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
       @Override
       public boolean isCellEditable(int filas,int columnas){
         if(columnas == 1){
            return true; 
         }else{
             return false;
         }  
       }
    };
    private ArrayList<String> mascotas = new ArrayList<>();
    private ExpertoAdministrarVeterinaria expertoVeterinaria; 
    
    
    public MisMascotas() {
        initComponents();
        this.setLocationRelativeTo(null);
        armaCabeceraTabla();
        this.setResizable(false);
    }
    
    public void armaCabeceraTabla (){
        modelo.addColumn("NOMBRE DE LA MASCOTA");
        jtMisMascotas.setModel(modelo);
    }
    
    public void llenarDatos(){
        for (String name:mascotas){
         modelo.addRow(new Object[]{name});
        }
        
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMisMascotas = new javax.swing.JPanel();
        jlMisMascotas = new javax.swing.JLabel();
        jspMisMascotas = new javax.swing.JScrollPane();
        jtMisMascotas = new javax.swing.JTable();
        jbAñadirMascota = new javax.swing.JButton();
        jbContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMisMascotas.setBackground(new java.awt.Color(153, 204, 255));
        jpMisMascotas.setMaximumSize(new java.awt.Dimension(800, 600));
        jpMisMascotas.setMinimumSize(new java.awt.Dimension(800, 600));
        jpMisMascotas.setPreferredSize(new java.awt.Dimension(800, 600));

        jlMisMascotas.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlMisMascotas.setText("-MIS MASCOTAS-");

        jtMisMascotas.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtMisMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "0"
            }
        ));
        jtMisMascotas.setMaximumSize(new java.awt.Dimension(280, 280));
        jtMisMascotas.setMinimumSize(new java.awt.Dimension(280, 280));
        jtMisMascotas.setPreferredSize(new java.awt.Dimension(280, 280));
        jtMisMascotas.setRowHeight(25);
        jtMisMascotas.getTableHeader().setReorderingAllowed(false);
        jspMisMascotas.setViewportView(jtMisMascotas);

        jbAñadirMascota.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbAñadirMascota.setText("Añadir Mascota");
        jbAñadirMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirMascotaActionPerformed(evt);
            }
        });

        jbContinuar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbContinuar.setText("Continuar");
        jbContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/lista-de-salud-del-perro.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Volver a Administrador Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMisMascotasLayout = new javax.swing.GroupLayout(jpMisMascotas);
        jpMisMascotas.setLayout(jpMisMascotasLayout);
        jpMisMascotasLayout.setHorizontalGroup(
            jpMisMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMisMascotasLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jlMisMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(jpMisMascotasLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAñadirMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jbContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jpMisMascotasLayout.createSequentialGroup()
                .addComponent(jspMisMascotas)
                .addContainerGap())
        );
        jpMisMascotasLayout.setVerticalGroup(
            jpMisMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMisMascotasLayout.createSequentialGroup()
                .addGroup(jpMisMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMisMascotasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpMisMascotasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jlMisMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspMisMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jpMisMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbContinuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAñadirMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMisMascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMisMascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuarActionPerformed
        if(jtMisMascotas.getSelectedRow()>=0){
            int fila= jtMisMascotas.getSelectedRow();
            String aliasSeleccionado = (String)jtMisMascotas.getValueAt(fila, 0);
        
            DTOinfoMascota dto =expertoVeterinaria.buscarMascota(aliasSeleccionado);
            AdministradorMascota adminMascota = new AdministradorMascota ();
            adminMascota.setDto(dto);
            adminMascota.setVisible(true);
            adminMascota.setExpertoVeterinaria(expertoVeterinaria);
            this.setVisible(false);
            this.dispose();
        }
        
    }//GEN-LAST:event_jbContinuarActionPerformed

    private void jbAñadirMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirMascotaActionPerformed
        
        AñadirNuevaMascota añadirNuevaMascota = new AñadirNuevaMascota();
        añadirNuevaMascota.setExpertoVeterinaria(expertoVeterinaria);
        añadirNuevaMascota.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbAñadirMascotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdministradorCliente adminCliente = new AdministradorCliente();
        adminCliente.setExpertoVeterinaria(expertoVeterinaria);
        adminCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisMascotas().setVisible(true);
            }
        });
    }

    public ArrayList<String> getMisMascotas() {
        return mascotas;
    }

    public void setMisMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
        llenarDatos();

     }

    
    
    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria){
        this.expertoVeterinaria = expertoVeterinaria;
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAñadirMascota;
    private javax.swing.JButton jbContinuar;
    private javax.swing.JLabel jlMisMascotas;
    private javax.swing.JPanel jpMisMascotas;
    private javax.swing.JScrollPane jspMisMascotas;
    private javax.swing.JTable jtMisMascotas;
    // End of variables declaration//GEN-END:variables
}
