/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.cargar_barra;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author YPereyra
 */
public class Carga extends javax.swing.JFrame {

       cargar_barra hilo;
    public Carga() {
        initComponents();
               setOpacity((float)0.9);
        this.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
         try {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icono.png"));
        setIconImage(icon);
 setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
         hilo = new cargar_barra(progreso);
        hilo.start();
        hilo=null;
      pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
    }

   void iniciar() throws SQLException
    {
      if(progreso.getValue()==5)
{
       pan1.setVisible(true);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
       
       }
   if(progreso.getValue()==10)
{
    //conectar();
    pan1.setVisible(false);
        pan2.setVisible(true);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
        
}
        if(progreso.getValue()==15)
{
      pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(true);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
        
        
}

      if(progreso.getValue()==20)
{
        //Consultar_num_cot();
       pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(true);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
        
}
      if(progreso.getValue()==25)
{
       pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(true);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
}
      if(progreso.getValue()==30)
{
    
       pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(true);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
        
}
      if(progreso.getValue()==35)
{
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(true);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
        
}
      if(progreso.getValue()==40)
{
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(true);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
        
}
      if(progreso.getValue()==45)
{
        
       pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(true);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
}
      if(progreso.getValue()==50)
{
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(true);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(false);
}
      if(progreso.getValue()==55)
{
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(true);
        pan12.setVisible(false);
        pan13.setVisible(false);
}
      if(progreso.getValue()==60)
{
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(true);
        pan13.setVisible(false);
}
      if(progreso.getValue()==70)
{
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);  
        pan8.setVisible(false);
        pan9.setVisible(false);
        pan10.setVisible(false);
        pan11.setVisible(false);
        pan12.setVisible(false);
        pan13.setVisible(true);
}
        if(progreso.getValue()==100)
    {
      
        Login ob = new Login();
        dispose();
        ob.setVisible(true);
        //Login.usuario_l.requestFocus();
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        pan1 = new javax.swing.JLabel();
        pan2 = new javax.swing.JLabel();
        pan3 = new javax.swing.JLabel();
        pan4 = new javax.swing.JLabel();
        pan5 = new javax.swing.JLabel();
        pan6 = new javax.swing.JLabel();
        pan7 = new javax.swing.JLabel();
        pan8 = new javax.swing.JLabel();
        pan9 = new javax.swing.JLabel();
        pan11 = new javax.swing.JLabel();
        pan10 = new javax.swing.JLabel();
        pan12 = new javax.swing.JLabel();
        pan13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progreso.setBackground(new java.awt.Color(77, 77, 77));
        progreso.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        progreso.setForeground(new java.awt.Color(41, 25, 0));
        progreso.setBorderPainted(false);
        progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        progreso.setOpaque(true);
        progreso.setRequestFocusEnabled(false);
        progreso.setStringPainted(true);
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        getContentPane().add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 245, 130, 10));

        pan1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan1.setForeground(new java.awt.Color(255, 255, 255));
        pan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan1.setText("Iniciando Sistema");
        getContentPane().add(pan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan2.setForeground(new java.awt.Color(255, 255, 255));
        pan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan2.setText("Cargando Modulo de Factura");
        getContentPane().add(pan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan3.setForeground(new java.awt.Color(255, 255, 255));
        pan3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan3.setText("Cargando Modulo de Cotizacion");
        getContentPane().add(pan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan4.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan4.setForeground(new java.awt.Color(255, 255, 255));
        pan4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan4.setText("Cargando Modulo de Cliente");
        getContentPane().add(pan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan5.setForeground(new java.awt.Color(255, 255, 255));
        pan5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan5.setText("Cargando Modulo de Servicios");
        getContentPane().add(pan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan6.setForeground(new java.awt.Color(255, 255, 255));
        pan6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan6.setText("Cargando Modulo de Usuarios");
        getContentPane().add(pan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan7.setForeground(new java.awt.Color(255, 255, 255));
        pan7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan7.setText("Cargando Modulo de Reportes");
        getContentPane().add(pan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan8.setForeground(new java.awt.Color(255, 255, 255));
        pan8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan8.setText("Cargar Modulo de Gastos");
        getContentPane().add(pan8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan9.setForeground(new java.awt.Color(255, 255, 255));
        pan9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan9.setText("Cargando Modulo de Consulta");
        getContentPane().add(pan9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan11.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan11.setForeground(new java.awt.Color(255, 255, 255));
        pan11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan11.setText("Iniciando Sistema");
        getContentPane().add(pan11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan10.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan10.setForeground(new java.awt.Color(255, 255, 255));
        pan10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan10.setText("Cargando Reportes");
        getContentPane().add(pan10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan12.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan12.setForeground(new java.awt.Color(255, 255, 255));
        pan12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan12.setText("Cargando Modulo de Login");
        getContentPane().add(pan12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        pan13.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        pan13.setForeground(new java.awt.Color(255, 255, 255));
        pan13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan13.setText("Conectando a la Base de Datos");
        getContentPane().add(pan13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 140, 20));

        jPanel1.setBackground(new java.awt.Color(41, 25, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carga.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
        try {
            iniciar();
            UIManager.put( "nimbusOrange", new Color(41,25,0));
        } catch (SQLException ex) {
            Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_progresoStateChanged

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
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pan1;
    private javax.swing.JLabel pan10;
    private javax.swing.JLabel pan11;
    private javax.swing.JLabel pan12;
    private javax.swing.JLabel pan13;
    private javax.swing.JLabel pan2;
    private javax.swing.JLabel pan3;
    private javax.swing.JLabel pan4;
    private javax.swing.JLabel pan5;
    private javax.swing.JLabel pan6;
    private javax.swing.JLabel pan7;
    private javax.swing.JLabel pan8;
    private javax.swing.JLabel pan9;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}
