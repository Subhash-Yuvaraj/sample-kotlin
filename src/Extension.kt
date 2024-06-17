fun main(){
    val ani : Animal = Animal()
    ani.diet="Herbivore"
    val ani2:Animal = Animal()
    ani2.diet="Carnivore"
    val newani=ani2.plus(ani)
    println(newani.diet)
    val ani3 : Animal = Animal()
    ani3.diet="Herbivore"
    val ani23:Animal = Animal()
    ani23.diet="Carnivore"
    val newani3=ani3 + ani23
    println(newani3.diet)
}
//infix takes only one param ->remember
infix operator fun Animal.plus(a:Animal) : Animal{
    val animal:Animal = Animal()
    animal.diet=this.diet+","+a.diet
    return animal
}