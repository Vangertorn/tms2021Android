import hands.IHand
import hands.SamsungHand
import hands.SonyHand
import hands.ToshibaHand
import heads.IHead
import heads.SamsungHead
import heads.SonyHead
import heads.ToshibaHead
import legs.ILeg
import legs.SamsungLeg
import legs.SonyLeg
import legs.ToshibaLeg

fun main(){
    val listLegs: ArrayList<ILeg> = ArrayList()
    listLegs.add(SonyLeg(10))
    listLegs.add(SamsungLeg(20))
    listLegs.add(ToshibaLeg(30))
    val listHands: ArrayList<IHand> = ArrayList()
    listHands.add(SonyHand(10))
    listHands.add(SamsungHand(20))
    listHands.add(ToshibaHand(30))
    val listHeads: ArrayList<IHead> = ArrayList()
    listHeads.add(SonyHead(10))
    listHeads.add(SamsungHead(20))
    listHeads.add(ToshibaHead(30))
    val listNames: ArrayList<String> = ArrayList()
    listNames.add("Android")
    listNames.add("Bender")
    listNames.add("Boston Dynamic")
    listNames.add("Asimo")
    listNames.add("VGo")
    listNames.add("Roboy")
    val buildRobots = BuildRobots(listLegs,listHeads,listHands,listNames)
    val shop = Shop()
    val listRobots: ArrayList<Robot> = buildRobots.creationRobot(6)
    shop.addRobotsList(listRobots)
    shop.maxPraise()
    for (i in 0 until listRobots.size){
        listRobots[i].action()
    }


}