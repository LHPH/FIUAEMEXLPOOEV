package Interfaces;

/** Interfaces
 *  Clases usadas Contrato y Persona
 *  las interfaces son como las clases abstractas solo que en las interfaces
 *  los atributos son obligatoriamente finales y static aunque no se definan asi
 *  las interfaces pueden heredar de varias interfaces pero no pueden heredar de clases
 *  las interfaces no pueden implementar otras interfaces
 *  */

interface IdiomaContrato{
    public void setIdioma(String idioma);
}

interface Jerarquia{
    public void Puesto();
}


public interface Contrato extends IdiomaContrato, Jerarquia{
    
    public int numhojas=20;
    public static String tipoletra="Arial 12";
    public final String nomEmpresa="ORACLE COMPANY";
    
    /**los metodos de una interfaz son obligatoriamente abstractos aunqueno se defina asi
     * de igual forma todos los metodos de una interfaz no pueden ser privados
     * las interfaces no tienen constructores*/
    
    public abstract void firma(String fecha,String [] personas);
    
    public void fechaInicio(String fecha);
    
    public void fechaTermino(String fechat);
    
    public int salario();
    
    public void reglas();
    
    public void Puesto();
    
    public void Puesto(String nom);
    
}
