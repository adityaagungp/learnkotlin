package classes

//declaring class that can be inherited
open class Zombie() {

    protected var name: String = ""

    constructor(name: String): this() {
        this.name = name
    }

    open fun shout() {
        println("I am $name")
    }

    fun kill() {
        println("I kill a person")
    }
}

class ParentZombie(): Zombie() {

    //visibility rule in Kotlin is similar with Java
    private var children: List<Zombie> = listOf()

    constructor(name: String): this() {
        this.name = name
    }

    //a way to override parent's method. The overridden method must be opened too
    override fun shout() {
        super.shout()
        println("I am a parent zombie.")
    }
}

fun main(args: Array<String>) {

    val z1 = Zombie("Ani")
    z1.shout()

    val parent = ParentZombie("Budi")
    parent.shout()

    //Type casting example
    val z2 = ParentZombie("Cahyo") as Zombie
    z2.kill()
}