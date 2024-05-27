package classes;

import interfaces.AparelhoTelefonicoInterface;
import interfaces.NavegadorInternetInterface;
import interfaces.ReprodutorMusicalInterface;

public class Iphone  implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorInternetInterface {
    private String musicaAtual;
    private String paginaAtual;

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + paginaAtual);
    }
}
