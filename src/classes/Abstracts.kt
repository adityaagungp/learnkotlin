package classes

//example of abstract class
abstract class Article {

    var title: String = ""
    abstract fun post()
}

//example of enum declaration, similar with Java
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

class NewsArticle(): Article() {

    constructor(title: String): this() {
        this.title = title
    }

    override fun post() {
        println("News is here")
    }
}