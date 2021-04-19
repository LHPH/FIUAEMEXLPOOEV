package Edu;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel2 extends JPanel {
    private JButton jButton1 = new JButton();

    public Panel2() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JPanel jbInit() {
        this.setLayout( null );
        jButton1.setText("jButton1");
        jButton1.setBounds(new Rectangle(280, 225, 95, 30));
        this.add(jButton1, null);
        return this;
    }
}
