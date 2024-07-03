Feature: Ingresar al login

  @testorange
  Scenario: Ingresar al login correctamente
    Given ingreso a la pagina web
    And ingreso el username "Admin"
    And  ingreso la contraseña "admin123"
    When hago clic en el boton iniciar sesion
    Then se deberia ingresar correctamente
    And valido que se muestre la etiqueta "Dashboard"
    And hago clic en el boton admin
    And ingreso en la barra de busqueda el usuario "datamining"
