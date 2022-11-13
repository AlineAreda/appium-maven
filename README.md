## appium-maven
Exemplo automação de testes mobile com Appium e Maven

### O que preciso Ter Configurado para Rodar o Projeto ##

- Appium Server
- Android Home 
- Java Home
- Node
- Android Studio instalado
- Xcode Instalado ( Se quiser rodar IOS )

### Como faço para rodar o projeto local? ##

- Android: 
mvn test -Dlocal=local -Dplatform=android

- IOS:
mvn test -Dlocal=local -Dplatform=ios


### Como faço para rodar o projeto no device farm? ##

OBS:
Configurar antes os parâmetros do Browserstack. Depois de configurado, rodar os comandos abaixo:

- Android: 
mvn test -Dlocal=devicefarm -Dplatform=android



