/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.table.AbstractTableModel;
import panaderia.Pedido;
import panaderia.Producto;

/**
 *
 * @author Administrador
 */
public class ModeloPedido extends AbstractTableModel {

      private String  nombres[] = {"Nombre Cliente","Tipo Pan","Nombre Pan","Forma de Pago","Total"};
    
    public ModeloPedido(){
     
    }
    @Override
    public int getRowCount() {
        return FormularioCliente.pedidos.size();
    }

    @Override
    public int getColumnCount() {
       return nombres.length;
    }
    
    @Override
    public String getColumnName(int column){
        return nombres[column];
    }
    
    public void agregarFila(Pedido pedido){
        FormularioCliente.pedidos.add(pedido);
        this.fireTableRowsInserted( FormularioPedidos.productos.size(), FormularioPedidos.productos.size());
    }
    public void eliminarFila(int index){
        FormularioCliente.pedidos.remove(index);
        this.fireTableRowsDeleted(index,index);
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return FormularioCliente.pedidos.get(rowIndex).getNombreCliente();
            case 1: return FormularioCliente.pedidos.get(rowIndex).getProducto().getSpecProducto().getFabricante();
            case 2: return FormularioCliente.pedidos.get(rowIndex).getProducto().getSpecProducto().getNombre();
            case 3: return FormularioCliente.pedidos.get(rowIndex).getMoneda().getMoneda();
            case 4: return FormularioCliente.pedidos.get(rowIndex).getTotal();
            default: return null;

        }
    }
    
    @Override
    public void setValueAt (Object dato, int rowIndex, int columna) {
         
        Producto aux = FormularioPedidos.productos.get(rowIndex);    
        Producto ax = (Producto)dato;
        switch (columna) {
            
           case 0:                                                      
              FormularioCliente.pedidos.get(rowIndex).getNombreCliente();
               break;
          
           case 1:                                                       
               FormularioCliente.pedidos.get(rowIndex).getProducto().getSpecProducto().getFabricante();
               break;
           
           case 2:                                                       
             FormularioCliente.pedidos.get(rowIndex).getProducto().getSpecProducto().getNombre();
               break;
           case 3:
              FormularioCliente.pedidos.get(rowIndex).getMoneda();
               break;
           case 4:
                FormularioCliente.pedidos.get(rowIndex).getTotal();
               break;
                        
               
        }
        this.fireTableCellUpdated(rowIndex,columna);
        this.fireTableRowsUpdated(rowIndex,rowIndex);
    }
    
}
