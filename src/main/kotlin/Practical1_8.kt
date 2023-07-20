import java.util.Arrays

fun main(){
    val arr= arrayOf(1,2,4)
    println(Arrays.deepToString(arr))
    var arr1 = IntArray(5)
    arr1[0]=10
    arr1[1]=20
    arr1[2]=30
    arr1[3]=40
    arr1[4]=50
    for(i in 0..arr1.size-1){
        println("" + arr1[i])
    }
    var arr2 = intArrayOf(1,2,3,4,5)
    for (i in 0..arr2.size-1){
        println(""+arr2[i])
    }
    var arr3 = Array<Int>(9){i:Int->i}
    for(i in 0..arr3.size-1){
        println(""+arr3[i])
    }
}