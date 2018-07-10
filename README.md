Idea Plugin JsBeautify Formatter
================================

Use the famous [html/css/js formatter](http://jsbeautifier.org/) to format code in IDEA.

Features:

- Format html/htm/xhtml/xml/css/js/json/jsx files

Problems:

- if the code contains tab(`\f`), the caret will be incorrect after formatting

Todo:

- Fix known issues
- Format selected text
- Make file types configurable
- Publish to IntelliJ plugins repo

Build the plugin to a zip
-------------------------

```
./gradlew buildPlugin
```

It will generate the plugin file in `./build/distributions`

Install it in IDEA, you will find it in the end of `Edit` menu. Don't forget give it a keyshort.

Run plugin for dev
------------------

```
./gradlew runIde
```
