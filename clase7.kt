fun main() {
   val time = 20
   
   // if..else expresion
   // dentro de las llaves estas lo que se va a devolver
   val greeting = if (time < 18) {
      "Good day."
   } else {
      "Good evening."
   }

   println(greeting)


   val day = 4

   // when la ternativa a if..else
   // devuelve un valor se si ha hecho match
   val result = when (day) {
   1 -> "Monday"
   2 -> "Tuesday"
   3 -> "Wednesday"
   4 -> "Thursday"
   5 -> "Friday"
   6 -> "Saturday"
   7 -> "Sunday"
   else -> "Invalid day."
   }

   println(result)
}