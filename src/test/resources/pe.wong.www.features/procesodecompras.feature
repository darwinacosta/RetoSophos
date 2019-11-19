#language:es

Característica: Ingresar a la pagina Wong y realizar el proceso
  de compra de un producto

  Esquema del escenario: Realizar el proceso de compra de un producto
    Dado Que el cliente ingresar a WONG
    Cuando Realizar la compra buscando el producto "<producto>" y agregar al carrito
    Entonces Validar que se haya agregado "<agregado>" al carrito exitosamente

    Ejemplos:

      | producto                                 | agregado                       |
      | Panetón Pasas Gourmet Flamigni Caja 1 kg | ¡Producto agregado al carrito! |
