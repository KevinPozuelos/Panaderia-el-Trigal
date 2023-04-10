package panaderia;

/**
 * Clase enumerada para controlar los estados de los pedidos de la clase Pedido
 *
 * @author Kevin Pozuelos
 */
public enum EstadoPedido {
    VACIO, TEMPORAL, INICIANDO, PENDIENTE, PAGADO, PROCESANDO, ENVIANDO, ENTREGADO;

    public String toString() {
        switch (this) {
            case VACIO:
                return "(vacio)";
            case TEMPORAL:
                return "temporal";
            case INICIANDO:
                return "iniciando";
            case PENDIENTE:
                return "pendiente";
            case PAGADO:
                return "pagado";
            case PROCESANDO:
                return "procesando";
            case ENVIANDO:
                return "enviando";
            case ENTREGADO:
                return "entregado";
            default:
                return "(---)";
        }
    }
}
