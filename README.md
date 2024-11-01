
# Sistema de Endereço - ViaCEP



Este projeto é um sistema de gerenciamento de endereços que utiliza a API ViaCEP para buscar informações de endereço a partir de um CEP fornecido. Ele foi desenvolvido em Java com Spring Boot e usa Spring Data JPA para persistência de dados.








### °Descrição


Este projeto foi desenvolvido como parte de um bootcamp de Programação Orientada a Objetos (POO) em Java. O sistema permite que alunos se inscrevam em cursos, acessem conteúdos diversos, como cursos e mentorias, e acompanhem seu progresso até a conclusão dos cursos.


Estrutura do Projeto
Classes Principais


### 1° Funcionalidades
 
 
 

º Consulta de endereço via API do ViaCEP.

º Relacionamento de endereços com Cliente de endereço.

º Endpoints RESTful para gerenciar endereços e perfis.





### 2° Tecnologias Utilizadas




º Java (versão 21)
° Spring Boot (versão 3.2.10)
° Spring Data JPA - para persistência
° API ViaCEP - para busca de endereços
° Swagger - para documentação da API
° Banco de dados - MySQL ou PostgreSQL (configurável)




### 3° Estrutura do Projeto




° controller - Contém os endpoints para gerenciamento de endereços e usuários.
° service - Contém a lógica de negócio e as integrações com a API ViaCEP.
º repository - Interfaces para comunicação com o banco de dados.
º model - Classes de entidade como Endereco e Usuario.


### 4° Exemplo de Uso
° Para consultar um endereço pelo CEP, envie uma requisição GET

°GET /api/enderecos/{cep}




### 5° Exemplo de Resposta

 {
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
   "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308"
}

Esse éum projeto simples de uma API Restfull, que consiste via cep, achar o endereço por completo!
 
 

