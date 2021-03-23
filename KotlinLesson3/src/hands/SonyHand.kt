package hands

class SonyHand( val praise : Int): IHand {
    override fun upHead() {
        println("Up hand  by Sony")
    }

    override fun praise(): Int = praise

}