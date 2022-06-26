fun main() {
   // tipos de datos numericos en kotlin
   val a: Int = 10000
   val d: Double = 100.00
   val f: Float = 100.00f
   val l: Long = 1000000004
   val s: Short = 10
   val b: Byte = 1
   println("Int Value is " + a)
   println("Double  Value is " + d)
   println("Float Value is " + f)
   println("Long Value is " + l )
   println("Short Value is " + s)
   println("Byte Value is " + b)

   // tipo de datos caracter
   val letter: Char    // defining a Char variable
   letter = 'A'        // Assigning a value to it
   println("$letter")

   // secuencias de escape de caracteres
   // Las siguientes secuencias de escape son compatibles con Kotlin: \t, \b, \n, \r, \', \", \\ y \$
   println('\n') //prints a newline character
   println('\$') //prints a dollar $ character
   println('\\') //prints a back slash \ character

   // tipos de datos string y la variante row string
   val escapedString : String  = "I am escaped String!\n"
   var rawString :String  = """This is going to be a
   multi-line string and will
   not have any escape sequence""";
   print(escapedString)
   println(rawString)

   // tipo de dato boleano
   val A: Boolean = true   // defining a variable with true value
   val B: Boolean = false   // defining a variable with false value

   println("Value of variable A "+ A )
   println("Value of variable B "+ B )

   // tipo de dato array
   val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5) // elementos de tipo int solamente
   println("Value at 3rd position : " + numbers[2])  // acceder al valor de un elemento

   val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange") // otra forma de crear array de un solo tipo de elemento

   val cars = arrayOf("Volvo", true, "Ford", 3) // acepta cualquier tipo de elemento
   println(cars[1])

   // Para convertir un tipo de datos numéricos en otro tipo, Kotlin proporciona un conjunto de funciones
   // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()
   val x: Int = 100
   val y: Long = x.toLong()

   println(y)
}