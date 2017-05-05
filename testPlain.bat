
echo off

set argC=0
for %%x in (%*) do Set /A argC+=1

set LDIR=%~dp0lib
set CLASSPATH=%LDIR%\liblinear-1.33-with-deps.jar;%LDIR%\jwnl.jar;%LDIR%\commons-logging.jar;%LDIR%\jdom.jar;%LDIR%\trove.jar;%LDIR%\maxent-2.4.0.jar;%LDIR%\opennlp-tools-1.3.0.jar;%~dp0ims.jar
echo %CLASSPATH%
set modelDir=%1
set testFile=%2
set savePath=%3
set senseIndex=%4
set split=0
set token=0
set pos=0
set lemma=0
set delimiter="/"
if /I "%argC%" GEQ 5 set split = %5
if /I "%argC%" GEQ 6 set token=%6
if /I "%argC%" GEQ 7 set pos=%7
if /I "%argC%" GEQ 8 set lemma=%8
if /I "%argC%" GEQ 9 set delimiter=%9

set LANG=en_US
if /I "%argC%" GEQ 4 (java -mx2500m -cp %CLASSPATH% sg.edu.nus.comp.nlp.ims.implement.CTester -ptm %LDIR%\tag.bin.gz -tagdict %LDIR%\tagdict.txt -ssm %LDIR%\EnglishSD.bin.gz -prop %LDIR%\prop.xml -f sg.edu.nus.comp.nlp.ims.feature.CAllWordsFeatureExtractorCombination -c sg.edu.nus.comp.nlp.ims.corpus.CAllWordsPlainCorpus -r sg.edu.nus.comp.nlp.ims.io.CPlainCorpusResultWriter -is %senseIndex% %testFil% %modelDir% %modelDir% %savePath% -delimiter "%delimiter%" -split %split% -token %token% -pos %pos% -lemma %lemma%
) else ( 
    java -mx2500m -cp %CLASSPATH% sg.edu.nus.comp.nlp.ims.implement.CTester -ptm %LDIR%\tag.bin.gz -tagdict %LDIR%\tagdict.txt -ssm %LDIR%\EnglishSD.bin.gz -prop %LDIR%\prop.xml -f sg.edu.nus.comp.nlp.ims.feature.CAllWordsFeatureExtractorCombination -c sg.edu.nus.comp.nlp.ims.corpus.CAllWordsPlainCorpus -r sg.edu.nus.comp.nlp.ims.io.CPlainCorpusResultWriter %testFile% %modelDir% %modelDir% %savePath% -delimiter "%delimiter%" -split %split% -token %token% -pos %pos% -lemma %lemma%
)
