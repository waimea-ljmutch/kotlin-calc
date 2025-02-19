
fun main() {
    println("-------------------")
    println("caculator!")
    println("-------------------")

    val num1 = getInt ("Please enter your 1st number: ")
    val op = getInt ("Please enter an operation ")
}




/**
 * Function to get a string from the user
 *
 * parameters:
 *   - prompt - Text to show the user
 * returns:
 *   - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}

/**
 * Function to get an Int from the user

 * parameters:
 *   - prompt - Text to show the user
 * returns:
 *   - Int that the user types
 */
fun getInt(prompt: String): Int {
    var intValue: Int?

    while(true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

    return intValue!!
}