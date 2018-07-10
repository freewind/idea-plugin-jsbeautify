Idea Plugin JsBeautify Formatter
================================

Use the famous [html/css/js formatter](http://jsbeautifier.org/) to format code in IDEA.

Features:

[x] Format html/htm/xhtml/xml/css/js/json/jsx files

Problems:

- if the code contains tab(`\f`), the caret will be incorrect after formatting

Todo:

[ ] Fix known issues
[ ] Format selected text
[ ] Make file types configurable
[ ] Publish to IntelliJ plugins repo

Run plugin in IDEA:

```
./gradlew runIde
```

Build the plugin to a zip
-------------------------

```
./gradlew buildPlugin
```

It will generate the plugin file in `./build/distributions`

Install it in IDEA, and configure a keyshort for it.

Notice
-------

- Use `version 'IC-2018.1.5'` every time to reduce download. (about 500M)
- Don't forget to change `id` and `name` in `resources/META-INF/plugin.xml` to current project