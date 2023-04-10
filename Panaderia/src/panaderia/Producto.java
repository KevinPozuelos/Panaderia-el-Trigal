package panaderia;
/**
 * Clase que define un Producto con sus respectivos atributos
 * @author Kevin Pozuelos 
 */
public class Producto {

    private int sku;
    private double precio;
    private double costo;
    private int cantidad;
    private SpecProducto specProducto;

    public Producto(int sku, double precio, double costo, int cantidad, SpecProducto specProducto) {
        setSku(sku);
        setPrecio(precio);
        setCosto(costo);
        setCantidad(cantidad);
        setSpecProducto(specProducto);
    }

    public Producto() {
        this(0, 0.0, 0.0, 0, new SpecProducto());
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSpecProducto(SpecProducto specProducto) {
        this.specProducto = specProducto;
    }

    public int getSku() {
        return sku;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public SpecProducto getSpecProducto() {
        return specProducto;
    }

    public String toString() {
        return "\tsku:\t" + sku + "\n\tcos:\t" + costo + "\n\tpre:\t" + precio + "\n\tcan:\t" + cantidad
                + "\n\tspc:\t{\n\t" + specProducto + "\n\t}";
    }
}
