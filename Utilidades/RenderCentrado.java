package Utilidades;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

  public class RenderCentrado extends DefaultTableCellRenderer {
      
    public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
             // Llamada a clase padre para no perder el aspecto
             super.getTableCellRendererComponent (table, value,isSelected,hasFocus,row,column);
             setToolTipText(value+"");
             if(isSelected){
                 System.out.println(this.getBackground());
             }
             setHorizontalAlignment(SwingConstants.CENTER);// metodo de JLabel
             return this;
        }
    }