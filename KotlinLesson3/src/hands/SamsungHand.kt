package hands

class SamsungHand (val praise :  Int) : IHand{
    override fun upHead() {
        println("Up hand by Samsung")
    }

    override fun praise(): Int = praise

}