package panaderia;
/**
 * Clase para manejar las especificaciones de cada Pan
 * @author Kevin Pozuelos
 */
public class SpecProducto {

    private String nombre;
    private TipoPan tipo;

    public SpecProducto(String nombre) {
        this(nombre, TipoPan.VACIO);
    }

    public SpecProducto(TipoPan tipo) {
        this("---", tipo);
    }

    public SpecProducto(String nombre, TipoPan tipo) {
        this.tipo = tipo;
        setNombre(nombre);
        setFabricante(tipo);
    }

    public SpecProducto() {
        this("---", TipoPan.VACIO);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFabricante(TipoPan fabricante) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return tipo.name();
    }

    public String toString() {
        return "\tnom:\t" + nombre + "\n\t\tfab:\t" + tipo;

    }
}
