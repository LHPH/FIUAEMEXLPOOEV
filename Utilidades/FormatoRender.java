package Utilidades;

import java.awt.Color;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoRender extends DefaultTableCellRenderer{
    public static final int DEFAULT=0;
    public static final int CENTRADO=1;
    protected static int POSICION=0;
    protected static Color COLOR_FILA_PAR=Color.white;
    protected static Color COLOR_TEXTO_PAR=Color.black;
    protected static Color COLOR_FILA_IMPAR=Color.white;
    protected static Color COLOR_TEXTO_IMPAR=Color.black;
    protected static Color COLOR_FILA_SELECCIONADA=new Color(184,207,229);
    protected static Color COLOR_TEXTO_SELECCIONADO=Color.black;
    
    
    public FormatoRender(){
        
    }
    
    public FormatoRender(int posText,Color colorText,Color colorFila,Color colorSelec,Color colorTextSelec,Color colorText2,Color colorFila2 ){
        POSICION=posText;
        COLOR_TEXTO_PAR=colorText;
        COLOR_FILA_PAR=colorFila;
        COLOR_FILA_SELECCIONADA=colorSelec;
        COLOR_TEXTO_SELECCIONADO=colorTextSelec;
        COLOR_TEXTO_IMPAR=colorText2;
        COLOR_FILA_IMPAR=colorFila2;
    }
    
    public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
             // Llamada a clase padre para no perder el aspecto
             super.getTableCellRendererComponent (table, value,isSelected,hasFocus,row,column);
             setToolTipText(value+"");
            if(row%2==0 && isSelected==false){
                this.setForeground(COLOR_TEXTO_IMPAR);
                this.setBackground(COLOR_FILA_IMPAR);
                this.setOpaque(true);
            }
            else{
                if(isSelected==false){
                    this.setForeground(COLOR_TEXTO_PAR);
                    this.setBackground(COLOR_FILA_PAR);
                    this.setOpaque(true);
                }
            }
             if(POSICION==0){
                 setHorizontalAlignment(SwingConstants.LEFT);// metodo de JLabel
             }
             else{
                 setHorizontalAlignment(SwingConstants.CENTER);// metodo de JLabel
             }
             if(isSelected==true){
                 this.setForeground(COLOR_TEXTO_SELECCIONADO);
                 this.setBackground(COLOR_FILA_SELECCIONADA);
             }
             return this;
        }
}
