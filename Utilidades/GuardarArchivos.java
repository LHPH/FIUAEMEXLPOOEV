package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GuardarArchivos {
    public GuardarArchivos() {
        super();
    }
    
    public static void copiarFicheros(File f1, File f2){
          try {
            //InputStream, OutputStream  
            FileInputStream in = new FileInputStream(f1);
            FileOutputStream out = new FileOutputStream(f2);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
              out.write(buf, 0, len);
            }
            in.close();
            out.close();
         
          } catch (IOException ioe){
            ioe.printStackTrace();
          }
        }
    
    
     
    public static void main(String []arg){
        copiarFicheros(new File("C:\\Users\\H\\Documents\\JDeveloper\\Catch_me\\src\\catch_me","1.png"),
                       new File("C:\\Users\\H\\Documents\\JDeveloper\\Catch_me\\src","1.png"));
    }
    
    
}
