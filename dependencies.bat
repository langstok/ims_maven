@echo off
REM extract lib dir relative to the source folder
cd .\..\lib
call mvn install:install-file -Dfile=weka-3.2.3.jar -DgroupId=nz.ac.waikato.cms.weka -DartifactId=weka-stable -Dversion=3.2.3 -Dpackaging=jar
call mvn install:install-file -Dfile=maxent-2.4.0.jar -DgroupId=org.apache.opennlp -DartifactId=opennlp-maxent -Dversion=2.4.0 -Dpackaging=jar
call mvn install:install-file -Dfile=opennlp-tools-1.3.0.jar -DgroupId=org.apache.opennlp -DartifactId=opennlp-tools -Dversion=1.3.0 -Dpackaging=jar
call mvn install:install-file -Dfile=liblinear-1.33-with-deps.jar -DgroupId=de.bwaldvogel -DartifactId=liblinear -Dversion=1.3.3 -Dpackaging=jar
pause


