package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium(29)
    aquarium1.printSize()
    aquarium1.volume = 70
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
    makeFish()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}