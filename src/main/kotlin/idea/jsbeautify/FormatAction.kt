package idea.jsbeautify

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.TextEditor
import com.intellij.openapi.project.impl.ProjectImpl


class FormatAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent?) {
        (e?.project as? ProjectImpl)?.let { project ->
            formatDocument(project)
        }
    }

    private fun formatDocument(project: ProjectImpl) {
        FileEditorManager.getInstance(project)?.let { fileManager ->
            fileManager.selectedEditors.filterIsInstance<TextEditor>().forEach { editor ->
                editor.file?.name?.let { fileName ->
                    val formatted = formattedContent(fileName, editor.editor)
                    if (formatted != null) {
                        modifyDocument(editor.editor, formatted)
                    }
                }
            }
        }
    }

    private fun modifyDocument(editor: Editor, formatted: String) {
        val newCaretOffset = calculateNewCaretOffset(editor, formatted)
        ApplicationManager.getApplication().runWriteAction {
            editor.document.setText(formatted)
            editor.caretModel.moveToOffset(newCaretOffset)
        }
    }

    private fun calculateNewCaretOffset(editor: Editor, newContent: String): Int {
        val oldOffset = editor.caretModel.offset
        val oldContent = editor.document.text

        return calculateNewCaretOffset(oldContent, oldOffset, newContent)
    }

    private fun formattedContent(fileName: String, editor: Editor): String? {
        return when {
            isJsFile(fileName) -> formatter.formatJs(editor.document.text)
            isCssFile(fileName) -> formatter.formatCss(editor.document.text)
            isHtmlFile(fileName) -> formatter.formatHtml(editor.document.text)
            else -> null
        }
    }

    private fun isHtmlFile(fileName: String): Boolean {
        return listOf("html", "htm", "xhtml", "xml").contains(suffix(fileName))
    }

    private fun isCssFile(fileName: String): Boolean {
        return listOf("css").contains(suffix(fileName))
    }

    private fun isJsFile(fileName: String): Boolean {
        return listOf("js", "json", "jsx").contains(suffix(fileName))
    }

    private fun suffix(fileName: String): String = fileName.substringAfterLast(".", "no-suffix-found").toLowerCase()

}


// Fixme: can't handle `\f` well, so don't use it in code for now
fun calculateNewCaretOffset(oldContent: String, oldOffset: Int, newContent: String): Int {
    val compressed = run {
        val heading = oldContent.take(oldOffset)
        heading.replace("""\s""".toRegex(), "")
    }
    var newOffset = 0
    compressed.forEach { char ->
        val index = newContent.indexOf(char, startIndex = newOffset)
        if (index == -1) return oldOffset
        newOffset = index + 1
    }
    return newOffset
}