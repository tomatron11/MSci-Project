@echo off
rem arthome should point to ...\UKCAD\src containing art.jar
set arthome="C:\Users\tomwi\Documents\Final Year Project\PROJECT\UKCAD\src"
rem javafx should point to ...\lib in the JavaFx directory
set javafx="C:\Program Files\JavaFX\javafx-sdk-17.0.2\lib"
rem javassist should point to the Javassist .jar file
set javassist="C:\Program Files\Javassist\jboss-javassist-javassist-700be6f\javassist.jar"
java -classpath %arthome%/classes;%arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %1.art
javac -Xlint -d %arthome%/classes -classpath %arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
java --module-path %javafx% --add-modules javafx.controls -cp %javassist%;%arthome%/classes;%arthome%/art.jar ARTTestFX %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%1.str' +phaseAG
