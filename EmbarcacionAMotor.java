/**
 *franciscoJavier
 */
class EmbarcacionAMotor extends Barco{

    private int potencia;

    public EmbarcacionAMotor(String matricula,double eslora, int anio, Persona persona, int potencia) {
        super( matricula, eslora, anio, persona);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
    
    @Override
    public int getCoeficienteBernua() {
       return VALOR_MULTIPLICADOR_BERNUA * potencia;
    }
    
    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Embarcación a motor con " +potencia+ " caballos.\n";
        return datos;
    }
    
}
