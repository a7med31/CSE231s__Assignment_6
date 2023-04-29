@ECHO OFF
ECHO
javac -d . Lab6_Code/*.java
java Lab6_Code.Sort_ARXML sampleTest.arxml
java Lab6_Code.Sort_ARXML invalidExtension.xml
java Lab6_Code.Sort_ARXML emptyTest.arxml
pause
