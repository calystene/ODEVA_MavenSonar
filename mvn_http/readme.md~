mvn_http
----

### Premier projet Maven

#### Navigateur http minimaliste 

1. création du projet : mkdir -p mvn_http/src/main/java et mkdir -p test/main/java
2. création du POM :  kwrite pom.xml (puis copier/coller du texte pom.xml de base)
3. création du fichier dans /main/java : touch HelloHttp.java && kwrite HelloTP.java (puis incorporation du texte)
4. tentative de compilation à la racine : mvn compile   ==> Résultat : Build Failure
5. on ajoute les dépendances dans le pom.xml, ensuite -> mvn compile   ===> Résultat : Build Success
6. on éxécute mvn exec:java -Dexec.mainClass="HelloHttp?" && mvn exec:java -Dexec.mainClass="HelloHttp" -Dexec.args="​http://www.univ-lille1.fr", et le code HTML de la page s'affiche dans la console


#### Création d'un nouveau projet avec les sources et tests JUnit fait précédément

1. Inclusion des sources et tests
2. Ajout des dépendances JUnit dans pom.xml (<version>4.4</version> pour JUnit 4.0)
3. mvn compile ==> Success
3. mvn test === > Success (5 runs, 0 failure)


