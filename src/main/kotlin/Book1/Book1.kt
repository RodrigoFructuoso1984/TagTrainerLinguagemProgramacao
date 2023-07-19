package Book1

class Book(val title: String, val author: String, val year: Int) {
    fun titleWithAuthorPair(): Pair<String,String>{
        return  title to author
    }

    fun titleWithAuthorWithYearTriple(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }

    fun canBorrow(hasBook: Int) : Boolean {
        return hasBook < MAX_NUMBERS_BOOKS
    }

    fun printUrl() {
        val url = createUrl(title)
        println(url)
    }


    companion object {
        const val BASE_URL = "https://www.library.com/books/"
        fun createUrl(title: String) : String {
            return BASE_URL + title + ".html"
        }
    }

}

fun main(args: Array<String>) {

    val book = Book("A Guerra dos Tronos", "George R. R. Martin", 1996)

    book.printUrl()
    println(book.canBorrow(hasBook = 2))

    val titleAuthorYearTriple = book.titleWithAuthorWithYearTriple()
    val (title, author, year) = titleAuthorYearTriple
    println(year)
    println(author)
    println(title)
    println("Aqui está o livro ${titleAuthorYearTriple.first}," +
            " escrito por ${titleAuthorYearTriple.second}" +
            " em ${titleAuthorYearTriple.third}")

    val allBooks: MutableList<String> = mutableListOf("Romeo and Juliet", "Hamlet", "Macbeth", "Othello")
    val library: Map<String, MutableList<String>> = mapOf("William Shakespeare" to allBooks)
    //println(library.get("William Shakespeare"))
    //library.contains("Hamlet")
    //library.any { it.value.contains("Hamlet") }

    val isHamlet = library.any { it.value.contains("Hamlet") }
    println("Is there any book called Hamlet? $isHamlet")

    val moreBooks = mutableMapOf<String, String>()
    moreBooks["The Tempest"] = "William Shakespeare"

    //val title = "Hamlet"
    //val title = "The Tempest"

    if (!moreBooks.containsKey(title)) {
        moreBooks[title] = "William Shakespeare"
    }

    println("Teste" + moreBooks)


}

const val MAX_NUMBERS_BOOKS = 20