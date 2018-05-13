package online.p87.fplta.controller

import tornadofx.Controller

class AppController: Controller() {
    fun fetchTeamData(teamId: String): String {
        println(teamId)
        return "Please Wait"
    }
}