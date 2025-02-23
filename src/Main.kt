
fun main() {
    println("-------------------")
    println("Calculator!")
    println("-------------------")

    val num1 = getDouble ("Please enter your 1st number: ")
    val op = getString  ("Please enter an operation (+,-,*,/) ")
    val num2 = getDouble ("Please enter your 2nd number: ")
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
        when (userInput) {
            "+" -> break
            "-" -> break
            "*" -> break
            "/" -> break

        }
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
fun getDouble(prompt: String): Double {
    var doubleValue: Double?

    while(true) {
        print(prompt)
        val userInput = readln()
        doubleValue = userInput.toDoubleOrNull()
        if (doubleValue != null) break
    }

    return doubleValue!!
}