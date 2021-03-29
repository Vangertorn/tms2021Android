package heads

class SonyHead(val praise: Int):IHead {
    override fun speakHead() {
        println("Speak head by Sony")
    }

    override fun praise(): Int =praise
}