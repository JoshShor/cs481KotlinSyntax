package com.example.cs481kotlinsyntax


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumretinfer(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSumRetOmit(a: Int, b: Int){
    println("sum of $a and $b is ${a + b}")
}

fun printpractice(){
    //print prints its argument to the standard output
    print("Hello")
    print("world!")
    //println prints its arguments and adds a line break
    //so that the next thing you print appears on the next line
    println("Hello world!")
    println(42)
}

fun variaables(){
    var a:Int = 1
    val b = 2
    val c: Int
    c = 3
    a = 10
    var x = 5
    println(x)
    x += 1
    println(x)
}

fun ifmaxOf(a: Int, b:Int): Int{
    if (a > b){
        return a
    }else{
        return b
    }
}

fun maxOfExpress(a: Int, b: Int) = if (a>b) a else b

fun multipleifelse(number: Int): String{
    val result = if (number>0){
        "less than 0"
    }else if(number in 0..9){
        "In Between 0 and 9"
    }else if(number in 10 .. 99){
        "in between 10 to 99"
    }else{
        "More than 100"
    }
    return result
}

fun arraylist(){
    val arrayList = ArrayList<String>(5)
    arrayList.add("Programming")
    arrayList.add("Mobile")
    arrayList.add("Security")
    arrayList.add("Usable")
    arrayList.add("Learn")
    for (i in arrayList){
        println(i)
    }
}
fun collection(){
    val items = listOf("apple", "banana", "kiwifruit")
    for(item in items){
        println(item)
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avacado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}



fun iterateOver(){
    for(x in 1..5){
        print(x)
    }
    for(x in 1..2 step 2){
        print(x)
    }
    println()
    for(x in 9 downTo 0 step 5)
        print(x)
}

fun forloop(){
    val items = listOf("apple", "banana", "kiwifruit")
    for(item in items){
        println(item)
    }
    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }
}

fun whileloop(){
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while(index < items.size){
        println("item at $index is ${items[index]}")
        index ++
    }
}

fun whenexpression(a: Int, b:Int, condition: Int){
    val result = when (condition){
        1 -> a+b
        2 -> a-b
        3 -> a*b
        4 -> a/b
        else -> "no expression"
    }
}

fun checkifnumberinrange(){
    val x = 10
    val y = 9
    if(x in (1..(y + 1))){
        println("fits in range")
    }
}

fun checkifnumberoutofrange(){
    val list = listOf("a","b","c")

    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if (list.size !in list.indices){
        println("list size if out of the valid list indices range, too")
    }
}

fun nullval(){
    var apival : String = "cs481"
    print("String length " +apival.length)
}

fun nonnull(){
    var apival : String? = "cs481"
}

fun nullcheck(){
    var apival : String? = "cs481"
    if(apival != null && apival.length > 0){
        println("String length: ${apival.length}")
    } else {
        println("String is empty")
    }
    apival = null
    println(apival)
    if(apival != null){
        println("String length: ${apival.length}")
    }else{
        println("String is empty")
    }
}

fun nullsafeoperator(){
    var apival: String? = "cs481"
    println(apival?.length)
    apival= null
    println(apival?.length)
}

fun sumlamda(a: Int, b: Int): Int{
    return a + b
}

val lamdafunc: (Int, Int) -> Int = {a, b -> a + b}

fun sumwithlamda(a: Int, b: Int, myFunc:(Int, Int) -> Int){
    var result = myFunc(a,b)
    println("Lamda output" + result)
}

fun main(){
    printpractice()
    println(sum(2, 3))
    println(sumretinfer(2, 3))
    println(printSum(2, 3))
    println(printSumRetOmit(2, 3))
    variaables()
    println(ifmaxOf(2, 3))
    println(multipleifelse(40))
    println(maxOfExpress(2, 3))
    arraylist()
    collection()
    iterateOver()
    forloop()
    whileloop()
    whenexpression(2,3,3)
    checkifnumberinrange()
    checkifnumberoutofrange()
    nullval()
    nonnull()
    nullcheck()
    nullsafeoperator()
    //println("The perimeter is ${Rectangle(5.0, 2.0).perimeter}")
    print(sumwithlamda(5,6, lamdafunc))
}