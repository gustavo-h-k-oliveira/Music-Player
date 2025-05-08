package player;

import model.Musica;
import model.Playlist;

public class PlayerMusical {
    private Musica musicaAtual;
    protected Playlist playlistAtual;

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public void tocarMusica(Musica musica) {
        musicaAtual = musica;
        System.out.println("Tocando: " + musica.getTitulo() + " - " + musica.getArtista());
    }

    public void tocarPlaylist(Playlist playlist) {
        playlistAtual = playlist;
        for (Musica musica : playlist.getMusicas()) {
            tocarMusica(musica);
        }
    }

    // Método protected para ser sobrescrito por subclasses (ex: modo aleatório)
    protected void proximaMusica() {
        // lógica para próxima música
    }
}
