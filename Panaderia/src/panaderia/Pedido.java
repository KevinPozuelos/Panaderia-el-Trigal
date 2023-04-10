package panaderia;

import java.util.LinkedList;
import java.util.List;
/**
 * Clase pedido para ingreso de datos con los respectivos atributos
 * @author Kevin Pozuelos
 */
public class Pedido {

    private String nombreCliente;
    private Producto producto;
    private Efectivo moneda;
    private double total;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Efectivo getMoneda() {
        return moneda;
    }

    public void setMoneda(Efectivo moneda) {
        this.moneda = moneda;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public List<Producto> getListado() {
        return listado;
    }

    public void setListado(List<Producto> listado) {
        this.listado = listado;
    }

    public Fecha getFechaFormalizacion() {
        return fechaFormalizacion;
    }

    public void setFechaFormalizacion(Fecha fechaFormalizacion) {
        this.fechaFormalizacion = fechaFormalizacion;
    }
    private EstadoPedido estado;
    private List<Producto> listado;
    private Fecha fechaFormalizacion;

    public Pedido() {
        listado = new LinkedList<Producto>();
        estado = EstadoPedido.TEMPORAL;
        fechaFormalizacion = new Fecha();
    }

    public void agregarProducto(Producto producto) {
        estado = EstadoPedido.INICIANDO;
        this.producto = producto;
        listado.add(producto);
    }

    public double calcularTotal() {
        estado = EstadoPedido.PENDIENTE;
        double subTotal = 0.0;

        for (Producto producto : listado) {
            subTotal += producto.getPrecio();
        }

        return subTotal;
    }

    public void pagar(FormaPago formaPago) {

        fechaFormalizacion = new Fecha(16, 12, 2020);
        estado = EstadoPedido.PROCESANDO;
        double total = calcularTotal();
        this.total = total;
        formaPago.pagar(total);
        estado = EstadoPedido.PAGADO;
    }
}
