import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        meuFilme.avalia(6.3);

        meuFilme.exibeFichaTecnica();

    }
}
