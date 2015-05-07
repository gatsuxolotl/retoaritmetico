
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gatsuxolotl
 */
public class reto extends javax.swing.JFrame {
    int selector = 0, respuesta, selector2, limite1, limite2, cont = 0,
            operador1, operador2, contsum = 0, contrest = 0, contmult = 0,
            contdiv = 0;
    String simbolo = "";
    Random rnd = new Random();

    /**
     * Creates new form reto
     */
    public reto() {
        initComponents();
        setSize(900, 500);
    }

    //inicio de metodos
    public void botones(int respuesta) {
        int alazar[] = new int[9], selectorbotones, exp, repetidos[] = new int[9],
                temp = 0, arregloboton[] = new int[9], i = 0, contadorrep = 0, fnl = 0;
        String numazar = "", temp2 = "";
        limite1 = respuesta + 10;
        limite2 = respuesta - 10;
        
        exp = (int) (Math.random() * (8 - 0 + 1) + 0);
        arregloboton[exp] = respuesta;

        do {
            exp = (int) (Math.random() * (limite1 - limite2 + 1) + limite2);
            for (int j = 0; j < arregloboton.length; j++) {
                if (arregloboton[j] != exp) {
                    contadorrep++;
                }
            }
            if (arregloboton[i] != respuesta && contadorrep == 9 && arregloboton[i] == 0) {
                arregloboton[i] = exp;
                fnl++;
            }
            i++;
            if (i == 9) {
                i = 0;
            }
            contadorrep = 0;
        } while (fnl != 8);
        
        jButton1.setText(Integer.toString(operador1));
        jButton2.setText(simbolo);
        jButton3.setText(Integer.toString(operador2));
        jButton4.setText(Integer.toString(arregloboton[0]));
        jButton5.setText(Integer.toString(arregloboton[1]));
        jButton6.setText(Integer.toString(arregloboton[2]));
        jButton7.setText(Integer.toString(arregloboton[3]));
        jButton8.setText(Integer.toString(arregloboton[4]));
        jButton9.setText(Integer.toString(arregloboton[5]));
        jButton10.setText(Integer.toString(arregloboton[6]));
        jButton11.setText(Integer.toString(arregloboton[7]));
        jButton12.setText(Integer.toString(arregloboton[8]));
    }

    public int suma() {
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
        operador1 = (int) (Math.random() * (999 - 100 + 1) + 100);
        operador2 = (int) (Math.random() * (99 - 10 + 1) + 10);
        respuesta = operador1 + operador2;
        System.out.println(operador1 + "+" + operador2 + "=" + respuesta);
        return respuesta;
    }

    public int resta() {
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
        operador1 = (int) (Math.random() * (999 - 100 + 1) + 100);
        operador2 = (int) (Math.random() * (99 - 10 + 1) + 10);
        respuesta = operador1 - operador2;
        System.out.println(operador1 + "-" + operador2 + "=" + respuesta);
        return respuesta;
    }

    public int multiplicacion() {
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
        operador1 = (int) (Math.random() * (500 - 100 + 1) + 100);
        operador2 = (int) (Math.random() * (9 - 2 + 1) + 2);
        respuesta = operador1 * operador2;
        System.out.println(operador1 + "*" + operador2 + "=" + respuesta);
        return respuesta;
    }

    public int divicion() {
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
        operador1 = (int) (Math.random() * (999 - 200 + 1) + 200);
        operador2 = (int) (Math.random() * (9 - 2 + 1) + 2);
        respuesta = operador1 / operador2;
        System.out.println(operador1 + "/" + operador2 + "=" + respuesta);
        return respuesta;
    }

    public void principia() {
        int operaciones[] = {0, 1, 2, 3};

        if (contsum == 5) {
            operaciones[0] = -99;
        }
        if (contrest == 5) {
            operaciones[1] = -99;
        }
        if (contmult == 5) {
            operaciones[2] = -99;
        }
        if (contdiv == 5) {
            operaciones[3] = -99;
        }

        do {
            selector = rnd.nextInt(4);
            selector2 = operaciones[selector];
            cont++;
            if (cont == 4) {
                cont = 0;
            }
        } while (operaciones[cont] == -99);

        switch (selector2) {
            case 0:
                contsum++;
                jButton1.setForeground(Color.red);
                jButton2.setForeground(Color.red);
                jButton3.setForeground(Color.red);
                jButton4.setForeground(Color.red);
                jButton5.setForeground(Color.red);
                jButton6.setForeground(Color.red);
                jButton7.setForeground(Color.red);
                jButton8.setForeground(Color.red);
                jButton9.setForeground(Color.red);
                jButton10.setForeground(Color.red);
                jButton11.setForeground(Color.red);
                jButton12.setForeground(Color.red);
                jButton13.setForeground(Color.red);
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sangre.png")));
                simbolo = "+";
                botones(suma());
                System.out.println("suma");
                System.out.println(contsum);
                break;
            case 1:
                contrest++;
                jButton1.setForeground(Color.green);
                jButton2.setForeground(Color.green);
                jButton3.setForeground(Color.green);
                jButton4.setForeground(Color.green);
                jButton5.setForeground(Color.green);
                jButton6.setForeground(Color.green);
                jButton7.setForeground(Color.green);
                jButton8.setForeground(Color.green);
                jButton9.setForeground(Color.green);
                jButton10.setForeground(Color.green);
                jButton11.setForeground(Color.green);
                jButton12.setForeground(Color.green);
                jButton13.setForeground(Color.green);
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tierra.png")));
                simbolo = "-";
                botones(resta());
                System.out.println("resta");
                System.out.println(contrest);
                break;
            case 2:
                contmult++;
                jButton1.setForeground(Color.blue);
                jButton2.setForeground(Color.blue);
                jButton3.setForeground(Color.blue);
                jButton4.setForeground(Color.blue);
                jButton5.setForeground(Color.blue);
                jButton6.setForeground(Color.blue);
                jButton7.setForeground(Color.blue);
                jButton8.setForeground(Color.blue);
                jButton9.setForeground(Color.blue);
                jButton10.setForeground(Color.blue);
                jButton11.setForeground(Color.blue);
                jButton12.setForeground(Color.blue);
                jButton13.setForeground(Color.blue);
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agua.png")));
                simbolo = "*";
                botones(multiplicacion());
                System.out.println("multi");
                System.out.println(contmult);
                break;
            case 3:
                contdiv++;
                jButton1.setForeground(Color.gray);
                jButton2.setForeground(Color.gray);
                jButton3.setForeground(Color.gray);
                jButton4.setForeground(Color.gray);
                jButton5.setForeground(Color.gray);
                jButton6.setForeground(Color.gray);
                jButton7.setForeground(Color.gray);
                jButton8.setForeground(Color.gray);
                jButton9.setForeground(Color.gray);
                jButton10.setForeground(Color.gray);
                jButton11.setForeground(Color.gray);
                jButton12.setForeground(Color.gray);
                jButton13.setForeground(Color.gray);
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fuego.png")));
                simbolo = "/";
                botones(divicion());
                System.out.println("divi");
                System.out.println(contdiv);
                break;
            case -99:
                break;
            default:
                throw new AssertionError();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setEnabled(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 100, 33);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 10, 100, 33);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setEnabled(false);
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 10, 100, 33);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 70, 100, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 70, 100, 50);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(270, 70, 100, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 140, 100, 50);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(140, 140, 100, 50);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(270, 140, 100, 50);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(10, 210, 100, 50);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(140, 210, 100, 50);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(270, 210, 100, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tiempo restante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 285, 174, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Elemento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(301, 285, 98, 29);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton13.setText("jButton1");
        getContentPane().add(jButton13);
        jButton13.setBounds(10, 327, 121, 33);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("Iniciar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(141, 320, 97, 48);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(320, 320, 70, 66);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombraagua.png"))); // NOI18N
        getContentPane().add(jButton16);
        jButton16.setBounds(440, 70, 70, 66);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombraagua.png"))); // NOI18N
        getContentPane().add(jButton17);
        jButton17.setBounds(520, 70, 70, 66);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombraagua.png"))); // NOI18N
        getContentPane().add(jButton18);
        jButton18.setBounds(600, 70, 70, 66);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombraagua.png"))); // NOI18N
        getContentPane().add(jButton19);
        jButton19.setBounds(680, 70, 70, 66);

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombraagua.png"))); // NOI18N
        getContentPane().add(jButton20);
        jButton20.setBounds(760, 70, 70, 66);

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrafuego.png"))); // NOI18N
        getContentPane().add(jButton31);
        jButton31.setBounds(440, 140, 70, 66);

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrafuego.png"))); // NOI18N
        getContentPane().add(jButton32);
        jButton32.setBounds(520, 140, 70, 66);

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrafuego.png"))); // NOI18N
        getContentPane().add(jButton33);
        jButton33.setBounds(600, 140, 70, 66);

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrafuego.png"))); // NOI18N
        getContentPane().add(jButton34);
        jButton34.setBounds(680, 140, 70, 66);

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrafuego.png"))); // NOI18N
        getContentPane().add(jButton35);
        jButton35.setBounds(760, 140, 70, 66);

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombratierra.png"))); // NOI18N
        getContentPane().add(jButton36);
        jButton36.setBounds(600, 280, 70, 66);

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombratierra.png"))); // NOI18N
        getContentPane().add(jButton37);
        jButton37.setBounds(440, 280, 70, 66);

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombratierra.png"))); // NOI18N
        getContentPane().add(jButton38);
        jButton38.setBounds(520, 280, 70, 66);

        jButton39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombratierra.png"))); // NOI18N
        getContentPane().add(jButton39);
        jButton39.setBounds(680, 280, 70, 66);

        jButton40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombratierra.png"))); // NOI18N
        getContentPane().add(jButton40);
        jButton40.setBounds(760, 280, 70, 66);

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrasangre.png"))); // NOI18N
        getContentPane().add(jButton41);
        jButton41.setBounds(440, 210, 70, 66);

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrasangre.png"))); // NOI18N
        getContentPane().add(jButton42);
        jButton42.setBounds(520, 210, 70, 66);

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrasangre.png"))); // NOI18N
        getContentPane().add(jButton43);
        jButton43.setBounds(600, 210, 70, 66);

        jButton44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrasangre.png"))); // NOI18N
        getContentPane().add(jButton44);
        jButton44.setBounds(680, 210, 70, 66);

        jButton45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrasangre.png"))); // NOI18N
        getContentPane().add(jButton45);
        jButton45.setBounds(760, 210, 70, 66);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        principia();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getText().equals(Integer.toString(respuesta))) {
            JOptionPane.showMessageDialog(this, "correcto");
        } else {
            JOptionPane.showMessageDialog(this, "falso");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jButton5.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jButton6.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jButton7.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jButton8.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jButton9.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jButton10.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jButton11.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jButton12.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(reto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private String IntegerToString(int temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
