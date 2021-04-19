package Herencia;

/** Herencia en Java: Clases Abstractas
 *  Clases usadas Abstracta y PrubAbstracta
 *  las clases abstractas se definen con la palabra abstract y contienen
 *  metodos abstractos o no abstractos y atributos con cualquier modificador*/

public abstract class Abstracta{
    
    int dimension;
    String color;
    static String tipo;
    
    /**Las clases abstractas pueden tener constructor */
    
    public Abstracta(){
        
    }
    
    /**Los metodos abstractos no estan definidos solo implementados
     * puede haber sobrecarga de metodos
     * los metodos que no sean abstractos deben ser definidos
     * */
   
   public abstract void contar();
   
   public int contar(int inf, int sup){
       int sum=0;
       for(int cont=inf;cont<sup;cont++){
           sum++;
       }
       return sum;
   }
   
   public abstract String getNombre();
   
   
   public abstract void dibujar();
   
   public void pintar(Abstracta abs,String color){
       abs.color=color;
   }
   
}
