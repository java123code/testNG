set projectpath=C:\Users\mike\workspace\NadaGuides
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\libs\*
java org.testng.TestNG %projectpath%\testng.xml
pause