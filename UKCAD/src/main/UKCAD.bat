@echo off
rem runs UKCAD with an example program and no currently opened file 
break>temp/currentFile.txt
break>UKCAD_Interpreter.str
echo ball = sphere(50)>UKCAD_Interpreter.str
cmd.exe /c reparsefx.bat UKCAD_Interpreter