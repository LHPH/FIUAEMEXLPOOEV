package Principios;

/** Principios de Java: Atributos y Metodos Estaticos
 *  Clases usadas: Estaticos
 *  Para declarar un metodo o atributo estatico se le antepone la palabra static
 *  un metodo o un atributo es un miembro de clase
 *  esto signfica que es un elemento propio de la clase
 *  en el caso de las atributos static estos a diferencia de los atributos normales
 *  conservan el valor con el que le es asignado por lo cual el valor del atributo static
 *  sera el mismo para todos los objetos de esa clase
 *  en el caso de los metodos static son metodos propios de la clase por lo que no pueden
 *  modificar en su definicion a los atributos del objeto de la clase
 *  dado que son metodos propios de la clase y no tanto del objeto basado en ella
 *  se puede acceder a los metodos o atributos statics poniendo el nombre de la clase.metodostatic
 *  ejemplo 
 *  Estatico.contador
 *  Estaitco.metodo2
 *  las clases tambien pueden ser static pero estas tienen que ser clases internas*/
public class Estatico {
    
    public static int contador=0;
    public int contador2=0;
    public int Obj;
    
    static class clasestatic{}
    
    public Estatico(int obj) {
        super();
        contador++; // cada vez que se crea un objeto se suma 1
        contador2++;
        this.Obj=obj;
        System.out.println("Objeto No: "+obj);
        System.out.println("Contador de Clase: "+contador);
        System.out.println("Contador Atributo: "+contador2);
    }
    
    public void metodo(){
        System.out.println("Objeto No: "+this.Obj);
        System.out.println("Acceso a Metodos no Estaticos");
        contador++;
        System.out.println(contador);
        System.out.println(contador2);
    }
    
    /** a diferencia de los metodos no estaticos,en los metodos estaticos
     * no se puede acceder a los atributos o metodos que no sean estaticos
     * solo a los metodos o atributos que sean estaticos*/
    public static void metodo2(){
        System.out.println("Acceso a Metodos Estaticos");
        contador++;
        System.out.println(contador);
    }
    
    public static void main(String [] arg){
        Estatico a = new Estatico(1);
        Estatico b = new Estatico(2);
        Estatico c = new Estatico(3);
        
        a.metodo();    
        a.metodo2();
        
        b.metodo();
        b.metodo2();
        
        c.metodo();
        c.metodo2();
        
        Estatico.metodo2();
        
        }
}
