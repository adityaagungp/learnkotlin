
fun main(args: Array<String>) {

    //simple loop to print even number
    for (i in 1..100) {
        //may contains lines of code, or even another loop
        if (i % 2 == 0) {
            println(i)
        }
    }

    for (i in 0..100 step 2) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    //half-open range loop, 10 won't be printed
    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    //create loop with while
    var count = 1
    while (count < 10) {
        println(count)
        count++
    }

    //loop with do-while, has quite different flow with while loop
    var index = 10
    do {
        println(index)
        index--
    } while (index > 0)

    //continue and break example
    for (i in 1..10) {
        if (i == 5) {
            //will return to the loop immediately
            continue
        } else if (i == 9) {
            //will exit parent loop
            break
        }
        println(i)
    }

    //break the desired loop
    loop1@ for (i in 1..10) {
        for (j in 1..5) {
            if (j % 3 == 0) {
                break@loop1
            }
            println("($i,$j)")
        }
    }
}