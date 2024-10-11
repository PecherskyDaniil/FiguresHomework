class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable,Transforming, Figure(0) {
    // TODO: реализовать интерфейс Transforming
    var color: Int = -1 // при объявлении каждое поле нужно инициализировать

    lateinit var name: String // значение на момент определения неизвестно (только для объектных типов)
    // дополнительный конструктор вызывает основной
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    // нужно явно указывать, что вы переопределяете метод
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    // для каждого класса area() определяется по-своему
    override fun area(): Float {
        return (width*height).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun resize(zoom: Int) {
        width*=zoom
        height*=zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        var dx:Int=0
        var dy:Int=0
        dy=x-centerX
        dx=y-centerY
        x=centerX
        y=centerY
        when(direction){
            RotateDirection.Clockwise->this.move(dx,-1*dy)
            RotateDirection.CounterClockwise->this.move(-1*dx,dy)
        }
        var dwidth:Int
        dwidth=width
        width=height
        height=dwidth
    }

    override fun toString(): String {
        return "Rect(x=$x, y=$y, width=$width, height=$height)"
    }

}