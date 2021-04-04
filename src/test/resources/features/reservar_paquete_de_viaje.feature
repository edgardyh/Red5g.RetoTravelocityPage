# language: es

Característica: yo como usuario del servicio necesito abrir la pagina
  travelocity para realizar reservas de un paquete de viaje

  @Descuento
  Escenario: abrir pagina - Paquete - travelocity - con SerintyBDD
    Dado que un usuario esta en la pagina de travelocity por un paquete
    Cuando el usuario escoge un hotel - lo reserva y escoge el horario de vuelo
    Entonces el deberia visualizar el total a pagar y el descuento

  @Fechas
  Escenario: abrir pagina - Paquete - Valida Fechas - Travelocity - SerenityBDD
    Dado que un usuario esta en la pagina de travelocity por un paquete
    Cuando llena formulario de manera incorrecta
    Entonces el deberia visualizar el mensaje de validacion de llenado incorrecto
