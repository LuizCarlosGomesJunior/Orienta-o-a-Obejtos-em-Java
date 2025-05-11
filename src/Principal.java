import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {
        Titulo meuTitulo = new Titulo();
        meuTitulo.setNome("O poderoso chefão");
        meuTitulo.setAnoDelancamento(1970);
        meuTitulo.setDuracaoEmMinutos(180);

        meuTitulo.exibeFichatecnica();
        meuTitulo.avalia(8);
        meuTitulo.avalia(5);
        meuTitulo.avalia(10);
        System.out.println(meuTitulo.getTotalDeAvaliacoes());
        System.out.printf("%.1f", meuTitulo.pegaMedia());

        Filme filme = new Filme();
        filme.setNome("One Piece");
        filme.setDuracaoEmMinutos(180);
        filme.setAnoDelancamento(2023);

        Filme filme1 = new Filme();
        filme1.setNome("One Piece");
        filme1.setDuracaoEmMinutos(160);
        filme1.setAnoDelancamento(2025);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDelancamento(2000);
        lost.exibeFichatecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme1);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempototal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}
