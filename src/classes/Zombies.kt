package classes

import java.util.*

//declaring class that can be inherited
open class Zombie(): Comparable<Zombie> {

    protected var name: String = ""

    constructor(name: String): this() {
        this.name = name
    }

    fun getZombieName(): String {
        return name
    }

    open fun shout() {
        println("I am $name")
    }

    fun kill() {
        println("I kill a person")
    }

    override fun compareTo(other: Zombie): Int {
        when {
            name < other.name -> return -1
            name > other.name -> return 1
            else -> return 0
        }
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
    z2.shout()

    val zombies = arrayListOf<Zombie>()
    zombies.add(Zombie("Benny"))
    zombies.add(Zombie("Chandra"))
    zombies.add(Zombie("Ari"))
    zombies.add(Zombie("Bana"))

    Collections.sort(zombies)
    for (zombie in zombies) {
        println(zombie.getZombieName())
    }
}