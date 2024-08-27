# Android Dev - Equipe DroidSmiths

![GitHub repo size](https://img.shields.io/github/repo-size/jonas-holanda/androidDev-DroidSmiths?style=for-the-badge)
![GitHub contributors](https://img.shields.io/github/contributors/jonas-holanda/androidDev-DroidSmiths?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/jonas-holanda/androidDev-DroidSmiths?style=for-the-badge)
![GitHub pull requests](https://img.shields.io/github/issues-pr/jonas-holanda/androidDev-DroidSmiths?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/jonas-holanda/androidDev-DroidSmiths?style=for-the-badge)

**Este repositório contém desafios e atividades desenvolvidas pela equipe DroidSmiths no curso Android Dev, utilizando a linguagem Kotlin para desenvolvimento de aplicações móveis.**

## Membros da Equipe

![Jonas Holanda](https://avatars.githubusercontent.com/u/138180385?v=4) | ![Nelson Caracas](https://avatars.githubusercontent.com/u/124903742?s=400&u=fee3652b8af4fbbb8f20bb8c00d1aae48f002b50&v=4) | ![Helen Santos](https://avatars.githubusercontent.com/u/173499841?v=4) | ![Gabriel Lopes](https://media.licdn.com/dms/image/v2/D4D03AQEtZtgEugGYNg/profile-displayphoto-shrink_200_200/profile-displayphoto-shrink_200_200/0/1701292845613?e=1730332800&v=beta&t=fgsDdMAh7h1tQIIoZSeKSkkG0IxBBecEs3vt9_9agrs) |
| :--: |:--:| :--: | :--: | 
| [![Jonas Holanda](https://img.shields.io/badge/-Jonas%20Holanda-30A3DC?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jonas-holanda) | [![Nelson Caracas](https://img.shields.io/badge/-Nelson%20Caracas-30A3DC?style=for-the-badge&logo=github&logoColor=white)](https://github.com/ncaracas) | [![Helen Santos](https://img.shields.io/badge/-Helen%20Santos-30A3DC?style=for-the-badge&logo=github&logoColor=white)](https://github.com/sunHelen12) | [![Gabriel Lopes](https://img.shields.io/badge/-Gabriel%20Lopes-30A3DC?style=for-the-badge&logo=github&logoColor=white)](https://github.com/LVMdS) |

## Desafios do Bootcamp

### Desafio 2

| Nível do Desafio | Resolução do Desafio |
| :-------------: | :-------------------: |
| 🔹🔈 Nível Iniciante | [![Ver Código](https://img.shields.io/badge/Ver%20C%C3%B3digo-a97bff?style=for-the-badge&logo=kotlin&logoColor=white)](./Desafio_2/Iniciante/src/main/kotlin/ConservacaoMarinha.kt) |

## Como Contribuir

1. **Faça um Fork** deste repositório clicando no botão "Fork" na parte superior direita da página do GitHub.
2. **Clone o repositório** para o seu ambiente local:
   ```bash
   git clone https://github.com/SEU_USERNAME/androidDev-DroidSmiths.git
   ```
3. **Adicione o remote upstream** para manter seu repositório local atualizado com o repositório original da equipe:
   ```bash
   git remote add upstream https://github.com/jonas-holanda/androidDev-DroidSmiths.git
   ```
   > **Dica:** Utilize o comando `git pull upstream main` para baixar e mesclar as alterações no seu repositório local, ou `git fetch upstream main` para apenas baixar as atualizações.

4. **Crie uma nova branch** para desenvolver sua feature ou corrigir um bug. Utilize a convenção de nomes `feat/dx-x/SEU_USERNAME`:
   ```bash
   git checkout -b feat/dx-x/SEU_USERNAME
   ```
   > **Exemplo:** Para o Desafio 2 no nível iniciante, o comando seria: `git checkout -b feat/d2-iniciante/jonas-holanda`.

5. **Desenvolva suas alterações** na pasta correspondente ao desafio e nível de dificuldade.
   
6. **Adicione suas alterações** à "staging area":
   ```bash
   git add Desafio_2/Iniciante/src/main/kotlin/ConservacaoMarinha.kt
   ```
   > **Nota:** Para adicionar todas as mudanças, use `git add .`, mas verifique quais arquivos foram adicionados com `git status`.

7. **Commit suas alterações** com uma mensagem descritiva:
   ```bash
   git commit -m "feat: sua alteração realizada"
   ```
8. **Envie suas alterações** para o seu repositório remoto:
   ```bash
   git push origin feat/dx-x/SEU_USERNAME
   ```
9. **Crie um Pull Request** no GitHub para que suas alterações sejam revisadas e integradas ao repositório principal.

10. **Atualize sua branch local** principal após a aprovação do seu Pull Request:
    ```bash
    git checkout main
    git pull upstream main
    ```

### Exemplo de Interação com o Terminal

![Interação CLI](https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExbXM1N3k3bGIzM2xyYTNybnIwYnI3d21kanpvY2w0Mmc2am55d3gzZCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/EtAodLkiYKYyv3M8e2/giphy.gif)

**Descrição da Interação:**

**Descrição da Interação:**

No exemplo de interação com o terminal, o usuário executa o programa `ConservacaoMarinha.jar` utilizando o comando `java -jar ConservacaoMarinha.jar`. O programa, que é desenvolvido em Kotlin, solicita que o usuário insira dados relacionados a um ambiente marinho protegido:

1. **Tipo de Ambiente Marinho**: O usuário é solicitado a inserir o tipo de ambiente marinho (por exemplo, "Manguezal").
2. **Área Protegida em Km²**: O usuário deve informar a área protegida em quilômetros quadrados.
3. **Programas de Monitoramento**: O programa pergunta se há programas de monitoramento em execução para o ambiente (com resposta "sim" ou "não").

Após a entrada de dados, o programa exibe os resultados formatados em uma tabela, detalhando o tipo de ambiente, a área protegida, e se há ou não programas de monitoramento. O terminal também mostra exemplos adicionais de objetos de conservação com diferentes dados, demonstrando a flexibilidade da classe `ConservacaoMarinha` e como ela lida com diferentes entradas.

Por fim, o terminal exibe o conteúdo do código-fonte `ConservacaoMarinha.kt`, que define a classe `ConservacaoMarinha` com suas propriedades e métodos, incluindo validação de entradas e a representação formatada dos dados. A classe permite a criação de objetos que representam diferentes cenários de conservação marinha, manipulando as propriedades como tipo de ambiente, área protegida, e a existência de monitoramento.

**Para mais detalhes sobre o Git e comandos básicos, consulte o [Repositório de Comandos Git](https://github.com/jonas-holanda/projeto1-git).**

---