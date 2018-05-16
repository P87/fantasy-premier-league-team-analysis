package online.p87.fplta.model

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import java.util.SortedMap

class TeamModel(val name: String, val history: JsonArray<JsonObject>?) {

    fun getPointsAsMap(): SortedMap<Int, Int?> {
        val pointsHashMap: HashMap<Int, Int?> = hashMapOf()
        this.history?.let {
            for ((week, data) in this.history.withIndex()) {
                pointsHashMap[week] = data.int("points")
            }
        }

        return pointsHashMap.toSortedMap()
    }
}