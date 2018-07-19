package idea.jsbeautify

import com.intellij.openapi.components.ApplicationComponent

class FormatComponent : ApplicationComponent {

    override fun getComponentName(): String {
        return this.javaClass.name
    }

    override fun initComponent() {
        initFormatter()
    }

    private fun initFormatter() {
        formatter.formatJs("{}")
    }
}