package panaderia;
/**
 * Clase enumerada que nos permite definir en la clase SpecProducto los tipos de pan.
 * @author Kevin Pozuelos
 */
public enum TipoPan {
    VACIO, TEMP, MANTECA, TOSTADO, FRANCES, OTRO;

    @Override
    public String toString() {
        switch (this) {
            case VACIO:
                return "-vacio-";
            case TEMP:
                return "tmp";
            case MANTECA:
                return "[Manteca]";
            case TOSTADO:
                return "[Tostado]";
            case FRANCES:
                return "[FRANCES]";
            case OTRO:
                return "[Otro]";
            default:
                return "[---]";
        }
    }
}
