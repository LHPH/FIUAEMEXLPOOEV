package Interfaces;

import java.io.Serializable;

/** una clase no puede heredar de una interfaz pero puede implementarlas
 * puede implementar mas de una interfaz
 * al implementar una interfaz la clase debe implementar y definir todos los metodos
 * de las interfaces que esta implementando
 * tambien tiene que implementar y definir todos los metodos que una interfaz este heredando de otra interfaz
 * si no se definen todos los metodos, la clase debe ponerse como abstracta*/

public class Persona implements Contrato,Serializable{
    
    private String nombre;
    private String empresa;
    private  String puesto="2";
    
    public Persona(String nom) {
        this.nombre=nom;
        this.empresa=Contrato.nomEmpresa;
    }
    
    public void info(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Empresa: "+this.empresa);
        System.out.println("Puesto: "+this.puesto);
        System.out.println("Salario: "+this.salario());
    }
    
    @Override
    public void firma(String fecha, String[] personas) {
    }

    @Override
    public void fechaInicio(String fecha) {
        
    }
    
    @Override
    public int salario() {
        return 8000;
    }

    @Override
    public void reglas() {
        System.out.println("Llegar Puntual al Trabajo");
        System.out.println("Trabajar en Equipo");
    }

    @Override
    public void Puesto() {
        this.puesto="Desarrollador";
    }

    @Override
    public void Puesto(String nom) {
        this.puesto="Desarrollador";
    }

    @Override
    public void setIdioma(String idioma) {
        System.out.println("El Contrato estaba en ingles");
    }
    
    @Override
    public void fechaTermino(String fechat) {
    }
    
    /**Punto 1)
     *   las clases que implementen interfaces pueden declararse y crearse objetos como una clase
     *   que no implemente ninguna interfaz
     * 
     * Punto 2)
     *  las interfaces no pueden crear objetos pero se puede asignar a una referencia de una interfaz
     *  un objeto que implemente esa interfaz y ese objeto de tipo interfaz puede ejecutar solo los metodos sobreescritos
     *  del objeto que las implemento y que se uso para crearse
     *  si se quiere ejecutar todos los metodos del objeto que implementa la interfaz se tiene que hacer un cast
     * */
    
    public static void main(String[] args) {
        //1
        Persona p = new Persona("Luis");
        p.Puesto("Desarrollador");
        p.info();
        //2
        Contrato con = new Persona("Luis");
        con.Puesto("Desarrollador");
        Persona p2 = (Persona)con;
        p2.info();
    }
}
