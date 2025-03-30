@echo off
cd /d C:\Users\PC\Documents\GitHub\GestionAlmacen.CodigoJava

sonar-scanner.bat ^
  -D"sonar.projectKey=GestionAlmacen" ^
  -D"sonar.sources=." ^
  -D"sonar.host.url=http://localhost:9000" ^
  -D"sonar.token=sqp_a2345f176d6bf4c31f3e3c8c25bdb3a444aa4530" ^
  -D"sonar.java.binaries=bin"

pause
