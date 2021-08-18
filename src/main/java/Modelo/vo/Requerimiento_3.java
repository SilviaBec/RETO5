package Modelo.vo;

public class Requerimiento_3 {
// Su código

//esto lo hicimos en clase consulta 5 fijo revisar en reto


    public String Proveedor;
    public String Pagado;
    public String Constructora;


public Requerimiento_3(){

}

    public Requerimiento_3(String proveedor, String pagado, String constructora) {
        Proveedor = proveedor;
        Pagado = pagado;
        Constructora = constructora;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    public String getPagado() {
        return Pagado;
    }

    public void setPagado(String pagado) {
        Pagado = pagado;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }  


}
