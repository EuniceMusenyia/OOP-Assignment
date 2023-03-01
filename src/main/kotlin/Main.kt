fun main() {
    var human1 = Human("eunice", 23, 49)
    human1.eating(2)
    human1.speak("I am doing Kotlin assignment")
    human1.birthday()


    val user1 = User ("Eunice", "Mutunga","eunicemusenyia@gmail.com","qwerty@21",+254702368371)
    println(user1.lastName)
    println(user1.password)

}
class Human(var name: String, var age: Int, var weight: Int){
    fun eating (foodweight: Int) {
        println("I am eating ${foodweight}kgs of food")
      weight+= foodweight
        println(weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
       age = ++age
        println(age)
    }
}
data class User (var firstName: String, var lastName: String, var Email: String, var password: String, var phoneNumber: Number)
