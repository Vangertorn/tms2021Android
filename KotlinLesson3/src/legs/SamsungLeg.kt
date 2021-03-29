package legs

class SamsungLeg(val praise: Int) : ILeg {
    override fun step() {
        println("step samsung's leg")
    }

    override fun praise(): Int = praise
}