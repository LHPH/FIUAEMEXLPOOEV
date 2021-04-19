package Principios;

/** Principios de Java: Objetos
 * Clases usadas: Objetos
 * clase que tiene la intencion de mostrar sobre los objetos
   los objetos que no son inicializados se llaman referencias
y las referencias a las que no se les ha una referencia a una direccion
de memoria de un objeto del tipo de su referencia tienen el valor
 predeterminado de null*/
public class Objetos {
    //objetos sin inicializar
    String cadena;
    Object o;
    
    /** los constructores son aquellos que le asignan memoria a los objetos
     * ,son los que creawn los objetos*/
    public Objetos() {
        super();
    }
    
    public static void main(String [] arg){
        
        Objetos obj=new Objetos();
        System.out.println("Contenido del Objeto 1");
        System.out.println("String sin inicializar: "+obj.cadena);
        System.out.println("Referencia del Objeto: "+obj); 
        System.out.println("Inicializando String ");
        obj.nombre("Hola");
        System.out.println("String inicializado: "+obj.cadena);
        
        Objetos obj2=new Objetos();
        System.out.println("Contenido del Objeto 2");
        System.out.println("String sin inicializar: "+obj2.cadena);
        System.out.println("Referencia del Objeto: "+obj2); 
        System.out.println("Inicializando String ");
        obj2.nombre("Hola desde objeto 2");
        System.out.println("String inicializado: "+obj2.cadena);

    }
    
    
    void nombre(String nom){
        this.cadena=nom;
    }
}
