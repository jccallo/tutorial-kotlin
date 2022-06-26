fun main() {
   // Lists
   // puede ser mutable (listOf) o de solo lectura (mutableListOf)
   // puede acceder por medio de indices
   // puede contener elementos duplicados

    val theList = listOf("one", "two", "three", "four", 2)
    println(theList)
    
    val theMutableList = mutableListOf("one", "two", "three", "four")
    println(theMutableList)

    // agregra un elemento
    theMutableList.add("five")
    println("the list: $theMutableList")

    // iterar usando el elemento
    for (item in theList) {
        println(item)
    }

    // iterar usando el indice
    for (index in theList.indices) {
        println(theList[index])
    }

    // iterar usando forEach
    // is es equivalente a this en kotlin
    theMutableList.forEach { println(it) }
}