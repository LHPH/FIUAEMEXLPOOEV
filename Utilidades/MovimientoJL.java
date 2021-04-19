package Utilidades;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import java.util.ArrayList;

import javax.swing.JLabel;

public class MovimientoJL implements MouseMotionListener,MouseListener {
    private int [] coorXOrig;
    private int [] coorYOrig;
    private int coorX;
    private int coorY;
    private int width;
    private int height;
    private ArrayList<JLabel> lista = new ArrayList<JLabel>();
    private ArrayList<JLabel> lista2 = new ArrayList<JLabel>();
    int ind=0;
    int ind2=0;
    
    
    public MovimientoJL() {
        super();
    }
    
    public void add(JLabel etiqueta){
        lista.add(etiqueta);
    }
    
    public void add2(JLabel etiqueta2){
        lista2.add(etiqueta2);   
    }
    
    public void init(){
        coorXOrig=new int[lista.size()];
        coorYOrig=new int[lista.size()];
        for(int i=0;i<lista.size();i++){
            coorXOrig[i]=lista.get(i).getX();
            coorYOrig[i]=lista.get(i).getY();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int i=0;
        System.out.println("sss");
       
            for(i=0;i<lista.size();i++){
                if(lista.get(i)==(JLabel)e.getComponent()){
                    break;
                }
            }
            this.width=lista.get(i).getWidth();
            this.height=lista.get(i).getHeight();
            this.coorX=lista.get(i).getX();
            this.coorY=lista.get(i).getY();
            lista.get(i).setBounds(this.coorX+e.getX()-this.width/2,this.coorY+e.getY()-this.height/2,this.width,this.height);
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)==(JLabel) e.getComponent()){
                ind=i;
                break;
            }
        }
        this.coorX=lista.get(ind).getX();
        this.coorY=lista.get(ind).getY();
        this.width=lista.get(ind).getWidth();
        this.height=lista.get(ind).getHeight();
        lista.get(ind).setBounds(this.coorX,this.coorY, width, height);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lista.get(ind).setBounds(new Rectangle(this.coorX,this.coorY,this.width,this.height));
        if(comprobar()==true){
        
            System.out.println("Exito");
            lista.get(ind).setVisible(false);
        }
        else{
            lista.get(ind).setBounds(new Rectangle(this.coorXOrig[ind],this.coorYOrig[ind],this.width,this.height));
        }
    }
    
    private boolean comprobar(){
        boolean resp=false;
        for(int i=0;i<lista2.size();i++){
            if(lista.get(ind).getX()==lista2.get(i).getX() ||  lista.get(ind).getY()==lista2.get(i).getY() ){
                ind2=i;
                resp=true;
                break;
            }
        }
        return resp;
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
