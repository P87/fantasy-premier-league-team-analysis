package online.p87.fplta.app

import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val label by cssclass()
        val textBox by cssclass()
    }

    init {
        heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }

        label {
            padding = box(14.px, 10.px)
            fontSize = 14.px
            fontWeight = FontWeight.BOLD
        }

        textBox {
            padding= box(10.px, 0.px, 10.px, 10.px)
        }
    }
}