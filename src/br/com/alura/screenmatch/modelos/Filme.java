package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoplano;
    private double somaDasavaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvaliacao(){
        return this.totalDeAvaliacao;
    }
    public void exibeFichaTecnica(){
        System.out.println("**************** Ficha técnica ******************");
        System.out.println("br.com.alura.screenmatch.modelos.Filme: " + this.getNome());
        System.out.println("Ano de Lançamento: " + this.getAnoDeLancamento());
        System.out.println("Media Avaliações: " + this.pegaMedia());
        System.out.println("Total de Avaliações: " + this.getTotalDeAvaliacao());
        System.out.println("Duração: " + this.getDuracaoEmMinutos() +" min");
        System.out.println("*************************************************");
    }
    public void avalia(double nota){
        this.somaDasavaliacoes += nota;
        this.totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return this.somaDasavaliacoes / this.totalDeAvaliacao;
    }
}

