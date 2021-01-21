package classwork1

class PersonConstructor (
    val fname : String,
    val lname : String,
    val age : Int
    )

fun main(){
    val person1 = PersonConstructor("Kiran","Khan",20)
    val person2 = PersonConstructor("Salman","Khan",55)
    val person3 = PersonConstructor("Katrina","Kaif",35)

    val lstPerson = mutableListOf<PersonConstructor>()
    lstPerson.add(person1)
    lstPerson.add(person2)
    lstPerson.add(person3)
    for(person in lstPerson){
        println("First name: ${person.fname} , last name : ${person.lname} , age : ${person.age} ")
    }
}