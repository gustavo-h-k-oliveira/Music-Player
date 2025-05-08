package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
    private String nome;
    private String senha;
    private List<Playlist> playlists = new ArrayList<>();

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public boolean autenticar(String senhaTeste) {
        return senha.equals(senhaTeste);
    }

    public String getNome() {
        return nome;
    }

    // Adiciona uma nova playlist ao usuário
    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    // Remove uma playlist do usuário
    public void removerPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    // Retorna uma lista imutável para evitar alterações externas
    public List<Playlist> getPlaylists() {
        return Collections.unmodifiableList(playlists);
    }
}
