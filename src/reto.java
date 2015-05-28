
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
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
             contdiv=0,contadorSegundos=5,botoncontenedor,contadortotal
             ,contsumacierto=0, contrestacierto=0, contmultacierto=0,contdivacierto=0
             ,contsumerror=0, contresterror=0, contmulterror=0,contdiverror=0,
             conterrores=0,contaciertos=0;
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
//    public void botones(int respuesta){
//        int alazar[]=new int [9],selectorbotones,exp,repetidos[]=new int [9],
//                temp=0,arregloboton[]=new int [9],i=0,contadorrep=0,fnl=0;
//        String numazar="",temp2="";
//        limite1=respuesta+10;
//        limite2=respuesta-10;
//            //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
//            //asigno lugal aleatorio dentro del array para la respuesta
//            exp=(int)(Math.random()*(8-0+1)+0);
//            botoncontenedor=exp;
//            arregloboton[exp]=respuesta;
//            
//            do {
//            exp=(int)(Math.random()*(limite1-limite2+1)+limite2);
//                for (int j = 0; j < arregloboton.length; j++) {
//                    if (arregloboton[j]!=exp) {
//                        contadorrep++;
//                    }
//                }
//                if (arregloboton[i]!=respuesta&&contadorrep==9&&arregloboton[i]==0) {
//                    arregloboton[i]=exp;
//                    fnl++;
//                }
//            i++;
//                if (i==9) {
//                    i=0;
//                }
//            contadorrep=0;
//        } while (fnl!=8);
//            jButton1.setText(Integer.toString(operador1));
//            jButton2.setText(simbolo);
//            jButton3.setText(Integer.toString(operador2));
//            jButton4.setText(Integer.toString(arregloboton[0]));
//            jButton5.setText(Integer.toString(arregloboton[1]));
//            jButton6.setText(Integer.toString(arregloboton[2]));
//            jButton7.setText(Integer.toString(arregloboton[3]));
//            jButton8.setText(Integer.toString(arregloboton[4]));
//            jButton9.setText(Integer.toString(arregloboton[5]));
//            jButton10.setText(Integer.toString(arregloboton[6]));
//            jButton11.setText(Integer.toString(arregloboton[7]));
//            jButton12.setText(Integer.toString(arregloboton[8]));
//            
//            /*for (int j = 0; j < arregloboton.length; j++) {
//                System.out.println(arregloboton[j]);
//            
//        }*/
//        
//    }
//    
//    public int suma(){
//        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
//       operador1=(int)(Math.random()*(999-100+1)+100);
//       operador2=(int)(Math.random()*(99-10+1)+10);
//       respuesta=operador1+operador2;
//        System.out.println(operador1+"+"+operador2+"="+respuesta);
//    return(respuesta);
//    }
//    
//    public int resta(){
//        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
//       operador1=(int)(Math.random()*(999-100+1)+100);
//       operador2=(int)(Math.random()*(99-10+1)+10);
//       respuesta=operador1-operador2;
//        System.out.println(operador1+"-"+operador2+"="+respuesta);
//    return(respuesta);
//    }
//    
//    public int multiplicacion(){
//        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
//       operador1=(int)(Math.random()*(500-100+1)+100);
//       operador2=(int)(Math.random()*(9-2+1)+2);
//       respuesta=operador1*operador2;
//        System.out.println(operador1+"*"+operador2+"="+respuesta);
//    return(respuesta);
//    }
//    
//    public int divicion(){
//        //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
//        do {            
//       operador1=(int)(Math.random()*(999-200+1)+200);
//       operador2=(int)(Math.random()*(9-2+1)+2);
//       respuesta=operador1/operador2;
//        } while (operador1%operador2!=0);
//        System.out.println(operador1+"/"+operador2+"="+respuesta);
//    return(respuesta);
//    }
//    
//    public void principia(){
//     int operaciones[]={0,1,2,3};
//        
//        //assigno bandera para quitar operaciones completadas
//        if (contsum==5) {
//            operaciones[0]=-99;
//       }
//        if (contrest==5) {
//            operaciones[1]=-99;
//       }
//        if (contmult==5) {
//            operaciones[2]=-99;
//       }
//        if (contdiv==5) {
//            operaciones[3]=-99;
//       }
//        
//        do {       
//            selector=rnd.nextInt(4);
//            selector2=operaciones[selector];
//            cont++;
//            if (cont==4) {
//                cont=0;
//            }
//        } while (selector2==-99);
//        
//        switch (selector2) {
//            case 0:
//                contsum++;
//                jButton1.setForeground(Color.red);
//                jButton2.setForeground(Color.red);
//                jButton3.setForeground(Color.red);
//                jButton4.setForeground(Color.red);
//                jButton5.setForeground(Color.red);
//                jButton6.setForeground(Color.red);
//                jButton7.setForeground(Color.red);
//                jButton8.setForeground(Color.red);
//                jButton9.setForeground(Color.red);
//                jButton10.setForeground(Color.red);
//                jButton11.setForeground(Color.red);
//                jButton12.setForeground(Color.red);
//                jButton13.setForeground(Color.red);
//                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                simbolo="+";
//                botones(suma());
//                System.out.println("suma");
//                System.out.println(contsum);
//                break;
//            case 1:
//                contrest++;
//                jButton1.setForeground(Color.green);
//                jButton2.setForeground(Color.green);
//                jButton3.setForeground(Color.green);
//                jButton4.setForeground(Color.green);
//                jButton5.setForeground(Color.green);
//                jButton6.setForeground(Color.green);
//                jButton7.setForeground(Color.green);
//                jButton8.setForeground(Color.green);
//                jButton9.setForeground(Color.green);
//                jButton10.setForeground(Color.green);
//                jButton11.setForeground(Color.green);
//                jButton12.setForeground(Color.green);
//                jButton13.setForeground(Color.green);
//                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                simbolo="-";
//                botones(resta());
//                System.out.println("resta");
//                System.out.println(contrest);
//                break;
//            case 2:
//                contmult++;
//                jButton1.setForeground(Color.blue);
//                jButton2.setForeground(Color.blue);
//                jButton3.setForeground(Color.blue);
//                jButton4.setForeground(Color.blue);
//                jButton5.setForeground(Color.blue);
//                jButton6.setForeground(Color.blue);
//                jButton7.setForeground(Color.blue);
//                jButton8.setForeground(Color.blue);
//                jButton9.setForeground(Color.blue);
//                jButton10.setForeground(Color.blue);
//                jButton11.setForeground(Color.blue);
//                jButton12.setForeground(Color.blue);
//                jButton13.setForeground(Color.blue);
//                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                simbolo="X";
//                botones(multiplicacion());
//                System.out.println("multi");
//                System.out.println(contmult);
//                break;
//            case 3:
//                contdiv++;
//                jButton1.setForeground(Color.gray);
//                jButton2.setForeground(Color.gray);
//                jButton3.setForeground(Color.gray);
//                jButton4.setForeground(Color.gray);
//                jButton5.setForeground(Color.gray);
//                jButton6.setForeground(Color.gray);
//                jButton7.setForeground(Color.gray);
//                jButton8.setForeground(Color.gray);
//                jButton9.setForeground(Color.gray);
//                jButton10.setForeground(Color.gray);
//                jButton11.setForeground(Color.gray);
//                jButton12.setForeground(Color.gray);
//                jButton13.setForeground(Color.gray);
//                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                simbolo="/";
//                botones(divicion());
//                System.out.println("divi");
//                System.out.println(contdiv);
//                break;
//            case -99:
//                break;
//            default:
//        }
//    }
//    
//    public void cambiasombras(){
//        jButton21.setText("Elemtos "+contaciertos+" de 20");
//        jButton29.setText("Elemtos "+conterrores+" de 20");
//        switch (contaciertos) {
//            case 1:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra1.png")));
//                break;
//            case 2:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra2.png")));
//                break;
//            case 3:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra3.png")));
//                break;
//            case 4:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra4.png")));
//                break;
//            case 5:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra5.png")));
//                break;
//            case 6:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra6.png")));
//                break;
//            case 7:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra7.png")));
//                break;
//            case 8:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra8.png")));
//                break;
//            case 9:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra9.png")));
//                break;
//            case 10:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra10.png")));
//                break;
//            case 11:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra11.png")));
//                break;
//            case 12:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra12.png")));
//                break;
//            case 13:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra13.png")));
//                break;
//            case 14:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra14.png")));
//                break;
//            case 15:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra15.png")));
//                break;
//            case 16:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra16.png")));
//                break;
//            case 17:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra17.png")));
//                break;
//            case 18:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra18.png")));
//                break;
//            case 19:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra19.png")));
//                break;
//            case 20:
//                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra20.png")));
//                break;
//            default:
//        }
//        switch (conterrores) {
//            case 1:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra1.png")));
//                break;
//            case 2:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra2.png")));
//                break;
//            case 3:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra3.png")));
//                break;
//            case 4:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra4.png")));
//                break;
//            case 5:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra5.png")));
//                break;
//            case 6:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra6.png")));
//                break;
//            case 7:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra7.png")));
//                break;
//            case 8:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra8.png")));
//                break;
//            case 9:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra9.png")));
//                break;
//            case 10:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra10.png")));
//                break;
//            case 11:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra11.png")));
//                break;
//            case 12:
//                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra12.png")));
//                break;
//            case 13:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra13.png")));
//                break;
//            case 14:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra14.png")));
//                break;
//            case 15:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra15.png")));
//                break;
//            case 16:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra16.png")));
//                break;
//            case 17:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra17.png")));
//                break;
//            case 18:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra18.png")));
//                break;
//            case 19:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra19.png")));
//                break;
//            case 20:
//                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra20.png")));
//                break;
//            default:
//        }
//        switch (simbolo) {
//            case "+":
//                switch (contsumacierto) {
//                    case 1:
//                        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        break;
//                    case 2:
//                        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    case 3:
//                        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    case 4:
//                        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    case 5:
//                        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            case "-":
//                switch (contrestacierto) {
//                    case 1:
//                        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        break;
//                    case 2:
//                        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    case 3:
//                        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    case 4:
//                        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    case 5:
//                        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            case "X":
//                switch (contmultacierto) {
//                    case 1:
//                        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        break;
//                    case 2:
//                        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    case 3:
//                        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    case 4:
//                        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    case 5:
//                        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            case "/":
//                 switch (contdivacierto) {
//                    case 1:
//                        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        break;
//                    case 2:
//                        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    case 3:
//                        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    case 4:
//                        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    case 5:
//                        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            default:
//                throw new AssertionError();
//        }
//        
//        switch (simbolo) {
//            case "+":
//                switch (contsumerror) {
//                    case 1:
//                        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        break;
//                    case 2:
//                        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    case 3:
//                        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    case 4:
//                        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    case 5:
//                        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            case "-":
//                switch (contresterror) {
//                    case 1:
//                        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        break;
//                    case 2:
//                        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    case 3:
//                        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    case 4:
//                        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    case 5:
//                        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            case "X":
//                switch (contmulterror) {
//                    case 1:
//                        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        break;
//                    case 2:
//                        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    case 3:
//                        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    case 4:
//                        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    case 5:
//                        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            case "/":
//                 switch (contdiverror) {
//                    case 1:
//                        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        break;
//                    case 2:
//                        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    case 3:
//                        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    case 4:
//                        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    case 5:
//                        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
//                        
//                        break;
//                    default:
//                }
//                break;
//            default:
//        }
//    }
//    
//    public void tiempoparaatras(){
//        contadorSegundos=5;
//    time = new Timer(1000, new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e){
//        jButton13.setText(":5");
//        contadorSegundos--;
//        jButton13.setText(contadorSegundos+"");
//            if (contadorSegundos==0) {
//                conterrores++;
//                switch (botoncontenedor) {
//                    case 0:
////                        jButton4.setForeground(Color.pink);
//                        jButton4.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 1:
////                        jButton5.setForeground(Color.pink);
//                        jButton5.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 2:
////                        jButton6.setForeground(Color.pink);
//                        jButton6.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 3:
////                        jButton7.setForeground(Color.pink);
//                        jButton7.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 4:
////                        jButton8.setForeground(Color.pink);
//                        jButton8.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 5:
////                        jButton9.setForeground(Color.pink);
//                        jButton9.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 6:
////                        jButton10.setForeground(Color.pink);
//                        jButton10.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 7:
////                        jButton11.setForeground(Color.pink);
//                        jButton11.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    case 8:
////                        jButton12.setForeground(Color.pink);
//                        jButton12.setBackground(new java.awt.Color(255, 0, 255));
//                        break;
//                    default:
//                        throw new AssertionError();
//                }
//                time.stop();
//                quitaacciones();
//                repaint();
//                 switch (simbolo) {
//                    case "+":
//                        contsumerror++;
//                        break;
//                    case "-":
//                        contresterror++;
//                        break;
//                    case "X":
//                        contmulterror++;
//                        break;
//                    case "/":
//                        contdiverror++;
//                        break;
//                    default:
//                }
//                 cambiasombras();
//                 JOptionPane.showMessageDialog(null, "tiempo agotado");
//                 quitamarcas();
//                 agregaacciones();
//                repaint();
//                 contadorSegundos=5;
//                 principia();
//                 tiempoparaatras();
//                 System.out.println("olakase");
//            }
//        }
//    
//    });
//    time.start();
//    }
//    
//    public void quitaacciones(){
//        jButton4.removeNotify();
//        jButton5.removeNotify();
//        jButton6.removeNotify();
//        jButton7.removeNotify();
//        jButton8.removeNotify();
//        jButton9.removeNotify();
//        jButton10.removeNotify();
//        jButton11.removeNotify();
//        jButton12.removeNotify();
//    }
//    
//    public void agregaacciones(){
//        jButton4.addNotify();
//        jButton5.addNotify();
//        jButton6.addNotify();
//        jButton7.addNotify();
//        jButton8.addNotify();
//        jButton9.addNotify();
//        jButton10.addNotify();
//        jButton11.addNotify();
//        jButton12.addNotify();
//    }
//    
//    public void quitamarcas(){
//    jButton4.setBackground(new java.awt.Color(240, 240, 240));
//    jButton5.setBackground(new java.awt.Color(240, 240, 240));
//    jButton6.setBackground(new java.awt.Color(240, 240, 240));
//    jButton7.setBackground(new java.awt.Color(240, 240, 240));
//    jButton8.setBackground(new java.awt.Color(240, 240, 240));
//    jButton9.setBackground(new java.awt.Color(240, 240, 240));
//    jButton10.setBackground(new java.awt.Color(240, 240, 240));
//    jButton11.setBackground(new java.awt.Color(240, 240, 240));
//    jButton12.setBackground(new java.awt.Color(240, 240, 240));
//    }
//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton30 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton30.setText("Dificultad intermedia");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Nivel");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem3.setText("Instrucciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Simbología");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Acerca de ...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton30)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton30)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        acercade acerca = new acercade(this, rootPaneCheckingEnabled);
        acerca.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        instrucciones instru = new instrucciones(this, rootPaneCheckingEnabled);
        instru.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        simbologia simbo = new simbologia(this, rootPaneCheckingEnabled);
        simbo.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        dificultadintermedia media = new dificultadintermedia(this, rootPaneCheckingEnabled);
        media.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton30ActionPerformed

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
    private javax.swing.JButton jButton30;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables

    private String IntegerToString(int temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
