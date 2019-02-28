package vistas;
import DTO.DTOtratamientosActivos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import veterinaria.expertos.ExpertoTratamientosActivos;



/**
 *
 * @author mauri
 * 
 */

public class TratamientosActivosDeLaVeterinaria extends javax.swing.JFrame {
    
    ExpertoTratamientosActivos expertoTratamientosActivos = new ExpertoTratamientosActivos();
    DefaultTableModel modelo = new DefaultTableModel(){
       @Override
       public boolean isCellEditable(int filas,int columnas){
         if(columnas == 4){
            return true; 
         }else{
             return false;
         }  
       } };
    ArrayList<DTOtratamientosActivos> tratamientosActivos = new ArrayList<>();

    public TratamientosActivosDeLaVeterinaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        armarCabecera();
        llenarDatos();
    }
    
    
    public void armarCabecera(){
        
        //Titulos de Columnas
        
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("NOMBRE DE MASCOTA");
        columnas.add("DUEÑO");
        columnas.add("TIPO DE TRATAMIENTO");
        columnas.add("DESCRIPCION");
  
        for(Object x:columnas){
        
           modelo.addColumn(x);
        }
        jtTratamientosActivosVete.setModel(modelo);
        jtTratamientosActivosVete.getTableHeader().setReorderingAllowed(false);
        jtTratamientosActivosVete.getColumnModel().getColumn(0).setPreferredWidth(150);
        jtTratamientosActivosVete.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtTratamientosActivosVete.getColumnModel().getColumn(2).setPreferredWidth(250);
        jtTratamientosActivosVete.getColumnModel().getColumn(3).setPreferredWidth(400);
    }
    
    public void llenarDatos(){
        tratamientosActivos = expertoTratamientosActivos.listarTratamientosActivos(true);
        for(DTOtratamientosActivos dto:tratamientosActivos){
            modelo.addRow(new Object[]{dto.getAliasMascota(),dto.getNombreCliente(),dto.getTipoTratamiento(),dto.getDescripcion()});
        }
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTratamientosActivosVeterinaria = new javax.swing.JPanel();
        jlTratamientosActivosVeterinaria = new javax.swing.JLabel();
        jspTratamientosActivosVete = new javax.swing.JScrollPane();
        jtTratamientosActivosVete = new javax.swing.JTable();
        jbVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpTratamientosActivosVeterinaria.setBackground(new java.awt.Color(153, 204, 255));
        jpTratamientosActivosVeterinaria.setMaximumSize(new java.awt.Dimension(800, 600));
        jpTratamientosActivosVeterinaria.setMinimumSize(new java.awt.Dimension(800, 600));
        jpTratamientosActivosVeterinaria.setName(""); // NOI18N
        jpTratamientosActivosVeterinaria.setPreferredSize(new java.awt.Dimension(800, 600));

        jlTratamientosActivosVeterinaria.setFont(new java.awt.Font("Cambria", 1, 32)); // NOI18N
        jlTratamientosActivosVeterinaria.setText("-TRATAMIENTOS ACTIVOS DE LA VETERINARIA-");

        jtTratamientosActivosVete.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtTratamientosActivosVete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "0", "1", "2", "3"
            }
        ));
        jtTratamientosActivosVete.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtTratamientosActivosVete.setMaximumSize(new java.awt.Dimension(500, 500));
        jtTratamientosActivosVete.setRowHeight(25);
        jspTratamientosActivosVete.setViewportView(jtTratamientosActivosVete);
        if (jtTratamientosActivosVete.getColumnModel().getColumnCount() > 0) {
            jtTratamientosActivosVete.getColumnModel().getColumn(0).setPreferredWidth(103);
            jtTratamientosActivosVete.getColumnModel().getColumn(1).setPreferredWidth(179);
            jtTratamientosActivosVete.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtTratamientosActivosVete.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

        jbVolver.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolver.setText("Volver al Menu Principal");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/images/boton-activar-notificaciones.png"))); // NOI18N

        javax.swing.GroupLayout jpTratamientosActivosVeterinariaLayout = new javax.swing.GroupLayout(jpTratamientosActivosVeterinaria);
        jpTratamientosActivosVeterinaria.setLayout(jpTratamientosActivosVeterinariaLayout);
        jpTratamientosActivosVeterinariaLayout.setHorizontalGroup(
            jpTratamientosActivosVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                .addGroup(jpTratamientosActivosVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jspTratamientosActivosVete))
                    .addGroup(jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTratamientosActivosVeterinaria)))
                .addContainerGap())
        );
        jpTratamientosActivosVeterinariaLayout.setVerticalGroup(
            jpTratamientosActivosVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jpTratamientosActivosVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                        .addComponent(jlTratamientosActivosVeterinaria)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTratamientosActivosVeterinariaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jspTratamientosActivosVete, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTratamientosActivosVeterinaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTratamientosActivosVeterinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        VeterinariaMenuPrincipal veterinariaMenuPrincipal = new VeterinariaMenuPrincipal();
        veterinariaMenuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbVolverActionPerformed


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
            java.util.logging.Logger.getLogger(TratamientosActivosDeLaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TratamientosActivosDeLaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TratamientosActivosDeLaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TratamientosActivosDeLaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TratamientosActivosDeLaVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlTratamientosActivosVeterinaria;
    private javax.swing.JPanel jpTratamientosActivosVeterinaria;
    private javax.swing.JScrollPane jspTratamientosActivosVete;
    private javax.swing.JTable jtTratamientosActivosVete;
    // End of variables declaration//GEN-END:variables
}
