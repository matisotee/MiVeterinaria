package vistas;

import DTO.DTOinfoTratamientos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import veterinaria.expertos.ExpertoVisitasDeDistintasMascotas;

/**
 *
 * @author mauri
 * 
 */

public class TodasLasVisitas extends javax.swing.JFrame {

    String nombreSeleccionado;
    ExpertoVisitasDeDistintasMascotas evddm;
    DefaultTableModel modelo = new DefaultTableModel(){
       @Override
       public boolean isCellEditable(int filas,int columnas){
         if(columnas == 4){
            return true; 
         }else{
             return false;
         }  
       } };
    ArrayList<DTOinfoTratamientos> dtoInfo = new ArrayList<>();

    public TodasLasVisitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        armarCabecera();
        
    }
    
    public void armarCabecera(){
        
        //Titulos de Columnas
        
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("NOMBRE DE MASCOTA");
        columnas.add("DUEÑO");
        columnas.add("FECHA");
        columnas.add("DETALLES");
  
        for(Object x:columnas){
        
           modelo.addColumn(x);
        }
        jtTodasLasVisitas.setModel(modelo);
        jtTodasLasVisitas.getTableHeader().setReorderingAllowed(false);
        jtTodasLasVisitas.getColumnModel().getColumn(0).setPreferredWidth(150);
        jtTodasLasVisitas.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtTodasLasVisitas.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtTodasLasVisitas.getColumnModel().getColumn(3).setPreferredWidth(500);
    }
    
    public void llenarDatos(){
        
        dtoInfo = evddm.buscarVisitasDelMismoTipo(nombreSeleccionado);
        for(DTOinfoTratamientos dto:dtoInfo){
          modelo.addRow(new Object[]{dto.getAliasMascota(),dto.getNombreCliente(),dto.getFecha(),dto.getDetalleTratamiento()});
        }
    }
    
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTodasLasVisitas = new javax.swing.JPanel();
        jlTodasLasVisitas = new javax.swing.JLabel();
        jbVolverAMenuPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTodasLasVisitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpTodasLasVisitas.setBackground(new java.awt.Color(153, 204, 255));
        jpTodasLasVisitas.setMaximumSize(new java.awt.Dimension(800, 600));
        jpTodasLasVisitas.setMinimumSize(new java.awt.Dimension(800, 600));
        jpTodasLasVisitas.setPreferredSize(new java.awt.Dimension(800, 600));

        jlTodasLasVisitas.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N

        jbVolverAMenuPrincipal.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbVolverAMenuPrincipal.setText("Volver a Menu Principal");
        jbVolverAMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverAMenuPrincipalActionPerformed(evt);
            }
        });

        jtTodasLasVisitas.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtTodasLasVisitas.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTodasLasVisitas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtTodasLasVisitas.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jtTodasLasVisitas.setRowHeight(25);
        jScrollPane1.setViewportView(jtTodasLasVisitas);

        javax.swing.GroupLayout jpTodasLasVisitasLayout = new javax.swing.GroupLayout(jpTodasLasVisitas);
        jpTodasLasVisitas.setLayout(jpTodasLasVisitasLayout);
        jpTodasLasVisitasLayout.setHorizontalGroup(
            jpTodasLasVisitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTodasLasVisitasLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jbVolverAMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTodasLasVisitasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTodasLasVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jpTodasLasVisitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jpTodasLasVisitasLayout.setVerticalGroup(
            jpTodasLasVisitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTodasLasVisitasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlTodasLasVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jbVolverAMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTodasLasVisitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTodasLasVisitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverAMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverAMenuPrincipalActionPerformed
        VeterinariaMenuPrincipal veterinariaMenuPrincipal = new VeterinariaMenuPrincipal();
        veterinariaMenuPrincipal.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbVolverAMenuPrincipalActionPerformed


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
            java.util.logging.Logger.getLogger(TodasLasVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodasLasVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodasLasVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodasLasVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodasLasVisitas().setVisible(true);
            }
        });
    }

    public void setNombreSeleccionado(String nombreSeleccionado) {
        this.nombreSeleccionado = nombreSeleccionado;
        jlTodasLasVisitas.setText("TODAS LAS VISITAS DE TIPO: "+nombreSeleccionado.toUpperCase());
    }

    public void setEvddm(ExpertoVisitasDeDistintasMascotas evddm) {
        this.evddm = evddm;
        llenarDatos();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbVolverAMenuPrincipal;
    private javax.swing.JLabel jlTodasLasVisitas;
    private javax.swing.JPanel jpTodasLasVisitas;
    private javax.swing.JTable jtTodasLasVisitas;
    // End of variables declaration//GEN-END:variables
}
