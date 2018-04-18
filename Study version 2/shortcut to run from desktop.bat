@echo off
REM valentine from desktop. point cd to Study version 2 directory.
title Study Guide Version 2
setlocal
:LoopAgain
cd C:\users\tom\desktop\projects\fun\Study\Study version 2
java StudyGuide2
set /p inputLine="Type exit to quit: "
If /I (%inputLine%)==(exit) GOTO LoopEnd
GOTO LoopAgain
:LoopEnd
echo Have a Nice Day!
pause
@echo on