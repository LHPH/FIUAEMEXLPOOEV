package Edu;

import java.awt.Dimension;

import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame2 extends JFrame {
    
    private JLabel jLabel1; 

    public Frame2() {
        try {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cargar();
            jbInit();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,"Error Fatal");
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(682, 485));
        jLabel1.setBounds(new Rectangle(75, 5, 580, 435));
        this.getContentPane().add(jLabel1, null);
    }
    
    public static void main(String []arg){
        Frame2 a = new Frame2();
        a.setVisible(true);
    }
    
    public  void cargar(){ 
            File file = new File("2.png");
            file.exists();
            if(file.exists()==true){
                jLabel1= new JLabel(new ImageIcon("1.png"));
            }
            else{
                 JOptionPane.showMessageDialog(this,"Imagen No Encontrada");
                 URL url1 = getClass().getClassLoader().getResource("1.png");
                 jLabel1 = new JLabel(new ImageIcon(url1));
            }
        }
    }
