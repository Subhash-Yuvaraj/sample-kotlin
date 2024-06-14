fun main(){
    var ani : Animal = Animal()
    ani.diet="Herbivore"
    var ani2:Animal = Animal()
    ani2.diet="Carnivore"
    var newani=ani2.plus(ani)
    println(newani.diet)
}
fun Animal.plus(a:Animal) : Animal{
    var animal:Animal = Animal()
    animal.diet=this.diet+","+a.diet
    return animal
}