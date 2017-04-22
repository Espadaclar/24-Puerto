/**
 *franciscoJavier
 */
class Alquiler {
    
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco; 

    public static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    public static final  int VALOR_MULTIPLICADOR_ESLORA = 10;
    public Alquiler(int diasOcupacion, Barco barco, int posicionAmarre) {
        this.diasOcupacion = diasOcupacion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public int getPosicionAmarre() {
        return posicionAmarre;
    }
    
    /**
     * El precio del alquiler a pagar se calcula sumando el número de días de 
     * ocupación multiplicado por un valor en función del barco (obtenido simplemente 
     * multiplicando por 10 los metros de eslora), más un valor ﬁjo (300 euros) 
     * multiplicado por el coeficiente de Bernua del barco.
     * @return 
     */
    public float getPrecioAlquiler(){
        float totalAPagar = 0;
        //cambia el tipo double de barco.getEslora() a float.
        double alquiler = (barco.getEslora() * VALOR_MULTIPLICADOR_ESLORA);
        float alquilerEslora = (float)alquiler;
        
        float bernua = barco.getCoeficienteBernua() * VALOR_MULTIPLICADOR_BERNUA;
        totalAPagar =  diasOcupacion * alquilerEslora + bernua;    
        return totalAPagar;
    }

    @Override
    public String toString() {
        
        String datos = "";
        datos += "Número del amarre alquilado; " +posicionAmarre+ "\n";
        datos += "Dias de alquiler; " +diasOcupacion+ " días.\n";
        datos += "Total a pagar por el alquiler del amarre; "+getPrecioAlquiler()+ " €.\n";
        return datos;
    } 
    
}