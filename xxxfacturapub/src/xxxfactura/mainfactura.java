
package xxxfactura;

public class mainfactura   {
    
     public static void main(String[] args) {
      
          factura fact1 = new factura();
          
         fact1.documentooficial.meter_documentooficial();
        fact1.meter_factura();
         fact1.perecedero.producto.meter_producto();
         fact1.perecedero.meter_caducidad();
         fact1.cliente.meter_cliente();
         fact1.cliente.persona.meter_persona();
         fact1.cliente.persona.domicilio.meter_domicilio();
          
         fact1.documentooficial.mostrar_documentooficial();
         fact1.mostrar_factura();
         fact1.perecedero.producto.mostrar_producto();
         fact1.perecedero.mostrar_caducidad();
         fact1.cliente.mostrar_cliente();
         fact1.cliente.persona.mostrar_persona();
         fact1.cliente.persona.domicilio.mostrar_domicilio();
   
     
     }
    
}
