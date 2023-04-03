rem temp should be set to the temp folder
set temp="C:\Users\tomwi\Documents\Final Year Project\PROJECT\UKCAD\src\main\temp"
start parsefx UKCAD_Syntax +showAll
copy /b eSOS_CAD.art + %temp%\try.str + term.txt + %temp%\map.str %temp%\temp.art
call ../artfx %temp%\temp.art