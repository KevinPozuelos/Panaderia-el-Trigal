package panaderia;

/**
 *
 * @author Kevin Pozuelos
 * @author Welmann Paniagua 
 * Clase que implementa la interface Forma de pago
 */
public class Efectivo implements FormaPago {

    private String moneda;

    public String getMoneda() {
        return moneda;
    }

    public Efectivo(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public void pagar(double total) {
        System.out.println("El pago ha sido, en efectivo, con la moneda '" + moneda + "', un total de: " + total);
    }

}
