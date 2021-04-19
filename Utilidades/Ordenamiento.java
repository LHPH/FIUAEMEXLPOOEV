package Utilidades;


public class Ordenamiento {
    
    public static final int MAY_TO_MEN=0;
    public static final int MEN_TO_MAY=1;
    
    /**Ordena un Arreglo de n elementos en el orden especificado usando el metodo de ordenamiento
     * por burbuja,el orden puede ser:<p>
     * Ordenamiento.MAY_TO_MEN: De mayor a menor<p> 
     * Ordenamiento.MEN_TO_MAY: De menor a mayor
     * @param arr el arreglo de numeros que se va a ordenar
     * @param orden  el orden especificado
     * @return el arreglo ordenado
     * */
    public static int [] burbuja(int [] arr,int orden)throws NullPointerException{
        int cont=0,cont2=0,aux;
        int [] res;
        if(arr==null){
            throw new NullPointerException("El Arreglo Esta Vacio");
        }else{
            res=arr.clone(); //si no se usa el metodo clone, el metodo alterara el vector original
            if(orden==MAY_TO_MEN){
                for(cont=0;cont<res.length;cont++){
                    for(cont2=cont;cont2<res.length;cont2++){
                        if(res[cont]<res[cont2]){
                            aux=res[cont];
                            res[cont]=res[cont2];
                            res[cont2]=aux;
                        }
                    }
                }
            }
            else{
                for(cont=0;cont<res.length;cont++){
                    for(cont2=cont;cont2<res.length;cont2++){
                        if(res[cont]>res[cont2]){
                            aux=res[cont];
                            res[cont]=res[cont2];
                            res[cont2]=aux;
                        }
                    }
                }
            }
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        Ordenamiento o = new Ordenamiento();
        int []b = {1,3,2,7};
        int [] c=o.burbuja(b,Ordenamiento.MAY_TO_MEN);
        int [] d =o.burbuja(b,Ordenamiento.MEN_TO_MAY);
        for(int i=0;i<4;i++){
            System.out.print(c[i]);
            System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i<4;i++){
            System.out.print(d[i]);
            System.out.print(" ");
        }
    }
    
    
}
