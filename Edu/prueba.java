package Edu;

import Utilidades.DocumentoJTF;

import Utilidades.FormatoRender;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Rectangle;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.BoundedRangeModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class prueba extends JFrame {

    private JTextField jTextField1 = new JTextField();
    private JTable jTable1 = new JTable();
    DefaultTableModel modelo;
    private JProgressBar jProgressBar1 = new JProgressBar();

    public prueba(){
        try{
            
            jbInit();
        }catch(Exception e){
            
        }
    }
    
    private void jbInit()throws Exception{
        modelo = new DefaultTableModel();
        modelo.addColumn("ssssss");
        modelo.addColumn("ssssssaa");
        Object[]a = {1,2};
        Object[]a1 = {3,4};
        modelo.addRow(a);
        modelo.addRow(a1);
        this.setSize(100, 100);
        this.setLayout(null);
        this.setSize(new Dimension(557, 277));
        jTextField1.setBounds(new Rectangle(100, 25, 130, 30));
        jTextField1.setDocument(new DocumentoJTF(3));
        jTable1.setBounds(new Rectangle(55, 105, 265, 120));
        jTable1.setModel(modelo);
        
        jProgressBar1.setBounds(new Rectangle(340, 50, 170, 25));
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setValue(0);
        jProgressBar1.setBackground(Color.blue);
        
        jTable1.setDefaultRenderer(Object.class, new FormatoRender(1,Color.black,Color.white,Color.blue,Color.white,Color.black,Color.pink));
        this.getContentPane().add(jProgressBar1, null);
        this.getContentPane().add(jTable1, null);
        this.getContentPane().add(jTextField1, null);
    }
    
    public static void main(String [] arg){
        prueba a = new prueba();
        a.setVisible(true);  
        a.cambiar();
        
    }
    
    public void cambiar(){
        int i=0;
        for(i=0;i<100;i++){
            jProgressBar1.setValue(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

