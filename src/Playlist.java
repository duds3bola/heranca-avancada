import java.util.ArrayList;

public class Playlist {

    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public Musica getMusica(int indice) {
        return musicas.get(indice);
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeMusicas() {
        return musicas.size();
    }

    public boolean estaVazia() {
        return musicas.isEmpty();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Musica adicionada a playlist.");
    }

    public void listarNomes() {

        if (this.musicas.isEmpty()) {
            System.out.println("Voce tem 0 musicas na sua playlist.");
        } else {

            for (int i = 0; i < this.musicas.size(); i++) {

                System.out.println(
                        "( " + (i + 1) + " ) "
                                + this.musicas.get(i).getTitulo()
                                + " - "
                                + this.musicas.get(i).getArtista()
                );
            }
        }
    }
}