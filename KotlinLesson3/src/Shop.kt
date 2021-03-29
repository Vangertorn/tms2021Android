class Shop {

    private val list: ArrayList<Robot> = ArrayList()
    fun addRobot(robot: Robot) {
        list.add(robot)
    }

    fun addRobotsList(listRobot: ArrayList<Robot>) {
        list.addAll(listRobot)
    }

    fun maxPraise() {
        if (list.size > 0) {
            list.sortByDescending { it.prise() }
            println("${list[0].name} is the most expensive robot. It cost is ${list[0].prise()}")
            println("===================================")
        } else{
            println("You don't created a few robots")
        }
    }
}