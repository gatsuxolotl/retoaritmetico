
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
             contdiv=0,contadorSegundos=20;
     String simbolo=" ";
    Random rnd = new Random();
    Timer time;

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
        do {            
       operador1=(int)(Math.random()*(999-200+1)+200);
       operador2=(int)(Math.random()*(9-2+1)+2);
       respuesta=operador1/operador2;
        } while (operador1%operador2!=0);
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
                simbolo="/";
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
    
    public void cambiasombras(){
        switch (simbolo) {
            case "+":
                switch (contsum) {
                    case 1:
                        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        break;
                    case 2:
                        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    case 3:
                        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    case 4:
                        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    case 5:
                        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "-":
                switch (contrest) {
                    case 1:
                        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        break;
                    case 2:
                        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    case 3:
                        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    case 4:
                        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    case 5:
                        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "X":
                switch (contmult) {
                    case 1:
                        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        break;
                    case 2:
                        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    case 3:
                        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    case 4:
                        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    case 5:
                        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "/":
                 switch (contdiv) {
                    case 1:
                        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        break;
                    case 2:
                        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    case 3:
                        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    case 4:
                        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    case 5:
                        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void tiempoparaatras(){
    time = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        jButton13.setText(":20");
        jButton13.setText(contadorSegundos+"");
        contadorSegundos--;
            if (contadorSegundos==0) {
                contadorSegundos=60;
                
            }
        }
    
    });
    time.start();
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
        jLabel3 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("jButton1");
        jButton2.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("Iniciar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jugador");

        jButton21.setText("Eelementos 0 de 20.");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setEnabled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton47.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton52.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton59.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton28.setEnabled(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("Eelementos 0 de 20.");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ignorancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14)))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        principia();
        cambiasombras();
        tiempoparaatras();
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

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

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
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
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
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private String IntegerToString(int temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
