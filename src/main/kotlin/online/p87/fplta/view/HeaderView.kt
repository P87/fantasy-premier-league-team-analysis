package online.p87.fplta.view

import tornadofx.*
import online.p87.fplta.app.Styles

class HeaderView : View("Fantasy Premier League Team Analyser") {
    override val root = hbox {
        label ("Fantasy Premier League Team Analyser") {
            addClass(Styles.heading)
        }
    }
}