package classes

//Defining class with its attribute
class Employee(name: String) {

    init {
        println("$name is created")
    }
}

class Employee2(var name: String, var age: Int) {

    init {
        println("$name with age $age is created")
    }

    fun sayHello() {
        println("Hello my name is " + name)
    }
}

//more proper way to define class
class House() {

    var address: String = ""
    var number: Int = 0
    var owner: String = ""

    constructor(address: String, number: Int, owner: String):this() {
        this.address = address
        this.number = number
        this.owner = owner
    }

    constructor(address: String): this() {
        this.address = address
    }
}

fun main(args: Array<String>) {

    val e1 = Employee("Budi")
    //The code below result error in compilation
    //val name = e1.name

    val e2 = Employee2("Joko", 30)
    println(e2.name)

    val house = House("Jalan Kancil", 22, "Ali")
    println(house.address)
}