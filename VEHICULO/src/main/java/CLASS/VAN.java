package CLASS;

/**
 *
 * @author Juan_K
 */
public class VAN extends FATHER_CLASS {
    private int No_Asientos ;
    private int Cantidad_Personas ;
    private String Tipo_Combustible ;

    public VAN() {
 
    }

    public VAN(int No_Asientos, int Cantidad_Personas, String Tipo_Combustible, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.No_Asientos = No_Asientos;
        this.Cantidad_Personas = Cantidad_Personas;
        this.Tipo_Combustible = Tipo_Combustible;
    }

    public int getNo_Asientos() {
        return No_Asientos;
    }

    public int getCantidad_Personas() {
        return Cantidad_Personas;
    }

    public String getTipo_Combustible() {
        return Tipo_Combustible;
    }
    
    @Override
    public String getAccountData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
