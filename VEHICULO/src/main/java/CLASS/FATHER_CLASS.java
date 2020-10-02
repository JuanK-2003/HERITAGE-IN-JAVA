package CLASS;

/**
 *
 * @author Juan_K
 */
public abstract class FATHER_CLASS {

    protected String No_Placa;
    protected int Modelo;
    protected String Marca;

    public FATHER_CLASS(){
        
    }
    public FATHER_CLASS(String No_Placa, int Modelo, String Marca) {
        this.No_Placa = No_Placa;
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public String getNo_Placa() {
        return No_Placa + this.getNo_Placa() + " Bienvenido";
    }

    public void setNo_Placa(String No_Placa) {
        this.No_Placa = No_Placa;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }
    public abstract String getAccountData();
}
