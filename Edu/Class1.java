package Edu;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.Socket;
import java.net.NetworkInterface;
import java.net.SocketException;

import Principios.Encapsulamiento1;

public class Class1 {
    public Class1() {
    }

    public static void main(String[] args) throws SocketException {
        NetworkInterface a;
        try{
            String IP=Inet4Address.getLocalHost().getHostAddress();
            
            a = NetworkInterface.getByInetAddress(Inet4Address.getLocalHost());
            byte [] b=a.getHardwareAddress(); //devuleve la direccion MAC en decimal
            String MAC="";
            for(int i=0;i<b.length;i++){
                //System.out.format("%02X %s", b[i],(i <b.length - 1) ? "-" : "");
               //System.out.println(b[i]);
                MAC=MAC+String.format("%02X%s",b[i],(i <b.length - 1) ? "-" : "");
            }
            System.out.println(MAC);
            System.out.println(IP);
        }catch(UnknownHostException e){
            
        }
    }
}
