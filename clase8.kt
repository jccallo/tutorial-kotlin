fun main() {
   val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
   for (x in cars) {
      println(x)
   }

   val nums = arrayOf(1, 5, 10, 15, 20)
   for (x in nums) {
      println(x)
   }

   // ranges
   // Print the whole alphabet:
   for (chars in 'a'..'x') {
      println(chars)
   }

   // You can also create ranges of numbers:
   for (nums in 5..15) {
      println(nums)
    } 
}