package Principios;

/** Principios de Java: Encapsulamiento
 * Clases usadas: Encapsulamiento, PruebaEncapsulamiento y Otra clase de otro paquete
 * A las clases, atributos y metodos se les pueden asignar un modificador
 * de acceso los cuales son 4 de ellos
 * 1) Publico: Clases, Metodos y Atributos pueden ser accedidos desde cualquier clase, subclase
 *    o clase perteneciente a otro paquete
 *    
 * 2) Privado: Clases, Metodos y Atributos solo pueden ser usados desde la clase donde son declarados
 *    por lo que no pueden ser usados por otras clases. Las clases no deben ser privadas ya que rompe
 *    con el paradigma OO
 *    
 * 3) Protegido: Clases, Metodos y Atributos pueden ser usados desde otras clases que estan en el paquete
 *    pero no pueden ser usados desde clases de otro paquete
 *    
 * 4) Default: Clases, Metodos y Atributos solo pueden ser usados por las clases que estan en el paquete*/


public class Encapsulamiento1 {
    
    public int x=10;
    public char z='x';
    private String cad="Encapsulamiento";
    boolean abc=true;
    

  /** Los constructores pueden tener los diferentes tipos de modificadores de acceso
   * pero solo pueden ser publicos y por default para no romper el paradigma OO*/    
    public Encapsulamiento1() {
        super();
    }
    
    /** Los metodos tambien pueden tener los modificadores de acceso*/
    public void metodo1(){
        System.out.println("Metodo 1 publico");
    }
    
    private void metodo2(){
        System.out.println("Metodo 2 privado");
    }
    
    protected void metodo3(){
        System.out.println("Metodo 3 protected");
    }
    
    void metodo4(){
        System.out.println("Metodo 4 default");
    }
    
    public static void main(String [] arg){
        Encapsulamiento1 e = new Encapsulamiento1();
        e.x=2;
        e.z='h';
        e.cad="Encaps";
        e.abc=false;
        e.metodo1();
        e.metodo2();
        e.metodo3();
        e.metodo4();
    }
    
    
    
}
