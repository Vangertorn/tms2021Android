package heads

class ToshibaHead(val praise: Int) : IHead {
    override fun speakHead() {
        println("Speak head by Toshiba")
    }

    override fun praise(): Int = praise
}