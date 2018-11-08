#language:es
Característica: Realizar reservas de vuelo

  Escenario: Como usuario requiero realizar reservas de vuelo
    Dado marcela requiere realizar una reserva de vuelo
      | usuario      | contrasena | confirmarcontrasena |
      | pepitoperez1 |   12345678 |            12345678 |
    Cuando marcela registra la informacion necesaria para el vuelo
    Entonces ella deberia poder verificar su vuelo exitosamente
