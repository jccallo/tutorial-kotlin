fun main() {
   // funciones
   fun sumTwo(a:Int, b:Int):Int{
      val x = a + b
      return x
   }

   // funciones lambda:
   // {variable with type -> body of the function}  
   val upperCase = { str: String -> str.toUpperCase() }  
   println( upperCase("hello, world!") )
}