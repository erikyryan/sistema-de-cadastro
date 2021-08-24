# Trabalho III POO
O projeto trabalhado é um sistema de cadasttro de pessoa juridica e fisica

## Pré-requisitos

Antes de começar é necessario tter instalado na maquina
[Java11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)

Biblioteca grafica [JavaFx](https://gluonhq.com/products/javafx/) para a compilação concreta do sistema
e configurar no Classbath.

Uso de um editor para trabalhar com o código, como o[Eclipse](https://www.eclipse.org/downloads/) e o [VsCode](https://code.visualstudio.com/download) 

## IDE's
Para a criação desse projeto utilizamos a IDE [Eclipse](https://www.eclipse.org/downloads/) e o [VsCode](https://code.visualstudio.com/download) 

### Instalção da IDE
1.Baixe o arquivo executavel 

2.Descompactar o arquivo

3.Para o Windows e Mac, executar e permitir a instalação

4.Para a distribuição Linux, instalar com o  comando

```bash
sudo dpkg -i <inicial_do_arquivo>
```
## JavaFx

JavaFX é a nova biblioteca gráfica da plataforma Java que serve para:

1.Criar interfaces gráficas

2.Animações 

3.Desenhar na tela

4.Efeitos 

5.Gráficos 

6.Programar arrastando e soltando

7.Tocar vídeo e áudio

### Instalação e configuração 

#### 1. [Eclipse](https://www.eclipse.org/downloads/)

##### Instruções

[Video explacativo](https://www.youtube.com/watch?v=KKI7tDozPog)

 1.1 Abra o Eclipse -> Help -> Eclipse Marketplace

1.2 Procure por "javafx"

1.3 Instale e(fx)eclipse.

1.4 Depois da instalação, reeinicie o Eclipse 

1.5 Crie um novo projeto File -> New -> Project -> Selecione JavaFx

1.6 Crie um projeto JavaFx Project -> next -> nomei o projeto -> finish

1.7 Você vera um erro ao tentar executar, então deve-se configurar o Classpath

1.8 Clique com o botão direito em cima do projetto criado e selecione propriedades

1.9 Escollha Java Build Path -> Libraries -> Add External Jars

2.0 Procure dentro do seu computador a pasta baixada com o javafx-sdk

2.1 Selecione dentro da lib todas as bibliotecas e a pasta src compactada 

2.2 Clique em Apply e Apply and close + F5(refresh)

2.3 Na parte de cima da IDE, clique com o botão direito em cima do Run -> Run configuration

2.4 Java Application -> arguments 

2.5 Escreva --module-path"<diretorio_do_JavaFx_no_computador"--add-modules=javafx.controls,javafx.fxml

2.6 Clique em Aplly, após Run

#### 2. [VsCode](https://code.visualstudio.com/download) 

[Video explicativo](https://www.youtube.com/watch?v=H67COH9F718)

2.1 Verique a veersão do VScode, é preciso está atualizado

2.2 Abra o VScode -> Extension -> Procure por JavaFx -> instale as extenções

2.3 Na barra de cima do editor, clique com o botão direto em View -> Command Palette(cntl+Shift+P)-> Java: Configure Java Runtime -> baixe o JDK 11

2.4 Instale JDK 11  

2.5 Copie o diretorio aonde foi instaldo o JDK, clique com o botão direito no Meu PC (na pasta de documentos) e selecione propriedades

2.6 Advanced system setting -> Envinorment Variables -> Java_home -> Edit e cole o diretorio do JDK

2.7 Reenicie o Vscode

2.8 Crie um novo projeto java -> No build tools -> Java Projetcs -> Selecione o seu projeto 

2.9 Cllique no simbolo '+' em Referenced Libraries

2.10 Procure dentro do seu computador a pasta baixada com o javafx-sdk

2.11 Selecione dentro da lib todas as bibliotecas e a pasta src compactada

2.12 Apos compilar apresentará o seguinte erro: "JavaFX runtine components are missing, and are required to run this application"

2.13 Clique em Run -> open configuration -> .visualcode -> lauch.jason

2.14 adicione a baixo de 'request': "vmArgs": "--module-path <diretorio_onde_esta_javaFX>--add-modules javafx.controls,javafx.fxml"

2.15 Compile o código






  
