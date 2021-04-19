package Edu;

import Utilidades.Conector;

import java.awt.Cursor;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Cliente extends JFrame implements Runnable {
    private JButton jButton1 = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea aux;
    Conector con;

    public Cliente() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(506, 347));
        this.setTitle("Cliente");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        jButton1.setText("Conectar");
        jButton1.setBounds(new Rectangle(360, 15, 120, 25));

        jButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jButton1_mouseClicked(e);
                }
            });
        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",1,12));
        
        jTextArea2.setLineWrap(true);
        jTextArea2.setFont(new Font("Arial",1,12));


        jTextArea2.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    jTextArea2_keyPressed(e);
                }
            });
        
        refrescarjTextArea();
        
        jScrollPane1.setBounds(new Rectangle(25, 55, 440, 195));
        jScrollPane1.getViewport().add(jTextArea1, null);
        
        jScrollPane2.setBounds(new Rectangle(25, 265, 440, 35));
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        jScrollPane2.getViewport().add(jTextArea2, null);
        
        
        this.getContentPane().add(jScrollPane2, null);

        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(jButton1, null);
    }

    private void jTextArea2_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==e.VK_ENTER){
            String text = jTextArea1.getText();
            jTextArea1.setText(text+"\n"+jTextArea2.getText());
            con.enviarMSG(jTextArea2.getText());
            jTextArea2.setText(null);
            jTextArea2=null;
            jTextArea2=aux;
            refrescarjTextArea();
            jScrollPane2.getViewport().add(jTextArea2, null);
        }
    }
    
    public void refrescarjTextArea(){
        aux=new JTextArea();
        aux.setLineWrap(true);
        aux.setFont(new Font("Arial",1,12));
        aux.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    jTextArea2_keyPressed(e);
                }
            });
    }

    private void jButton1_mouseClicked(MouseEvent e) {
        con=new Conector("127.0.0.1");
        Thread hilo = new Thread(this,"Cliente");
        hilo.start();
        //con.enviarMSG("Cliente Conectado");
    }
    
    public static void main(String [] arg){
        try
        {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        Cliente s = new Cliente();
        s.setVisible(true);
    }

    @Override
    public void run() {
        String text="";
        while(con.getEstado("Cliente")==true){
            text=con.leerMSG();
            if(text!=null){
                jTextArea1.setText(jTextArea1.getText()+"\n"+text);
            }
        }
        
    }
}
