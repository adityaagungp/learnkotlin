package classes

//interface example
interface Shape {

    //uninitialized property is allowed
    //var id: String

    fun getArea(): Double

    //Kotlin allow non-empty method in interface
    fun notifyShape() {
        println("I am shape")
    }
}

open class Rectangle(): Shape {

    var baseSide: Int = 0
    var heightSide: Int = 0

    constructor(base: Int, height: Int): this() {
        baseSide = base
        heightSide = height
    }

    override fun getArea(): Double {
        return (baseSide * heightSide).toDouble()
    }
}

class Triangle(): Shape {

    var base: Int = 0
    var height: Int = 0

    constructor(base: Int, height: Int): this() {
        this.base = base
        this.height = height
    }

    override fun getArea(): Double {
        return (base * height).toDouble() / 2
    }

    override fun notifyShape() {
        println("I am triangle")
    }
}

interface Drawing {
    fun draw()
}

class Square(): Rectangle(), Drawing {

    constructor(side: Int): this() {
        baseSide = side
        heightSide = side
    }

    override fun draw() {
        print("me square")
    }
}

fun main(args: Array<String>) {

    val mRect = Rectangle(10, 8)
    println(mRect.getArea())
    mRect.notifyShape()

    val mTriangle = Triangle(9, 5)
    mTriangle.notifyShape()
    println(mTriangle.getArea())

    val mSquare = Square(10)
    mSquare.notifyShape()
    mSquare.draw()
}