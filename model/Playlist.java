package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> getMusicas() {
            return Collections.unmodifiableList(musicas);
    }
}
