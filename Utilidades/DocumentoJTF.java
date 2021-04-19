package Utilidades;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**Clase DocumentoJTF
 * clase que se usa con con proposito de personalizar
 * ciertas caracteristicas del JTextField como son
 * el que solo se puedan escribir Mayusculas dentro de el entre otros*/
public class DocumentoJTF extends PlainDocument{
    /**Constante que indica que el texto que debe aparecer en el JTextField debe estar en Mayusculas */
    public static final int Mayusculas=0;
    /**Constante que indica que el texto que debe aparecer en el JTextField debe estar en Minusculas */
    public static final int Minusculas=1;
    /**Constante que indica que el texto que debe aparecer debe estar limitado */
    public static final int Limitador=2;
    /**Constante que indica que el texto que debe aparecer en el JTextField no debe contener digitos */
    public static final int NoDigitos=3;
    /**Atributo que indica que tipo de opcion sera la que implementara la clase */
    private int Tipo=0;
    /**Atributo que indica cuantos caracteres deben escribirse como maximo */
    private int Limite=0;
    /**Atributo que tendra una referencia al JTextField al que se le aplique dichas caracteristicas */
    private JTextField editor;
    
    /**Constructor de la clase en el cual se indica que tipo de caracteristica debe implementarse
     * en el JTextField al que se le aplique dicha caracteristica
     * @param tipo el tipo de caracteristica sobre el texto que aparecera en el JTextField
     * */
    public DocumentoJTF(int tipo){
        this.Tipo=tipo;
    }
    
    /**Constructor de la clase en el cual se indica que tipo, a que JTextField y que limite debe implementarse
     * en el JTextField al que se le aplique dicha caracteristica
     * @param tipo el tipo de caracteristica sobre el texto que aparecera en el JTextField
     * @param editor el JTextField al que se le quiera aplicar dicha caracteristica
     * @param limite el limite de caracteres que mostrarar el JTextField
     * */
    public DocumentoJTF(JTextField editor,int tipo,int limite){
        this.Tipo=tipo;
        this.editor=editor;
        this.Limite=limite;
    }   
    
    /**Constructor de la clase en el cual se indica que tipo y a que JTextField debe implementarse dichas caracteristicas
     * @param tipo el tipo de caracteristica sobre el texto que aparecera en el JTextField
     * @param editor el JTextField al que se le quiera aplicar dicha caracteristica
     * */
    public DocumentoJTF(JTextField editor,int tipo){
        this.Tipo=tipo;
        this.editor=editor;
    }   
    
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        switch(this.Tipo){
        
        case Mayusculas:
            if(this.Limite==0){
                super.insertString(offset, str.toUpperCase(), attr);
            }
            else{
                if(editor.getText().length()+str.length()>this.Limite){
                    return ;
                }
                else{
                        super.insertString(offset,str.toUpperCase(), attr);
                    }
                }
            break;
        
        case Minusculas:
            if(this.Limite==0){
                super.insertString(offset, str.toLowerCase(), attr);
            }
            else{
                if(editor.getText().length()+str.length()>this.Limite){
                    return ;
                }
                else{
                        super.insertString(offset,str.toLowerCase(), attr);
                    }
                }
            break;
        
        case Limitador:
            
            if(editor.getText().length()+str.length()>this.Limite){
                return ;
            }
            else{
                super.insertString(offset,str, attr);
            }
            break;
        
        case NoDigitos:
            String str2="";
            for(int i=0;i<str.length();i++){
                if(Character.isDigit(str.charAt(i))==false){
                    str2=""+str.charAt(i);
                    super.insertString(offset+i,str2, attr);
                    str2="";
                }
                else{
                    return;
                }
            }
            break;
        
        }
                 
       }
}

