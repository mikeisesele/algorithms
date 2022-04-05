package algo

class Replacer {

    fun replace(string: String): String {

        // convert string to an array of words
        val words = string.split(" ").toMutableList()
        val newSentence = mutableListOf<String>()

        // replace all instances of u or you with your
        for (i in words.indices) {

            if (words[i].contains("u")) {
                words[i] = words[i].replace("u", "your client")
            }

            if (words[i].contains("you")) {
                words[i] = words[i].replace("you", "your client")
            }

            if (words[i].contains("youuu")) {
                words[i] = words[i].replace("youu", "your client")
            }

        }

        // join the array back into a string
        for (i in words.indices) { newSentence.add(words[i]) }

        // print the new string
        return newSentence.joinToString(" ")

    }
}