/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import panaderia.Producto;

/**
 *
 * @author Administrador
 */
public class ModeloTabla extends AbstractTableModel {
    
    private String  nombres[] = {"Sku","Nombre Pan","Tipo Pan","Precio","Costo","Cantidad"};
    
    public ModeloTabla(){
     
    }
    @Override
    public int getRowCount() {
        return FormularioPedidos.productos.size();
    }

    @Override
    public int getColumnCount() {
       return nombres.length;
    }
    
    @Override
    public String getColumnName(int column){
        return nombres[column];
    }
    
    public void agregarFila(Producto producto){
        FormularioPedidos.productos.add(producto);
        this.fireTableRowsInserted( FormularioPedidos.productos.size(), FormularioPedidos.productos.size());
    }
    public void eliminarFila(int index){
        FormularioPedidos.productos.remove(index);
        this.fireTableRowsDeleted(index,index);
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return FormularioPedidos.productos.get(rowIndex).getSku();
            case 1: return FormularioPedidos.productos.get(rowIndex).getSpecProducto().getNombre();
            case 2: return FormularioPedidos.productos.get(rowIndex).getSpecProducto().getFabricante();
            case 3: return FormularioPedidos.productos.get(rowIndex).getPrecio();
            case 4: return FormularioPedidos.productos.get(rowIndex).getCosto();
            case 5: return FormularioPedidos.productos.get(rowIndex).getCantidad();
            default: return null;

        }
    }
    
    @Override
    public void setValueAt (Object dato, int fila, int columna) {
         
        Producto aux = FormularioPedidos.productos.get(fila);    
        Producto ax = (Producto)dato;
        switch (columna) {
            
           case 0:                                                      
               FormularioPedidos.productos.get(fila).getSku();
               break;
          
           case 1:                                                       
               FormularioPedidos.productos.get(fila).getSpecProducto().getNombre();
               break;
           
           case 2:                                                       
              FormularioPedidos.productos.get(fila).getSpecProducto().getFabricante();
               break;
           case 3:
               FormularioPedidos.productos.get(fila).getPrecio();
               break;
           case 4:
                FormularioPedidos.productos.get(fila).getCosto();
               break;
           case 5:
               FormularioPedidos.productos.get(fila).getCantidad();
               break;
               
               
        }
        this.fireTableCellUpdated(fila,columna);
        this.fireTableRowsUpdated(fila,fila);
    }

}
