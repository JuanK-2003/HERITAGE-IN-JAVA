package CLASS;

/**
 *
 * @author Juan_K
 */
public class TRUCK extends FATHER_CLASS {
    private String Capacidad_Carga ;
    private int Cantidad_Llantas ;
    private String Tipo_Caja ;

    public TRUCK() {
 
    }
    public TRUCK(String Capacidad_Carga, int Cantidad_Llantas, String Tipo_Caja, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.Capacidad_Carga = Capacidad_Carga;
        this.Cantidad_Llantas = Cantidad_Llantas;
        this.Tipo_Caja = Tipo_Caja;
    }

    public String getCapacidad_Carga() {
        return Capacidad_Carga;
    }

    public void setCapacidad_Carga(String Capacidad_Carga) {
        this.Capacidad_Carga = Capacidad_Carga;
    }

    public int getCantidad_Llantas() {
        return Cantidad_Llantas;
    }

    public void setCantidad_Llantas(int Cantidad_Llantas) {
        this.Cantidad_Llantas = Cantidad_Llantas;
    }

    public String getTipo_Caja() {
        return Tipo_Caja;
    }

    public void setTipo_Caja(String Tipo_Caja) {
        this.Tipo_Caja = Tipo_Caja;
    }
    @Override
    public String getAccountData() {
        return "";
    }
}
