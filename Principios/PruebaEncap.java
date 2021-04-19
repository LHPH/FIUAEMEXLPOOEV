package Principios;

public class PruebaEncap {
   
    public static void main(String[] args) {
        Encapsulamiento1 e = new Encapsulamiento1();
        e.x=2;
        e.z='h';
       // e.cad="Encaps";  Error ya que cad es privado
        e.abc=false;
        e.metodo1();
       // e.metodo2();  Error ya que metodo2 es privado
        e.metodo3();
        e.metodo4();
    }
}
