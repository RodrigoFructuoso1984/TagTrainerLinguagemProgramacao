open class Book (val title: String, val author: String) {

    open var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "texto") : Book(title, author) {
   var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}

fun main(args: Array<String>) {
    val book = Book("Caso Colombo", "Rodrigo Fructuoso")
    println("\nTítulo: ${book.title} - Autor: ${book.author}")

    book.readPage()
    println("Páginas lidas: ${book.currentPage}")
    book.readPage()
    println("Páginas lidas: ${book.currentPage}")

    val ebook = eBook("O Senhor dos Anéis", "J.R.R. Tolkien")
    println("\nTítulo: ${ebook.title} - Autor: ${ebook.author}")
    println("Palavras lidas por página: ${ebook.wordCount}") // Saída: 0

    ebook.readPage()
    println("Palavras lidas por página: ${ebook.wordCount}") // Saída: 250

    ebook.readPage()
    println("Palavras lidas por página: ${ebook.wordCount}")

}