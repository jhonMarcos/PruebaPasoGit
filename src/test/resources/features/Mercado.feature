# new feature
# Tags: optional

Feature: Agrego de producto

  @ingresarCuenta
  Scenario: Agrego de producto exitoso
    Given ingrese a la pagina web Mercado Libre
      And hago clic en ingresar
      And ingreso mi username "jhonmarcossoto@gmail.com"
      And ingreso mi contraseña "zanpakuto"
      When hago clic en iniciar sesion
      Then se mostrara la cuenta iniciada
