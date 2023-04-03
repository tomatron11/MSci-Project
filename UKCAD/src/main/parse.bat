@echo off
rem arthome should point to ...\UKCAD\src containing art.jar
set arthome="C:\Users\tomwi\Documents\Final Year Project\PROJECT\UKCAD\src"

java -classpath %arthome%/classes;%arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %1.art
javac -Xlint -d %arthome%/classes -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
java -classpath %arthome%/classes;%arthome%/art.jar ARTTest %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%1.str' +phaseAG
