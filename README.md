# Music-Player
Aplicação de reprodução de música em Java para praticar modificadores de acesso e orientação a objetos.

---

## 1. **Fundamentos do Modelo**
- [ ] Criar a classe `Musica` com atributos privados, construtor e getters.
- [ ] Criar a classe `Playlist` com lista de músicas, métodos para adicionar/remover músicas e método para retornar músicas (com acesso controlado).
- [ ] Criar a classe `Usuario` com nome, senha (privado), métodos de autenticação e associação de playlists.

## 2. **Player Básico**
- [ ] Implementar a classe `PlayerMusical` com métodos para tocar uma música e tocar uma playlist inteira.
- [ ] Controlar a música atual e playlist atual como atributos privados.
- [ ] Exibir informações da música ao tocar (`System.out.println`).

## 3. **Funcionalidades de Playlist**
- [ ] Adicionar métodos para remover música da playlist.
- [ ] Listar todas as músicas de uma playlist.
- [ ] Criar playlists personalizadas para cada usuário.

## 4. **Aprimorando o Player**
- [ ] Implementar métodos para tocar a próxima e a música anterior (`proximaMusica()`, `musicaAnterior()`), usando o modificador `protected`.
- [ ] Criar uma subclasse `PlayerAleatorio` que sobrescreve a lógica de tocar próxima música de forma aleatória.

## 5. **Utilitários e Encapsulamento**
- [ ] Criar classe utilitária `TimeFormatter` em um pacote `util`, para formatar duração das músicas.
- [ ] Usar modificadores de acesso default para métodos utilitários que só precisam ser usados internamente.

## 6. **Funcionalidades de Usuário**
- [ ] Implementar autenticação de usuário.
- [ ] Limitar funcionalidades para usuário não autenticado (ex: não permitir tocar músicas).
- [ ] Permitir que cada usuário tenha múltiplas playlists.

## 7. **Melhorias de Segurança e Encapsulamento**
- [ ] Retornar listas imutáveis ao expor coleções (ex: músicas da playlist).
- [ ] Garantir que métodos sensíveis e atributos estejam bem encapsulados (`private` ou `protected`).

## 8. **Extras e Experimentação**
- [ ] Implementar busca de músicas por nome ou artista.
- [ ] Adicionar funcionalidade de remover playlists.
- [ ] Permitir renomear playlists.
- [ ] Simular tempo de reprodução com `Thread.sleep` (opcional, para praticar fluxos de execução).
- [ ] Criar testes unitários simples para principais métodos.

---
