/**
 *franciscoJavier
 */
class Alquiler {
    
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco; 

    public static final  int VALOR_MULTIPLICADOR_ESLORA = 10;
    public Alquiler(int diasOcupacion, Barco barco, int posicionAmarre) {
        this.diasOcupacion = diasOcupacion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    /**
     * El precio del alquiler a pagar se calcula sumando el número de días de 
     * ocupación multiplicado por un valor en función del barco (obtenido simplemente 
     * multiplicando por 10 los metros de eslora), más un valor ﬁjo (300 euros) 
     * multiplicado por el coeficiente de Bernua del barco.
     * @return 
     */
    public double getPrecioAlquiler(){
        double totalAPagar = 0;
        int bernua = barco.getCoeficienteBernua();
            totalAPagar =  diasOcupacion * (barco.getEslora() * 10) + barco.getCoeficienteBernua();
        return totalAPagar;
    }

    @Override
    public String toString() {
        
        String datos = "";
        datos += "Dias de alquiler; " +diasOcupacion+ " días.\n";
        datos += "Número del amarre alquilado; " +posicionAmarre+ "\n";
        datos += "Total a pagar por el alquiler del amarre; "+getPrecioAlquiler()+ " €.n";
        return datos;
    } 
    
}