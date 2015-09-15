import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class pag5 extends javax.swing.JFrame {

    static Connection coneccion;
static Statement instruccion;


    public pag5() {
        initComponents();
                 Calendar cal=Calendar.getInstance();
 String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(cal.YEAR);
this.lblfecha.setText(fecha); 
clean();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_Nuevo = new javax.swing.JButton();
        Boton_Actualizar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        txt_piso = new javax.swing.JTextField();
        Boton_Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_IDpersonal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Personal");

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

        jLabel2.setText("TIPO:");

        jLabel3.setText("PISO A CARGO:");

        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
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
                "ID", "Tipo", "Piso", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID PERSONAL:");

        txt_IDpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDpersonalActionPerformed(evt);
            }
        });

        jLabel8.setText("FECHA");

        lblfecha.setText("00/00/00");

        jLabel4.setText("NOMBRE:");

        txt_nombre.setText(" ");
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_IDpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_piso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(313, 313, 313))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Boton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Nuevo))
                            .addComponent(Boton_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblfecha)
                        .addGap(404, 404, 404))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Boton_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Eliminar)
                            .addComponent(Boton_Limpiar)
                            .addComponent(Boton_Nuevo))))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_IDpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tipo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                    .addComponent(txt_piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblfecha))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Boton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NuevoActionPerformed
        try{
         Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
         coneccion=DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","fran2015");
        // establecer conexion ala base de datos
         instruccion = coneccion.createStatement();// consultar a la base de datos
          instruccion.executeUpdate("insert into personal(IDpersonal, per_Tipo, per_PisoCargo, per_Nombre) values('"+txt_IDpersonal.getText() + "','" +txt_tipo.getText() + "','" +txt_piso.getText()+"','" +txt_nombre.getText() + "')");
          JOptionPane.showMessageDialog(null," HA INGRESADO NUEVO PERSONAL ");
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
 
          instruccion.executeUpdate("delete from personal where per_Nombre='"+txt_nombre.getText()+"'");               
          JOptionPane.showMessageDialog(null," SE HA ELIMINADO UN EMPLEADO REGISTRO ");

//         Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
//         coneccion=DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","fran2015");
//        // establecer conexion ala base de datos
//         instruccion = coneccion.createStatement();// consultar a la base de datos
//          instruccion.executeUpdate("delete from personal where p_Nombre='"+txt_nombre.getText()+"'");               
//          JOptionPane.showMessageDialog(null," SE HA RETIRADO UN PERSONAL ");
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

      }    clean();
}//GEN-LAST:event_Boton_EliminarActionPerformed

private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed
}//GEN-LAST:event_txt_tipoActionPerformed

private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
clean();
}//GEN-LAST:event_Boton_LimpiarActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
dispose();
    inicio2 ini=new inicio2();
ini.setLocationRelativeTo(null);
    ini.setVisible(true);
}//GEN-LAST:event_jButton6ActionPerformed

    private void txt_IDpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDpersonalActionPerformed
    }//GEN-LAST:event_txt_IDpersonalActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pag5().setVisible(true);
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txt_IDpersonal;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_piso;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
   
public void clean(){ 
        txt_tipo.setText("");
        txt_IDpersonal.setText("");
        txt_piso.setText("");
        txt_nombre.setText("");
                try {
            Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost/Hospital", "root", "fran2015");
            // establecer conexion ala base de datos
            instruccion = coneccion.createStatement();// consultar a la base de datos
            // consultar a la base de datos//Flata la ruta
            ResultSet resultado = instruccion.executeQuery("select max(IDpersonal) as siguiente FROM personal");
            
            int maximo =1 ;
            
            while (resultado.next()) {
                //son 6 columnas, la dimesion del objeto datos de 6
                maximo+= resultado.getInt("siguiente");
                
                
            }
            
            txt_IDpersonal.setText(""+maximo);
            txt_IDpersonal.setEditable(false);
            
            
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
         modelo.addColumn("IDpersonal");
         modelo.addColumn("Tipo");
         modelo.addColumn("PisoCargo");
         modelo.addColumn("Nombre");
            try {
        Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
        coneccion = DriverManager.getConnection("jdbc:mysql://localhost/Hospital", "root", "fran2015");
        // establecer conexion ala base de datos
        instruccion = coneccion.createStatement();// consultar a la base de datos
        // consultar a la base de datos//Flata la ruta
        ResultSet resultado = instruccion.executeQuery("select * FROM personal ORDER BY IDpersonal");

        while (resultado.next()) {
            //son 6 columnas, la dimesion del objeto datos de 6
            Object[] datos = new Object[4];
            for (int i = 0; i < 4; i++) {
                datos[i] = resultado.getObject(i + 1);

            }
            modelo.addRow(datos);
        }

        jTable1.setModel(modelo);
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
        
    }
}
