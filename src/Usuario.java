public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void mostrarDados() {
        System.out.printf("Usuario tem o nome: %s", this.nome);
    }
}
