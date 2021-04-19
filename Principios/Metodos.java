package Principios;

/** Principios de Java: Metodos
 * Clases usadas Metodos
 * clase que tiene el proposito de dar a conocer sobre los metodos que no son estaticos y
 * mostrar sobre una de las caracteristicas mas importantes que tienen: la sobrecarga de metodos
 * 
 * La sobrecarga de metodos consiste en declarar varios metodos con el mismo nombre pero con
 * diferente lista de parametros*/

 public class Metodos {
    
    
    /**Los constructores son metodos especiales dado que no tienen un tipo de retorno y con ellos
     * se crean los objetos de clase por lo cual tambien se les puede aplicar
     * la sobrecarga de metodos*/
    public Metodos() {
        super();
    }
    
    public Metodos(int a){ //constructor sobrecargado
        super();
    }
    
    /** los metodos pueden ser nombrados siguiendo las reglas de nombramiento de las variables
     * o atributos
     * Pueden tener regresar de un int hasta un Object
     * pueden tener cualquier modificador de acceso
     * Reglas de Sobrecarga De Metodos
     * 1) Dos o mas metodos que sean sobrecargados deben tener una lista diferente de tipo de parametros
     * 2) Pueden cambiar su valor de retorno
     * 3) Pueden cambiar su modificador de acceso
     * */
    public Object metodo(){
        Object a="Objeto";
        return a;
    }
    
    public int metodo1(){
        return 1;
    }
    
    public int metodo1(int num){
        return num;
    }
    
    private int metodo1(int num, int num2){
        return num+num2;
    }
    
    public void metodo1(float a){
        
    }
    
    public char metodo2(){
        return 'x';
    }
    
    public int metodo2(int a){
        return a;
    }
    
    public String metodo2(String g){
        return g;
    }
    
    /**Elipsis: se denota con tres puntos previamente definido el tipo de parametro
     * la elipsis indica que el metodo puede aceptar una lista de parametros variable diferente de 0
     * por lo cual el metodo puede recibir uno, dos o 10 parametros,etc*/
    public void metodo3(int... vec){
        int suma=0;
        for(int i=0;i<vec.length;i++){
            suma=suma+vec[i];
        }
        System.out.println("Suma de los Parametros Enviados: "+suma);
    }
    
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        
        Object b = metodos.metodo();
        int a = metodos.metodo1();
        
        int c = metodos.metodo2(1); 
        char d = metodos.metodo2();
        
        metodos.metodo3(1,2,3,4,5); // prueba de metodo con elipsis de 5 argumetnos
        metodos.metodo3(1,1);  //prueba de metodo con elipsis con 2 argumetnos
    }
    
}
