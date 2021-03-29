package legs

class SonyLeg(val praise: Int):ILeg {
    override fun step() {
       println("step sony's leg")
    }

    override fun praise(): Int =praise
}