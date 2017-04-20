/**
 *
 * @author alumno
 */
public abstract class  Barco {
    private Persona persona;
    private String matricula;
    private double eslora;
    private int anioFabricacion;

    public Barco(Persona persona, String matricula, double eslora, int anioFabricacion) {
        this.persona = persona;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }
    
    public abstract float getCoeficienteBernua();

    @Override
    public String toString() {
        String datos = "";
        datos += "Nombre propietario; " +persona.getName()+ "\n";
        datos += "Matrícula del barco; " +matricula+ "\n";
        datos += "Metros de eslora; " +eslora+ " m.\n";
        datos += "Año de fabricación; " +anioFabricacion+ "\n";
        return datos;
        
        
    }
       
}
