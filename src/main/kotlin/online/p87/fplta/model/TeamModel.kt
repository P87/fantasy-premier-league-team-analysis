package online.p87.fplta.model

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import java.util.SortedMap

class TeamModel(val name: String, val history: JsonArray<JsonObject>?) {

    fun getPointsAsMap(): SortedMap<Int, Int?> {
        val pointsHashMap: HashMap<Int, Int?> = hashMapOf()

        val pointsMap: Map<Int, Int?> = history?.withIndex()?.map { (week, data) ->
            Pair(week, data.int("points"))
        }?.toMap() ?: emptyMap()

        return pointsMap.toSortedMap()
    }
}