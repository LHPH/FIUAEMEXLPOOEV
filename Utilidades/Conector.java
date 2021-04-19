package Utilidades;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class Conector {
    
    private Socket enchufe;
    private ServerSocket Ssock;
    private DataInputStream entrada;
    private DataOutputStream salida;
    private boolean servidorConectado=false;
    private boolean clienteConectado=false;
    final int puerto=6712;
    
    public Conector() {
        try{
            Ssock = new ServerSocket(puerto);
            enchufe=Ssock.accept();
            entrada=new DataInputStream(enchufe.getInputStream());
           // entrada=new BufferedReader(entradaSocket);
            salida = new DataOutputStream(enchufe.getOutputStream());
            servidorConectado=true;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Conector(String ip){
        try{
            enchufe=new Socket(ip,puerto);
            entrada=new DataInputStream(enchufe.getInputStream());
            //entrada=new BufferedReader(entradaSocket);
            salida = new DataOutputStream(enchufe.getOutputStream());
            clienteConectado=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void enviarMSG(String text){
        try{
            salida.writeUTF(text);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public String leerMSG(){
        try{
            return entrada.readUTF();
        }catch(IOException e){
            return null;
        }
    }
    
    public boolean getEstado(String tipo){
        if(tipo.equals("Servidor")){
            return servidorConectado;
        }
        else{
            if(tipo.equals("Cliente")){
                return clienteConectado;
            }
            else{
                return false;
            }
        }
    }
    
    public void cerrar(){
        try{
            enchufe.close();
            Ssock.close();
            entrada.close();
            salida.close();
            entrada.close();
            clienteConectado=false;
            servidorConectado=false;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
