package online.p87.fplta.view

import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import online.p87.fplta.model.TeamModel
import tornadofx.*

class HistoryView: View("History") {
    val teamModel: TeamModel by param()

    override val root = vbox {
        label(teamModel.name)
        linechart("Season History", CategoryAxis(), NumberAxis()) {
            series(teamModel.name) {
                for ((key, value) in teamModel.getPointsAsMap()) {
                    data("GW ${key + 1}", value)
                }

            }
        }

    }
}