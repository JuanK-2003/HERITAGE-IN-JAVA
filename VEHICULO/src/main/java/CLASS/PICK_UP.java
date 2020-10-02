package CLASS;

/**
 *
 * @author Juan_K
 */
public class PICK_UP extends CAR {

    public PICK_UP(){
        
    }

    public PICK_UP(String Medida_Maletera, int No_Puertas, String Combustible, String No_Placa, int Modelo, String Marca) {
        super(Medida_Maletera, No_Puertas, Combustible, No_Placa, Modelo, Marca);
    }
    
    @Override
    public String getAccountData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
