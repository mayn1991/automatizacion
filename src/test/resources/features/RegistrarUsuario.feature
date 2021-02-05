#Author: marcoyon01.1991@gmail.com

@tag
Feature: registrar usuario

 @registrousuarios
  Scenario Outline: como usuario quiero registrarme en la tienda virtual  
    Given que ingreso a la tienda virtual
    And hago click en el Sign in
    When creo una nueva cuenta "<mail>"
    And ingreso la informacion personal como su nombre "<nombre>"
    And ingreso su apellido "<apellido>"
    And ingreso su contrasenia "<contrasenia>"
    And ingreso su direccion "<direccion>"
    And ingreso su ciudad "<ciudad>"
    And ingreso su estado "<estado>"
    And ingreso su codigo postal "<codigo>"
    And ingreso la ciudad "<ciudad>"
    And ingreso el pais "<pais>"
    And ingreso su numero celular "<celular>"
    And ingreso su referencia "<referencia>"
    Then valido el registro de mi cuenta
    
 		Examples: 
      | mail  | nombre| contrasenia|apellido|direccion|ciudad|estado|codigo|ciudad|pais|celular|referencia|
      | marco.2021@gmail.com |marco|      Tintaya123.| perez|lima|lima|lima|12345|Peru|944990505|a lado |asdadas|