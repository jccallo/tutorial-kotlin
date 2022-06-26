import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
   print("Ingrese el dia: ")
   var dia = readLine()!!.toString().lowercase()

   print("Ingrese el dia: ")
   var edad = readLine()!!.toInt()
   
   var descuento = 0.0
   var costoEntrada = 0.0

   if (dia == "martes" && edad < 25) {
      descuento = 12 * 0.25
   } else if (dia == "miercoles" && edad > 60) {
      descuento = 12 * 0.40                                    
   } else if (dia == "jueves") {
      descuento = 12 * 0.20
   }
   
   costoEntrada = 12 - descuento

   val df = DecimalFormat("#.##")
   df.roundingMode = RoundingMode.CEILING

   // print(String.format("%.2f", costoEntrada))
   print(df.format(costoEntrada)))
}
