fun main(){
    println("Enter the number: ")
    var num = readLine()!!.toInt()

    when(num){
        1 -> print("Jan")
        2 -> print("Feb")
        3 -> print("March")
        4 -> print("April")
        5 -> print("May")
        6 -> print("jum")
        7 -> print("july")
        8 -> print("Aug")
        9 -> print("Sep")
        10 -> print("Oct")
        11 -> print("Nov")
        12 -> print("Dec")
        else -> {
            println("Enter the valid number")
        }
    }
}