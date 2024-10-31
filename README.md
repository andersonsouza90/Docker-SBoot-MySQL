Executar o prompt na raiz do projeto o comando: 
docker-compose up --build

Após terminar o docker-compose:

acessar a url http://localhost:8080/

![image](https://github.com/user-attachments/assets/0f6ff98b-401d-42ae-8f21-6444db404127)

Acessa o banco mysql local - usuário: root e senha: root

![image](https://github.com/user-attachments/assets/83413fe6-c351-4380-acd0-0e0f9ca8071c)

Adicione algum nome no banco de dados festa e na tabela convidados

  insert into convidados (cpf, nome)
  values ("123.123.123-12", "Dandy");
  
![image](https://github.com/user-attachments/assets/d365cf3e-b668-42fa-b10b-68f85cb103b6)

Atualize o browser e deverá aparecer a consulta do nome inserido no banco

![image](https://github.com/user-attachments/assets/8c031bb0-d180-40d1-84d2-6d3f33931349)

