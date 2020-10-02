package CLASS;

/**
 *
 * @author Juan_K
 */
public abstract class CAR extends FATHER_CLASS {
    protected String Medida_Maletera;
    protected int No_Puertas;
    protected String Combustible ;
    
    public CAR() {
 
    }
    public CAR(String Medida_Maletera, int No_Puertas, String Combustible, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.Medida_Maletera = Medida_Maletera;
        this.No_Puertas = No_Puertas;
        this.Combustible = Combustible;
    }

    public String getMedida_Maletera() {
        return Medida_Maletera;
    }

    public void setMedida_Maletera(String Medida_Maletera) {
        this.Medida_Maletera = Medida_Maletera;
    }

    public int getNo_Puertas() {
        return No_Puertas;
    }

    public void setNo_Puertas(int No_Puertas) {
        this.No_Puertas = No_Puertas;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }
    @Override
    public abstract String getAccountData();
}
