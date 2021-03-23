import hands.IHand
import heads.IHead
import legs.ILeg

class BuildRobots(val listLegs: ArrayList<ILeg>, val listHeads: ArrayList<IHead>, val listHands: ArrayList<IHand>, val listName: ArrayList<String>) {
    val listRobots: ArrayList<Robot> = ArrayList()
    fun creationRobot(i: Int): ArrayList<Robot> {
        if(listName.size<i){
            println("Not enough names, You can creation new names and try again")
            return listRobots
        }
        for (j in 0 until i) {
            val rand1: Int = (0 until listHands.size).random()
            val rand2: Int = (0 until listHeads.size).random()
            val rand3: Int = (0 until listLegs.size).random()
            val robot = Robot(listName[i],listHands[rand1],listHeads[rand2],listLegs[rand3])
            listRobots.add(robot)
        }
        return listRobots
    }
}