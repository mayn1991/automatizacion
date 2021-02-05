#Author: marcoyon01.1991@gmail.com

@tag
Feature: flujo de compras
        
  @ingresarusuario
  Scenario Outline: como usuario quiero ingresar con mi usuario
    Given que ingreso a la tienda virtual
    And hago click en el Sign in
    When ingreso el mail "<mail>" y su contrasenia "<contrasenia>"
    Then valido que ingreso el usuario 

    Examples: 
      | mail  | contrasenia | 
      | marco2022@gmail.com |     Tintaya123. | 

   @busquedaproducto
   Scenario Outline: como usuario quiero validar que busque la blusa
    Given que ingreso a la tienda virtual
    When ingreso el producto "<producto>" 
    Then valido a buscado correctamente

    Examples: 
      | producto  | 
      | blouse |     
   
   @agregarcarro
    Scenario Outline: como usuario quiero agregar carrito el producto de verano
    Given que ingreso a la tienda virtual
    And hago click en el Sign in
    And ingreso el mail "<mail>" y su contrasenia "<contrasenia>"
    When seleccione vestido de verano
    And agrego el producto "<productoverano>" 
    And seleccione vestido de noche
    And agrego el producto "<productonoche>" 
    And seleccione vestido casual
    And agrego el producto "<productocasual>"
    And hacemos click checkout 
    And hacemos click para pasar a direccion
    And hacemos click para pasar a envios
    And hacemos click para pasar a pagos
    And hacemos click en pago por bancos
    And hacemos click en confirmar orden
    Then valido que se la orden esta completada

    Examples: 
      |mail|contrasenia| productoverano  | productonoche|productocasual|
      |marco2022@gmail.com |     Tintaya123. | Printed Chiffon Dress | Printed Dress|Printed Dress|
      
   @visualizarlistadoordenes
    Scenario Outline: como usuario quiero comprobar todas mis ordenes
    Given que ingreso a la tienda virtual
    And hago click en el Sign in
    And ingreso el mail "<mail>" y su contrasenia "<contrasenia>"
    When hacemos click en Order history and details
    Then valido todos los registros realizados 
     Examples: 
      | mail  | contrasenia | 
      | marco2022@gmail.com |     Tintaya123. | 
    