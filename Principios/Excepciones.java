package Principios;

/**Principios de Java: Excepciones 
 * Clases usadas Excepciones
 * Las excepciones se utilizan para evitar un posible error que se llegue a dar en la ejecucion
 * de un programa*/

public class Excepciones {
   
   
   /**Metodo que esta a la espera de que una posible excepcion ocurra
    * se utiliza la palabra throws seguida del nombre de la excepcion que puede ocurrir
    * en el metodo. Un metodo que lanza una excepcion de esta manera debe encerrarse en un
    * bloque try-catch*/
    public void metodo1(int a) throws ArithmeticException, Exception{
        int b=2;
        int c;
        c=b/a;
        System.out.println("Resultado de la Division"+c);
    }
   
   /**Metodo que muestra un bloque try-catch-finally.
    * en el bloque try se pone el codigo que puede fallar ante un suceso inesperado o excepcion
    * en el bloque catch se pone el codigo para tratar la excepcion
    * en el bloque finally que es opcional se pone codigo que se ejecuta sin importar
    * si una excepcion ocurrio o no*/ 
    public void metodo1(int a,int b){
        try{
            int c=a/b;
            System.out.println("Resultado de la division "+c);
        }catch(ArithmeticException e){
            
            System.out.println("No se pudo dividir entre 0");
        }
        finally{
            System.out.println("Fin Metodo");
        }
    }

  /** Metodo en cuyo cuerpo se define una instruccion throw que sirve para lanzar
   * una excepcion al irse la ejecucion del programa por tal camino. el metodo no
   * marca error de compilacion si no se trata con try-catch por lo cual es opcional*/
    public void metodo3(int a, int b){
        int c;
        if(b==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        else{
            c=a/b;
            System.out.println("El Resultado de la division es "+c);
        }
    }
  
  

    public static void main(String[] args) {
        Excepciones exc = new Excepciones();
        
        try{
            System.out.println("Metodo 1 Prueba 1: Argumento diferente de 0");
            exc.metodo1(1);
        }catch(ArithmeticException b){
            System.out.println("No se pudo dividir entre 0");
        } catch (Exception e) {
        }

        try{
            System.out.println("Metodo 2 Prueba 2: Argumento igual 0");
            exc.metodo1(0); //si no hay un manejador de excepciones esto causa error dado que no se puede dividir entre 0
        }catch(ArithmeticException b){
            System.out.println("No se pudo dividir entre 0");
        } catch (Exception e) {
        }

        System.out.println("Metodo 1Prueba 1: Argumento diferente de 0");
        exc.metodo1(2,2);
        
        System.out.println("Metodo 2 Prueba 2: Argumento igual de 0");
        exc.metodo1(2,0); 
        
        System.out.println("Metodo 3 Prueba 1: Argumento diferente de 0");
        exc.metodo3(10, 5);
        System.out.println("Metodo 3 Prueba 2: Argumento igual a 0");
        exc.metodo3(10,0); // se le indica a la MVJ de una excepcion
    }
}
