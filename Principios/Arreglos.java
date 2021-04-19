package Principios;

/** Principios de Java: Arreglos
 * Clases usadas Arreglos
 * clase que tiene el proposito de mostrar sobre los arreglos unidimensionales
 * y arreglos bidimensionales*/
public class Arreglos {
    
    public Arreglos() {
        super();
    }
    
    /** Metodo que muestra las diferentes formas de declarar un arreglo
     * de tipo entero. la primera y segunda declaracion son casi similares
     * se reservan dos espacios de memoria a una referencia de tipo int
     * la tercerar declaracion indica a la referencia los espacios y el contenido que tendra
     * esta declaracion se debe de hacer de esa manera ya que si no sera un error
     * la ultima declaracion es conocida como arreglo anonimo y se debe declarar de esa manera
     * sino dara error
     * por default cada espacio de memoria contiene el valor predeterminado del tipo al que hace referencia*/
    public void vectores(){
        int [] a = new int[2];
        int b [] = new int[2];
        int [] c ={1,2};
        int [] d =new int[]{1,2};
        System.out.println("Vectores");
        System.out.println("Vector a");
        agregar(a);
        System.out.println("Vector b");
        agregar(b);
        System.out.println("Vector c");
        agregar(c);
        System.out.println("Vector d");
        agregar(d);
    }
    
    /** Metodo que muestra las diferentes formas de declarar un arreglo bidimensional
     * de tipo entero. la primera y segunda declaracion son casi similares
     * se reservan dos espacios de memoria a una referencia de tipo int y en cada espacio se le asignan dos espacios mas
     * la tercera declaracion solo reserva dos espacios de memoria por lo que posteriormente a cada espacio de memoria
     * se le debe asignar otro numero de espacios de memoria reservados
     * la cuarta y quinta declaracion son similares en las que se asignan los espacios reservados en memoria
     * y el contenido que contendra
     * la ultima declaracion es un arreglo bidimensional anonimo y se debe declarar de tal manera como se muestra
     * para no marcar error
     * por default cada espacio de memoria contiene el valor predeterminado del tipo al que hace referencia*/
    public void matrices(){
        int [][]a = new int[2][2];
        int b [][] = new int[2][2];
        int [][] c = new int[2][];
        c[0]=new int[2];
        c[1]=new int[2];
        int [][] d ={{1,2},{3,4}};
        int [][] e ={{1,2,3},{1},{2,3}};
        int [][] f =new int[][]{{10,9},{8,7}};
        
        System.out.println("Matrices");
        System.out.println("Matriz a");
        agregar(a);
        System.out.println("Matriz b");
        agregar(b);
        System.out.println("Matriz c");
        agregar(c);
        System.out.println("Matriz d");
        agregar(d);
        System.out.println("Matriz e");
        agregar(e);
        System.out.println("Matriz f");
        agregar(f);
    }
    
    /**Metodo agregar que pasa como parametro un arreglo unidimensional y que modifica su contenido */
    public void agregar(int [] vec){
        for(int i=0;i<vec.length;i++){
            vec[i]=i;
        }
        for(int i=0;i<vec.length;i++){
            System.out.print(vec[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    
    /** Metodo agregar sobrecargado que pasa como parametro un arreglo bidimensional y que modifica su contenido
     * */
    public void agregar(int[][]vec){
        int r,c,i=0;
        for(r=0;r<vec.length;r++){
            for(c=0;c<vec[r].length;c++){
                vec[r][c]=++i;
            }
        }
        for(r=0;r<vec.length;r++){
            for(c=0;c<vec[r].length;c++){
                System.out.print(vec[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String [] arg){
        Arreglos arr = new Arreglos();
        arr.vectores();
        arr.matrices();
    }
    
    
}
