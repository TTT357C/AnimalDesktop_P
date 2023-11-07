/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskop_animal;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utente
 */
public class DeskopAnimal {

    /**
     * @param args the command line arguments
     */
    public static NewJFrame a;
    public static NewJFrame_1 messaggio;
    public static int x_now;
    public static int y_now;
    public static int num;
    public static int num_2=9;
    public static int width;
    public static int height;
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        a=new NewJFrame();
        a.setVisible(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DeskopAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) screenSize.getWidth();
        height = (int)screenSize.getHeight();
        
        a.setLocation(width-1000, 300);
        x_now=width-1000;
        y_now=300;
        cammina_s();
        
    }
    //150 milliseconds speed=15
    //
    public static void cammina_s() {
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {@Override public void run() {cammina();}}, 0, 400, TimeUnit.MILLISECONDS);
    }
    
    public static void cammina(){
            Random random = new Random();
            int speed=random.nextInt(10)+25;
            switch(random.nextInt(20)+1){
                case 1: 
                    num_2=(random.nextInt(11)+1);
                   break;
                
                default:
                    break;
            }
            int bordx=300;
            int bordy=200;
            //controllo bordi
            if(x_now<bordx){
                num_2=4;
            }
            if(y_now<bordy){
                num_2=3;
            }
            if(x_now>width-bordx){
                num_2=1;
            }
            if(y_now>height-bordy){
                num_2=2;
            }
            if(x_now<bordx && y_now<bordy){
                num_2=8;
            }
            if(y_now<bordy && x_now>width-bordx){
                num_2=7;
            }
            if(y_now>height-bordy && x_now<bordx){
                num_2=5;
            }
            if(y_now>height-bordy && x_now>width-bordx){
                num_2=6;
            }
            switch(num_2){
                case 1: 
                  
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m.gif")));
                  x_now=x_now-speed;
                  a.setLocation(x_now,y_now);  
                    System.out.println("1");
                    break
                    ;
                case 2: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m_u.gif")));
                  y_now=y_now-speed;
                  a.setLocation(x_now,y_now);
                  System.out.println("2");
                  break
                    ;
                case 3: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m.gif")));
                  y_now=y_now+speed;
                  a.setLocation(x_now,y_now);    
                  System.out.println("3");
                  break
                    ;
                case 4: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m2.gif")));
                  x_now=x_now+speed;
                  a.setLocation(x_now,y_now);    
                  System.out.println("4");
                  break
                    ;
                case 5: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m_u2.gif")));
                  y_now=y_now-speed;
                  x_now=x_now+speed;
                  a.setLocation(x_now,y_now);   
                  System.out.println("5");
                  break
                    ;
                case 6: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m_u.gif")));
                  y_now=y_now-speed;
                  x_now=x_now-speed;
                  a.setLocation(x_now,y_now);  
                  System.out.println("6");
                  break
                    ;
                case 7: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m.gif")));
                  y_now=y_now+speed;
                  x_now=x_now-speed;
                  a.setLocation(x_now,y_now);  
                  System.out.println("7");
                  break
                    ;
                case 8: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_m2.gif")));
                  y_now=y_now+speed;
                  x_now=x_now+speed;
                  a.setLocation(x_now,y_now);    
                  System.out.println("8");
                  break
                    ;
                case 9: 
                  a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_g.gif")));
                  messaggio=new NewJFrame_1();
                  messaggio.setLocation(x_now-150, y_now-100);
                  messaggio.setVisible(true);
                  System.out.println("9");
                  num_2=10;
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DeskopAnimal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    messaggio.dispose();
                  break
                    ;
                default:
                    a.jLabel1.setIcon(new javax.swing.ImageIcon(DeskopAnimal.class.getResource("/Images/a_g.gif")));
                break;
            }
            
            
    }
    
}
