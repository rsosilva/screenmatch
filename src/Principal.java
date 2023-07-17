public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        meuFilme.avalia(6.3);

        meuFilme.exibeFichaTecnica();

    }
}
