package Utilidades;

import java.util.LinkedList;

import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class ValidarJTF {
    private LinkedList<JTextField> campos = new LinkedList<JTextField>();
    
    
    public ValidarJTF() {
    }
    
    public void agregar(JTextField campo){
        if(campo!=null){
            campos.add(campo);
        }
        else{
            throw new NullPointerException("la referencia es null");
        }
    }
    
    public void agregar(JTextField [] campos){
        if(campos.length==0){
            throw new NoSuchElementException("No hay elementos");
        }
        else{
            for(int i=0;i<campos.length;i++){
                this.campos.add(campos[i]);
            }
        }
    }
       
    public boolean isEmpty(){
        int num=this.campos.size();
        int sum=0;
        for(int i=0;i<this.campos.size();i++){
            if(campos.get(i).getText().equals("")==false){
                sum++;
            }
            else{
                break;
            }
        }
        if(sum==num){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static boolean CompPass(String pass,int length){
           int cont;
           boolean ban,ban2;
           char carac;
           ban=false;
           ban2=false;
           if(pass.length()<=length){
               ban=true;
           }
           else{
               ban=false;
           }
           if(ban==true){
               for(cont=0;cont<pass.length();cont++){
                   carac=pass.charAt(cont);
                   if(carac==' '){
                       ban2=false;
                       break;
                   }
               }
           }
           if(ban==true && ban2==true){
               return true;
           }
           else{
               if(ban==false){
                   JOptionPane.showMessageDialog(null,"Error La Contraseña Debe Ser de "+length+" Caracteres Maximo","Error",JOptionPane.ERROR_MESSAGE);
               }
               else{
                   if(ban2==false){
                       JOptionPane.showMessageDialog(null,"Error La Contraseña Tiene Espacios En Blanco","Error",JOptionPane.ERROR_MESSAGE);
                   }
               }
           }
           return false;
       }
    
    public static boolean soloMays(String text){
        int c;
        boolean ind=true;
        for(int i=0;i<text.length();i++){
            c=text.charAt(i);
            if(c<65 || c>90){
                ind=false;
                break;
            }
        }
        return ind;
    }
    
    public static boolean soloMin(String text){
        int c;
        boolean ind=true;
        for(int i=0;i<text.length();i++){
            c=text.charAt(i);
            if(c<97 || c>122){
                ind=false;
                break;
            }
        }
        return ind;
    }
    
    public static boolean soloLetras(String text){
        int c;
        boolean ind=true;
        for(int i=0;i<text.length();i++){
            c=text.charAt(i);
            if((c>=65 && c<=90) || (c>=97 && c<=127)){
                ind=false;
                break;
            }
        }
        return ind;
    }
    
    

   
}


