@echo off
rem Change the next line to point at the directory containing art.jar
set arthome="C:\Users\tomwi\Documents\Final Year Project\PROJECT\Classes Implementation"


java -classpath "C:\Program Files\Javassist\jboss-javassist-javassist-700be6f\javassist.jar";%arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %1.art
javac -Xlint -classpath "C:\Program Files\Javassist\jboss-javassist-javassist-700be6f\javassist.jar";.;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
java -classpath "C:\Program Files\Javassist\jboss-javassist-javassist-700be6f\javassist.jar";.;%arthome%/art.jar ARTTest %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%1.str' +phaseAG
