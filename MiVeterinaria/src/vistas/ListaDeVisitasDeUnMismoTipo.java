package vistas;

import DTO.DTOinfoMascota;
import DTO.DTOvisita;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import veterinaria.expertos.ExpertoAdministrarTratamiento;
import veterinaria.expertos.ExpertoAdministrarVeterinaria;

/**
 *
 * @author mauri
 * 
 */

public class ListaDeVisitasDeUnMismoTipo extends javax.swing.JFrame {

     String nombreTipoTratamiento;
     private ExpertoAdministrarVeterinaria expertoVeterinaria; 
     ArrayList<DTOvisita> visitas = new ArrayList<>();
     DefaultTableModel modelo = new DefaultTableModel(){
       @Override
       public boolean isCellEditable(int filas,int columnas){
         if(columnas == 2){
            return true; 
         }else{
             return false;
         }  
       } };
  
    public ListaDeVisitasDeUnMismoTipo() {
        initComponents();
        this.setLocationRelativeTo(null);
        armaCabeceraTabla();
        this.setResizable(false);
    }
    
    public void armaCabeceraTabla(){
    
        //Titulos de Columnas
        
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("DETALLES");
        columnas.add("FECHA");
  
        for(Object x:columnas){
        
           modelo.addColumn(x);
        }
        jtListaVisitasMismoTipo.setModel(modelo);
        jtListaVisitasMismoTipo.getTableHeader().setReorderingAllowed(false);   
    } 
    
    public void llenarDatos(){
       visitas =  expertoVeterinaria.listaDeVisitasDeUnMismoTipo(nombreTipoTratamiento);
        
        for (DTOvisita dto:visitas){
         modelo.addRow(new Object[]{dto.getDetalles(),dto.getFechaVisita()});
        }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpListaVisitasMismoTipo = new javax.swing.JPanel();
        jlListaVisitasMismoTipo = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jspListaVisitasMismoTipo = new javax.swing.JScrollPane();
        jtListaVisitasMismoTipo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpListaVisitasMismoTipo.setBackground(new java.awt.Color(153, 204, 255));
        jpListaVisitasMismoTipo.setPreferredSize(new java.awt.Dimension(400, 300));

        jlListaVisitasMismoTipo.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jlListaVisitasMismoTipo.setText("-LISTA DE VISITAS DE UN MISMO TIPO-");

        jbSalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtListaVisitasMismoTipo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtListaVisitasMismoTipo.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "1", "2"
            }
        ));
        jtListaVisitasMismoTipo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtListaVisitasMismoTipo.setMaximumSize(new java.awt.Dimension(1500, 1500));
        jtListaVisitasMismoTipo.setMinimumSize(new java.awt.Dimension(1500, 1500));
        jtListaVisitasMismoTipo.setPreferredSize(new java.awt.Dimension(800, 600));
        jtListaVisitasMismoTipo.setRowHeight(25);
        jspListaVisitasMismoTipo.setViewportView(jtListaVisitasMismoTipo);

        javax.swing.GroupLayout jpListaVisitasMismoTipoLayout = new javax.swing.GroupLayout(jpListaVisitasMismoTipo);
        jpListaVisitasMismoTipo.setLayout(jpListaVisitasMismoTipoLayout);
        jpListaVisitasMismoTipoLayout.setHorizontalGroup(
            jpListaVisitasMismoTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVisitasMismoTipoLayout.createSequentialGroup()
                .addGroup(jpListaVisitasMismoTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListaVisitasMismoTipoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jspListaVisitasMismoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                    .addGroup(jpListaVisitasMismoTipoLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaVisitasMismoTipoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlListaVisitasMismoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jpListaVisitasMismoTipoLayout.setVerticalGroup(
            jpListaVisitasMismoTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVisitasMismoTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListaVisitasMismoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jspListaVisitasMismoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpListaVisitasMismoTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpListaVisitasMismoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        AdministradorMascota adminMascota = new AdministradorMascota();
        adminMascota.setExpertoVeterinaria(expertoVeterinaria);
        DTOinfoMascota dto = expertoVeterinaria.buscarMascota(expertoVeterinaria.getExpertoMascota().getAliasMascotaActual());
        adminMascota.setDto(dto);
        adminMascota.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


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
            java.util.logging.Logger.getLogger(ListaDeVisitasDeUnMismoTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeVisitasDeUnMismoTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeVisitasDeUnMismoTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeVisitasDeUnMismoTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeVisitasDeUnMismoTipo().setVisible(true);
            }
        });
    }


    public void setNombreTipoTratamiento(String nombreTipoTratamiento) {
        this.nombreTipoTratamiento = nombreTipoTratamiento;
    }

    public void setExpertoVeterinaria(ExpertoAdministrarVeterinaria expertoVeterinaria) {
        this.expertoVeterinaria = expertoVeterinaria;    
        llenarDatos();
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlListaVisitasMismoTipo;
    private javax.swing.JPanel jpListaVisitasMismoTipo;
    private javax.swing.JScrollPane jspListaVisitasMismoTipo;
    private javax.swing.JTable jtListaVisitasMismoTipo;
    // End of variables declaration//GEN-END:variables
}
