package world


fun main(args: Array<String>) {
    val warrior = Warrior("Ali")
    var weapon = Warrior.Weapon()
    //this won't work
    //var medicine = Warrior.Medicine(10)
    warrior.setMedicine(10)
    //but to only access the method, it's possible
    println("Medicine has " + warrior.medicine.recoverPoint + " point")
    warrior.medicine.recover()

    //The instance is instantiated once at the whole program
    val creator: Creator = Creator.instance
    creator.announce()

    val creator2 = Creator.instance
    creator2.announce()

    val creator3 = Creator.instance
    creator3.announce()
}