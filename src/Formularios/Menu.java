/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Agenda;
import Fuentes.Fuentes;
import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import justicia.conectar;

/**
 *
 * @author YPereyra
 */
public class Menu extends javax.swing.JFrame implements Runnable {

String hora, minutos, segundos, ampm;
Calendar calendario;
Thread hi;
String nota;
Fuentes tipofuente;
    Agenda obj=new Agenda();
    
    public Menu() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);
        
        try {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icono.png"));
        setIconImage(icon);
 setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        Date sistFecha = new Date();
        int dia0 = sistFecha.getDate();
        dia.setText(String.valueOf(dia0));
        SimpleDateFormat formato = new SimpleDateFormat("EEEE");
        SimpleDateFormat formato1 = new SimpleDateFormat("MMMM");
        SimpleDateFormat formato2 = new SimpleDateFormat("YYYY");
        dia_letras.setText(formato.format(sistFecha) + " ");
        mes_letras.setText(formato1.format(sistFecha));
        año.setText(formato2.format(sistFecha));
        parche.setLayout(null);
        buscar_dia();
        obj.organizar_agenda();
        obj.marcar();
        
        hi = new Thread(this);
        hi.start();
        
        
    }

  void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }
  void buscar_dia() {

        String[] registros = new String[6];
        String sql = "SELECT nombre FROM agenda where mes='" + mes_letras.getText() + "' AND año='" + año.getText() + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("nombre");

                dia_letras.setText(registros[0]);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void num() {
        if (mes_letras.getText().equals("enero")) {
            jLabel37.setText("01");
        }
        if (mes_letras.getText().equals("febrero")) {
            jLabel37.setText("02");
        }
        if (mes_letras.getText().equals("marzo")) {
            jLabel37.setText("03");
        }
        if (mes_letras.getText().equals("abril")) {
            jLabel37.setText("04");
        }
        if (mes_letras.getText().equals("mayo")) {
            jLabel37.setText("05");
        }
        if (mes_letras.getText().equals("junio")) {
            jLabel37.setText("06");
        }
        if (mes_letras.getText().equals("julio")) {
            jLabel37.setText("07");
        }
        if (mes_letras.getText().equals("agosto")) {
            jLabel37.setText("08");
        }
        if (mes_letras.getText().equals("septiembre")) {
            jLabel37.setText("09");
        }
        if (mes_letras.getText().equals("octubre")) {
            jLabel37.setText("10");
        }
        if (mes_letras.getText().equals("noviembre")) {
            jLabel37.setText("11");
        }
        if (mes_letras.getText().equals("diciembre")) {
            jLabel37.setText("12");
        }
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diano = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_minimizar1 = new javax.swing.JButton();
        btn_cerrar1 = new javax.swing.JButton();
        nombre_usu_cli1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        parche = new javax.swing.JPanel();
        fondo_pantalla = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dia_letras = new javax.swing.JLabel();
        dia = new javax.swing.JLabel();
        mes_letras = new javax.swing.JLabel();
        año = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dia_1 = new javax.swing.JLabel();
        dia1 = new javax.swing.JScrollPane();
        ldia1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        dia_2 = new javax.swing.JLabel();
        dia2 = new javax.swing.JScrollPane();
        ldia2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        dia_3 = new javax.swing.JLabel();
        dia3 = new javax.swing.JScrollPane();
        ldia3 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        dia_4 = new javax.swing.JLabel();
        dia4 = new javax.swing.JScrollPane();
        ldia4 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        dia_5 = new javax.swing.JLabel();
        dia5 = new javax.swing.JScrollPane();
        ldia5 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        dia_6 = new javax.swing.JLabel();
        dia6 = new javax.swing.JScrollPane();
        ldia6 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        dia_7 = new javax.swing.JLabel();
        dia7 = new javax.swing.JScrollPane();
        ldia7 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        dia_8 = new javax.swing.JLabel();
        dia8 = new javax.swing.JScrollPane();
        ldia8 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        dia_9 = new javax.swing.JLabel();
        dia9 = new javax.swing.JScrollPane();
        ldia9 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        dia_10 = new javax.swing.JLabel();
        dia_11 = new javax.swing.JLabel();
        dia_12 = new javax.swing.JLabel();
        dia_13 = new javax.swing.JLabel();
        dia_14 = new javax.swing.JLabel();
        dia_15 = new javax.swing.JLabel();
        dia_22 = new javax.swing.JLabel();
        dia_30 = new javax.swing.JLabel();
        dia_16 = new javax.swing.JLabel();
        dia_17 = new javax.swing.JLabel();
        dia_18 = new javax.swing.JLabel();
        dia_19 = new javax.swing.JLabel();
        dia_20 = new javax.swing.JLabel();
        dia_21 = new javax.swing.JLabel();
        dia_23 = new javax.swing.JLabel();
        dia_24 = new javax.swing.JLabel();
        dia_25 = new javax.swing.JLabel();
        dia_27 = new javax.swing.JLabel();
        dia_28 = new javax.swing.JLabel();
        dia_29 = new javax.swing.JLabel();
        dia29 = new javax.swing.JScrollPane();
        ldia29 = new javax.swing.JList<>();
        dia_26 = new javax.swing.JLabel();
        dia_31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        dia10 = new javax.swing.JScrollPane();
        ldia10 = new javax.swing.JList<>();
        dia11 = new javax.swing.JScrollPane();
        ldia11 = new javax.swing.JList<>();
        dia12 = new javax.swing.JScrollPane();
        ldia12 = new javax.swing.JList<>();
        dia13 = new javax.swing.JScrollPane();
        ldia13 = new javax.swing.JList<>();
        dia14 = new javax.swing.JScrollPane();
        ldia14 = new javax.swing.JList<>();
        dia15 = new javax.swing.JScrollPane();
        ldia15 = new javax.swing.JList<>();
        dia16 = new javax.swing.JScrollPane();
        ldia16 = new javax.swing.JList<>();
        dia17 = new javax.swing.JScrollPane();
        ldia17 = new javax.swing.JList<>();
        dia18 = new javax.swing.JScrollPane();
        ldia18 = new javax.swing.JList<>();
        dia19 = new javax.swing.JScrollPane();
        ldia19 = new javax.swing.JList<>();
        dia20 = new javax.swing.JScrollPane();
        ldia20 = new javax.swing.JList<>();
        dia21 = new javax.swing.JScrollPane();
        ldia21 = new javax.swing.JList<>();
        dia22 = new javax.swing.JScrollPane();
        ldia22 = new javax.swing.JList<>();
        dia23 = new javax.swing.JScrollPane();
        ldia23 = new javax.swing.JList<>();
        dia24 = new javax.swing.JScrollPane();
        ldia24 = new javax.swing.JList<>();
        dia25 = new javax.swing.JScrollPane();
        ldia25 = new javax.swing.JList<>();
        dia26 = new javax.swing.JScrollPane();
        ldia26 = new javax.swing.JList<>();
        dia27 = new javax.swing.JScrollPane();
        ldia27 = new javax.swing.JList<>();
        dia28 = new javax.swing.JScrollPane();
        ldia28 = new javax.swing.JList<>();
        dia30 = new javax.swing.JScrollPane();
        ldia30 = new javax.swing.JList<>();
        dia31 = new javax.swing.JScrollPane();
        ldia31 = new javax.swing.JList<>();
        volver = new javax.swing.JButton();
        subir = new javax.swing.JButton();
        bajar = new javax.swing.JButton();
        menu_hora = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jLabel37.setText("jLabel36");

        btn_minimizar.setToolTipText("Minimizar");
        btn_minimizar.setBorder(null);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });

        btn_cerrar.setToolTipText("Cerrar");
        btn_cerrar.setBorder(null);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1365, 768));
        setMinimumSize(new java.awt.Dimension(1365, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1365, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_minimizar1.setToolTipText("Minimizar");
        btn_minimizar1.setBorder(null);
        btn_minimizar1.setContentAreaFilled(false);
        btn_minimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_minimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1214, 55, 30, 31));

        btn_cerrar1.setToolTipText("Cerrar");
        btn_cerrar1.setBorder(null);
        btn_cerrar1.setContentAreaFilled(false);
        btn_cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 55, 30, 31));

        nombre_usu_cli1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        nombre_usu_cli1.setForeground(new java.awt.Color(255, 255, 255));
        nombre_usu_cli1.setText("Leandro Aquino");
        getContentPane().add(nombre_usu_cli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 242, 170, 20));

        jPanel7.setBackground(new java.awt.Color(28, 18, 0));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 242, 170, 20));

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 160, 50));

        jPanel2.setBackground(new java.awt.Color(28, 18, 0));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 70, 20));

        parche.setBackground(new java.awt.Color(28, 18, 0));
        getContentPane().add(parche, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 135, 220, 30));
        getContentPane().add(fondo_pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 1, 5));

        dia_letras.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        dia_letras.setForeground(new java.awt.Color(255, 255, 255));
        dia_letras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_letras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dia_letras.setMaximumSize(new java.awt.Dimension(100, 22));
        dia_letras.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel4.add(dia_letras);

        dia.setBackground(new java.awt.Color(255, 255, 255));
        dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        dia.setForeground(new java.awt.Color(255, 255, 255));
        dia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia.setPreferredSize(new java.awt.Dimension(25, 22));
        dia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(dia);

        mes_letras.setBackground(new java.awt.Color(255, 0, 0));
        mes_letras.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        mes_letras.setForeground(new java.awt.Color(255, 0, 0));
        mes_letras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes_letras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mes_letras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mes_letras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(mes_letras);

        año.setBackground(new java.awt.Color(255, 0, 0));
        año.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        año.setForeground(new java.awt.Color(255, 0, 0));
        año.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        año.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        año.setPreferredSize(new java.awt.Dimension(50, 22));
        año.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(año);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 135, 350, 30));

        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        dia_1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_1.setForeground(new java.awt.Color(255, 255, 255));
        dia_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_1.setText("1");
        dia_1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_1.setAlignmentY(0.0F);
        dia_1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_1);
        dia_1.setBounds(0, 0, 97, 17);

        dia1.setBorder(null);
        dia1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia1.setOpaque(false);

        ldia1.setBackground(new java.awt.Color(28, 18, 0));
        ldia1.setForeground(new java.awt.Color(253, 195, 45));
        ldia1.setDragEnabled(true);
        ldia1.setFocusable(false);
        ldia1.setRequestFocusEnabled(false);
        ldia1.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia1.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia1.setVisibleRowCount(2);
        ldia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia1MouseClicked(evt);
            }
        });
        dia1.setViewportView(ldia1);

        jPanel1.add(dia1);
        dia1.setBounds(4, 20, 96, 40);

        jLabel1.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 3, 98, 63);

        dia_2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_2.setForeground(new java.awt.Color(255, 255, 255));
        dia_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_2.setText("2");
        dia_2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_2.setAlignmentY(0.0F);
        dia_2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_2);
        dia_2.setBounds(100, 0, 97, 17);

        dia2.setBorder(null);
        dia2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia2.setOpaque(false);

        ldia2.setBackground(new java.awt.Color(28, 18, 0));
        ldia2.setForeground(new java.awt.Color(253, 195, 45));
        ldia2.setDragEnabled(true);
        ldia2.setFocusable(false);
        ldia2.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia2.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia2.setVisibleRowCount(2);
        ldia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia2MouseClicked(evt);
            }
        });
        dia2.setViewportView(ldia2);

        jPanel1.add(dia2);
        dia2.setBounds(104, 20, 96, 40);

        jLabel2.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 3, 98, 63);

        dia_3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_3.setForeground(new java.awt.Color(255, 255, 255));
        dia_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_3.setText("3");
        dia_3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_3.setAlignmentY(0.0F);
        dia_3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_3);
        dia_3.setBounds(200, 0, 97, 17);

        dia3.setBorder(null);
        dia3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia3.setOpaque(false);

        ldia3.setBackground(new java.awt.Color(28, 18, 0));
        ldia3.setForeground(new java.awt.Color(253, 195, 45));
        ldia3.setDragEnabled(true);
        ldia3.setFocusable(false);
        ldia3.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia3.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia3.setVisibleRowCount(2);
        ldia3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia3MouseClicked(evt);
            }
        });
        dia3.setViewportView(ldia3);

        jPanel1.add(dia3);
        dia3.setBounds(204, 20, 96, 40);

        jLabel3.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 3, 98, 63);

        dia_4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_4.setForeground(new java.awt.Color(255, 255, 255));
        dia_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_4.setText("4");
        dia_4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_4.setAlignmentY(0.0F);
        dia_4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_4);
        dia_4.setBounds(300, 0, 97, 17);

        dia4.setBorder(null);
        dia4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia4.setOpaque(false);

        ldia4.setBackground(new java.awt.Color(28, 18, 0));
        ldia4.setForeground(new java.awt.Color(253, 195, 45));
        ldia4.setDragEnabled(true);
        ldia4.setFocusable(false);
        ldia4.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia4.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia4.setVisibleRowCount(2);
        ldia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia4MouseClicked(evt);
            }
        });
        dia4.setViewportView(ldia4);

        jPanel1.add(dia4);
        dia4.setBounds(304, 20, 96, 40);

        jLabel4.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 3, 98, 63);

        dia_5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_5.setForeground(new java.awt.Color(255, 255, 255));
        dia_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_5.setText("5");
        dia_5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_5.setAlignmentY(0.0F);
        dia_5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_5);
        dia_5.setBounds(400, 0, 97, 17);

        dia5.setBorder(null);
        dia5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia5.setOpaque(false);

        ldia5.setBackground(new java.awt.Color(28, 18, 0));
        ldia5.setForeground(new java.awt.Color(253, 195, 45));
        ldia5.setDragEnabled(true);
        ldia5.setFocusable(false);
        ldia5.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia5.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia5.setVisibleRowCount(2);
        ldia5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia5MouseClicked(evt);
            }
        });
        dia5.setViewportView(ldia5);

        jPanel1.add(dia5);
        dia5.setBounds(404, 20, 96, 40);

        jLabel5.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 3, 98, 63);

        dia_6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_6.setForeground(new java.awt.Color(255, 255, 255));
        dia_6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_6.setText("6");
        dia_6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_6.setAlignmentY(0.0F);
        dia_6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_6);
        dia_6.setBounds(500, 0, 97, 17);

        dia6.setBorder(null);
        dia6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia6.setOpaque(false);

        ldia6.setBackground(new java.awt.Color(28, 18, 0));
        ldia6.setForeground(new java.awt.Color(253, 195, 45));
        ldia6.setDragEnabled(true);
        ldia6.setFocusable(false);
        ldia6.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia6.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia6.setVisibleRowCount(2);
        ldia6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia6MouseClicked(evt);
            }
        });
        dia6.setViewportView(ldia6);

        jPanel1.add(dia6);
        dia6.setBounds(504, 20, 96, 40);

        jLabel6.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 3, 98, 63);

        dia_7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_7.setForeground(new java.awt.Color(255, 255, 255));
        dia_7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_7.setText("7");
        dia_7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_7.setAlignmentY(0.0F);
        dia_7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_7);
        dia_7.setBounds(600, 0, 97, 17);

        dia7.setBorder(null);
        dia7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia7.setOpaque(false);

        ldia7.setBackground(new java.awt.Color(28, 18, 0));
        ldia7.setForeground(new java.awt.Color(253, 195, 45));
        ldia7.setDragEnabled(true);
        ldia7.setFocusable(false);
        ldia7.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia7.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia7.setVisibleRowCount(2);
        ldia7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia7MouseClicked(evt);
            }
        });
        dia7.setViewportView(ldia7);

        jPanel1.add(dia7);
        dia7.setBounds(602, 20, 96, 40);

        jLabel7.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 3, 98, 63);

        dia_8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_8.setForeground(new java.awt.Color(255, 255, 255));
        dia_8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_8.setText("8");
        dia_8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_8.setAlignmentY(0.0F);
        dia_8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_8);
        dia_8.setBounds(0, 68, 97, 17);

        dia8.setBorder(null);
        dia8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia8.setOpaque(false);

        ldia8.setBackground(new java.awt.Color(28, 18, 0));
        ldia8.setForeground(new java.awt.Color(253, 195, 45));
        ldia8.setDragEnabled(true);
        ldia8.setFocusable(false);
        ldia8.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia8.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia8.setVisibleRowCount(2);
        ldia8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia8MouseClicked(evt);
            }
        });
        dia8.setViewportView(ldia8);

        jPanel1.add(dia8);
        dia8.setBounds(2, 90, 96, 40);

        jLabel8.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 3, 98, 63);

        dia_9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_9.setForeground(new java.awt.Color(255, 255, 255));
        dia_9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_9.setText("9");
        dia_9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_9.setAlignmentY(0.0F);
        dia_9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_9);
        dia_9.setBounds(100, 68, 97, 17);

        dia9.setBorder(null);
        dia9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia9.setOpaque(false);

        ldia9.setBackground(new java.awt.Color(28, 18, 0));
        ldia9.setForeground(new java.awt.Color(253, 195, 45));
        ldia9.setDragEnabled(true);
        ldia9.setFocusable(false);
        ldia9.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia9.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia9.setVisibleRowCount(2);
        ldia9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia9MouseClicked(evt);
            }
        });
        dia9.setViewportView(ldia9);

        jPanel1.add(dia9);
        dia9.setBounds(102, 90, 94, 40);

        jLabel9.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 3, 98, 63);

        dia_10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_10.setForeground(new java.awt.Color(255, 255, 255));
        dia_10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_10.setText("10");
        dia_10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_10.setAlignmentY(0.0F);
        dia_10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_10);
        dia_10.setBounds(200, 68, 97, 17);

        dia_11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_11.setForeground(new java.awt.Color(255, 255, 255));
        dia_11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_11.setText("11");
        dia_11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_11.setAlignmentY(0.0F);
        dia_11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_11);
        dia_11.setBounds(300, 68, 97, 17);

        dia_12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_12.setForeground(new java.awt.Color(255, 255, 255));
        dia_12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_12.setText("12");
        dia_12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_12.setAlignmentY(0.0F);
        dia_12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_12);
        dia_12.setBounds(400, 68, 97, 17);

        dia_13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_13.setForeground(new java.awt.Color(255, 255, 255));
        dia_13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_13.setText("13");
        dia_13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_13.setAlignmentY(0.0F);
        dia_13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_13);
        dia_13.setBounds(500, 68, 97, 17);

        dia_14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_14.setForeground(new java.awt.Color(255, 255, 255));
        dia_14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_14.setText("14");
        dia_14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_14.setAlignmentY(0.0F);
        dia_14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_14);
        dia_14.setBounds(600, 68, 97, 17);

        dia_15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_15.setForeground(new java.awt.Color(255, 255, 255));
        dia_15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_15.setText("15");
        dia_15.setAlignmentY(0.0F);
        dia_15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(dia_15);
        dia_15.setBounds(0, 132, 97, 17);

        dia_22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_22.setForeground(new java.awt.Color(255, 255, 255));
        dia_22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_22.setText("22");
        dia_22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_22.setAlignmentY(0.0F);
        dia_22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_22);
        dia_22.setBounds(0, 198, 97, 17);

        dia_30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_30.setForeground(new java.awt.Color(255, 255, 255));
        dia_30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_30.setText("30");
        dia_30.setAlignmentY(0.0F);
        dia_30.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(dia_30);
        dia_30.setBounds(100, 262, 97, 17);

        dia_16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_16.setForeground(new java.awt.Color(255, 255, 255));
        dia_16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_16.setText("16");
        dia_16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_16.setAlignmentY(0.0F);
        dia_16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_16);
        dia_16.setBounds(100, 130, 97, 17);

        dia_17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_17.setForeground(new java.awt.Color(255, 255, 255));
        dia_17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_17.setText("17");
        dia_17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_17.setAlignmentY(0.0F);
        dia_17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_17);
        dia_17.setBounds(200, 130, 97, 17);

        dia_18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_18.setForeground(new java.awt.Color(255, 255, 255));
        dia_18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_18.setText("18");
        dia_18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_18.setAlignmentY(0.0F);
        dia_18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_18);
        dia_18.setBounds(300, 130, 97, 17);

        dia_19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_19.setForeground(new java.awt.Color(255, 255, 255));
        dia_19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_19.setText("19");
        dia_19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_19.setAlignmentY(0.0F);
        dia_19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_19);
        dia_19.setBounds(400, 130, 97, 17);

        dia_20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_20.setForeground(new java.awt.Color(255, 255, 255));
        dia_20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_20.setText("20");
        dia_20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_20.setAlignmentY(0.0F);
        dia_20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_20);
        dia_20.setBounds(500, 130, 97, 17);

        dia_21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_21.setForeground(new java.awt.Color(255, 255, 255));
        dia_21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_21.setText("21");
        dia_21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_21.setAlignmentY(0.0F);
        dia_21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_21);
        dia_21.setBounds(600, 130, 97, 17);

        dia_23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_23.setForeground(new java.awt.Color(255, 255, 255));
        dia_23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_23.setText("23");
        dia_23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_23.setAlignmentY(0.0F);
        dia_23.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_23);
        dia_23.setBounds(100, 198, 97, 17);

        dia_24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_24.setForeground(new java.awt.Color(255, 255, 255));
        dia_24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_24.setText("24");
        dia_24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_24.setAlignmentY(0.0F);
        dia_24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_24);
        dia_24.setBounds(200, 198, 97, 17);

        dia_25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_25.setForeground(new java.awt.Color(255, 255, 255));
        dia_25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_25.setText("25");
        dia_25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_25.setAlignmentY(0.0F);
        dia_25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_25);
        dia_25.setBounds(300, 198, 97, 17);

        dia_27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_27.setForeground(new java.awt.Color(255, 255, 255));
        dia_27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_27.setText("27");
        dia_27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_27.setAlignmentY(0.0F);
        dia_27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_27);
        dia_27.setBounds(500, 198, 97, 17);

        dia_28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_28.setForeground(new java.awt.Color(255, 255, 255));
        dia_28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_28.setText("28");
        dia_28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_28.setAlignmentY(0.0F);
        dia_28.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_28);
        dia_28.setBounds(600, 198, 97, 17);

        dia_29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_29.setForeground(new java.awt.Color(255, 255, 255));
        dia_29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_29.setText("29");
        dia_29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_29.setAlignmentY(0.0F);
        dia_29.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_29);
        dia_29.setBounds(0, 262, 97, 17);

        dia29.setBorder(null);
        dia29.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia29.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia29.setOpaque(false);

        ldia29.setBackground(new java.awt.Color(28, 18, 0));
        ldia29.setForeground(new java.awt.Color(253, 195, 45));
        ldia29.setDragEnabled(true);
        ldia29.setFocusable(false);
        ldia29.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia29.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia29.setVisibleRowCount(2);
        ldia29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia29MouseClicked(evt);
            }
        });
        dia29.setViewportView(ldia29);

        jPanel1.add(dia29);
        dia29.setBounds(2, 280, 96, 40);

        dia_26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_26.setForeground(new java.awt.Color(255, 255, 255));
        dia_26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_26.setText("26");
        dia_26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_26.setAlignmentY(0.0F);
        dia_26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_26);
        dia_26.setBounds(400, 198, 97, 17);

        dia_31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia_31.setForeground(new java.awt.Color(255, 255, 255));
        dia_31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dia_31.setText("31");
        dia_31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dia_31.setAlignmentY(0.0F);
        dia_31.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dia_31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dia_31);
        dia_31.setBounds(200, 262, 97, 17);

        jLabel10.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 3, 98, 63);

        jLabel11.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 3, 98, 63);

        jLabel12.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 3, 98, 63);

        jLabel13.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 3, 98, 63);

        jLabel14.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 3, 98, 63);

        jLabel15.setBackground(new java.awt.Color(0, 14, 53));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 3, 98, 63);

        jLabel16.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 3, 98, 63);

        jLabel17.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, 3, 98, 63);

        jLabel18.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 3, 98, 63);

        jLabel19.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 3, 98, 63);

        jLabel20.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 3, 98, 63);

        jLabel21.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel21);
        jLabel21.setBounds(0, 3, 98, 63);

        jLabel22.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel22);
        jLabel22.setBounds(0, 3, 98, 63);

        jLabel23.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel23);
        jLabel23.setBounds(0, 3, 98, 63);

        jLabel24.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel24);
        jLabel24.setBounds(0, 3, 98, 63);

        jLabel25.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel25);
        jLabel25.setBounds(0, 3, 98, 63);

        jLabel26.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel26);
        jLabel26.setBounds(0, 3, 98, 63);

        jLabel27.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel27);
        jLabel27.setBounds(0, 3, 98, 63);

        jLabel28.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel28);
        jLabel28.setBounds(0, 3, 98, 63);

        jLabel29.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel29);
        jLabel29.setBounds(0, 3, 98, 63);

        jLabel30.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel30);
        jLabel30.setBounds(0, 3, 98, 63);

        jLabel31.setBackground(new java.awt.Color(0, 14, 53));
        jPanel1.add(jLabel31);
        jLabel31.setBounds(1, 3, 98, 64);

        dia10.setBorder(null);
        dia10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia10.setOpaque(false);

        ldia10.setBackground(new java.awt.Color(28, 18, 0));
        ldia10.setForeground(new java.awt.Color(253, 195, 45));
        ldia10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ldia10.setDragEnabled(true);
        ldia10.setFocusable(false);
        ldia10.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia10.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia10.setVisibleRowCount(2);
        ldia10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia10MouseClicked(evt);
            }
        });
        dia10.setViewportView(ldia10);

        jPanel1.add(dia10);
        dia10.setBounds(202, 90, 96, 40);

        dia11.setBorder(null);
        dia11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia11.setOpaque(false);

        ldia11.setBackground(new java.awt.Color(28, 18, 0));
        ldia11.setForeground(new java.awt.Color(253, 195, 45));
        ldia11.setDragEnabled(true);
        ldia11.setFocusable(false);
        ldia11.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia11.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia11.setVisibleRowCount(2);
        ldia11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia11MouseClicked(evt);
            }
        });
        dia11.setViewportView(ldia11);

        jPanel1.add(dia11);
        dia11.setBounds(302, 90, 96, 40);

        dia12.setBorder(null);
        dia12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia12.setOpaque(false);

        ldia12.setBackground(new java.awt.Color(28, 18, 0));
        ldia12.setForeground(new java.awt.Color(253, 195, 45));
        ldia12.setDragEnabled(true);
        ldia12.setFocusable(false);
        ldia12.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia12.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia12.setVisibleRowCount(2);
        ldia12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia12MouseClicked(evt);
            }
        });
        dia12.setViewportView(ldia12);

        jPanel1.add(dia12);
        dia12.setBounds(402, 90, 96, 40);

        dia13.setBorder(null);
        dia13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia13.setOpaque(false);

        ldia13.setBackground(new java.awt.Color(28, 18, 0));
        ldia13.setForeground(new java.awt.Color(253, 195, 45));
        ldia13.setDragEnabled(true);
        ldia13.setFocusable(false);
        ldia13.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia13.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia13.setVisibleRowCount(2);
        ldia13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia13MouseClicked(evt);
            }
        });
        dia13.setViewportView(ldia13);

        jPanel1.add(dia13);
        dia13.setBounds(502, 90, 96, 40);

        dia14.setBorder(null);
        dia14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia14.setOpaque(false);

        ldia14.setBackground(new java.awt.Color(28, 18, 0));
        ldia14.setForeground(new java.awt.Color(253, 195, 45));
        ldia14.setDragEnabled(true);
        ldia14.setFocusable(false);
        ldia14.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia14.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia14.setVisibleRowCount(2);
        ldia14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia14MouseClicked(evt);
            }
        });
        dia14.setViewportView(ldia14);

        jPanel1.add(dia14);
        dia14.setBounds(602, 90, 96, 40);

        dia15.setBorder(null);
        dia15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia15.setOpaque(false);

        ldia15.setBackground(new java.awt.Color(28, 18, 0));
        ldia15.setForeground(new java.awt.Color(253, 195, 45));
        ldia15.setDragEnabled(true);
        ldia15.setFocusable(false);
        ldia15.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia15.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia15.setVisibleRowCount(2);
        ldia15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia15MouseClicked(evt);
            }
        });
        dia15.setViewportView(ldia15);

        jPanel1.add(dia15);
        dia15.setBounds(2, 150, 96, 40);

        dia16.setBorder(null);
        dia16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia16.setOpaque(false);

        ldia16.setBackground(new java.awt.Color(28, 18, 0));
        ldia16.setForeground(new java.awt.Color(253, 195, 45));
        ldia16.setDragEnabled(true);
        ldia16.setFocusable(false);
        ldia16.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia16.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia16.setVisibleRowCount(2);
        ldia16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia16MouseClicked(evt);
            }
        });
        dia16.setViewportView(ldia16);

        jPanel1.add(dia16);
        dia16.setBounds(102, 150, 96, 40);

        dia17.setBorder(null);
        dia17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia17.setOpaque(false);

        ldia17.setBackground(new java.awt.Color(28, 18, 0));
        ldia17.setForeground(new java.awt.Color(253, 195, 45));
        ldia17.setDragEnabled(true);
        ldia17.setFocusable(false);
        ldia17.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia17.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia17.setVisibleRowCount(2);
        ldia17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia17MouseClicked(evt);
            }
        });
        dia17.setViewportView(ldia17);

        jPanel1.add(dia17);
        dia17.setBounds(202, 150, 96, 40);

        dia18.setBorder(null);
        dia18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia18.setOpaque(false);

        ldia18.setBackground(new java.awt.Color(28, 18, 0));
        ldia18.setForeground(new java.awt.Color(253, 195, 45));
        ldia18.setDragEnabled(true);
        ldia18.setFocusable(false);
        ldia18.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia18.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia18.setVisibleRowCount(2);
        ldia18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia18MouseClicked(evt);
            }
        });
        dia18.setViewportView(ldia18);

        jPanel1.add(dia18);
        dia18.setBounds(302, 150, 96, 40);

        dia19.setBorder(null);
        dia19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia19.setOpaque(false);

        ldia19.setBackground(new java.awt.Color(28, 18, 0));
        ldia19.setForeground(new java.awt.Color(253, 195, 45));
        ldia19.setDragEnabled(true);
        ldia19.setFocusable(false);
        ldia19.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia19.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia19.setVisibleRowCount(2);
        ldia19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia19MouseClicked(evt);
            }
        });
        dia19.setViewportView(ldia19);

        jPanel1.add(dia19);
        dia19.setBounds(402, 150, 96, 40);

        dia20.setBorder(null);
        dia20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia20.setOpaque(false);

        ldia20.setBackground(new java.awt.Color(28, 18, 0));
        ldia20.setForeground(new java.awt.Color(253, 195, 45));
        ldia20.setDragEnabled(true);
        ldia20.setFocusable(false);
        ldia20.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia20.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia20.setVisibleRowCount(2);
        ldia20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia20MouseClicked(evt);
            }
        });
        dia20.setViewportView(ldia20);

        jPanel1.add(dia20);
        dia20.setBounds(502, 150, 96, 40);

        dia21.setBorder(null);
        dia21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia21.setOpaque(false);

        ldia21.setBackground(new java.awt.Color(28, 18, 0));
        ldia21.setForeground(new java.awt.Color(253, 195, 45));
        ldia21.setDragEnabled(true);
        ldia21.setFocusable(false);
        ldia21.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia21.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia21.setVisibleRowCount(2);
        ldia21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia21MouseClicked(evt);
            }
        });
        dia21.setViewportView(ldia21);

        jPanel1.add(dia21);
        dia21.setBounds(602, 150, 96, 40);

        dia22.setBorder(null);
        dia22.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia22.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia22.setOpaque(false);

        ldia22.setBackground(new java.awt.Color(28, 18, 0));
        ldia22.setForeground(new java.awt.Color(253, 195, 45));
        ldia22.setDragEnabled(true);
        ldia22.setFocusable(false);
        ldia22.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia22.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia22.setVisibleRowCount(2);
        ldia22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia22MouseClicked(evt);
            }
        });
        dia22.setViewportView(ldia22);

        jPanel1.add(dia22);
        dia22.setBounds(2, 220, 96, 38);

        dia23.setBorder(null);
        dia23.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia23.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia23.setOpaque(false);

        ldia23.setBackground(new java.awt.Color(28, 18, 0));
        ldia23.setForeground(new java.awt.Color(253, 195, 45));
        ldia23.setDragEnabled(true);
        ldia23.setFocusable(false);
        ldia23.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia23.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia23.setVisibleRowCount(2);
        ldia23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia23MouseClicked(evt);
            }
        });
        dia23.setViewportView(ldia23);

        jPanel1.add(dia23);
        dia23.setBounds(102, 220, 96, 38);

        dia24.setBorder(null);
        dia24.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia24.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia24.setOpaque(false);

        ldia24.setBackground(new java.awt.Color(28, 18, 0));
        ldia24.setForeground(new java.awt.Color(253, 195, 45));
        ldia24.setDragEnabled(true);
        ldia24.setFocusable(false);
        ldia24.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia24.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia24.setVisibleRowCount(2);
        ldia24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia24MouseClicked(evt);
            }
        });
        dia24.setViewportView(ldia24);

        jPanel1.add(dia24);
        dia24.setBounds(202, 220, 96, 38);

        dia25.setBorder(null);
        dia25.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia25.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia25.setOpaque(false);

        ldia25.setBackground(new java.awt.Color(28, 18, 0));
        ldia25.setForeground(new java.awt.Color(253, 195, 45));
        ldia25.setDragEnabled(true);
        ldia25.setFocusable(false);
        ldia25.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia25.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia25.setVisibleRowCount(2);
        ldia25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia25MouseClicked(evt);
            }
        });
        dia25.setViewportView(ldia25);

        jPanel1.add(dia25);
        dia25.setBounds(302, 220, 96, 38);

        dia26.setBorder(null);
        dia26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia26.setOpaque(false);

        ldia26.setBackground(new java.awt.Color(28, 18, 0));
        ldia26.setForeground(new java.awt.Color(253, 195, 45));
        ldia26.setDragEnabled(true);
        ldia26.setFocusable(false);
        ldia26.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia26.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia26.setVisibleRowCount(2);
        ldia26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia26MouseClicked(evt);
            }
        });
        dia26.setViewportView(ldia26);

        jPanel1.add(dia26);
        dia26.setBounds(402, 220, 96, 38);

        dia27.setBorder(null);
        dia27.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia27.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia27.setOpaque(false);

        ldia27.setBackground(new java.awt.Color(28, 18, 0));
        ldia27.setForeground(new java.awt.Color(253, 195, 45));
        ldia27.setDragEnabled(true);
        ldia27.setFocusable(false);
        ldia27.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia27.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia27.setVisibleRowCount(2);
        ldia27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia27MouseClicked(evt);
            }
        });
        dia27.setViewportView(ldia27);

        jPanel1.add(dia27);
        dia27.setBounds(502, 220, 96, 38);

        dia28.setBorder(null);
        dia28.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia28.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia28.setOpaque(false);

        ldia28.setBackground(new java.awt.Color(28, 18, 0));
        ldia28.setForeground(new java.awt.Color(253, 195, 45));
        ldia28.setDragEnabled(true);
        ldia28.setFocusable(false);
        ldia28.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia28.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia28.setVisibleRowCount(2);
        ldia28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia28MouseClicked(evt);
            }
        });
        dia28.setViewportView(ldia28);

        jPanel1.add(dia28);
        dia28.setBounds(602, 220, 96, 38);

        dia30.setBorder(null);
        dia30.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia30.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia30.setOpaque(false);

        ldia30.setBackground(new java.awt.Color(28, 18, 0));
        ldia30.setForeground(new java.awt.Color(253, 195, 45));
        ldia30.setDragEnabled(true);
        ldia30.setFocusable(false);
        ldia30.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia30.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia30.setVisibleRowCount(2);
        ldia30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia30MouseClicked(evt);
            }
        });
        dia30.setViewportView(ldia30);

        jPanel1.add(dia30);
        dia30.setBounds(102, 280, 96, 40);

        dia31.setBorder(null);
        dia31.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dia31.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        dia31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dia31.setOpaque(false);

        ldia31.setBackground(new java.awt.Color(28, 18, 0));
        ldia31.setForeground(new java.awt.Color(253, 195, 45));
        ldia31.setDragEnabled(true);
        ldia31.setFocusable(false);
        ldia31.setSelectionBackground(new java.awt.Color(4, 47, 36));
        ldia31.setSelectionForeground(new java.awt.Color(253, 195, 45));
        ldia31.setVisibleRowCount(2);
        ldia31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldia31MouseClicked(evt);
            }
        });
        dia31.setViewportView(ldia31);

        jPanel1.add(dia31);
        dia31.setBounds(202, 280, 96, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 185, 700, 470));

        volver.setBorder(null);
        volver.setContentAreaFilled(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 146, 12, 15));

        subir.setBorder(null);
        subir.setContentAreaFilled(false);
        subir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subirMouseClicked(evt);
            }
        });
        subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirActionPerformed(evt);
            }
        });
        getContentPane().add(subir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 141, 10, 15));

        bajar.setBorder(null);
        bajar.setContentAreaFilled(false);
        bajar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bajar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bajarMouseClicked(evt);
            }
        });
        bajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajarActionPerformed(evt);
            }
        });
        getContentPane().add(bajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 141, 10, 15));

        menu_hora.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        menu_hora.setForeground(new java.awt.Color(255, 255, 255));
        menu_hora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_hora.setText("3:07 P.M.");
        menu_hora.setToolTipText("Hora Actual");
        getContentPane().add(menu_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 117, 70, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-01.png"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(1365, 768));
        Fondo.setMinimumSize(new java.awt.Dimension(1365, 768));
        Fondo.setPreferredSize(new java.awt.Dimension(1365, 768));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_minimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizar1ActionPerformed
        this.setState(Menu.ICONIFIED);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_minimizar1ActionPerformed

    private void btn_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar1ActionPerformed
        close();         // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrar1ActionPerformed

    private void ldia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia1MouseClicked

    }//GEN-LAST:event_ldia1MouseClicked

    private void ldia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia2MouseClicked

    }//GEN-LAST:event_ldia2MouseClicked

    private void ldia3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia3MouseClicked

    }//GEN-LAST:event_ldia3MouseClicked

    private void ldia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia4MouseClicked

    }//GEN-LAST:event_ldia4MouseClicked

    private void ldia5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia5MouseClicked

    }//GEN-LAST:event_ldia5MouseClicked

    private void ldia6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia6MouseClicked

    }//GEN-LAST:event_ldia6MouseClicked

    private void ldia7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia7MouseClicked

    }//GEN-LAST:event_ldia7MouseClicked

    private void ldia8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia8MouseClicked

    }//GEN-LAST:event_ldia8MouseClicked

    private void ldia9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia9MouseClicked

    }//GEN-LAST:event_ldia9MouseClicked

    private void ldia29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia29MouseClicked

    }//GEN-LAST:event_ldia29MouseClicked

    private void ldia10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia10MouseClicked

    }//GEN-LAST:event_ldia10MouseClicked

    private void ldia11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia11MouseClicked

    }//GEN-LAST:event_ldia11MouseClicked

    private void ldia12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia12MouseClicked

    }//GEN-LAST:event_ldia12MouseClicked

    private void ldia13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia13MouseClicked

    }//GEN-LAST:event_ldia13MouseClicked

    private void ldia14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia14MouseClicked

    }//GEN-LAST:event_ldia14MouseClicked

    private void ldia15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia15MouseClicked

    }//GEN-LAST:event_ldia15MouseClicked

    private void ldia16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia16MouseClicked

    }//GEN-LAST:event_ldia16MouseClicked

    private void ldia17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia17MouseClicked

    }//GEN-LAST:event_ldia17MouseClicked

    private void ldia18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia18MouseClicked

    }//GEN-LAST:event_ldia18MouseClicked

    private void ldia19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia19MouseClicked

    }//GEN-LAST:event_ldia19MouseClicked

    private void ldia20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia20MouseClicked

    }//GEN-LAST:event_ldia20MouseClicked

    private void ldia21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia21MouseClicked

    }//GEN-LAST:event_ldia21MouseClicked

    private void ldia22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia22MouseClicked

    }//GEN-LAST:event_ldia22MouseClicked

    private void ldia23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia23MouseClicked

    }//GEN-LAST:event_ldia23MouseClicked

    private void ldia24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia24MouseClicked

    }//GEN-LAST:event_ldia24MouseClicked

    private void ldia25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia25MouseClicked

    }//GEN-LAST:event_ldia25MouseClicked

    private void ldia26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia26MouseClicked

    }//GEN-LAST:event_ldia26MouseClicked

    private void ldia27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia27MouseClicked

    }//GEN-LAST:event_ldia27MouseClicked

    private void ldia28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia28MouseClicked

    }//GEN-LAST:event_ldia28MouseClicked

    private void ldia30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia30MouseClicked

    }//GEN-LAST:event_ldia30MouseClicked

    private void ldia31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldia31MouseClicked

    }//GEN-LAST:event_ldia31MouseClicked

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Date sistFecha = new Date();
        int dia0 = sistFecha.getDate();
        dia.setText(String.valueOf(dia0));
        SimpleDateFormat formato = new SimpleDateFormat("EEEE");
        SimpleDateFormat formato1 = new SimpleDateFormat("MMMM");
        SimpleDateFormat formato2 = new SimpleDateFormat("YYYY");
        dia_letras.setText(formato.format(sistFecha) + " ");
        mes_letras.setText(formato1.format(sistFecha));
        año.setText(formato2.format(sistFecha));
        buscar_dia();
        obj.organizar_agenda();
        obj.marcar();
        num();
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void subirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subirMouseClicked
        switch (mes_letras.getText()) {
            case "enero":
            mes_letras.setText("febrero");
            break;
            case "febrero":
            mes_letras.setText("marzo");
            break;
            case "marzo":
            mes_letras.setText("abril");
            break;
            case "abril":
            mes_letras.setText("mayo");
            break;
            case "mayo":
            mes_letras.setText("junio");
            break;
            case "junio":
            mes_letras.setText("julio");
            break;
            case "julio":
            mes_letras.setText("agosto");
            break;
            case "agosto":
            mes_letras.setText("septiembre");
            break;
            case "septiembre":
            mes_letras.setText("octubre");
            break;
            case "octubre":
            mes_letras.setText("noviembre");
            break;
            case "noviembre":
            mes_letras.setText("diciembre");
            break;
            case "diciembre":
            int ax = Integer.parseInt(año.getText());
            int ap = ax + 1;
            if (ap > 2150) {
                JOptionPane.showMessageDialog(null, "El año final de este calendario es el 2150");
                año.setText("2100");
                mes_letras.setText("diciembre");
                buscar_dia();
                obj.organizar_agenda();
            } else {
                año.setText(String.valueOf(ap));
                mes_letras.setText("enero");
            }
            break;
            default:
            break;
        }
        buscar_dia();
        obj.organizar_agenda();
        obj.marcar();
        num();
    }//GEN-LAST:event_subirMouseClicked

    private void subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subirActionPerformed

    private void bajarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajarMouseClicked
        switch (mes_letras.getText()) {
            case "enero":
            int ax = Integer.parseInt(año.getText());
            int ap = ax - 1;
            if (ap < 2020) {
                JOptionPane.showMessageDialog(null, "El año inicial de este calendario es el 2020");
                año.setText("2020");
                mes_letras.setText("enero");
                buscar_dia();
                obj.organizar_agenda();
            } else {
                año.setText(String.valueOf(ap));
                mes_letras.setText("diciembre");
            }
            break;
            case "diciembre":
            mes_letras.setText("noviembre");
            break;
            case "noviembre":
            mes_letras.setText("octubre");
            break;
            case "octubre":
            mes_letras.setText("septiembre");
            break;
            case "septiembre":
            mes_letras.setText("agosto");
            break;
            case "agosto":
            mes_letras.setText("julio");
            break;
            case "julio":
            mes_letras.setText("junio");
            break;
            case "junio":
            mes_letras.setText("mayo");
            break;
            case "mayo":
            mes_letras.setText("abril");
            break;
            case "abril":
            mes_letras.setText("marzo");
            break;
            case "marzo":
            mes_letras.setText("febrero");
            break;
            case "febrero":
            mes_letras.setText("enero");
            break;
            default:
            break;
        }
        buscar_dia();
        obj.organizar_agenda();
        obj.marcar();
        num();
    }//GEN-LAST:event_bajarMouseClicked

    private void bajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajarActionPerformed

    }//GEN-LAST:event_bajarActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setState(Menu.ICONIFIED);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        close();         // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public static javax.swing.JLabel año;
    private javax.swing.JButton bajar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_cerrar1;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_minimizar1;
    public static javax.swing.JLabel dia;
    public static javax.swing.JScrollPane dia1;
    public static javax.swing.JScrollPane dia10;
    public static javax.swing.JScrollPane dia11;
    public static javax.swing.JScrollPane dia12;
    public static javax.swing.JScrollPane dia13;
    public static javax.swing.JScrollPane dia14;
    public static javax.swing.JScrollPane dia15;
    public static javax.swing.JScrollPane dia16;
    public static javax.swing.JScrollPane dia17;
    public static javax.swing.JScrollPane dia18;
    public static javax.swing.JScrollPane dia19;
    public static javax.swing.JScrollPane dia2;
    public static javax.swing.JScrollPane dia20;
    public static javax.swing.JScrollPane dia21;
    public static javax.swing.JScrollPane dia22;
    public static javax.swing.JScrollPane dia23;
    public static javax.swing.JScrollPane dia24;
    public static javax.swing.JScrollPane dia25;
    public static javax.swing.JScrollPane dia26;
    public static javax.swing.JScrollPane dia27;
    public static javax.swing.JScrollPane dia28;
    public static javax.swing.JScrollPane dia29;
    public static javax.swing.JScrollPane dia3;
    public static javax.swing.JScrollPane dia30;
    public static javax.swing.JScrollPane dia31;
    public static javax.swing.JScrollPane dia4;
    public static javax.swing.JScrollPane dia5;
    public static javax.swing.JScrollPane dia6;
    public static javax.swing.JScrollPane dia7;
    public static javax.swing.JScrollPane dia8;
    public static javax.swing.JScrollPane dia9;
    public static javax.swing.JLabel dia_1;
    public static javax.swing.JLabel dia_10;
    public static javax.swing.JLabel dia_11;
    public static javax.swing.JLabel dia_12;
    public static javax.swing.JLabel dia_13;
    public static javax.swing.JLabel dia_14;
    public static javax.swing.JLabel dia_15;
    public static javax.swing.JLabel dia_16;
    public static javax.swing.JLabel dia_17;
    public static javax.swing.JLabel dia_18;
    public static javax.swing.JLabel dia_19;
    public static javax.swing.JLabel dia_2;
    public static javax.swing.JLabel dia_20;
    public static javax.swing.JLabel dia_21;
    public static javax.swing.JLabel dia_22;
    public static javax.swing.JLabel dia_23;
    public static javax.swing.JLabel dia_24;
    public static javax.swing.JLabel dia_25;
    public static javax.swing.JLabel dia_26;
    public static javax.swing.JLabel dia_27;
    public static javax.swing.JLabel dia_28;
    public static javax.swing.JLabel dia_29;
    public static javax.swing.JLabel dia_3;
    public static javax.swing.JLabel dia_30;
    public static javax.swing.JLabel dia_31;
    public static javax.swing.JLabel dia_4;
    public static javax.swing.JLabel dia_5;
    public static javax.swing.JLabel dia_6;
    public static javax.swing.JLabel dia_7;
    public static javax.swing.JLabel dia_8;
    public static javax.swing.JLabel dia_9;
    public static javax.swing.JLabel dia_letras;
    private javax.swing.JLabel diano;
    private javax.swing.JLabel fondo_pantalla;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel37;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JList<String> ldia1;
    public static javax.swing.JList<String> ldia10;
    public static javax.swing.JList<String> ldia11;
    public static javax.swing.JList<String> ldia12;
    public static javax.swing.JList<String> ldia13;
    public static javax.swing.JList<String> ldia14;
    public static javax.swing.JList<String> ldia15;
    public static javax.swing.JList<String> ldia16;
    public static javax.swing.JList<String> ldia17;
    public static javax.swing.JList<String> ldia18;
    public static javax.swing.JList<String> ldia19;
    public static javax.swing.JList<String> ldia2;
    public static javax.swing.JList<String> ldia20;
    public static javax.swing.JList<String> ldia21;
    public static javax.swing.JList<String> ldia22;
    public static javax.swing.JList<String> ldia23;
    public static javax.swing.JList<String> ldia24;
    public static javax.swing.JList<String> ldia25;
    public static javax.swing.JList<String> ldia26;
    public static javax.swing.JList<String> ldia27;
    public static javax.swing.JList<String> ldia28;
    public static javax.swing.JList<String> ldia29;
    public static javax.swing.JList<String> ldia3;
    public static javax.swing.JList<String> ldia30;
    public static javax.swing.JList<String> ldia31;
    public static javax.swing.JList<String> ldia4;
    public static javax.swing.JList<String> ldia5;
    public static javax.swing.JList<String> ldia6;
    public static javax.swing.JList<String> ldia7;
    public static javax.swing.JList<String> ldia8;
    public static javax.swing.JList<String> ldia9;
    private javax.swing.JLabel menu_hora;
    public static javax.swing.JLabel mes_letras;
    public static javax.swing.JLabel nombre_usu_cli1;
    private javax.swing.JPanel parche;
    private javax.swing.JButton subir;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

conectar cc = new conectar();
    Connection cn = cc.conexion();
 
    
    public void run() {
    Thread ct= Thread.currentThread();
    
    while(ct==hi){
    calcula();
    menu_hora.setText(hora+":"+minutos+" "+ampm);
    //:"+segundos+"
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        }
    }
    private void calcula(){
       Calendar calendario = new GregorianCalendar();
       Date fechaHoraActal = new Date();

       calendario.setTime(fechaHoraActal);
       ampm= calendario.get(Calendar.AM_PM)==Calendar.AM?"A.M.":"P.M.";
    if(ampm.equals("P.M.")){
    int h= calendario.get(Calendar.HOUR_OF_DAY)-12;
    hora=h>9?""+h:"0"+h;
    }else{
    hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    }
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
            
    }



}
