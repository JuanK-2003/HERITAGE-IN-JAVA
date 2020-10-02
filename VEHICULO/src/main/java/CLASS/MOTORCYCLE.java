package CLASS;

/**
 *
 * @author Juan_K
 */
public class MOTORCYCLE extends FATHER_CLASS {
    private String Tipo_Motor ;
    private String Medida_Rines;
    private int CC_Motor ;

    public MOTORCYCLE() {
 
    }
    public MOTORCYCLE(String Tipo_Motor, String Medida_Rines, int CC_Motor, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.Tipo_Motor = Tipo_Motor;
        this.Medida_Rines = Medida_Rines;
        this.CC_Motor = CC_Motor;
    }

    @Override
    public String getAccountData() {
        return "";
    }
}
