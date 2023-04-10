
package panaderia;

import interfaz.FormularioCliente;
import interfaz.FormularioPedidos;

public class Panaderia {

   
    public static void main(String[] args) {
        Producto pr1= new Producto(1001, 2.50, 10, 25,new SpecProducto("Frances", TipoPan.FRANCES));
        Producto pr2= new Producto(1002, 2.51, 8, 25,new SpecProducto("Champurrada", TipoPan.TOSTADO));
        Producto pr3= new Producto(1003, 2.52, 11, 25,new SpecProducto("Cachitos", TipoPan.MANTECA));
        Producto pr4= new Producto(1004, 2.53, 6, 25,new SpecProducto("Magdalena", TipoPan.OTRO));
        
        
       /* Pedido miPedido = new Pedido();
        
       miPedido.agregarProducto(pr1);
        miPedido.agregarProducto(pr2);
        miPedido.agregarProducto(pr3);
        miPedido.agregarProducto(pr4);
        miPedido.pagar( new Efectivo( "GTQ" ) );*/
        FormularioCliente f = new FormularioCliente(pr1,pr2,pr3,pr4);
        f.setVisible(true);
        
    }
    
}
