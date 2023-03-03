fun main(){
family("Sally", "Favour", "Samuel", "Kinya")
    grammatical()
    math()
    println(friends("Mwikali", "Kimathi", "Nkatha"))

}


fun family(name1:String, name2:String, name3:String, name4:String){
    var word = arrayOf(name1,name2,name3,name4)
    println(word.contentToString())
}

fun grammatical(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { cities -> println(cities.capitalize()) }
}

fun math(){
    var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = number[1] + number[4]
    println(sum)
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())
}
fun friends(nam1:String, nam2:String,nam3:String):String{
    var names = arrayOf("$nam1", "$nam2", "$nam3")
    return names.contentToString()
}
