fun main() {

   // precio del articulo
   print("¿Precio de articulo a comprar?: ")
   var precioArticulo = readLine()!!.toInt()

   // cantidad a comprar
   print("¿Cantidad de articulos a comprar?: ")
   var cantidadArticulo = readLine()!!.toDouble()

   // importe parcial
   var importe = precioArticulo * cantidadArticulo
   
   // descuento
   var descuento: Double;
   if (cantidadArticulo > 100) {
      descuento = importe * 0.4
   } else if (cantidadArticulo > 25) {
      descuento = importe * 0.2
   } else if (cantidadArticulo > 10) {
      descuento = importe * 0.1
   } else {
      descuento = 0.0;
   }

   // importe total
   var total = importe - descuento

   // salida
   println("Descuento: " + descuento)
   println("Total a pagar: " + total)

}

