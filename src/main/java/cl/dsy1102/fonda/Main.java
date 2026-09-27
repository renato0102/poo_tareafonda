package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {
        GestorFonda gestor =  new GestorFonda();
        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        BebidaAlcoholica chicha = new BebidaAlcoholica("Chicha", 1000, 40, 12.0, false, true);
        Bebida pisco = new BebidaAlcoholica("Pisco Sour", 500, 25, 18.0,true, false );
        Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha ", 1000, 60, 95);
        Bebida mote = new BebidaSinAlcohol("Mote con huesillo", 400, 50, 70);
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
         chicha.restringirVenta();
         //((BebidaAlcoholica) chichaAlc).restringirVenta(); (Este es en caso que la chicha la tengas identificada solo con Bebida sin agregarle el aloholica)
        // TODO 3: registrarlas todas en el gestor.
        gestor.registrar(chicha);
        gestor.registrar(pisco);
        gestor.registrar(chichaSinAlcohol);
        gestor.registrar(mote);

        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        System.out.println("---SOLICITU DE VENTAS---");
        gestor.vender("Pisco Sour", 2);
        gestor.vender("Pisco Sour", 5);
        gestor.vender("Chicha", 1);
        gestor.vender("Mote con huesillo", 6);

        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.
        System.out.println("BUSQUEDA POR NOMBRE: Chicha");
        for (Bebida bebida : gestor.getBebidas()){
            if(bebida.getNombre().equalsIgnoreCase("Chicha"));
            System.out.println("");
        }
        System.out.println("===LISTADO DE BEBIDAS===");
        for(Bebida bebida: gestor.getBebidas())
            System.out.println("Nombre: "+ bebida.getNombre()+ " | Volumen: "+ bebida.getVolumenML()+ "ml");



        System.out.println("Proyecto listo. Comienza por la clase Bebida.");
    }
}
