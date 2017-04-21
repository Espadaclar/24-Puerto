/**
 *franciscoJavier
 */
class Puerto {
    
    private Alquiler[] amarres;

    public Puerto() {
        amarres = new Alquiler[4];
    }
    /**
     * comprueba si hay amarres libres.
     */
    public boolean hayAmarresLibres(){
        boolean amarreLibre = false;
        for(Alquiler amarre: amarres){
            if(amarre == null){
                amarreLibre = true;
            }
        }
        return amarreLibre;
    }
    
    /**
     * devuelve el primer amarre libre que hay. (para asignarlo a un alquiler¡¡¡)
     */
    public int posicionPrimerAmarreLibre(){
        int cont = 0;
        int amarreLibre = 0;
        boolean encontrado = false;
        while(cont < amarres.length && !encontrado){
            if(amarres[cont] == null){
                encontrado = true;
                amarreLibre = cont;
            }
            cont ++;
        }
        return amarreLibre;
    }
    
    /**
     * mt para alquilar uno de los amarres. Devuelve el total del alquiler, o -1
     * en caso de que no haber amarres libres
     */
    public float alquilarAmarre(int numDias, Barco barco){
        float resultado = -1;
        if(hayAmarresLibres()){
            Alquiler alquiler = new Alquiler(numDias, barco, posicionPrimerAmarreLibre());
            amarres[posicionPrimerAmarreLibre()] = alquiler;                    
        }
        return resultado;
    }
    
    /**
     * calcula el coste del alquiler de cada tipo de embarcación.
     */
    
    private float totalAPagarPorAlquiler(int numDias, Barco barco){
        float total = 0;
        if(barco.toString().contains("numMastiles")){
           total = barco.getCoeficienteBernua();
        }
        
        return total;
    }
            
}
