package online.p87.fplta.app

import online.p87.fplta.view.MainView
import tornadofx.App
import tornadofx.reloadStylesheetsOnFocus

class App: App(MainView::class, Styles::class) {
    init {
        reloadStylesheetsOnFocus()
    }
}