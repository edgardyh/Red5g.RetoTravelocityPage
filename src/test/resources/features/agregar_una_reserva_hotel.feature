# language: es

Característica: yo como usuario del servicio necesito abrir la pagina
  travelocity para realizar reservas de viajes

  @Aereo
  Escenario: abrir pagina - Vuelo - travelocity - con SerintyBDD
    Dado que un usuario esta en la pagina de travelocity
    Cuando el usuario busca - un destino - un hotel - lo reserva - escoge tipo de habitacion y aerolinea
    Entonces el deberia visualizar el monto a pagar en pantalla

  @Terrestre
  Escenario: abrir pagina - Terrestre - travelocity - con SerintyBDD
    Dado que un usuario esta en la pagina de travelocity
    Cuando el usuario busca un hotel - lo reserva - escoge tipo de habitacion y transporte terrestre
    Entonces el deberia visualizar el monto total a pagar y la validacion de campo