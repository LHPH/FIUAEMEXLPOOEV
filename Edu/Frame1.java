package Edu;

import java.awt.Dimension;
import Utilidades.Cartas;

import java.awt.CardLayout;

import java.awt.Rectangle;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame1 extends JFrame {
    Cartas cartas = new Cartas(50,50,100,300);
    Panel1 p = new Panel1();
    Panel2 p2 = new Panel2();
    
    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(708, 387));
        String []a = {"Panel1","Panel2"};
        JPanel [] b = new JPanel[2];
        b[0]=p;
        b[1]=p2;
        cartas.setLayout(new CardLayout());
        cartas.setBounds(new Rectangle(50, 50, 590, 300));
        cartas.agregar(a,b);
        p.setCartas(cartas);
        ArrayList ss= new ArrayList();
        ss.add(p2);
        p.setPaneles(ss);
        this.getContentPane().add(cartas);
    }
    
    public static void main(String [] arg){
        Frame1 f = new Frame1();
        f.setVisible(true);
    }
}
