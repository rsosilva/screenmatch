public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoplano;
    double somaDasavaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("**************** Ficha técnica ******************");
        System.out.println("Filme: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Media Avaliações: " + this.pegaMedia());
        System.out.println("*************************************************");
    }
    void avalia(double nota){
        this.somaDasavaliacoes += nota;
        this.totalDeAvaliacao++;
    }

    double pegaMedia(){
        return this.somaDasavaliacoes / this.totalDeAvaliacao;
    }
}

