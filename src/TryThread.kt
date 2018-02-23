fun main(args: Array<String>) {
    val thread = MyThread("Ali")
    thread.start()
    println("Thread has started")
    val thread2 = MyThread("Budi")
    thread2.start()

    //The codes above will print:
    /*
    Thread has started
    Ali : 0
    Budi : 0
    Ali : 1
    Budi : 1
    Ali : 2
    Budi : 2
    Ali : 3
    Budi : 3
    Ali : 4
    Budi : 4
    */

    joinedThread()
}

fun joinedThread() {
    val ciciThread = MyThread("Cici")
    val doniThread = MyThread("Doni")
    val ediThread = MyThread("Edi")
    println("Threads started")
    ciciThread.start()
    doniThread.start()
    ediThread.start()
    ediThread.join() //codes afher this line won't be executed after the thread is finished
    println("Threads ended")
}
class MyThread(var id: String): Thread() {

    override fun run() {
        var count = 0
        while (count < 5) {
            println("$id : $count")
            count++
            try {
                Thread.sleep(500)
            } catch (ex: Exception) {
                print(ex.message)
            }
        }
    }
}