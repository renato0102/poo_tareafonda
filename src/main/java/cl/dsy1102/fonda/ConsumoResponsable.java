package cl.dsy1102.fonda;
// solo se definen los elemetos
public interface ConsumoResponsable {
    boolean tieneVentaRestringida();
    void restringirVenta();
    boolean superaLimite(int unidades);
}
