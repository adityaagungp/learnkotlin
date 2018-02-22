package world


//Example of singleton class
class Creator {

    private constructor() {
        println("Creator is created")
    }

    companion object {
        val instance: Creator by lazy { Creator() }
    }

    fun announce() {
        println("I am the creator")
    }
}