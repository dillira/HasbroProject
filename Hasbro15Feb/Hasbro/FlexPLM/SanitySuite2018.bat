@echo "Starting Selenium test"

set projectLocation=C:\Hasbro15Feb\Hasbro\FlexPLM
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\SanitySuite2018.xml
pause


