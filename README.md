# Descrição do projeto

# Descrição do desafio
Realizar teste de comportamento no site tornseumprogramador.com

# Time: UniQA
Integrantes: <br>
<ul>
    <li>Maria</li>
    <li>Jéssica</li>
    <li>Grazi</li>
    <li>Nathalia</li>
    <li>Fernanda</li>

</ul>


### Criar uma aplicação Selenium com os seguintes casos de teste
### Caso de teste 1
Acessar o site torneseumprogramador e fazer a busca ... <br>

<b>Cenário</b>: Entrar no site do torne se um programador e buscar pelo conteudo tdd<br>
Dado que estou no site do torne se um programador<br>
E digito no campo de busca a palavra "TDD"<br>
E cliclo em pesquisar<br>
Entao devo ver o resultado na busca "TDD"<br>

<b>Cenário</b>: Entrar no site do torne se um programador e buscar pelo conteudo bdd
Dado que estou no site do torne se um programador<br>
E digito no campo de busca a palavra "BDD"<br>
E cliclo em pesquisar<br>
Entao devo ver o resultado na busca "BDD"<br>


----------------------------------------------------------------------------
# Tecnologias utilizadas
:heavy_check_mark: Java
Linguagem de programacao para desenvolvimento da aplicacao<br>

:heavy_check_mark: Maven
Gerenciador de dependencias para o <b>Java</b><br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsavel por traduzir uma linguagem humana em código Java

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem GutKing(Cucumber) abrindo o browser e fazendo o teste de comportamento<br>

# Como utilizar
### Pré requisitos
- Instalar o Java:<br>
https://www.java.com/pt-BR/download/
- Instalar JDK:<br>
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

- Verficar se o JAVA está configurado em 

- Clone do projeto

```bash
git clone https://github.com/FehMonique/consulta-site-torne-se-um-programador
```
- Entrando na pasta do projeto
```bash
cd consulta-site-torne-se-um-programador
``` 
- Configurando Selenium no seu computador
Fazer o download do Chrome Webdriver e extrair o arquivo dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>
<b>Exemplo:</b>
```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_win32.zip
unzip chromedriver_win32.zip
rm -rf chromedriver_win32.zip
cd ../driver
```
- Limpando e validando maven Unix
```bash
./mvnw clean
```
- Limpando e validando maven Windows
```bash
mvnw.cmd clean
```
- Executando teste no Unix
```bash
./test.sh
```
- Executando teste no Windows
```bash
test.bat
```

## Estrutura de arquivos
```
.
├───.mvn
│   └───wrapper
├───driver
├───src
│   ├───main
│   │   └───java
│   │       └───io
│   │           └───cucumber
│   │               └───danilo
│   └───test
│       ├───java
│       │   └───io
│       │       └───cucumber
│       │           └───fernanda
│       └───resources
│           └───io
│               └───cucumber
│                   └───fernanda
└───target
    ├───classes
    │   └───io
    │       └───cucumber
    │           └───danilo
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    ├───surefire-reports
    └───test-classes
        └───io
            └───cucumber
                └───fernanda
```

    



