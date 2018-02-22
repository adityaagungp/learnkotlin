package classes

import java.util.ArrayList

class Stack<T> {

    var elements: ArrayList<T> = arrayListOf()
    var size: Int = 0

    fun push(element: T) {
        elements.add(0, element)
        size++
    }

    fun pop(): T? {
        //if-else way
        /*if (size > 0) {
            size--
            return elements.removeAt(0)
        } else {
            return null
        }*/
        /* Exception way
            Best practice is handle each predicted exception type
         */
        try {
            return elements.removeAt(0)
        } catch (ex: IndexOutOfBoundsException) {
            println("Stack is already empty")
        } catch (ex: Exception) {
            println(ex.message)
        }
        return null
    }
}

//Short example of extension, define additional methods to existing class
fun Stack<Int>.sumAll() : Int {
    var sum = 0
    for (e in elements) {
        sum += e
    }
    return sum
}

fun main(args: Array<String>) {
    val stack = Stack<Int>()
    stack.push(22)
    stack.push(44)
    stack.push(8)
    println(stack.size)
    //Code below cause error
    //stack.push("Ari")
    println(stack.pop())
    println("Stack size now: " + stack.size)
    println("Sum of all elements: " + stack.sumAll())

    val strings = Stack<String>()
    strings.push("Ali")
    strings.push("Budi")
    println(strings.size)
    println("Popping names:")
    println(strings.pop())
    println(strings.pop())
    //This line will cause exception
    println(strings.pop())
}