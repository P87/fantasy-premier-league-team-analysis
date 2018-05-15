package online.p87.fplta.view

import online.p87.fplta.model.TeamModel
import tornadofx.*

class HistoryView: View("History") {
    val teamModel: TeamModel by param()

    override val root = vbox {
        label(teamModel.name)

    }
}