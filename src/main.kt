fun main() {
    val output = getProduct(arrayOf(2,4,6,7,4))
    println(output)

   val show=anyNum(arrayOf(2.0,3.4,5.5,5.0))
    println(show)

    var getall=getChar(arrayOf('a','e','i','o','u'))
    println(getall)


}
// No 1.
fun getProduct(result:Array<Int>):Int {
    var product = 2
    result.forEach { a ->
        product*=a

        }
    return product
}

// No 2.
fun anyNum(result: Array<Double>):Double{
    var sum=4.5
    result.forEach { x->
            sum+=x
        }
       return sum
}

   //No 3.
   fun getChar(vowels:Array<Char>):Int{
       var num = 0
       vowels.forEach { chibale ->
           if (chibale=='a'||chibale=='e'||chibale=='i'||chibale=='o'||chibale=='u'){
               num++
           }
       }
       return num
   }