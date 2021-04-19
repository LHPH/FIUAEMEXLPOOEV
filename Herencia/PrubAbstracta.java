package Herencia;

/** Las clases que hereden de clases abstractas
 * deben implementar todos los metodos que sean abstractos
 * de la clase abstracta
 * si no se implementan todos la subclase debe declararse como abstracta tambien*/
public class PrubAbstracta extends Abstracta {
    
    public PrubAbstracta() {
        super();
    }

    @Override
    public void contar() {
        
    }
    
    public int contar(int inf,int sup){
        int sum=0;
        for(int cont=inf;cont<sup;cont++){
            sum++;
            System.out.println(sum);
        }
        return sum;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void dibujar() {
    }
    
    public void pintar(Abstracta abs){
        super.pintar(abs,"Rojo");
        System.out.println("Se Pintara de color "+abs.color);
    }
    
    /** Las clases abstractas no pueden crear objetos pero pueden usarse si se les asigna a una referencia
     * un objeto de la sublcase 
     * el objeto de la superclase ejecuta solo sus propios metodos si estos no se sobreescribieron en la subclase
     * y si no son privados, sino es asi el objeto de la superclase ejecutara los metodos sobreescritos*/
    
    public static void main(String[] args) {
        Abstracta abs = new PrubAbstracta();
        int num=abs.contar(0, 10);
        System.out.println(num);
    }
}
