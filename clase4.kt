fun main() {
   var x: Int = 40
   var y: Int = 30

   // operadores aritmeticos
   println("x + y = " +  (x + y))
   println("x - y = " +  (x - y))
   println("x / y = " +  (x / y))
   println("x * y = " +  (x * y))
   println("x % y = " +  (x % y))

   // operadores relacionales o condicionales
   println("x > y = " +  (x > y))
   println("x < y = " +  (x < y))
   println("x >= y = " +  (x >= y))
   println("x <= y = " +  (x <= y))
   println("x == y = " +  (x == y))
   println("x != y = " +  (x != y))

   // operadores de asignacion
   x += 5
   println("x += 5 = " + x )
   
   x = 40;
   x -= 5
   println("x -= 5 = " +  x)
   
   x = 40
   x *= 5
   println("x *= 5 = " +  x)
   
   x = 40
   x /= 5
   println("x /= 5 = " +  x)
   
   x = 43
   x %= 5
   println("x %= 5 = " + x)

   // operadores unarios
   var a: Int = 40
   var b: Boolean = true

   println("+a = " +  (+a))
   println("-a = " +  (-a))
   println("++a = " +  (++a))
   println("--a = " +  (--a))
   println("!b = " +  (!b))

   // operadores logicos
   var m: Boolean = true
   var n: Boolean = false

   println("m && n = " +  (m && n))
   println("m || n = " +  (m || n))
   println("!n = " +  (!n))
}