package cl.dsy1102.fonda;

public abstract class Bebida {
    //Definimos los atributos
    //Atributos de Identificacion
    protected String nombre;
    protected int volumenML;
    //Atributo de estado
    protected int stock;

    // Metodos
    //Constructor
    public Bebida(String nombre, int volumenML, int stock){
        this.nombre= nombre;
        this.volumenML=volumenML;
        this.stock = stock;

    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if  (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("Ingrese el nombre de la bebida");
        }
        this.nombre = nombre;
    }

    public int getVolumenML() {
        return volumenML;
    }

    public void setVolumenML(int volumenML) {
        if (volumenML < 100 || volumenML > 3000){
            throw new IllegalArgumentException("El volumen tiene que estar entre 100 y 3000 ml");
        }
        this.volumenML = volumenML;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock<0){
            throw new IllegalArgumentException("El stock debe ser mayor a 0");
        }
        this.stock = stock;
    }
    //Comportamientos
    public abstract double calcularPrecio();
    public abstract String obtenerDetalle();
    @Override
    public String toString(){
        return "Nombre:" + this.getNombre() + " | Volumen: " + this.getVolumenML();
    }


    public void setVentaRestringida() {
    }
}
