package iphone;

import funcoes.NavegadorWeb;
import funcoes.ReprodutorDeMusica;
import funcoes.Telefone;

public class Iphone implements NavegadorWeb, Telefone, ReprodutorDeMusica {
     // Método main
     public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando funções do Reprodutor de Música
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();

        // Testando funções do Telefone
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funções do Navegador Web
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaPagina();
        meuIphone.atualizarPagina();
    }
    // Funcoes do Reprodutor de Musica
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone pelo Reprodutor de Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone pelo Reprodutor de Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no iPhone pelo Reprodutor de Música");
    }

    // Funcoes do Telefone
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação no iPhone pelo Telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no iPhone pelo Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no iPhone pelo Telefone");
    }

    // Funcoes do Navegador Web
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página no iPhone pelo Navegador Web");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova Página no iPhone pelo Navegador Web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página no iPhone pelo Navegador Web");
    }
    
}
