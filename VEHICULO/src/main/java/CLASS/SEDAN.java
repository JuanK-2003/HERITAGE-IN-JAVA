package CLASS;

/**
 *
 * @author Juan_K
 */
public class SEDAN extends CAR {
    public SEDAN(){
        
    }

    public SEDAN(String Medida_Maletera, int No_Puertas, String Combustible, String No_Placa, int Modelo, String Marca) {
        super(Medida_Maletera, No_Puertas, Combustible, No_Placa, Modelo, Marca);
    }
    public String getAccountData() {
        return "Vehículo tipo: Sedan, Modelo: " + this.Modelo + " \n";
    }
}