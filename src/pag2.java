
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class pag2 extends javax.swing.JFrame {

    static Connection coneccion;
    static Statement instruccion;

    public pag2() {
        initComponents();
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(cal.YEAR);
        this.lblfecha.setText(fecha);
        clean();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Boton_Nuevo = new javax.swing.JButton();
        Boton_Actualizar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Enfermedad = new javax.swing.JTextField();
        txt_PersonalAC = new javax.swing.JTextField();
        txt_Doc = new javax.swing.JTextField();
        txt_Suministro = new javax.swing.JTextField();
        Boton_Limpiar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Pacientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Enfermedad", "Doctor", "Personal", "Suministro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        jLabel2.setText("NOMBRE DEL PACIENTE:");

        jLabel3.setText("ENFERMEDAD/PROBLEMA:");

        jLabel4.setText("DOCTOR A CARGO:");

        jLabel5.setText("PERSONAL A CARGO:");

        jLabel6.setText("SUMINISTRO:");

        txt_PersonalAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PersonalACActionPerformed(evt);
            }
        });

        txt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DocActionPerformed(evt);
            }
        });

        txt_Suministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SuministroActionPerformed(evt);
            }
        });

        Boton_Limpiar.setBackground(new java.awt.Color(0, 153, 153));
        Boton_Limpiar.setText("LIMPIAR");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID DEL PACIENTE:");

        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        jLabel8.setText("FECHA");

        lblfecha.setText("00/00/00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblfecha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(24, 24, 24))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Boton_Eliminar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Boton_Limpiar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Boton_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Boton_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Suministro, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_PersonalAC, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(22, 22, 22)))))
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
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_PersonalAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Suministro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblfecha))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Boton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NuevoActionPerformed
    try {
        Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
        coneccion = DriverManager.getConnection("jdbc:mysql://localhost/Hospital", "root", "fran2015");
        // establecer conexion ala base de datos
        instruccion = coneccion.createStatement();// consultar a la base de datos
        instruccion.executeUpdate("insert into pacientes(IDpaciente, p_Nombre, p_Enfermedad_problema, doc_Nombre, p_PersonalCargo, p_Suministro) values('" + txt_ID.getText() + "','" + txt_Nombre.getText() + "','" + txt_Enfermedad.getText() + "','" + txt_Doc.getText() + "','" + txt_PersonalAC.getText() + "','" + txt_Suministro.getText() + "')");
        JOptionPane.showMessageDialog(null, " SE HA INGRESADO UN PACIENTE ");
    } catch (SQLException exeptionsql) {
        JOptionPane.showMessageDialog(null, exeptionsql.getMessage(),
                "error al insertar datos", JOptionPane.ERROR_MESSAGE);

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
    clean();
}//GEN-LAST:event_Boton_NuevoActionPerformed

private void Boton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarActionPerformed
cargar();
}//GEN-LAST:event_Boton_ActualizarActionPerformed

private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
    try {
        Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
        coneccion = DriverManager.getConnection("jdbc:mysql://localhost/Hospital", "root", "fran2015");
        jdbc:
        mysql:
        // establecer conexion ala base de datos
        instruccion = coneccion.createStatement();// consultar a la base de datos
        instruccion.executeUpdate("delete from pacientes where p_Nombre='" + txt_Nombre.getText()
                + "' and p_Enfermedad_problema=" + "'" + txt_Enfermedad.getText() + "'");
        JOptionPane.showMessageDialog(null, " UN PACIENTE HA SIDO DADO DE ALTA SATISFACTORIAMENTE ");
    } catch (SQLException exeptionsql) {
        JOptionPane.showMessageDialog(null, exeptionsql.getMessage(),
                "error al borrar datos", JOptionPane.ERROR_MESSAGE);

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
    clean();
}//GEN-LAST:event_Boton_EliminarActionPerformed

private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
    clean();
}//GEN-LAST:event_Boton_LimpiarActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    dispose();
    inicio2 ini = new inicio2();
    ini.setLocationRelativeTo(null);
    ini.setVisible(true);
}//GEN-LAST:event_jButton6ActionPerformed

private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
}//GEN-LAST:event_txt_IDActionPerformed

    private void txt_PersonalACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PersonalACActionPerformed
    }//GEN-LAST:event_txt_PersonalACActionPerformed

    private void txt_SuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SuministroActionPerformed
    }//GEN-LAST:event_txt_SuministroActionPerformed

    private void txt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DocActionPerformed
    }//GEN-LAST:event_txt_DocActionPerformed

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
            java.util.logging.Logger.getLogger(pag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pag2().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txt_Doc;
    private javax.swing.JTextField txt_Enfermedad;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_PersonalAC;
    private javax.swing.JTextField txt_Suministro;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        txt_Nombre.setText("");
        txt_Enfermedad.setText("");
        txt_PersonalAC.setText("");
        txt_Doc.setText("");
        txt_Suministro.setText("");
        txt_ID.setText("");

        try {
            Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost/Hospital", "root", "fran2015");
            // establecer conexion ala base de datos
            instruccion = coneccion.createStatement();// consultar a la base de datos
            // consultar a la base de datos//Flata la ruta
            ResultSet resultado = instruccion.executeQuery("select max(IDpaciente) as siguiente FROM pacientes");
            
            int maximo =1 ;
            
            while (resultado.next()) {
                //son 6 columnas, la dimesion del objeto datos de 6
                maximo+= resultado.getInt("siguiente");
                
                
            }
            
            txt_ID.setText(""+maximo);
            txt_ID.setEditable(false);
            
            
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

    private void cargar() {
            DefaultTableModel modelo = new DefaultTableModel();
    // Creamos las columnas.
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Enfermedad_problema");
    modelo.addColumn("Doctor");
    modelo.addColumn("Personal Cargo");
    modelo.addColumn("Suministro");
    try {
        Class.forName("com.mysql.jdbc.Driver");// coneccion a la base de datos
        coneccion = DriverManager.getConnection("jdbc:mysql://localhost/Hospital", "root", "fran2015");
        // establecer conexion ala base de datos
        instruccion = coneccion.createStatement();// consultar a la base de datos
        // consultar a la base de datos//Flata la ruta
        ResultSet resultado = instruccion.executeQuery("select * FROM pacientes ORDER BY IDpaciente");

        while (resultado.next()) {
            //son 6 columnas, la dimesion del objeto datos de 6
            Object[] datos = new Object[6];
            for (int i = 0; i < 6; i++) {
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
