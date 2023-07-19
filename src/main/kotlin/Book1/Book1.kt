package Book1

class Book(val title: String, val author: String, val year: Int) {
    fun titleWithAuthorPair(): Pair<String,String>{
        return  title to author
    }

    fun titleWithAuthorWithYearTriple(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }

}

fun main(args: Array<String>) {
    /*val book = Book("A Guerra dos Tronos", "George R. R. Martin", 1996)

    val titleAuthorYearTriple = book.titleWithAuthorWithYearTriple()
    val (nome, author, title) = titleAuthorYearTriple
    println(nome)
    println(author)
    println(title)
    println("Aqui está o livro ${titleAuthorYearTriple.first}," +
            " escrito por ${titleAuthorYearTriple.second}" +
            " em ${titleAuthorYearTriple.third}")*/

    val allBooks: MutableList<String> = mutableListOf("Romeo and Juliet", "Hamlet", "Macbeth", "Othello")
    val library: Map<String, MutableList<String>> = mapOf("William Shakespeare" to allBooks)
    //println(library.get("William Shakespeare"))
    //library.contains("Hamlet")
    //library.any { it.value.contains("Hamlet") }

    val isHamlet = library.any { it.value.contains("Hamlet") }
    println("Is there any book called Hamlet? $isHamlet")

    val moreBooks = mutableMapOf<String, String>()
    moreBooks["The Tempest"] = "William Shakespeare"

    val title = "Hamlet"
    //val title = "The Tempest"

    if (!moreBooks.containsKey(title)) {
        moreBooks[title] = "William Shakespeare"
    }

    println("Teste" + moreBooks)
}