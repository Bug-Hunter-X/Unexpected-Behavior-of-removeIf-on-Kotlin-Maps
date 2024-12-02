fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val keysToRemove = map.keys.filter { it % 2 == 0 }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=one, 3=three}
} 

//Alternative solution using filterTo

fun main(){
    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val filteredMap = map.filter { it.key % 2 != 0 }
    println(filteredMap) //Output: {1=one, 3=three}
}