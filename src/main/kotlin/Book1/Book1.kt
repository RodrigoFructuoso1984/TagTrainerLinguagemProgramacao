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
    val book = Book("A Guerra dos Tronos", "George R. R. Martin", 1996)

    val titleAuthorYearTriple = book.titleWithAuthorWithYearTriple()
    val (nome, author, title) = titleAuthorYearTriple
    println(nome)git
    println(author)
    println(title)
    println("Aqui está o livro ${titleAuthorYearTriple.first}," +
            " escrito por ${titleAuthorYearTriple.second}" +
            " em ${titleAuthorYearTriple.third}")
}