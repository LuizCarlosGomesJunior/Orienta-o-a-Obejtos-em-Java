package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasavaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes() {

        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichatecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: "+ anoDelancamento);
    }

    public void avalia(double nota) {
        somaDasavaliacoes +=nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {

        return somaDasavaliacoes / totalDeAvaliacoes;
    }
}
