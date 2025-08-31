@echo off
chcp 65001 > nul
cd /d %~dp0
start "" "C:\Program Files\Git\git-bash.exe" -c "./git_auto.sh"