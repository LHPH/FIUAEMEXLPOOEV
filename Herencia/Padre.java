package Herencia;


/** Herencia en Java: Herencia
 *  Clases usadas: Padre, Hijo*/
public class Padre {

    public String nombre;
    private int edad;
    private boolean salud;
    public String ocupacion="Desarrollador de Software";
    
    public Padre(String nom,int edad){
        this.nombre=nom;
        this.edad=edad;
    }
    
    public Padre(String nom){
        this.nombre=nom;
        this.edad=40;
    }
    
    public void setEdad(){
        this.edad=40;
    }
    
    public int setEdad(int ed){
        this.edad=ed;
        return ed;
    }

    public int getEdad(){
        return this.edad;
    }
    
    public void info(){
        System.out.println("Mi Nombre es: "+this.nombre);
        System.out.println("Soy "+this.ocupacion);
    }
    
    public void salud(boolean sal) throws Exception{
        if(sal==true){
            this.salud=true;
        }
        else{
            throw new Exception();
        }
    }
    
    private void cicatrices(boolean ind){
        if(ind==true){
            System.out.println("Tengo Cicatrices");
        }
        else{
            System.out.println("No Tengo Cicatrices");
        }
    }
    
    public static void tipoSangre(String tipo){
        System.out.println("MI SANGRE ES TIPO "+tipo);
    }
    
    public void diasFav(String...fav){
        int cont;
        System.out.println("Mis Dias Favoritos Son:");
        for(cont=0;cont<fav.length;cont++){
            System.out.println(fav[cont]);
        }
    }
    
    public void ocupacion(String nom){
        System.out.println(nom);
    }
    
    public void ocupacion(String nom,String salario){
        System.out.println(nom);
        System.out.println("Salario: "+salario);
    }
    
    public void ocupacion(String nom,String salario,String dir){
        System.out.println(nom);
        System.out.println("Salario "+salario);
        System.out.println("Direccion "+dir);
    }
    
    public Padre myself(){
        return this;
    }
    
    public final void tipoOjos(){
        System.out.println("Mis ojos son azules");
    }
    
}
