package Edu;

import Utilidades.Cartas;
import Utilidades.ChangeCarta;

import java.awt.CardLayout;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel1 extends JPanel implements ChangeCarta {
    private JButton jButton1 = new JButton();
    Cartas cartas;
    Panel2 pan;

    public Panel1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JPanel jbInit() throws Exception {
        this.setLayout( null );
        jButton1.setText("jButton1");
        jButton1.setBounds(new Rectangle(70, 205, 120, 35));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        this.add(jButton1, null);
        return this;
    }

    @Override
    public void initConexion() {
    }

    @Override
    public void setCartas(Cartas cartas) {
         this.cartas=cartas;
     }

    @Override
    public void cambiarPanel(String nombPanel) {
        CardLayout cl = (CardLayout)(cartas.getLayout());
        cl.show(cartas,nombPanel);
    }

    @Override
    public void setPaneles(ArrayList paneles) {
        if( ((Panel2)paneles.get(0)) instanceof Panel2 ){
            this.pan=(Panel2)paneles.get(0);
            System.out.println("Exito");
        }
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        cambiarPanel("Panel2");
    }
}
