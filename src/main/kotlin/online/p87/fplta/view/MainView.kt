package online.p87.fplta.view

import tornadofx.*

class MainView : View("Fantasy Premier League Team Analyser") {
    private val headerView: HeaderView by inject()
    private val formView: FormView by inject()

    override val root = borderpane {
        top = headerView.root
        center = formView.root
    }
}