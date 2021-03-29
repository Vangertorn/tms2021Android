package heads

class SamsungHead(val praise: Int) : IHead {
    override fun speakHead() {
        println("Speak head by Samsung")
    }

    override fun praise(): Int =praise
}