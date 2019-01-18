Desafio CIELO SERVICE

artefato Spring BOOT 
Acessado pelo artefato de front, devolve informação de extaraida de sistema legado (arquivo JSON).
Executar este artefato antes de acessar o front pelo browser.
Este artefato utiliza a porta 8001

________________________________________________________________

* No intuito de desacoplamento para fins de reuso da API por sistemas diversos
foi desenvolvido dois artefatos (WEB e SERVICE).
Para o correto funcionamento do sistema, os dois artefatos devem estar no ar 
antes da chamada via Browser.
* O sistema WEB contém a parte do front acessada pelo cliente via Browser, este artefato WEB
 consome via REST a aplicação SERVICE que é responsável pela transformação da informação 
 do sistema legado.

________________________________________________________________


Documentação swagger no endereço localhost:8001/swagger-ui.html


________________________________________________________________

Os projetos usam o framework Lombok para as classes de DTO

Caso seja executado a partir do eclipse é necessário instalar o framework na IDE

Faça o download do jar em 

https://projectlombok.org/download

Execute o arquivo jar com o java.
Ele irá tentar localizar a IDE no local padrão, caso não encontre 
será apresentado uma tela para indicar o local de instalação do Eclipse.
Basta instalar e reiniciar a IDE.