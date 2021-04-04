# language: es

Característica: yo como usuario del servicio necesito abrir la pagina
  travelocity para realizar reservar una actividad de viaje

  @Actividad
  Escenario: abrir pagina en espaniol - Actividad - travelocity - con SerintyBDD
    Dado que un usuario esta en la pagina de travelocity por una actividad
    Cuando el usuario escoge la actividad - reserva hotel y escoge el horario de vuelo
    Entonces el deberia visualizar el total a pagar y el descuento si aplica