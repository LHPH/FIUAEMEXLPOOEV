package Principios;

/**Principios de Java
 * Clase Variable que tiene el proposito de dar a conocer sobre los tipos primitivos de Java
 * , su inicializacion, su declaracion etc
 * 
 * Enteros byte < short < int < long
 * Reales float < double
 * Logicos boolean
 * Caracteres char
 * Las constantes pueden ser de cualquier tipo y su valor no puede ser modificado, se declara una constante
 * con la palabra final
 * 
 * el nombre de las variables o atributos deben empezar con una letra ya sea mayuscula o minuscula,
 * con un signo $ o con _ 
 * 
 * el nombre de las variables no debe tener espacios, #, signos de puntuacion, no deben ser
 * palabras reservadas
 * 
 * */
public class Variables {
    /** Declaracion de los atributos de la clase variable sin inicializar
     * entre los tipos primitivos de Java encontramos a los
     * int - 32 bits
     * float - 64 bits
     * char - 16 bits
     * byte - 8 bits
     * short - 16 bits
     * long - 64 bits
     * boolean
     * double - 64 bits*/
    int a1;
    float b1;
    char c2;
    byte d1;
    short e1;
    long f1;
    double g1;  
    boolean k1;
    
    final int ab=10; //constante de tipo entero
    
    public static void main(String[] args) {
       Variables var = new Variables();
       var.imprimir1();
       var.imprimir2();
       var.imprimir3();  
    }
    
    /** Metodo que tiene la intencion de mostrar el valor de los atributos que no han sido inicializados
     * al imprimir en pantalla muestra que los valores por default de los diferentes tipos de atributos son:
     * byte, short, int y long   0
     * float y dobule  0.0
     * boolean   false
     * char caracter vacio o 0
     * */
    void imprimir1(){
        System.out.println("Contenido de los Atributos sin Inicializar");
        System.out.println("int "+a1);
        System.out.println("float "+b1);
        System.out.println("char  "+c2);
        System.out.println("byte "+d1);
        System.out.println("short "+e1);
        System.out.println("double "+g1);
        System.out.println("long "+f1);
        System.out.println("boolean "+k1);
    }
    
    /** Metodo que tiene la intencion de mostrar las diferentes asiganaciones de valores
     * a los tipos primitivos. A diferencia de los atributos las variables declaradas en los metodos
     * se tiene que inicializar de manera forzada
     * */
    void imprimir2(){
        int a=1;
        float b=2.0f;
        char c='a';
        char c1=60;
        byte d=1;
        short e=1;
        long f=100;
        double g=12.34567;  
        boolean k=true;
        boolean i=(10>2); 
        System.out.println("Contenido de las variables locales");
        System.out.printf("int %d\n",a);
        System.out.printf("float %.2f\n",b);
        System.out.printf("char caracter %c\n",c);
        System.out.printf("char numerico %c\n",c1);
        System.out.printf("byte %b\n",d);
        System.out.printf("short %d\n",e);
        System.out.printf("double %e\n",g);
        System.out.printf("long %d\n",f);
        System.out.printf("boolean %b\n",k);   
    }
    
    /** metodo que tiene la intencion de mostrar los diferentes valores que se le pueden asiganar a un int
     * se le puede asignar un numero octal, decimal y hexadecimal. A su vez se pueden hacer operaciones
     * usando diferentes numeros con bases distintas*/
    void imprimir3(){
        int a=012;
        int b=0x0A;
        int c=12;
        int d=a+b;
        
        System.out.println("----Enteros------");
        System.out.println("Entero octal 012= "+a);
        System.out.println("Entero hexadecimal 0x0A= "+b);
        System.out.println("Entero decimal 12= "+c);
        System.out.println("Suma= "+d);
        System.out.println("----------------------");
    }
}
