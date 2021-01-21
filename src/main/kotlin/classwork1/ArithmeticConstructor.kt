package classwork1

//constructor have no return type and should be public
//we can either write or don't write constructor keyword
//syntax contructor : class classname Constructor()

//primary constructor
class ArithmeticConstructor (val first: Int, val second: Int){
    fun add(): Int {
        return first + second
    }
}

fun main(){
    val arithmeticConstructor = ArithmeticConstructor(3,4)
    print("sum of ${arithmeticConstructor.first} and ${arithmeticConstructor.second} is ${arithmeticConstructor.add()}")
}
