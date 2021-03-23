package legs

class ToshibaLeg(val praise: Int): ILeg {
    override fun step() {
        println("step toshiba's leg")
    }

    override fun praise(): Int = praise
}