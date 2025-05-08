import model.Musica;
import model.Playlist;
import model.Usuario;
import player.PlayerMusical;

public class Main {
    public static void main(String[] args) {
        // Criando músicas
        Musica m1 = new Musica("Imagine", "John Lennon", 183);
        Musica m2 = new Musica("Bohemian Rhapsody", "Queen", 354);
        Musica m3 = new Musica("Billie Jean", "Michael Jackson", 294);

        // Criando playlist e adicionando músicas
        Playlist playlist = new Playlist("Favoritas");
        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);
        playlist.adicionarMusica(m3);

        // Criando nova música
        Musica m4 = new Musica("Evenflow", "Pearl Jam", 294);

        // Criando usuário
        Usuario usuario = new Usuario("gustavo", "senha123");

        // Simulando autenticação do usuário
        if (usuario.autenticar("senha123")) {
            System.out.println("Usuário autenticado: " + usuario.getNome());

            // Criando player e tocando a playlist
            PlayerMusical player = new PlayerMusical();
            player.tocarPlaylist(playlist);

            // Tocando música individual
            player.tocarMusica(m4);
        } else {
            System.out.println("Falha na autenticação do usuário.");
        }
    }
}
