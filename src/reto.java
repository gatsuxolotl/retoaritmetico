
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
     int selector=0,respuesta,selector2,limite1,limite2,cont=0,
             operador1,operador2,contsum=0, contrest=0, contmult=0,
             contdiv=0;
     String simbolo="";
    Random rnd = new Random();

    /**
     * Creates new form reto
     */
    public reto() {
        initComponents();
    }

    //inicio de metodos
    public void botones(int respuesta){
        int alazar[]=new int [9],selectorbotones,exp,repetidos[]=new int [9],
                temp=0,arregloboton[]=new int [9],i=0,contadorrep=0,fnl=0;
        String numazar="",temp2="";
        limite1=respuesta+10;
        limite2=respuesta-10;
            //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
            exp=(int)(Math.random()*(8-0+1)+0);
            arregloboton[exp]=respuesta;
            
            do {
            exp=(int)(Math.random()*(limite1-limite2+1)+limite2);
                for (int j = 0; j < arregloboton.length; j++) {
                    if (arregloboton[j]!=exp) {
                        contadorrep++;
                    }
                }
                if (arregloboton[i]!=respuesta&&contadorrep==9&&arregloboton[i]==0) {
                    arregloboton[i]=exp;
                    fnl++;
                }
            i++;
                if (i==9) {
                    i=0;
                }
            contadorrep=0;
        } while (fnl!=8);
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
            
            /*for (int j = 0; j < arregloboton.length; j++) {
                System.out.println(arregloboton[j]);
            
        }*/
        
    }
    
    public int suma(){
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
       operador1=(int)(Math.random()*(999-100+1)+100);
       operador2=(int)(Math.random()*(99-10+1)+10);
       respuesta=operador1+operador2;
        System.out.println(operador1+"+"+operador2+"="+respuesta);
    return(respuesta);
    }
    
    public int resta(){
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
       operador1=(int)(Math.random()*(999-100+1)+100);
       operador2=(int)(Math.random()*(99-10+1)+10);
       respuesta=operador1-operador2;
        System.out.println(operador1+"-"+operador2+"="+respuesta);
    return(respuesta);
    }
    
    public int multiplicacion(){
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
       operador1=(int)(Math.random()*(500-100+1)+100);
       operador2=(int)(Math.random()*(9-2+1)+2);
       respuesta=operador1*operador2;
        System.out.println(operador1+"*"+operador2+"="+respuesta);
    return(respuesta);
    }
    
    public int divicion(){
        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
       operador1=(int)(Math.random()*(999-200+1)+200);
       operador2=(int)(Math.random()*(9-2+1)+2);
       respuesta=operador1/operador2;
        System.out.println(operador1+"/"+operador2+"="+respuesta);
    return(respuesta);
    }
    
    public void principia(){
     int operaciones[]={0,1,2,3};
        
        
        if (contsum==5) {
            operaciones[0]=-99;
       }
        if (contrest==5) {
            operaciones[1]=-99;
       }
        if (contmult==5) {
            operaciones[2]=-99;
       }
        if (contdiv==5) {
            operaciones[3]=-99;
       }
        
        do {       
            selector=rnd.nextInt(4);
            selector2=operaciones[selector];
            cont++;
            if (cont==4) {
                cont=0;
            }
        } while (operaciones[cont]==-99);
        
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
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                simbolo="+";
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
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                simbolo="-";
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
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                simbolo="X";
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
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                simbolo="%";
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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("jButton1");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("jButton1");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("jButton1");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("jButton1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.setText("jButton1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton11.setText("jButton1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setText("jButton1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tiempo restante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Elemento");

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton13.setText("jButton1");

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("Iniciar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(41, 41, 41)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(10, 10, 10)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton14)))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 100, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        principia();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getText().equals(Integer.toString(respuesta))) {
            JOptionPane.showMessageDialog(this, "correcto");
        }else{
            JOptionPane.showMessageDialog(this, "falso");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if (jButton5.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         if (jButton6.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         if (jButton7.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         if (jButton8.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         if (jButton9.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         if (jButton10.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         if (jButton11.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         if (jButton12.getText().equals(Integer.toString(respuesta))) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("falso");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

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
