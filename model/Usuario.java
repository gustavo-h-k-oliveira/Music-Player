package model;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public boolean autenticar(String senhaTeste) {
        return senha.equals(senhaTeste);
    }

    public String getNome() { return nome; }
}
