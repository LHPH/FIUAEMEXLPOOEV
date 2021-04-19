package Utilidades;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class ToolTipsComboBox extends BasicComboBoxRenderer {
    
    public String [] tooltips;
    
    public ToolTipsComboBox(String [] t){
        this.tooltips=t;
    }
    
    public Component getListCellRendererComponent(JList list, Object value,int index, boolean isSelected, boolean cellHasFocus) {
          if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
            
            if (-1 < index) {
              list.setToolTipText(tooltips[index]);
            }
            
          } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
          }
          setFont(list.getFont());
          setText((value == null) ? "" : value.toString());
          return this;
        }
    }
