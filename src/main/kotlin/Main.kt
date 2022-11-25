fun main(args: Array<String>) {

//Эта программа считает периметр треугольника
    println("First side:")
    val side1 = readln().toInt()
    println("Second side")
    val side2 = readln().toInt()
    println("Third side")
    val side3 = readln().toInt()

    val perimeter = side1 + side2 + side3

    println("Result: ")
    println(perimeter)

}