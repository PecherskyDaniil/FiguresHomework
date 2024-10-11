//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)
    // переменной базового класса
    val f: Figure = Rect(4,2,4,2)
    val f2: Figure = Circle()
    println(f.area())
    println(f2.area())
    val rect:Rect=Rect(4,3,4,2)
    println(rect)
    rect.rotate(RotateDirection.Clockwise,3,-3)
    println(rect)
    rect.rotate(RotateDirection.Clockwise,3,-3)
    println(rect)
    rect.rotate(RotateDirection.Clockwise,3,-3)
    println(rect)
    rect.rotate(RotateDirection.CounterClockwise,3,-3)
    println(rect)
}