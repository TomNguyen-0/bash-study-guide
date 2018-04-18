REM how to do a loop
@echo off
setlocal
set exit="exit"
:LoopStart
echo Hello

set /p inputLine="Type exit to quit :"
echo.%inputLine%
echo.%exit%

REM If  not (%inputLine%) ==(exit) GOTO LoopStart
If /I (%inputLine%)==(exit) GOTO endlocal
GOTO LoopStart
:endlocal
@echo on
pause