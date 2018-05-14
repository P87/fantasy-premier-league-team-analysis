package online.p87.fplta.controller

import tornadofx.Controller
import java.net.URL
import com.beust.klaxon.Parser
import com.beust.klaxon.JsonObject
import online.p87.fplta.model.TeamModel


class AppController: Controller() {
    fun fetchTeamData(teamId: String): TeamModel {
        val teamDetailsUrl = "https://fantasy.premierleague.com/drf/entry/$teamId/history"
        val apiResponse = URL(teamDetailsUrl).readText()
        val stringBuilder = StringBuilder(apiResponse)
        val parser = Parser()
        val json: JsonObject = parser.parse(stringBuilder) as JsonObject

        return TeamModel("${json.obj("entry")?.string("name")}", json.array("history"))
    }
}