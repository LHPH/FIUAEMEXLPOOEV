package ClasesIntAnGen;

/** Clases Internas,Anonimas y Genericas: Clases Internas
 * clases usadas Externa
 * las clases internas son aquellas que se definen dentro de una clase y no fuera
 * 
 * 
 * las clases externas no pueden acceder a los metodos y atributos de la clase
 * interna, para acceder se tendria que crear un objeto de la clase interna*/

public class Externa {
    
    private int a=2;
    public  char b='a';
    public static int p=23;
    
    /** Las Clases internas pueden tener atributos y metodos
     * los atributos y metodos pueden ser publicos, privados pero no pueden ser estaticos
     *  las clases internas pueden ser abstractas, publicas, de paquete o finales
     *  las clases internas pueden acceder los metodos y atributos de la clase externa
     *  sin importar su modificador de acceso
     *  las clases internas son las unicas que pueden tener el modificador static*/
    
    class Interna{
        
        public int $s=2;
        private char $a='f';
        float _b_=0.5f;
        
        public Interna(){
            System.out.println("Creando Clase Interna");
        }
        
        public int sumar1(){
            int c;
            c=$s+10;
            return c;
        }
        
        private char getchar(){
            return $a;
        }
        
        public void modificar(){
            $s=10;
        }
        
        public void metodo(){
            a=20;
            b='3';
            sumar();
            numero();
        }
        
    }
    
    
    static class Inner{
            public void ejecutar(){
                System.out.println("Metodo en clase interna estatica");
                p=100;
                numero();
            }
    }
    
    
    public Externa() {
        super();
    }
    
    public int sumar(){
        int c;
        c=a+3;
        return c;
    }
    
    private int multiplicar(){
        int c;
        c=a*3;
        return c;
    }
    
    public static int numero(){
        return 70;
    }
    
    /** Punto 1)
     *   se puede crear un objeto de la clase externa sin problemas
     *   
     *  Punto 2)
     *    para crear un objeto de una clase interna la declaracion del objeto tiene que
     *    ser como si se estuviera haciendo referencia a un miembro de clase
     *    esto es valido y es posible dado que la clase interna es un miembro de una clase
     *    
     *  Punto 3)
     *     se puede crear un objeto de una clase estatica y ejecutar los metodos correspondientes que tenga
     *     la diferencia es que la clase estatica no puede acceder a los metodos y atributos de Externa
     *     que no sean estaticos*/
    
    public static void main(String[] args) {
        //1)
        Externa ext = new Externa();
        System.out.println("Suma Externa: "+ext.sumar());
        //2)
        /*Interna in= ext.new Interna() == Externa.Interna in2 = ext.new Interna()-> esta declaracion se usa cuando
         * se quiere crear un objeto de la clase interna y la clase desde donde se crea no es la clase externa*/
        Interna in= ext.new Interna(); 
        System.out.println("Suma Interna: "+in.sumar1());
        //3)
        Inner ex = new Inner();
        ex.ejecutar();
    }
}
