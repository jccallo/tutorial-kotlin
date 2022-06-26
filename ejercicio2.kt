import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
   print("Ingrese la ubicacion: ")
   var ubicacion = readLine()!!.toString().lowercase()

   print("Ingrese el area: ")
   var area = readLine()!!.toString().lowercase()

   print("Ingrese el giro: ")
   var giro = readLine()!!.toString().lowercase()
   
   var monto =  when (ubicacion) {
      "miraflores" -> when (area) {
         "comercial" -> 15
         "principal" -> 13
         else -> 10 // "lateral"
      }
      "san isidro" -> when (area) {
         "comercial" -> 12
         "principal" -> 10
         else -> 8
      }
      "lince" -> when (area) {
         "comercial" -> 10
         "principal" -> 9
         else -> 6
      }
      else -> when (area) { // jesus maria
         "comercial" -> 14
         "principal" -> 12
         else -> 10
      }
   } 

   var porcentajeGiro = when(giro) {
      "abarrotes" -> 0.0
      "vestido y calzado" -> 0.15
      "electrodomestico" -> 0.20
      else -> 0.05 // alimentos y bebidas
   }
   
   var costoLicencia = monto + monto * porcentajeGiro


   val df = DecimalFormat("#.##")
   df.roundingMode = RoundingMode.CEILING

   // print(String.format("%.2f", costoEntrada))
   println(ubicacion)
   println(area)
   println(monto)
   println(porcentajeGiro)
   println(costoLicencia)
}