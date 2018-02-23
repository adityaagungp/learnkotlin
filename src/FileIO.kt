import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    writeFile("Hello Ali", "Hello.txt")
    readFile("Hello.txt")
}

fun writeFile(string: String, fileName: String) {
    //by default, will place the file at first directory
    val writer = FileWriter(fileName)
    // If wanna append existing file
    // val writer = FileWriter(fileName, true)
    try {
        writer.write(string)
        writer.close()
    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun readFile(fileName: String) {
    val reader = FileReader(fileName)
    try {
        // Read entire line
        /*val text = reader.readText()
        println(text)*/
        do {
            val char: Int = reader.read()
            print(char.toChar())
        } while (char != -1)
    } catch (ex: Exception) {
        println(ex.message)
    }
}