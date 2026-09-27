package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    //Atributo de indentificacion
    private int azucarPorLitro;
    //constructor
    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro){
        super (nombre, volumenML, stock);
        this.azucarPorLitro = azucarPorLitro;

    }

    //Getter y Setters
    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {this.azucarPorLitro = azucarPorLitro;
    }

    //Comportamientos
    @Override
    public double calcularPrecio() {
        double precioBase = 2000.0;
        if (this.getAzucarPorLitro() > 80) {
            //precioBase = precioBase + precioBase * 0.1
            precioBase = precioBase * 1.1;
        }
        return precioBase;
    }

    @Override
    public String obtenerDetalle() {
        String respuesta = "";
        respuesta = "Tipo: Bebida sin alcohol | ";
        respuesta += "Nombre: " + this.getNombre() + " | ";
        respuesta += "Volumen:  " + this.getVolumenML() + " ml | ";
        respuesta += "Stock: " + this.getStock() + " | ";
        respuesta += "Azucar: " + this.getAzucarPorLitro() + " g/L | ";
        respuesta += "Precio: " + this.calcularPrecio() + " \n " ;
        return respuesta;
    }
}
