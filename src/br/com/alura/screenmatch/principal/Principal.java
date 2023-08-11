package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        meuFilme.avalia(6.3);
        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);

        System.out.println("Para maratonar filmes e séries: "+ calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoRenato = new Filme("Rocky V",1995);
        filmeDoRenato.avalia(10);

        //System.out.println(filmeDoRenato.getNome());

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoRenato);
        listaDeFilmes.add(meuFilme);

        //System.out.println("Primeiro filme = " + listaDeFilmes.get(0).getNome());
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println("Filme " + i + " = " + listaDeFilmes.get(i).getNome());
        }

        System.out.println(listaDeFilmes);
    }
}
