package Edu;

import Utilidades.MovimientoJL;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Rectangle;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;
import java.awt.Cursor;
import java.awt.MouseInfo;

import java.awt.Point;

import java.util.List;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Dialog2 extends JDialog {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    int x,y,weigh,hight,xo,yo;

    public Dialog2() {
        this(null, "", false);
    }

    public Dialog2(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(684, 383));
        this.getContentPane().setLayout( null );
        MovimientoJL mov = new MovimientoJL();
        mov.add(jLabel1);
        mov.add2(jLabel2);
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(new Rectangle(15, 25, 100, 80));
        jLabel1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
       /* jLabel1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    jLabel1_mousePressed(e);
                }

                public void mouseReleased(MouseEvent e) {
                    jLabel1_mouseReleased(e);
                }
            });
        jLabel1.addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    jLabel1_mouseDragged(e);
                }
            });*/
        jLabel1.addMouseListener(mov);
        jLabel1.addMouseMotionListener(mov);
        jLabel2.setText("jLabel2");
        jLabel2.setBounds(new Rectangle(235, 20, 100, 80));
        jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        mov.init();
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jLabel1_mouseDragged(MouseEvent e) {
        if(e.MOUSE_PRESSED==MouseEvent.MOUSE_PRESSED){
            this.weigh=jLabel1.getWidth();
            this.hight=jLabel1.getHeight();
            this.x=jLabel1.getX();
            this.y=jLabel1.getY();
            jLabel1.setBounds(this.x+e.getX()-this.weigh/2,this.y+e.getY()-this.hight/2,this.weigh,this.hight);
            //System.out.println("x: "+(this.x+e.getX()-this.weigh/2)+" y: "+(this.y+e.getY()-this.hight/2));
        }
       
       /* int x1=0,y1=0;
        Point p =MouseInfo.getPointerInfo().getLocation();
        this.weigh=jLabel1.getWidth();
        this.hight=jLabel1.getHeight();
        if(p.x<=this.weigh){
            jLabel1.setBounds(new Rectangle(p.x,p.y,this.weigh,this.hight));
            System.out.println("sss");
        }*/
    }

    private void jLabel1_mousePressed(MouseEvent e) {
        this.weigh=jLabel1.getWidth();
        this.hight=jLabel1.getHeight();
        this.x=jLabel1.getX();
        this.xo=jLabel1.getX();
        this.yo=jLabel1.getY();
        this.y=jLabel1.getY();
        jLabel1.setBounds(this.x,this.y,this.weigh,this.hight);
        
    }

    private void jLabel1_mouseReleased(MouseEvent e) {
        jLabel1.updateUI();
        if(e.MOUSE_RELEASED==MouseEvent.MOUSE_RELEASED){
            //.setBounds(new Rectangle(this.x,this.y,this.weigh,this.hight));
            if(jLabel1.getX()==jLabel2.getX() || jLabel1.getY()==jLabel2.getY()){
                System.out.println("Exito");
            }
            else{
                jLabel1.setBounds(new Rectangle(this.xo,this.yo,this.weigh,this.hight));
            }
        }
        
    }
    
    public static void main(String [] arg){
        Dialog2 a = new Dialog2();
        a.setVisible(true);
    }
}
