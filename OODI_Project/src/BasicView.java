import com.javatraineronline.*;
import com.google.gson.Gson;
import java.awt.event.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.script.ScriptException;
import javax.swing.JFrame;

/**
 *
 * @author Omer Farooq Ahmed
 * This is the view (GUI) class of the MVC Calculator I am
 * building for my OODI project with Muneeb Khan Afridi
 * and Usama Hussain
 * Date: 3/11/2017
 */
public class BasicView extends javax.swing.JFrame {

	// Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
    
    /**
     * Creates new form BasicView
     */
    public BasicView(String title) {
        initComponents();
        this.setTitle(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));

        jTextField1.setBackground(new java.awt.Color(234, 235, 237));
        jTextField1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setEditable(false);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\7.jpg")); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton1.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton1.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\8.jpg")); // NOI18N
        jButton2.setText("jButton1");
        jButton2.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton2.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton2.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\9.jpg")); // NOI18N
        jButton3.setText("jButton1");
        jButton3.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton3.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton3.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\divide.jpg")); // NOI18N
        jButton4.setText("jButton1");
        jButton4.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton4.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton4.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\open.jpg")); // NOI18N
        jButton5.setText("jButton1");
        jButton5.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton5.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton5.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\4.jpg")); // NOI18N
        jButton6.setText("jButton1");
        jButton6.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton6.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton6.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\5.jpg")); // NOI18N
        jButton7.setText("jButton1");
        jButton7.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton7.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton7.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\6.jpg")); // NOI18N
        jButton8.setText("jButton1");
        jButton8.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton8.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton8.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\multiply.jpg")); // NOI18N
        jButton9.setText("jButton1");
        jButton9.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton9.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton9.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\1.jpg")); // NOI18N
        jButton10.setText("jButton1");
        jButton10.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton10.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton10.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\2.jpg")); // NOI18N
        jButton11.setText("jButton1");
        jButton11.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton11.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton11.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\3.jpg")); // NOI18N
        jButton12.setText("jButton1");
        jButton12.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton12.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton12.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\add.jpg")); // NOI18N
        jButton13.setText("jButton1");
        jButton13.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton13.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton13.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\close.jpg")); // NOI18N
        jButton14.setText("jButton1");
        jButton14.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton14.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton14.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\decimal.jpg")); // NOI18N
        jButton15.setText("jButton1");
        jButton15.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton15.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton15.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\0.jpg")); // NOI18N
        jButton16.setText("jButton1");
        jButton16.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton16.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton16.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\equal2.jpg")); // NOI18N
        jButton17.setText("jButton1");
        jButton17.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton17.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton17.setPreferredSize(new java.awt.Dimension(110, 90));
        
        /*
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        */

        jButton18.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\minus.jpg")); // NOI18N
        jButton18.setText("jButton1");
        jButton18.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton18.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton18.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(102, 102, 102));
        jButton19.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\accounting.jpg")); // NOI18N
        jButton19.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton19.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton19.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(102, 102, 102));
        jButton20.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\unit.jpg")); // NOI18N
        jButton20.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton20.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton20.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(102, 102, 102));
        jButton21.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\scientific.jpg")); // NOI18N
        jButton21.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton21.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton21.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(102, 102, 102));
        jButton22.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\blank.jpg")); // NOI18N
        jButton22.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton22.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton22.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(102, 102, 102));
        jButton23.setIcon(new javax.swing.ImageIcon("D:\\mvc_calculator\\sprites\\resized\\backspace.jpg")); // NOI18N
        jButton23.setMaximumSize(new java.awt.Dimension(110, 90));
        jButton23.setMinimumSize(new java.awt.Dimension(110, 90));
        jButton23.setPreferredSize(new java.awt.Dimension(110, 90));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    // FUNCTION TO ADD ACTION LISTENER TO JBUTTON17 IN THE CONTROLLER
    public void addCalculateListener(ActionListener calculateListener){
    	jButton17.addActionListener(calculateListener);
    }
    //GETTER METHOD FOR TEXT FROM FIELD
    public String getTextFromField() {
    	return jTextField1.getText();
    }
    //SETTER METHOD FOR JTEXTFIELD
    public void setTextToField(String str) {
    	jTextField1.setText(str);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"7");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         jTextField1.setText(jTextField1.getText()+"8");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"9");
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"/");
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"(");
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"4");
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"5");
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"6");
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"*");
    }                                        

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+")");
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"1");
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"2");
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"3");
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"+");
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+".");
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"0");
    }                                         
    /*
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // THIS IS WHERE THE MODEL IS CALLED
        
    }
    */                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"-");
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here: currency converter
    	CurrencyView currView= new CurrencyView();
    	currView.setVisible(true);
    	currView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	//CurrencyController currCont= new CurrencyController(new Finilization(), currView);
    	ControllerFacade facade= new ControllerFacade();
    	facade.currencyOperation(new CurrencyModelAdapter(), currView);
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here: unit converter
    	UnitView unitView= new UnitView();
    	unitView.setVisible(true);
    	unitView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	//UnitController unitCont= new UnitController(new UnitConverterModel(),unitView);
    	ControllerFacade facade= new ControllerFacade();
    	facade.unitOperation(new UnitConverterModel(), unitView);
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here: scientific
    	ScientificView1 sciView= new ScientificView1();
    	sciView.setVisible(true);
    	sciView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	//ScientificController sciCont= new ScientificController(sciView, new ScientificModel());
    	ControllerFacade facade= new ControllerFacade();
    	facade.ScientificOperation(sciView, new ScientificModel());
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	jTextField1.setText("");
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if (jTextField1.getText().length()>0) 
            jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));
    }                                         

    /**
     * @param args the command line arguments
     */
    
    
    

    
}