package ClasesIntAnGen;

/**Clases Internas, Anonimas y Genericas
 * clases usadadas PrubAnonima,Anonima,Anonima2,Evento
 * */

class Anonima{
    int a;
    
    public void nombre(){
        System.out.println("Soy Clase Anonima");
    }
    
    public void  metodo1(){
        int a,b,c;
        a=2;
        b=1;
        c=a+b;
        System.out.println("Suma de a y b: "+c);
    }
    
    public void metodo2(){
        System.out.println("Clase Anonima: Metodo Privado");
    }
    
}

abstract class Anonima2{
        
        abstract void metodo1();
        
        void metodo2(){
            System.out.println("Metodo en Clase Abstracta Anonima2");
        }
    }

interface Evento {
    
    public void mouse();
    
    public void teclas();
    
}

public class PrubAnonima {
    
    public PrubAnonima() {
        super();
    }
    
 /**Punto 1)
  *   Se crea una referencia de tipo Anonima y se le asigna un objeto de UNA SUBLCASE DE ANONIMA NO UN
  *   OBJETO DE LA CLASE ANONIMA, ESTA SUBLCLASE ES LA CLASE ANONIMA
  *   una vez hecho esto el objeto creado puede ejecutar los metodos propios de la clase anonima que
  *   no sean privados, a su vez si quiere ejecutar los metodos de la clase anonima(subclase) estos
  *   obligatoriamente tienen que estar definidos en la superclase(Anonima) y ser sobreescritos
  *   si se define un metodo en la sublcase y que no esta en la superclase este metodo no se podra
  *   ejecutar, por lo cual la clase anonima esta condicionada a sobreescribir de la superclase
  *   De igual forma pasa con los atributos, la referencia de tipo Anonima no puede acceder
  *   a atributos definidos en la clase anonima
  *   
  * Punto 2)
  *   se le puede asignar una referencia de una clase abstracta un objeto de una subclase
  *   de la clase abstracta. para que la referencia de tipo Anonima2 use los metodos
  *   de la clase anonima(subclase) estos tienen que haber sido sobreescritos de la superclase
  *   Anonima2. el objeto de tipo Anonima2 puede usar los metodos de la superclase que no sean abstractos
  *   y que no sean privados y que no hayan sido sobreescritos
  * 
  * Punto 3)
  *   se puede asignar a una referencia de una interfaz un objeto que implemente una interfaz del mismo tipo
  *   sucede lo mismo que en los dos puntos anteriores.
  *   a diferencia de las otras dos declaraciones una clase anonima puede ser declarada como
  *   parametro de un metodo y trabajando como se ha dicho en los dos puntos anteriores*/

    public static void main(String[] args) {
        //1)
        Anonima an = new Anonima(){
            int a1=2;
            
            public void metodo3(){
                System.out.println("Prueba Anonima: Metodo 3");
            }
            
            public void metodo2(){
                System.out.println("Prueba Anonima: Metodo 2");
            }
        };
        an.nombre();
        an.metodo1();
        an.metodo2();
        //2)
        Anonima2 an2 = new Anonima2(){

            @Override
            void metodo1() {
                System.out.println("metodo sobrescrito en clase anonima de clase abstyracta");
            }
        };
        an2.metodo1();
        an2.metodo2();
        //3)
        PrubAnonima p = new PrubAnonima();
        p.evento(new Evento(){

                @Override
                public void mouse() {
                    System.out.println("Evento Mouse");
                }

                @Override
                public void teclas() {
                    System.out.println("Evento Teclado");
                }
            });
    }
    
    public void evento(Evento e){
        e.mouse();
        System.out.println("Evento Terminado");
    }
}
