@echo off
REM valentine from desktop. point cd to Study version 2 directory.
title Study Guide Version 2
setlocal
cd C:\users\tom\desktop\projects\fun\Study\Study version 2
set path=%path%;"C:\Program Files\Java\jdk1.7.0_79\bin"
javac StudyGuide2.java
:LoopAgain
cls
cd C:\users\tom\desktop\projects\fun\Study\Study version 2
java StudyGuide2
cls
set /p inputLine="Type exit to quit: "
If /I (%inputLine%)==(exit) GOTO LoopEnd
GOTO LoopAgain
:LoopEnd
cls
echo Have a Nice Day!
pause
@echo on