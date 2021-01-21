package classwork1

//arthmetic
class Arithmetic {
    //data members
    var first : Int = 0
    var second : Int = 0

    //member function
    fun add() : Int{
        return first + second
    }
}

fun main(){
    //creating an object

    //Arithmetic arithmetic = new Arithmetic()
    val arithmetic = Arithmetic()
    arithmetic.first = 3
    arithmetic.second = 4
    print("sum of ${arithmetic.first} and ${arithmetic.second} is " +
            "${arithmetic.add()}")
}

//for above to access private value we use get and set
/*
private var first: Int = 0

fun getFirst():Int{
    return first
}
fun setFirst(_first:Int){
    first=_first
}

arithmetic.setFirst = (3) //in fun main()
print("sum of ${arithmetic.getFirst} //in fun main()
 */
