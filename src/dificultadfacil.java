
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
public class dificultadfacil extends javax.swing.JDialog {
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
     * Creates new form dificultadfacil
     */
    public dificultadfacil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        quitaacciones();
    }

     public class iconosangre implements Icon{
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("sangre.png")).getImage();
        g.drawImage(image, x, y, c);
    }
 
    @Override
    public int getIconWidth() {
        return 50;
    }
 
    @Override
    public int getIconHeight() {
        return 50;
    }
 
}
    
    public class iconotierra implements Icon{
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("tierra.png")).getImage();
        g.drawImage(image, x, y, c);
    }
 
    @Override
    public int getIconWidth() {
        return 50;
    }
 
    @Override
    public int getIconHeight() {
        return 50;
    }
 
}
    
    public class iconoagua implements Icon{
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("agua.png")).getImage();
        g.drawImage(image, x, y, c);
    }
 
    @Override
    public int getIconWidth() {
        return 50;
    }
 
    @Override
    public int getIconHeight() {
        return 50;
    }
 
}
    
    public class iconofuego implements Icon{
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("fuego.png")).getImage();
        g.drawImage(image, x, y, c);
    }
 
    @Override
    public int getIconWidth() {
        return 50;
    }
 
    @Override
    public int getIconHeight() {
        return 50;
    }
 
}
    
    public void botones(int respuesta){
        int alazar[]=new int [4],selectorbotones,exp,repetidos[]=new int [4],
                temp=0,arregloboton[]=new int [4],i=0,contadorrep=0,fnl=0;
        String numazar="",temp2="";
        limite1=respuesta+10;
        limite2=respuesta-10;
            //(int)(Math.random()*(HASTA-DESDE+1)+DESDE);
            //asigno lugal aleatorio dentro del array para la respuesta
            exp=(int)(Math.random()*(3-0+1)+0);
            botoncontenedor=exp;
            arregloboton[exp]=respuesta;
            do {
                if (respuesta%2==0) {
                    exp=(int)(Math.random()*(limite1-limite2+1)+limite2);
                    if (exp%2==0) {
                        
                    } else {
                        exp=0;
                    }
                } else {
                    exp=(int)(Math.random()*(limite1-limite2+1)+limite2);
                    if (exp%2!=0) {
                        
                    } else {
                        exp=0;
                    }
                }
                for (int j = 0; j < arregloboton.length; j++) {
                    if (arregloboton[j]!=exp) {
                        contadorrep++;
                    }
                }
                if (arregloboton[i]!=respuesta&&contadorrep==4&&arregloboton[i]==0) {
                    arregloboton[i]=exp;
                    fnl++;
                }
            i++;
                if (i==4) {
                    i=0;
                }
            contadorrep=0;
        } while (fnl!=3);
            jButton1.setText(Integer.toString(operador1));
            jButton2.setText(simbolo);
            jButton3.setText(Integer.toString(operador2));
            jButton4.setText(Integer.toString(arregloboton[0]));
            jButton5.setText(Integer.toString(arregloboton[1]));
            jButton7.setText(Integer.toString(arregloboton[2]));
            jButton8.setText(Integer.toString(arregloboton[3]));
            
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
        
        //assigno bandera para quitar operaciones completadas
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
        } while (selector2==-99);
        
        switch (selector2) {
            case 0:
                contsum++;
                jButton1.setForeground(Color.red);
                jButton2.setForeground(Color.red);
                jButton3.setForeground(Color.red);
                jButton4.setForeground(Color.red);
                jButton5.setForeground(Color.red);
                jButton7.setForeground(Color.red);
                jButton8.setForeground(Color.red);
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
                jButton7.setForeground(Color.green);
                jButton8.setForeground(Color.green);
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
                jButton7.setForeground(Color.blue);
                jButton8.setForeground(Color.blue);
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
                jButton7.setForeground(Color.gray);
                jButton8.setForeground(Color.gray);
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
        }
    }
    
    public void cambiasombras(){
        jButton21.setText("Elemtos "+contaciertos+" de 20");
        jButton29.setText("Elemtos "+conterrores+" de 20");
        switch (contaciertos) {
            case 1:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra1.png")));
                break;
            case 2:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra2.png")));
                break;
            case 3:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra3.png")));
                break;
            case 4:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra4.png")));
                break;
            case 5:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra5.png")));
                break;
            case 6:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra6.png")));
                break;
            case 7:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra7.png")));
                break;
            case 8:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra8.png")));
                break;
            case 9:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra9.png")));
                break;
            case 10:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra10.png")));
                break;
            case 11:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra11.png")));
                break;
            case 12:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra12.png")));
                break;
            case 13:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra13.png")));
                break;
            case 14:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra14.png")));
                break;
            case 15:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra15.png")));
                break;
            case 16:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra16.png")));
                break;
            case 17:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra17.png")));
                break;
            case 18:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra18.png")));
                break;
            case 19:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra19.png")));
                break;
            case 20:
                jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra20.png")));
                break;
            default:
        }
        switch (conterrores) {
            case 1:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra1.png")));
                break;
            case 2:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra2.png")));
                break;
            case 3:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra3.png")));
                break;
            case 4:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra4.png")));
                break;
            case 5:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra5.png")));
                break;
            case 6:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra6.png")));
                break;
            case 7:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra7.png")));
                break;
            case 8:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra8.png")));
                break;
            case 9:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra9.png")));
                break;
            case 10:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra10.png")));
                break;
            case 11:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra11.png")));
                break;
            case 12:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra12.png")));
                break;
            case 13:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra13.png")));
                break;
            case 14:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra14.png")));
                break;
            case 15:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra15.png")));
                break;
            case 16:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra16.png")));
                break;
            case 17:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra17.png")));
                break;
            case 18:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra18.png")));
                break;
            case 19:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra19.png")));
                break;
            case 20:
                jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra20.png")));
                break;
            default:
        }
        switch (simbolo) {
            case "+":
                switch (contsumacierto) {
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
                }
                break;
            case "-":
                switch (contrestacierto) {
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
                }
                break;
            case "X":
                switch (contmultacierto) {
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
                }
                break;
            case "/":
                 switch (contdivacierto) {
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
                }
                break;
            default:
                throw new AssertionError();
        }
        
        switch (simbolo) {
            case "+":
                switch (contsumerror) {
                    case 1:
                        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        break;
                    case 2:
                        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    case 3:
                        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    case 4:
                        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    case 5:
                        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sangre.png")));
                        
                        break;
                    default:
                }
                break;
            case "-":
                switch (contresterror) {
                    case 1:
                        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        break;
                    case 2:
                        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    case 3:
                        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    case 4:
                        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    case 5:
                        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tierra.png")));
                        
                        break;
                    default:
                }
                break;
            case "X":
                switch (contmulterror) {
                    case 1:
                        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        break;
                    case 2:
                        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    case 3:
                        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    case 4:
                        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    case 5:
                        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.png")));
                        
                        break;
                    default:
                }
                break;
            case "/":
                 switch (contdiverror) {
                    case 1:
                        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        break;
                    case 2:
                        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    case 3:
                        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    case 4:
                        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    case 5:
                        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fuego.png")));
                        
                        break;
                    default:
                }
                break;
            default:
        }
    }
    
    public void tiempoparaatras(){
        contadorSegundos=5;
    time = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        jButton13.setText(":5");
        contadorSegundos--;
        jButton13.setText(contadorSegundos+"");
            if (contadorSegundos==0) {
                conterrores++;
                switch (botoncontenedor) {
                    case 0:
//                        jButton4.setForeground(Color.pink);
                        jButton4.setBackground(new java.awt.Color(255, 0, 255));
                        break;
                    case 1:
//                        jButton5.setForeground(Color.pink);
                        jButton5.setBackground(new java.awt.Color(255, 0, 255));
                        break;
                    case 2:
//                        jButton7.setForeground(Color.pink);
                        jButton7.setBackground(new java.awt.Color(255, 0, 255));
                        break;
                    case 3:
//                        jButton8.setForeground(Color.pink);
                        jButton8.setBackground(new java.awt.Color(255, 0, 255));
                        break;
                    default:
                }
                time.stop();
                quitaacciones();
                repaint();
                 switch (simbolo) {
                    case "+":
                        contsumerror++;
                        break;
                    case "-":
                        contresterror++;
                        break;
                    case "X":
                        contmulterror++;
                        break;
                    case "/":
                        contdiverror++;
                        break;
                    default:
                }
                 cambiasombras();
                 switch (simbolo) {
                case "+":
                    iconosangre sang = new iconosangre();
                    JOptionPane.showMessageDialog(null, "¡Tiempo agotado pierdes sangre!", "Acierto", JOptionPane.DEFAULT_OPTION, sang);
                    
                break;
                case "-":
                    iconotierra tierr = new iconotierra();
                    JOptionPane.showMessageDialog(null, "¡Tiempo agotado pierdes tierra!", "Acierto", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                    iconoagua agu = new iconoagua();
                    JOptionPane.showMessageDialog(null, "¡Tiempo agotado pierdes agua!", "Acierto", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                    iconofuego fueg = new iconofuego();
                    JOptionPane.showMessageDialog(null, "¡Tiempo agotado pierdes fuego!", "Acierto", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
                 quitamarcas();
                 agregaacciones();
                repaint();
                 contadorSegundos=5;
                 if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
                 System.out.println("olakase");
            }
        }
    
    });
    time.start();
    }
    
    public void quitaacciones(){
        jButton4.removeNotify();
        jButton5.removeNotify();
        jButton7.removeNotify();
        jButton8.removeNotify();
    }
    
    public void agregaacciones(){
        jButton4.addNotify();
        jButton5.addNotify();
        jButton7.addNotify();
        jButton8.addNotify();
    }
    
    public void quitamarcas(){
    jButton4.setBackground(new java.awt.Color(240, 240, 240));
    jButton5.setBackground(new java.awt.Color(240, 240, 240));
    jButton7.setBackground(new java.awt.Color(240, 240, 240));
    jButton8.setBackground(new java.awt.Color(240, 240, 240));
    }
    
    public void findeljuego(){
        
        
        if (contaciertos>conterrores) {
            if (contaciertos==20) {
            JOptionPane.showMessageDialog(null, "¡Victoria!\n\nfantastico no comestiste un solo error");
        }else{
            JOptionPane.showMessageDialog(null, "¡Victoria!\n\nAciertos\nSuma: "+contsumacierto+"\nResta: "+contrestacierto+"\nMultiplicación: "+contmultacierto+"\nDivición: "+contdivacierto+"\n\nErrores\nSuma: "+contsumerror+"\nResta: "+contresterror+"\nMultiplicación: "+contmulterror+"\nDivición: "+contdiverror);
            }
        }
        if (contaciertos<conterrores) {
            if (conterrores==20) {
            JOptionPane.showMessageDialog(null, "¡Derrota!\n\npatetico no acertaste ni una sola");
        }else{
            JOptionPane.showMessageDialog(null, "¡Derrota!\n\nAciertos\nSuma: "+contsumacierto+"\nResta: "+contrestacierto+"\nMultiplicación: "+contmultacierto+"\nDivición: "+contdivacierto+"\n\nErrores\nSuma: "+contsumerror+"\nResta: "+contresterror+"\nMultiplicación: "+contmulterror+"\nDivición: "+contdiverror);
            }
        }
        if (contaciertos==conterrores) {
            JOptionPane.showMessageDialog(null, "¡Empate!\n\ncasi victoria|casi derrota\n\nAciertos\nSuma: "+contsumacierto+"\nResta: "+contrestacierto+"\nMultiplicación: "+contmultacierto+"\nDivición: "+contdivacierto+"\n\nErrores\nSuma: "+contsumerror+"\nResta: "+contresterror+"\nMultiplicación: "+contmulterror+"\nDivición: "+contdiverror);
        }
    JOptionPane.showMessageDialog(null, "Fin del juego");
    quitaacciones();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton57 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("Iniciar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton21.setText("Eelementos 0 de 20.");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jugador");

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton52.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Elemento");

        jButton47.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ignorancia");

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton59.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tiempo restante");

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombratierra.png"))); // NOI18N

        jButton55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombraagua.png"))); // NOI18N

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrasangre.png"))); // NOI18N

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombrafuego.png"))); // NOI18N

        jButton29.setText("Eelementos 0 de 20.");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton14)))
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        agregaacciones();
        principia();
        tiempoparaatras();
        jButton14.removeNotify();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        time.stop();
        if (jButton4.getText().equals(Integer.toString(respuesta))) {
            contaciertos++;
            switch (simbolo) {
                case "+":
                contsumacierto++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas sangre!", "Acierto", JOptionPane.DEFAULT_OPTION, sang);

                break;
                case "-":
                contrestacierto++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas tierra!", "Acierto", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmultacierto++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas agua!", "Acierto", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdivacierto++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas fuego!", "Acierto", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }else{
            conterrores++;
            switch (simbolo) {
                case "+":
                contsumerror++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes sangre!", "Error", JOptionPane.DEFAULT_OPTION, sang);
                break;
                case "-":
                contresterror++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes tierra!", "Error", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmulterror++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes agua!", "Error", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdiverror++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes fuego!", "Error", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        time.stop();
        if (jButton4.getText().equals(Integer.toString(respuesta))) {
            contaciertos++;
            switch (simbolo) {
                case "+":
                contsumacierto++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas sangre!", "Acierto", JOptionPane.DEFAULT_OPTION, sang);

                break;
                case "-":
                contrestacierto++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas tierra!", "Acierto", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmultacierto++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas agua!", "Acierto", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdivacierto++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas fuego!", "Acierto", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }else{
            conterrores++;
            switch (simbolo) {
                case "+":
                contsumerror++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes sangre!", "Error", JOptionPane.DEFAULT_OPTION, sang);
                break;
                case "-":
                contresterror++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes tierra!", "Error", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmulterror++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes agua!", "Error", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdiverror++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes fuego!", "Error", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        time.stop();
        if (jButton4.getText().equals(Integer.toString(respuesta))) {
            contaciertos++;
            switch (simbolo) {
                case "+":
                contsumacierto++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas sangre!", "Acierto", JOptionPane.DEFAULT_OPTION, sang);

                break;
                case "-":
                contrestacierto++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas tierra!", "Acierto", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmultacierto++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas agua!", "Acierto", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdivacierto++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas fuego!", "Acierto", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }else{
            conterrores++;
            switch (simbolo) {
                case "+":
                contsumerror++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes sangre!", "Error", JOptionPane.DEFAULT_OPTION, sang);
                break;
                case "-":
                contresterror++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes tierra!", "Error", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmulterror++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes agua!", "Error", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdiverror++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes fuego!", "Error", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        time.stop();
        if (jButton4.getText().equals(Integer.toString(respuesta))) {
            contaciertos++;
            switch (simbolo) {
                case "+":
                contsumacierto++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas sangre!", "Acierto", JOptionPane.DEFAULT_OPTION, sang);

                break;
                case "-":
                contrestacierto++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas tierra!", "Acierto", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmultacierto++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas agua!", "Acierto", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdivacierto++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta ganas fuego!", "Acierto", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }else{
            conterrores++;
            switch (simbolo) {
                case "+":
                contsumerror++;
                cambiasombras();
                iconosangre sang = new iconosangre();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes sangre!", "Error", JOptionPane.DEFAULT_OPTION, sang);
                break;
                case "-":
                contresterror++;
                cambiasombras();
                iconotierra tierr = new iconotierra();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes tierra!", "Error", JOptionPane.DEFAULT_OPTION, tierr);
                break;
                case "X":
                contmulterror++;
                cambiasombras();
                iconoagua agu = new iconoagua();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes agua!", "Error", JOptionPane.DEFAULT_OPTION, agu);
                break;
                case "/":
                contdiverror++;
                cambiasombras();
                iconofuego fueg = new iconofuego();
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta pierdes fuego!", "Error", JOptionPane.DEFAULT_OPTION, fueg);
                break;
                default:
            }
            if (contaciertos+conterrores==20) {
                findeljuego();
            } else {
                principia();
                tiempoparaatras();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(dificultadfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dificultadfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dificultadfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dificultadfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dificultadfacil dialog = new dificultadfacil(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
