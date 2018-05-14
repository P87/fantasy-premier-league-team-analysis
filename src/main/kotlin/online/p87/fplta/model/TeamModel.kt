package online.p87.fplta.model

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject

class TeamModel(val name: String, val history: JsonArray<JsonObject>?) {
}