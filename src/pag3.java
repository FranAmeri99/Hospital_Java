import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class pag3 extends javax.swing.JFrame {
static Connection coneccion;
static Statement instruccion;
    
    public pag3() {
        initComponents();
        Calendar cal=Calendar.getInstance();
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(cal.YEAR);
        this.lblfecha.setText(fecha); 
        clean();

       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_Nuevo = new javax.swing.JButton();
        Boton_Actualizar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NomDoctor = new javax.swing.JTextField();
        txt_CedulaDoc = new javax.swing.JTextField();
        txt_TurnoDoc = new javax.swing.JTextField();
        Boton_Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_IDdoctor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Doctores");

        Boton_Nuevo.setBackground(new java.awt.Color(0, 153, 153));
        Boton_Nuevo.setText("NUEVO");
        Boton_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_NuevoActionPerformed(evt);
            }
        });

        Boton_Actualizar.setBackground(new java.awt.Color(0, 153, 153));
        Boton_Actualizar.setText("CONSUTAR/ACTUALIZAR");
        Boton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualizarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setBackground(new java.awt.Color(0, 153, 153));
        Boton_Eliminar.setText("ELIMINAR");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE DEL DOCTOR:");

        jLabel3.setText("CEDULA DEL DOCTOR:");

        jLabel4.setText("TURNO:");

        txt_NomDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomDoctorActionPerformed(evt);
            }
        });

        Boton_Limpiar.setBackground(new java.awt.Color(0, 153, 153));
        Boton_Limpiar.setText("LIMPIAR");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cedula", "Turno"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID DOCTOR:");

        jLabel8.setText("FECHA");

        lblfecha.setText("00/00/00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblfecha))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(txt_TurnoDoc))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_CedulaDoc))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_NomDoctor))
                        .addComponent(jScrollPane1)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_IDdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(53, 53, 53)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Boton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Boton_Limpiar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Boton_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Boton_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(18, 18, 18))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_IDdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Boton_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Eliminar)
                            .addComponent(Boton_Limpiar)
                            .addComponent(Boton_Nuevo))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NomDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_CedulaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_TurnoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblfecha))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Boton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NuevoActionPerformed
        try{
         Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
         coneccion=DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","fran2015"); 
        // establecer conexion ala base de datos
         instruccion = coneccion.createStatement();// consultar a la base de datos
            // consultar a la base de datos
          instruccion.executeUpdate("insert into doctores(IDdoctor, doc_Nombre, doc_Cedula, doc_Turno) values('"+txt_IDdoctor.getText() + "','" +txt_NomDoctor.getText() + "','" +txt_CedulaDoc.getText()+"','" +txt_TurnoDoc.getText()+"')");
          JOptionPane.showMessageDialog(null," SE HA INGRESADO UN DOCTOR ");
    }
    catch(SQLException exeptionsql){
                 JOptionPane.showMessageDialog(null,exeptionsql.getMessage(),
                         "error al insertar datos",JOptionPane.ERROR_MESSAGE);
                
             }
     catch( ClassNotFoundException clasenoencontrada){
         JOptionPane.showMessageDialog(null,clasenoencontrada.getMessage(),
                 "no se encontro el controlador ",JOptionPane.ERROR_MESSAGE);
         System.exit(1);

     }
        finally {
        try {
            coneccion.close();
            instruccion.close();
         }

         catch ( SQLException sqlException ) {
            JOptionPane.showMessageDialog( null,
               sqlException.getMessage(), " no cerro correctamente la base de datos",
               JOptionPane.ERROR_MESSAGE );

            System.exit( 1 );
         }

      }
clean();
}//GEN-LAST:event_Boton_NuevoActionPerformed

private void Boton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarActionPerformed
         cargar();
}//GEN-LAST:event_Boton_ActualizarActionPerformed

private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
       try{
         Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
         coneccion=DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","fran2015");
        // establecer conexion ala base de datos
         instruccion = coneccion.createStatement();// consultar a la base de datos
 
          instruccion.executeUpdate("delete from doctores where doc_Nombre='"+txt_NomDoctor.getText()+"'");               
          JOptionPane.showMessageDialog(null," SE HA ELIMINADO UN DOCTOR DEL REGISTRO ");
    }
    catch(SQLException exeptionsql){
                 JOptionPane.showMessageDialog(null,exeptionsql.getMessage(),
                         "error al borrar datos",JOptionPane.ERROR_MESSAGE);
                 
             }
     catch( ClassNotFoundException clasenoencontrada){
         JOptionPane.showMessageDialog(null,clasenoencontrada.getMessage(),
                 "no se encontro el controlador ",JOptionPane.ERROR_MESSAGE);
         System.exit(1);

     }
        finally {
        try {
            coneccion.close();
            instruccion.close();
               
         }

         
         catch ( SQLException sqlException ) {
            JOptionPane.showMessageDialog( null,
               sqlException.getMessage(), " no cerro correctamente la base de datos",
               JOptionPane.ERROR_MESSAGE );

            System.exit( 1 );
         }

      }
           clean();
}//GEN-LAST:event_Boton_EliminarActionPerformed

private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
    clean();
}//GEN-LAST:event_Boton_LimpiarActionPerformed

private void txt_NomDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomDoctorActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_NomDoctorActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
dispose();
    inicio2 ini=new inicio2();
ini.setLocationRelativeTo(null);
    ini.setVisible(true);
}//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(pag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pag3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Actualizar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Limpiar;
    private javax.swing.JButton Boton_Nuevo;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txt_CedulaDoc;
    private javax.swing.JTextField txt_IDdoctor;
    private javax.swing.JTextField txt_NomDoctor;
    private javax.swing.JTextField txt_TurnoDoc;
    // End of variables declaration//GEN-END:variables
    public void clean(){
        txt_NomDoctor.setText("");
        txt_CedulaDoc.setText("");
        txt_IDdoctor.setText("");
        txt_TurnoDoc.setText("");
               
        try{
         Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
         coneccion=DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","fran2015");
        // establecer conexion ala base de datos
         instruccion = coneccion.createStatement();// consultar a la base de datos
            ResultSet resultado = instruccion.executeQuery("select max(IDdoctor) as siguiente FROM doctores");
        
        int maximo = 1;
        while(resultado.next()){
           //son 4 columnas, la dimesion del objeto datos de 4
                maximo+= resultado.getInt("siguiente");
         
                      }
        txt_IDdoctor.setText(""+maximo);
        txt_IDdoctor.setEditable(false);
        

        } catch (SQLException exeptionsql) {
            JOptionPane.showMessageDialog(null, exeptionsql.getMessage(),
                    "error en la base de datos", JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException clasenoencontrada) {
            JOptionPane.showMessageDialog(null, clasenoencontrada.getMessage(),
                    "no se encontro el controlador ", JOptionPane.ERROR_MESSAGE);
            System.exit(1);

        } finally {
            try {
                coneccion.close();
                instruccion.close();
            } catch (SQLException sqlException) {
                JOptionPane.showMessageDialog(null,
                        sqlException.getMessage(), " no cerro correctamente la base de datos",
                        JOptionPane.ERROR_MESSAGE);

                System.exit(1);
            }

        }
        cargar();
        
        }
    
    public void cargar(){
         DefaultTableModel modelo = new DefaultTableModel();
         // Creamos las columnas.
         modelo.addColumn("IDdoctor");
         modelo.addColumn("Nombre");
         modelo.addColumn("Cedula");
         modelo.addColumn("Turno");
        
        try{
         Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
         coneccion=DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","fran2015");
        // establecer conexion ala base de datos
         instruccion = coneccion.createStatement();// consultar a la base de datos
        ResultSet resultado=instruccion.executeQuery("select * FROM doctores ORDER BY IDdoctor");
         
        while(resultado.next()){
           //son 4 columnas, la dimesion del objeto datos de 4
                Object[] datos = new Object[4];
                for (int i = 0; i < 4; i++) {
                    datos[i] = resultado.getObject(i+1); 
            
                      }
                modelo.addRow(datos);
              }
        
        jTable1.setModel(modelo);
        }
    catch(SQLException exeptionsql){
                 JOptionPane.showMessageDialog(null,exeptionsql.getMessage(),
                         "error en la base de datos",JOptionPane.ERROR_MESSAGE);
                 
             }
     catch( ClassNotFoundException clasenoencontrada){
         JOptionPane.showMessageDialog(null,clasenoencontrada.getMessage(),
                 "no se encontro el controlador ",JOptionPane.ERROR_MESSAGE);
         System.exit(1);

     }
        finally {
        try {
            coneccion.close();
            instruccion.close();
             
         }

        catch ( SQLException sqlException ) {
            JOptionPane.showMessageDialog( null,
               sqlException.getMessage(), " no cerro correctamente la base de datos",
               JOptionPane.ERROR_MESSAGE );

            System.exit( 1 );
         }

      }
}                                        
        
        
    }
        
   


