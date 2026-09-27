package cl.dsy1102.fonda;
import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    private List <Bebida>bebidas;
    //Constructor
    public GestorFonda() {
        this.bebidas = new ArrayList<>();
    }
    //Getters y Setters


    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    public void registrar(Bebida bebida){
        this.bebidas.add(bebida);
    }
    public List <Bebida> buscarPorNombre (String nombre){
        ArrayList <Bebida> bebidasRegistradas = new ArrayList<>();
        for(Bebida bebida: this.getBebidas()){
            if(bebida.getNombre().equalsIgnoreCase(nombre)){
                bebidasRegistradas.add(bebida);
            }
        }
        return bebidasRegistradas;
    }
    public void vender (String nombre, int unidades){
        List <Bebida> bebidasInventario = this.buscarPorNombre(nombre);
        for (Bebida bebida : bebidasInventario){
            if(bebida.getStock() >= unidades){
                if (bebida instanceof ConsumoResponsable){
                    boolean checked;
                    checked = ((ConsumoResponsable) bebida).superaLimite(unidades);
                    if (checked){
                        throw new IllegalArgumentException("Se supera el limite de venta");
                    }

                }

            }
        }

    }
}
