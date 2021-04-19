package Utilidades;

import java.awt.CardLayout;
import java.awt.Rectangle;

import java.util.NoSuchElementException;
import javax.swing.JPanel;

/**Clase Cartas
 * @author Luis H
 * @version 1.0
 * Clase que tiene el proposito de simplificar el proceso de añadir a un panel
 * varios paneles para que en un determinado momento se cambie a uno de los
 * que estan contenidos en este JPanel
 * se recomienda que al usarse se implemente en todas las clases que sean JPaneles
 * y que sean agreagados a este contenedor la interface @see ChangeCartas
 * */

public class Cartas extends JPanel {
    /**Posicion del panel en la coordenada x */
    private int x;
    /**Posicion del panel en la coordenada y */
    private int y;
    /**anchura del panel */
    private int anchura;
    /**altura del panel */
    private int altura;
    
    /**Constructor de la clase Cartas
     * Inicia el JPanel "Madre" que albergara todos los paneles
     * que quieran ser cambiados en un momento determinado
     * @param x coordenada x que tendra este contenedor 
     * @param y coordenada y que tendra este contenedor
     * @param anc anchura que tendra este contenedor
     * @param alt altura que tendra este contenedor
     * */
    public Cartas(int x,int y,int anc,int alt) {
        this.x=x;
        this.y=y;
        this.anchura=anc;
        this.altura=alt;
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /**Metodo que iniciara a este contenedor
     * @throws Exception
     * */
    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setBounds(new Rectangle(x,y,anchura,altura));
        this.setLayout(new CardLayout());
    }
    
    /**Metodo agregar que agregara los paneles
     * que se deseen agregar a este contenedor
     * @param nombres un arreglo con los nombres de los paneles
     * @param paneles un arreglo de paneles que seran los paneles a agregar
     * @throws NullPointerException si los paneles son NULL
     * @throws NoSuchElementException si el numero de nombres dados no corresponde al numero de paneles que se han dado
     * o visceversa
     * */
    public void agregar(String [] nombres,JPanel [] paneles){
        for(int i=0;i<paneles.length;i++){
            if(paneles[i]==null){
                throw new NullPointerException("La Referencia es Null");
            }
        }
        if(nombres.length!=paneles.length){
            throw new NoSuchElementException("el numero de nombres no concuerda con el numero de paneles");
        }
        else{
            for(int i=0;i<nombres.length;i++){
                this.add(nombres[i],paneles[i]);
            }
        }
    }
    
}
