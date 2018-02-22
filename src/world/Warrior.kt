package world

class Warrior (var name: String) {

    private var health: Int = 0
    var medicine: Medicine = Medicine()

    fun setMedicine(point: Int) {
        //inner class can only be constructed on the outer class
        medicine = Medicine(point)
    }

    class Weapon {
        //this class won't able to access attributes of the outer class

        fun fire() {
            println("Fired")
        }
    }

    inner class Medicine() {

        var recoverPoint: Int = 0

        constructor(point: Int): this() {
            recoverPoint = point
        }

        fun recover() {
            println("Used by $name")
            health += recoverPoint
        }
    }
}