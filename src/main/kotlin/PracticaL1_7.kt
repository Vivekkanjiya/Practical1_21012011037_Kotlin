fun main(){
    println("Enter the num")
    var num = readln()!!.toInt()
    var result = fact(num)
    println("fact = "+result)
}

fun fact(num:Int):Int {
    if (num == 0 || num == 1) {
        return 1
    }
    else{
        return num * fact(num-1)
    }
}
