package Utilidades;

import java.util.ArrayList;

/**Interface ChangeCarta
 * @author Luis H
 * @version 1.0
 * esta interface se debe implementar a todos los paneles que vayan a agregarse
 * al contenedor proporcionado por la clase Cartas
 * */
public interface ChangeCarta {
    
    /**Metodo initConexion
     * este metodo se debe implementar si los paneles van a usar una conexion a una base de datos
     * ya sea para hacer una consulta o una transaccion*/
    public void initConexion();
    
    /**Metodo setCartas
     * este metodo debe implementarse en el panel agregado para poder tener control sobre el contenedor
     * de la clase Cartas
     * @param cartas un objeto de la clase Cartas, el cual va a ser el contenedor de los paneles
     * */
    public void setCartas(Cartas cartas);
    
    /**Metodo cambiarPanel
     * este metodo debe implementarse por si se quiere cambiar a otro panel que se haya agregado
     * al contenedor de la clase Cartas
     * las instrucciones tipicas que pueden estar en este metodo son las siguientes: <p>
     * <code>CardLayout cl = (CardLayout)(cartas.getLayout());
             cl.show(cartas,nombPanel);</code></p>
     * @param nombPanel un String indicando el nombre del panel 
     * */
    public void cambiarPanel(String nombPanel);
    
    /**Metodo setPaneles
     * metodo que debe implementarse en cada panel agregado para poder cambiar a un panel
     * especifico que defina ese panel
     * se recomienda que se use el operador instanceof para determinar en los elementos del ArrayList
     * el panel cuya referencia se quiere usar
     * @param paneles un ArrayList de los paneles que puede usar el panel que implementara este metodo
     * */
    public void setPaneles(ArrayList paneles);
}
