public class UsuarioPremium extends Usuario {
    private boolean temAnuncio;

    public UsuarioPremium(String nome) {
        super(nome);
        this.temAnuncio = false;
    }

    public void mostrarPremium() {
        System.out.println("\nTem anuncio: " + temAnuncio);
    }
}
