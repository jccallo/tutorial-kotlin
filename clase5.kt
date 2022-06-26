fun main() {
   // tipo de dato booleano
   val x: Boolean = true
   val y: Boolean = false
   val z: Boolean = true

   // operadores logicos equivalente a los clasicos
   println("x.and(y) = " +  x.and(y))
   println("x.or(y) = " +  x.or(y))
   println("x.and(z) = " +  x.and(z))

   // boolean to string
   var w: String
   w = x.toString()
   println("x.toString() = " +  x.toString())
   println("w = " +  w)

   // tipo de dato string
   val name : String = "Zara Ali"
   println("Name  - $name")  // Using template with variable name
   println("Name length - ${name.length}")  // Using template with expression.

   // obtener la longitud de un string
   val name : String = "Zara Ali"
   println("The length of name :" + name.length)
   println("The length of name :" + name.count())

   // range
   // 1..10  // Range of integers starting from 1 to 10
   // a..z   // Range of characters starting from a to z
   // A..Z   // Range of capital characters starting from A to Z
   for ( num in 1..4 ) {
      println(num)
   }

   // ver mas operaciones con cadenas en:
   // https://www.w3schools.com/kotlin/kotlin_strings.php
   // https://www.tutorialspoint.com/kotlin/kotlin_strings.htm

   // mas sobre arrays:
   // https://www.w3schools.com/kotlin/kotlin_arrays.php
   // https://www.tutorialspoint.com/kotlin/kotlin_arrays.htm

   // mas sobre ranges:
   // https://www.tutorialspoint.com/kotlin/kotlin_ranges.htm
   // https://www.w3schools.com/kotlin/kotlin_ranges.php

}