package online.p87.fplta.view

import tornadofx.*
import online.p87.fplta.app.Styles
import online.p87.fplta.controller.AppController
import online.p87.fplta.model.TeamModel

class FormView: View("Enter team ID") {

    private val controller: AppController by inject()

    override val root = hbox {
        label("Enter your team ID:")
        hbox(10) {
            addClass(Styles.textBox)
            val textField = textfield()

            button("Go") {
                action {
                    runAsync {
                        controller.fetchTeamData(textField.text)
                    } ui { teamModel: TeamModel ->
                        replaceWith(find<HistoryView>(mapOf(HistoryView::teamModel to teamModel)))
                    }
                }
            }
        }

    }
}