package Principios;

/** Principios de Java: Casting
 * Clases usadas: Casting
 * clase que tiene el proposito de mostrar el uso del casting y la promocion
 * el casting se utiliza cuando se quiere almacenar el valor de un tipo mas grande en un tipo mas pequeño, convertirlo al mismo
 * tipo
 * la promocion es cuando se asigna un valor de un tipo pequeño a un tipo grande y cuando se le asigna a un float
 * un valor int*/
public class Casting {
    public Casting() {
        super();
    }


    public static void main(String[] args) {
        int a=10;
        int a1;
        float b=20.4f;
        float b1;
        byte c=2;
        byte c1;
        double d=100.29;
        double d1;
        long e=2000L;
        long e1;
        
        System.out.println("Tabla de Valores");
        System.out.println("Int "+a);
        System.out.println("float "+b);
        System.out.println("byte "+c);
        System.out.println("double "+d);
        System.out.println("long "+e);
       
        
        //Casting y Promocion
        System.out.println("Promocion o Casting de Int ");
        a1=(int)b; //casting float a int 
        System.out.println(a1);
        a1=c;        //promocion de byte a int
        System.out.println(a1);
        a1=(int)d;  // casting de double a int
        System.out.println(a1);
        a1=(int)e;   // casting de long a int
        System.out.println(a1);
        
        System.out.println("Promocion o Casting de float ");
        b1=a;        // promocion de int a float
        System.out.println(b1);
        b1=c;        // promocion de byte a float
        System.out.println(b1);
        b1=(float)d; //casting de double a float
        System.out.println(b1);
        b1=e;       //promocion de long a float
        System.out.println(b1);
        
        System.out.println("Promocion o Casting de byte ");
        c1=(byte)a;  //casting de int a byte
        System.out.println(c1);
        c1=(byte)b;  //casting de float a byte
        System.out.println(c1);
        c1=(byte)d; // casting de double a byte
        System.out.println(c1);
        c1=(byte)e;  //casting de long a byte
        System.out.println(c1);
        
        System.out.println("Promocion de double ");
        d1=a;       //promocion de int a double
        System.out.println(d1);
        d1=b;       //promocion de float a double
        System.out.println(d1);
        d1=c;       //promocion de byte a double
        System.out.println(d1);
        d1=e;       //promocion de long a double
        System.out.println(d1);
        
        System.out.println("Promocion o Casting de Long ");
        e1=a;       //promocion de int a long
        System.out.println(e1);
        e1=(long)b; //casting de float a long
        System.out.println(e1);
        e1=c;       //promocion de byte a long
        System.out.println(e1);
        e1=(long)d; //casting de double a long
        System.out.println(e1);
        
        System.out.println("Promocion y Casting para Objetos");
        
        
        /**Solamente se puede hacer el cast entre objetos si previamente el objeto hijo
         * se creo con new, fue asignado despues a un objeto de la clase padre y luego
         * este objeto es casteado a un objeto hijo del mismo tipo que fue declarado en el primer paso
         * */
        String x = new String();
        Object xx =x;
        String xxx =(String)xx;
        
        Object y = new Object();
        String yy=(String)y; //Se lanza la excepcion ClassCastException
        
        
    }
}
