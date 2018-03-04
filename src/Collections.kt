
fun main(args: Array<String>) {

    //array declaration and initialization
    var nums = Array<Int>(5) {0}
    var numbers: Array<Int> = arrayOf(9, 4, 30, -2, 7)

    //iteration with index
    for (i in 0 until numbers.size) {
        println(numbers[i])
    }

    //iteration with items
    for (i in numbers) {
        println(i)
    }

    //two dimensional array
    val matrix: Array<Array<Int>> = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
    )

    for (i in 0..2) {
        for (j in 0..2) {
            if (j > 0) {
                print(" ")
            }
            print(matrix[i][j])
        }
        println()
    }

    //arraylist
    val list = ArrayList<String>()
    list.add("Budi")
    list.add("Chandra")
    list.remove("Budi")

    println("Size of list is " + list.size)
    if (list.contains("Budi")) {
        println("Budi is found")
    } else {
        println("Budi is not found")
    }

    val list2 = listOf("Dede", "Fajar", "Gina")
    val newList = list.plus(list2)
    println(newList)

    //HashMap
    val map = HashMap<Int, String>()
    map.put(1, "Budi")
    map.put(2, "Roni")
    map.put(9, "Dede")

    //access entries
    for (m in map.entries) {
        println("(" + m.key + ", " + m.value + ")")
    }

    //read values only, both loops works
    for (value in map.values) {
        println(value)
    }
    for (key in map.keys) {
        println(map.get(key))
    }

    //put method updates existing value
    map.put(9, "Cinta")
    println(map.get(9))

    //deletion
    map.remove(2)
    println("Hashmap size now: " + map.size)
}