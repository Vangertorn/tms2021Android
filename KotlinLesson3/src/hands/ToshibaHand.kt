package hands

class ToshibaHand( val praise: Int) : IHand {
    override fun upHead() {
        println("Up hand by Toshiba")
    }

    override fun praise(): Int = praise

}