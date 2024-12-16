package com.example.kotlin_classes.abschluss_abgabe

fun main() {

    val library = Library()

    val book1 = Book("1984", "George Orwell", Genre.FICTION, BookStatus.Available)
    val book2 = Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available)
    val book3 = Book("The Diary of Anne Frank", "Anne Frank", Genre.HISTORY, BookStatus.Available)

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    val address = Library.LibraryAddress("Main Street 42", "Berlin", "12345")
    address.printAddress()

    val member = library.LibraryMember("Max Mustermann", "ID12345")

    member.checkoutBook(book1, "2024-12-01")
    member.reserveBook(book2)

    println("\nStatus aller Bücher in der Bibliothek:")
    library.showBooksStatus()

    println("\nGenre-Beschreibungen:")
    Genre.FICTION.printDescription()
    Genre.SCIENCE.printDescription()
    Genre.HISTORY.printDescription()
}
