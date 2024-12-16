package com.example.kotlin_classes.abschluss_abgabe

class Library {
    private val books = mutableListOf<Book>()
    fun addBook(book: Book) {
        books.add(book)
        println("Buch hinzugefügt: ${book.title} von ${book.author}")
    }

    fun searchBook(query: String): List<Book> {
        return books.filter {
            it.title.contains(query, ignoreCase = true) || it.author.contains(query, ignoreCase = true)
        }
    }
    fun showBooksStatus() {
        books.forEach {
            println("Titel: ${it.title}, Status: ${it.status.printStatus()}")
        }
    }

    // Nested Class: LibraryAddress
    class LibraryAddress(val street: String, val city: String, val zipCode: String) {
        fun printAddress() {
            println("Bibliotheksadresse: $street, $city, $zipCode")
        }
    }

    // Inner Class: LibraryMember
    inner class LibraryMember(val name: String, val memberID: String) {

        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("$name hat das Buch '${book.title}' ausgeliehen. Rückgabedatum: $dueDate")
            } else {
                println("Das Buch '${book.title}' ist nicht verfügbar.")
            }
        }
        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("$name hat das Buch '${book.title}' reserviert.")
            } else {
                println("Das Buch '${book.title}' ist nicht verfügbar.")
            }
        }
    }
}
