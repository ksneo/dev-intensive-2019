package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        return when (fullName) {
            null -> (Pair(null, null))
            "", " " -> (Pair(null, null))
            else -> {
                val parts: List<String>? = fullName?.split(" ")

                val firstName = parts?.getOrNull(0)
                val lastName = parts?.getOrNull(1)
                return Pair(firstName, lastName)
            }
        }
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO("Not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String {
        TODO("Not implemented")
    }
}