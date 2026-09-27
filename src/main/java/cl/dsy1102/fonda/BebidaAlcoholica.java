package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {
    //Constantes
    private static  final int LIMITE_UNIDADES_POR_CLIENTE = 3;
    //Atributos de identificacion
    private double gradosAlcohol;
    private boolean certificada;
    // Atributo de estado
    private boolean ventaRestringida;
    //Contructor
    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradosAlcohol, boolean certificada, boolean ventaRestringida){
        super(nombre, volumenML, stock);
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
    }

    //Getter y Setters


    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }
    // Comportamientos

    @Override
    public double calcularPrecio() {
        double precioBase = 3500.0;
        if(!this.isCertificada())
            //precioBase = precioBase * 0.2
            precioBase = precioBase*1.2;
        return precioBase;
    }
    //Comportamientos de herencia

    @Override
    public String obtenerDetalle() {
        String esCertificada = this.isCertificada()? "Si" : "No";
        String esVentaRestringida = this.isVentaRestringida()? "Si" : "No";
        String respuesta = "";
        respuesta = "Tipo: Bebida alcoholica | ";
        respuesta += "Nombre: " + this.getNombre() + " | ";
        respuesta += "Volumen:  " + this.getVolumenML() + " ml | ";
        respuesta += "Stock: " + this.getStock() + " | ";
        respuesta += "Alchol: " + this.getGradosAlcohol() + " | ";
        respuesta += "Certificada: " + this.isCertificada() + " | ";
        respuesta += "Venta restringida: " + this.isVentaRestringida() + " | ";
        respuesta += "Precio: " + this.calcularPrecio() + " \n " ;
        return respuesta;
    }
    //comportamientos de interfaz

    @Override
    public boolean tieneVentaRestringida() {
        return this.isVentaRestringida();
    }

    @Override
    public void restringirVenta() {
        this.setVentaRestringida(true);

    }

    @Override
    public boolean superaLimite(int unidades) {
        return unidades > BebidaAlcoholica.LIMITE_UNIDADES_POR_CLIENTE;
    }



}
