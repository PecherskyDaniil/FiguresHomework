class Square(var x: Int, var y: Int, var a: Int) : Movable,Transforming, Figure(0) {
    override fun move(dx: Int, dy: Int) {
        x+=dx
        y+=dy
    }
    constructor(square:Square):this(square.x,square.y,square.a)
    override fun area(): Float =(a*a).toFloat()
    override fun resize(zoom: Int) {
        a*=zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        var dx:Int=0
        var dy:Int=0
        dy=x-centerX
        dx=y-centerY
        when(direction){
            RotateDirection.Clockwise->this.move(dx,-1*dy)
            RotateDirection.CounterClockwise->this.move(-1*dx,dy)
        }
    }

    override fun toString(): String {
        return "Square(x=$x, y=$y, a=$a)"
    }
}