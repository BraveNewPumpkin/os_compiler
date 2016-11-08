make sure your JAVA_HOME is pointing to a proper jdk version 1.8 or newer
run parser/gradlew installApp
there's a few places it can be run from here:
-via the gradle wrapper, but you have to set a variable for the required arguments to be passed to the program:
-- eg. gradlew run -Dexec.args="path/to/source/file path/to/data/file"
-via the "installed" runner:
-- eg. ./parser/build/install/parser/bin/parser path/to/source/file path/to/data/file