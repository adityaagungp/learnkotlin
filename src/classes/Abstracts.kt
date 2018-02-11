package classes

//example of abstract class
abstract class Article {

    var title: String = ""
    abstract fun post()
}

class NewsArticle(): Article() {

    constructor(title: String): this() {
        this.title = title
    }

    override fun post() {
        println("News is here")
    }
}