/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Controlador.Conexion;
import Controlador.VoluntarioController;
import Modelo.Voluntario;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Judi
 */
public class MenuOpciones extends javax.swing.JDialog {
    
    public Conexion conexion;
    public Connection link;
    /**
     * Creates new form MenuOpciones
     */
    
    public MenuOpciones()
    {
        initComponents();
        setLocationRelativeTo(null);
        conexion = new Conexion();
        link = conexion.Conectar();
    }
    public MenuOpciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conexion = new Conexion();
        link = conexion.Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        MostrarBttn = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        AgregarBttn = new javax.swing.JButton();
        ModificarBttn = new javax.swing.JButton();
        EliminarBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersonas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"), "Tabla"));
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Activo", "Nombre", "ApellidoPaterno", "ApellidoMaterno", "Edad", "Telefono", "Correo", "Profesion", "Debilidad", "Fortaleza", "Calle", "Numero", "Region", "IdTarea"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1050, 232));

        MostrarBttn.setText("Mostrar");
        MostrarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBttnActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 200, 70));
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 99, -1, -1));

        AgregarBttn.setText("Agregar");
        AgregarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBttnActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 170, 70));

        ModificarBttn.setText("Modificar");
        ModificarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBttnActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 180, 70));

        EliminarBttn.setText("Eliminar");
        EliminarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBttnActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 140, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBttnActionPerformed
        // TODO add your handling code here:
        mostrarBaseDatos();
    }//GEN-LAST:event_MostrarBttnActionPerformed

    private void ModificarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBttnActionPerformed
        BotonModificar bm = new BotonModificar();
        
        this.setVisible(false);
        bm.setVisible(true);
        
        
    }//GEN-LAST:event_ModificarBttnActionPerformed

    private void AgregarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBttnActionPerformed
        BotonAgregar bttnA = new BotonAgregar();
        this.setVisible(false);
        bttnA.setVisible(true);
    }//GEN-LAST:event_AgregarBttnActionPerformed

    private void EliminarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBttnActionPerformed
        BotonEliminar bttnE = new BotonEliminar();
        this.setVisible(false);
        bttnE.setVisible(true);
    }//GEN-LAST:event_EliminarBttnActionPerformed
    
    
    private void mostrarBaseDatos()
    {
        VoluntarioController vc = new VoluntarioController();
        ArrayList<Voluntario> voluntarios = vc.Leer(link);
        DefaultTableModel modelo = (DefaultTableModel) tablaPersonas.getModel();
        Object rowData[] = new Object[15];
        
        try
        {
            if(!voluntarios.isEmpty())
            {
                for (int i = 0; i < voluntarios.size(); i++) {
                    rowData[0] = voluntarios.get(i).getRut();
                    rowData[1] = voluntarios.get(i).getActivo();
                    rowData[2] = voluntarios.get(i).getNombre();
                    rowData[3] = voluntarios.get(i).getApellidoPaterno();
                    rowData[4] = voluntarios.get(i).getApellidoMaterno();
                    rowData[5] = voluntarios.get(i).getEdad();
                    rowData[6] = voluntarios.get(i).getTelefono();
                    rowData[7] = voluntarios.get(i).getCorreo();
                    rowData[8] = voluntarios.get(i).getProfesion();
                    rowData[9] = voluntarios.get(i).getDebilidad();
                    rowData[10] = voluntarios.get(i).getFortaleza();
                    rowData[11] = voluntarios.get(i).getCalle();
                    rowData[12] = voluntarios.get(i).getNumeroCalle();
                    rowData[13] = voluntarios.get(i).getRegion();
                    rowData[14] = voluntarios.get(i).getIdTarea();
                    
                    modelo.addRow(rowData);
                }
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuOpciones dialog = new MenuOpciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBttn;
    private javax.swing.JButton EliminarBttn;
    private javax.swing.JButton ModificarBttn;
    private javax.swing.JButton MostrarBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
