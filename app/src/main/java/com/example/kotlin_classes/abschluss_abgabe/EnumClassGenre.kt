package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Real-world information and factual content"),
    SCIENCE("Books about science and research"),
    HISTORY("Books about historical events and figures"),
    CHILDREN("Books targeted towards children");

    fun printDescription() {
        println(description)
    }
}
