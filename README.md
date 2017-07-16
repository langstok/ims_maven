# ims_maven
IMS WSD maven project

IMS (It Makes Sense) is a supervised English all-words word sense disambiguation (WSD) system. The flexible framework of IMS allows users to integrate different preprocessing tools, additional features, and different classifiers. By default, we use linear support vector machines as the classifier with multiple features. This implementation of IMS achieves state-of-the-art results on several SensEval and SemEval tasks

[NUS Natural Language Processing Group](http://www.comp.nus.edu.sg/~nlp/home.html)

Zhong, Zhi, & Ng, Hwee Tou (2012). Word Sense Disambiguation Improves Information Retrieval. Proceedings of the 50th Annual Meeting of the Association for Computational Linguistics (ACL 2012). (pp. 273 – 282). Jeju, South Kore

libs and models can be found [here](http://www.comp.nus.edu.sg/~nlp/software.html
) (bat file is included for dependency installation).

    wget http://www.comp.nus.edu.sg/~nlp/sw/lib.tar.gz
    tar -xvf lib.tar.gz

    mvn install:install-file -Dfile=.\lib\weka-3.2.3.jar -DgroupId=nz.ac.waikato.cms.weka -DartifactId=weka-stable -Dversion=3.2.3 -Dpackaging=jar 
    mvn install:install-file -Dfile=.\lib\maxent-2.4.0.jar -DgroupId=org.apache.opennlp -DartifactId=opennlp-maxent -Dversion=2.4.0 -Dpackaging=jar
    mvn install:install-file -Dfile=.\lib\opennlp-tools-1.3.0.jar -DgroupId=org.apache.opennlp -DartifactId=opennlp-tools -Dversion=1.3.0 -Dpackaging=jar
    mvn install:install-file -Dfile=.\lib\liblinear-1.33-with-deps.jar -DgroupId=de.bwaldvogel -DartifactId=liblinear -Dversion=1.3.3 -Dpackaging=jar
