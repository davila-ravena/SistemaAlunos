# Sistema de Gerenciamento de Alunos

## Descrição
Este projeto em Java permite gerenciar informações de alunos, incluindo:
- Nome, matrícula, curso e status de bolsa
- Finalização de curso e Trabalho de Conclusão
- Operações de cadastro, consulta, listagem e remoção de alunos

O sistema foi desenvolvido para fins de aprendizado em **Java** e aplicação de **orientação a objetos**.

## Funcionalidades
- Cadastrar novos alunos
- Editar informações de alunos existentes (via código)
- Consultar lista de alunos
- Buscar aluno por matrícula
- Remover alunos
- Possibilidade de expandir para persistência em arquivos ou banco de dados

## Tecnologias
- Java 11+ (ou versão utilizada)
- Estruturas de dados: ArrayList
- Orientação a Objetos: Classes, Métodos, Encapsulamento

## Estrutura do Projeto
- `model`: Classe de modelo (`Aluno.java`)
- `dao`: Classe de gerenciamento de alunos (`AlunoDAO.java`)
- `main`: Classe principal (`Main.java`) para execução do sistema

## Como executar
1. Clone o repositório:

   git clone https://github.com/seu-usuario/SistemaAlunos.git

2. Compile o projeto:

javac -d bin src/**/*.java

3. Execute:

java -cp bin main.Main

---

Exemplo de uso
--- Sistema de Gerenciamento de Alunos ---
1 - Cadastrar aluno
2 - Listar alunos
3 - Buscar aluno
4 - Remover aluno
0 - Sair
Escolha uma opção: 1
Nome: Maria
Matrícula: 12345
Curso: Análise e Desenvolvimento de Sistemas
Bolsa (true/false): true
Aluno cadastrado com sucesso!