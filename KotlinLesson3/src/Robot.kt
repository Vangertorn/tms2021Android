import hands.IHand
import heads.IHead
import legs.ILeg

class Robot( val name: String, private val hand: IHand, private val head: IHead, private val leg: ILeg) : IRobot {
    override fun action() {
        println("May name is $name")
        head.speakHead()
        hand.upHead()
        leg.step()
        println("==========================================")
    }

    override fun prise(): Int {
        return head.praise() + hand.praise() + leg.praise()
    }
}