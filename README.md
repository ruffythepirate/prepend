#Introduction

This small project is written for ammonite. The extension `.sc` is used to get code completion working smoothly in intellij. 

The program is intended to prepend a text to the text that is being streamed to the program. By defining `--text` you choose what text, and that gets prepended as a line before all the data that is being streamed.

# Usage

`cat myData | amm prepend --text "hello world!"` writes a line of `hello world` before the text content in the file `myData`.

You can also use it through podman/docker:

`echo "hello" | podman run --rm -i ruffythepirate/prepend --text "Before the world"
`
# Requirements

* Ammonite (https://github.com/lihaoyi/Ammonite)[Ammonite] with its requirements.
