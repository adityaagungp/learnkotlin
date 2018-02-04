
fun main(args: Array<String>) {

    //mapOf and hashMapOf
    val map = mapOf(1 to "Budi", 2 to "Cici", 4 to "Ari")
    println(map[4])

    val hashmap = hashMapOf(
            "Ani" to "Budi",
            1 to "Roy",
            "Cici" to 99.99
    )
    println(hashmap[1])
    println(hashmap["Cici"])

    //arrayOf
    val ar = arrayOf(1, 2, 3, 4, 5)
    println(ar[4])

    //listOf: immutable version of list
    val list = listOf(1, 5, 8, 100, 400)
    for (item in list) {
        println(item)
    }

    //mutableListOf: list element can be modified
    val list2 = mutableListOf(3, 5, 9)
    list2[2] = 2009
    for (item in list2) {
        println(item)
    }

    //setOf: immutable and unique objects container
    val set = setOf(1, 6, 9, 9, 69, 0)
    for (item in set) {
        println(item)
    }

    //mutableSetOf
    val mSet = mutableSetOf(2, 8, 0)
    mSet.add(3)
    for (item in mSet) {
        println(item)
    }
}