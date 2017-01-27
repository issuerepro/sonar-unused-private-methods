See https://groups.google.com/forum/#!topic/sonarqube/nmVKaMfWtnU for discussion

run: `mvnw clean package sonar:sonar -Dsonar.host.url=http://your.sonar.host`

---

tested with:
sonarqube: 5.6.4

plugins:
checkstyle 2.4
dependency-check 1.0.3
findbugs 3.4.4
git 1.2
java 4.4.0.8066
