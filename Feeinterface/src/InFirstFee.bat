REM Copyright (c) 2004-2008 Lan-in corporation.  All rights reserved.
REM DUES sample, echoText server
REM


set JAVA_HOME=C:\Haitai\HTEMR3\java
set LIB_HOME=.
set JAVA_JAR=.

set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\CacheDB.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\jdbc2_0-stdext.zip
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\jdom.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\msbase.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\mssqlserver.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\msutil.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\sax.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\saxpath.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xalan.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xercesImpl.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\ojdbc14.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\ojdbc5.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xbean.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xbean_xpath.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xmlbeans-qname.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\axis.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\htcommon.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\jaxrpc.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\commons-discovery-0.2.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\commons-logging-1.0.4.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\classes12.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\db2jcc.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\ht.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\jaxen-full.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\jsr173_1.0_api.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\resolver.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\saaj.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\wsdl4j-1.5.1.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xmlpublic.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\xml-apis.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\HtResponse.jar
set JAVA_JAR=%JAVA_JAR%;%LIB_HOME%\db2jcc.jar


%JAVA_HOME%\bin\java -classpath %JAVA_JAR% com.haitaiinc.ICommon.InterFaceManager InFirstFee