### Premier projet Maven
[Dépôt GIT] https://github.com/calystene/ODEVA_MavenSonar/
#### Navigateur http minimaliste 
**mvn_http**

1. création du projet : mkdir -p mvn_http/src/main/java et mkdir -p test/main/java
2. création du POM :  kwrite pom.xml (puis copier/coller du texte pom.xml de base)
3. création du fichier dans /main/java : touch HelloHttp.java && kwrite HelloTP.java (puis incorporation du texte)
4. tentative de compilation à la racine : mvn compile   ==> Résultat : Build Failure
5. on ajoute les dépendances dans le pom.xml, ensuite -> mvn compile   ===> Résultat : Build Success
6. on éxécute mvn exec:java -Dexec.mainClass="HelloHttp?" && mvn exec:java -Dexec.mainClass="HelloHttp" -Dexec.args="​http://www.univ-lille1.fr", et le code HTML de la page s'affiche dans la console


#### Création d'un nouveau projet avec les sources et tests JUnit fait précédément
**mvn_money**

1. Inclusion des sources et tests
2. Ajout des dépendances JUnit dans pom.xml (<version>4.4</version> pour JUnit 4.0)
3. mvn compile ==> Success
3. mvn test === > Success (5 runs, 0 failure)


#### Intégration avec Sonar
1. Inclusion du fichier sonar-project.properties
2. Execution de la commande mvn sonar:sonar
3. Correction des remarques relevés par sonar pour atteindre un taux de 95,7% Rules compliance
    * Suppression de la règle de tabulation
    * Suppression des underscores des variables final
    * écriture de la méthode hashCode() dans Money
    * et d'autres modifications dont je n'ai plus le souvenir...


