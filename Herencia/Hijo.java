package Herencia;

/** Herencia En Java
 * Clases usadas Padre, Hijo
 * Clases que tienen el proposito de mostrar informacion sobre la herencia
 * una clase que hereda de otra, hereda todos sus metodos y atributos que sean publicos
 * o protegidos.
 * una clase puede heredar de clases que sean abstractas, publicas o no publicas
 * pero no pueden heredar de clases que tengan el modificador final*/
import java.io.IOException;

public final class Hijo extends Padre {
    public String nombre;
    public int edad;
    private boolean salud;
    private String ocupacion="Estudiante";
    private Padre pad;
    
    
    /**Los constructores no se pueden heredar pero se pueden llamar
     * usando la palabra super*/
    public Hijo(String nom,String padre){
        super(padre);
        pad=super.myself();
        this.nombre=nom;
    }
    
    public Hijo(String nom,String padre,int edad,int edpad){
        super(padre,edpad);
        this.nombre=nom;
        pad=super.myself();
        this.edad=edad;
    }
    
    /**Metodos:
     * Reglas de la Herencia para Metodos
     * 1) Un metodo puede ser sobreescrito en la subclase si
     *    a) el metodo de la clase padre no es privado
     *    b) el metodo de la clase padre no es final
     * 2) los metodos deben tener el mismo tipo de retorno y lista de parametros que el metodo
     *   en que esta en la clase padre
     * 3) puede haber sobrecarga de metodos sobreescritos cumpliendo con las reglas de sobrecarga
     * 4) los metodos que lanzen excepciones pueden ser sobreescritos cumpliendo con alguno de estos puntos
     *   a) el metodo sobreescrito puede lanzar la misma excepcion que el metodo original
     *   b) el metodo sobreescrito puede lanzar un subtipo de la excepcion que lanza el metodo original
     *   c) el metodo sobreescrito puede no lanzar una excepcion
     *   d) el metodo sobreescrito no puede lanzar una excepcion de mayor rango que la que lanza el metodo original
     *  5) los metodos estaticos no pueden ser heredados y ser sobreescritos
     *     sin embargo la clase hija puede crear un metodo con el mismo nombre que el metodo estatico
     *     y aun asi eso no significa que se este sobreescribiendo el metodo. De igual forma la clase
     *     hija puede utilizar el metodo,si no es privado, dado que como es un metodo de clase
     *     y la clase hija es un objeto de la clase padre, la clase hija puede usarlo
     *  6) los metodos finales pueden ser hereados pero no sobreescritos
     *  7) los metodos abstractos pueden ser sobreescritos*/
    public void setEdad(){
        this.edad=10;
    }
    
    public int setEdad(int ed){
        this.edad=ed;
        return ed;
    }
    
    public void setEdad(String ed){
        this.edad=Integer.parseInt(ed);
    }

    public void salud(boolean ind){
        if(ind==true){
            this.salud=ind;
        }
        else{
            this.salud=ind;
        }
    }
    
    public static void tipoSangre(String tipo){
        System.out.println("mi tipo de sangre es: "+tipo);
    }
    
    public void info(){
        System.out.println("Mi Nombre es "+this.nombre);
        System.out.println("Mi Padre se llama "+super.nombre);
        System.out.println("Mi ocupacion es "+this.ocupacion);
    }
    
    public void ocupacion(){
        System.out.println(this.ocupacion);
    }
    
    public Padre tipoSangrePadre(){
        return pad;
    }

/**Punto 1)
 *   Un Objeto de una subclase al ser creado puede utilizar sus propios metodos,atributos,
 *   metodos que sobreescribio y de igual forma puede utilizar los metodos yatributos de la clase padr
 *   siempre y cuando estos sean publicos
 *   
 * Punto 2)
 *   se puede crear una referencia de la superclase asignandole un objeto de la sublcase
 *   esta referencia puede ejecutar los metodos de la superclase a excepcion de aquellos metodos
 *   que sean sobreescritos en la sublclase, en vez de eso se ejecutan los metodos sobreescritos que estan en la
 *   sublclase. Para ejecutar todos los metodos de la sublclase se hace un cast entre referencias
 *   
 * Punto 3)
 *   se pueden crear una referencia de la superclase y otra de la sublcase. cada uno ejecuta sus propios metodos
 *   correspondientes al asignarles su objeto correspondiente. se puede hacer que la referencia de la superclase
 *   ejecute los metodos de la subclase asingandole la referencia de sublclase en vez del objeto*/

    public static void main(String[] args) {
        //1)
        Hijo hijo = new Hijo("Luis","Hector");
        hijo.info();
        hijo.tipoSangre("O+");
        hijo.tipoSangrePadre().tipoSangre("O-");
        hijo.ocupacion();
        hijo.diasFav("Viernes","Lunes");
        //2)
        Padre padre = new Hijo("Luis","Hector",17,40);
        padre.info();
        padre.tipoSangre("O-");
        padre.ocupacion("Desarrollador de Software");
        Hijo hijo1 = (Hijo)padre;
        hijo1.info();
        hijo1.tipoSangre("O+");
        hijo.ocupacion();
        //3
        Padre padre2 = new Padre("Hector",40);
        padre2.info();
        Hijo hijo3 = new Hijo("Luis","Hector");
        padre2 = hijo3;
        padre2.info();
    }
}
