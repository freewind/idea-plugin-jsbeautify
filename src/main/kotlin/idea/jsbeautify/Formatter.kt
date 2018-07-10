package idea.jsbeautify

import idea.jsbeautify.js.BeautifyCss
import idea.jsbeautify.js.BeautifyHtml
import idea.jsbeautify.js.BeautifyJs
import jdk.nashorn.api.scripting.ScriptObjectMirror
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

@Suppress("PropertyName")
class Formatter {

    var js_beautify: ScriptObjectMirror? = null
    var css_beautify: ScriptObjectMirror? = null
    var html_beautify: ScriptObjectMirror? = null

    fun formatJs(js: String): String {
        return js_beautify!!.call(null, js) as String
    }

    fun formatCss(code: String): String {
        return css_beautify!!.call(null, code) as String
    }

    fun formatHtml(code: String): String {
        return html_beautify!!.call(null, code) as String
    }

}

val formatter = Formatter().apply {
    val engine = createJsEngine()
    engine.put("global", this)
    engine.eval(BeautifyJs)
    engine.eval(BeautifyCss)
    engine.eval(BeautifyHtml)
}

private fun createJsEngine(): ScriptEngine {
    val manager = ScriptEngineManager()
    return manager.getEngineByName("JavaScript")
}

