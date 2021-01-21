package classwork1

class Person {
    var fname : String = ""
    var lname : String = ""
    var age : Int = 0
}

fun main(){
    val person1 = Person()
    person1.fname = "Kiran"
    person1.lname = "khan"
    person1.age = 20

    val person2 = Person()
    person2.fname = "Salman"
    person2.lname = "khan"
    person2.age = 55

    val person3 = Person()
    person3.fname = "Katrina"
    person3.lname = "Kaif"
    person3.age = 35

    val lstPerson = mutableListOf<Person>()
    lstPerson.add(person1)
    lstPerson.add(person2)
    lstPerson.add(person3)

    println("Person Details are: ")
    //use loop to display all the person details
//    for(person in lstPerson){
//        println("First name : ${person.fname} , lastname: ${person.lname} ," +
//                " age: ${person.age}")
//    }

    //same as above
    for(i in lstPerson.indices){
        println("First name : ${lstPerson[i].fname} , lastname: ${lstPerson[i].lname} ," +
                " age: ${lstPerson[i].age}")
    }
}
