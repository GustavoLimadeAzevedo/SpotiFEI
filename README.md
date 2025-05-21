Projeto SpotiFEI
SpotiFEI - Gerenciador de Músicas e Playlists
Este projeto é uma aplicação Java para gerenciamento de músicas e playlists, desenvolvida com uma arquitetura em camadas (Model-View-Controller - MVC e Data Access Object - DAO). Ele permite que usuários e administradores interajam com um catálogo de músicas, criem playlists e gerenciem dados de forma persistente em um banco de dados.

 Tecnologias Utilizadas
Java: Linguagem de programação principal.
JDBC (Java Database Connectivity): Para conexão e interação com o banco de dados.
Swing (javax.swing): Para a interface gráfica do usuário (GUI).
MySQL (ou outro SGBD compatível com JDBC): Para persistência dos dados.
NetBeans IDE: Ambiente de desenvolvimento utilizado (inferido pelos comentários nos arquivos).

 Estrutura do Projeto
O projeto segue uma estrutura organizada em pacotes para melhor modularidade e separação de responsabilidades:

model/: Contém as classes que representam as entidades do negócio (Admin, Artista, Musica, PlayList, Usuario).
dao/: Contém as classes Data Access Object (DAO) responsáveis pela interação com o banco de dados para cada entidade (AdminDAO, ConexaoDAO, MusicaDAO, PlaylistDAO, UsuarioDAO).
Controller/: Contém as classes controladoras que gerenciam a lógica de negócios e atuam como intermediárias entre a interface do usuário e o acesso a dados (controllerAdmin, controllerMusica, controllerPlayList, controllerUsuario).
view/: Contém as classes da interface gráfica do usuário (GUI) desenvolvidas com Swing (AdminViewCadastro, AdminViewLogin, Cadastro, Login, Menu).
Conexao/: (Observação: Embora ConexaoDAO.java esteja no pacote dao, há uma referência a Conexao.conectar(), sugerindo uma classe Conexao separada para a lógica de conexão. Se Conexao.java não for fornecida, será necessário criá-la).

 Modelo de Dados (Banco de Dados)
Baseado nos DAOs, as tabelas esperadas no banco de dados são:

administrador_usuario: Armazena informações dos administradores.

id (PRIMARY KEY)
nome
usuario
senha
musica: Armazena informações das músicas.

id (PRIMARY KEY)
titulo
artista
genero
usuarios: Armazena informações dos usuários.

id (PRIMARY KEY)
nome
usuario
senha
Tabelas de Playlist: Embora a classe PlaylistDAO esteja largely vazia e PlayList.java também, é esperado que existam tabelas para playlists e para associar musicas a playlists (ex: playlist_musicas ou playlist_items).

Configuração do Banco de Dados
Crie um banco de dados (ex: spotifei_db).
Execute os scripts SQL para criar as tabelas administrador_usuario, musica e usuarios com as colunas mencionadas acima. Certifique-se de que os tipos de dados correspondam aos do Java (e.g., VARCHAR para String, INT para int).
Ajuste a classe Conexao.java (ou onde quer que a lógica de conexão esteja implementada) com suas credenciais do banco de dados (URL, usuário, senha).
