package Utilidades;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Cadenas {
    
    private Cadenas() {
    }
    
    public static String elimSaltLinea(String text){
        int longitud=text.length();
        char caracter;
        String text2="";
        for(int i=0;i<longitud;i++){
            caracter=text.charAt(i);
            if(caracter!='\n'){
                text2=text2+caracter;
            }
            else{
                text2=text2+";";
            }
        }
        return text2;
    }
    
    public static String inserSaltLinea(String text){
        int longitud=text.length();
        char caracter;
        String text2="";
        for(int i=0;i<longitud;i++){
            caracter=text.charAt(i);
            if(caracter!=';'){
                text2=text2+caracter;
            }
            else{
                text2=text2+"\n";
            }
        }
        return text2;
    }
    
    public static String toAscii(String text) throws Exception{
        String text2="";
        if(text.isEmpty()==true){
            throw new Exception("String con longitud 0");
        }
        else{
            int codigo;
            for(int i=0;i<text.length();i++){
                codigo=text.codePointAt(i);
                    text2=text2+codigo+"|";
            }
        }
        return text2;
    }
    
    public static String mayPrim(String text){
           int cont=0;
           String text2="";
           char carac;
           for(cont=0;cont<text.length();cont++){
               carac=text.charAt(cont);
               if(cont==0 || text.charAt(cont-1)==' '){
                   text2=text2+(""+carac).toUpperCase();
               }
               else{
                   text2=text2+carac;
               }
           }
           return text2;
       }
    
    public static int numOcurrPalabra(String palabra,String text){
        String patron="";
        int cont=0;
        if(text.isEmpty()==false){
            for(int i=0;i<palabra.length();i++){
                patron=patron+"["+palabra.charAt(i)+"]";
            }
            Pattern a =Pattern.compile(patron);
            Matcher matcher=a.matcher(text);
            
            while(matcher.find()){
                cont++;
            }
        }
        return cont;
    }
    
    public static int numPalabras(String text)throws Exception,NullPointerException{
        if(text.isEmpty()){
            throw new Exception("String con longitud 0");
        }
        else{
            if(text==null){
                throw new NullPointerException("String con referencia Null");
            }
            else{
                char caracter;
                int num=0;
                for(int i=0;i<text.length();i++){
                    caracter=text.charAt(i);
                    if(caracter==' '){
                        num++;
                    }
                }
                return num+1;
            }
        }
    }
    
    public static String [] conjuntoPalabras(String text)throws Exception{
            int longitud=numPalabras(text);
            System.out.println(longitud);
            String conjunto[]=new String[longitud];
            String palabra="";
            int j=0;
            for(int i=0;i<text.length();i++){
                if(text.charAt(i)!=' '){
                    palabra=palabra+text.charAt(i);
                }
                else{
                    conjunto[j]=palabra;
                    j++;
                }
            }
            return conjunto;
    }
    
    public static String toString(String ascii){
        String text="",textf="";
        char caracter,auxc;
        for(int i=0;i<ascii.length();i++){
            caracter=ascii.charAt(i);
            if(caracter!='|'){
                text=text+caracter;
            }
            else{
                auxc=(char)Integer.parseInt(text);
                textf=textf+auxc;
                text="";
            }
        }
        return textf;
    }
    
    public static void main(String []args)throws Exception{
        System.out.println(numPalabras("Hola mundo"));
        String a[]=conjuntoPalabras("Hola mundo como estas");
         System.out.println(a.length);
         System.out.println(mayPrim("hola mundo como estas"));
        System.out.println(toAscii("hola"));
        System.out.println(toString(toAscii("hola")));
    }
    
}
