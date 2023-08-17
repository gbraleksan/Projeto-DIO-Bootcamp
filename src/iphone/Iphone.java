package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("AppleMusic - Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("AppleMusic - Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("AppleMusic - Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Safari - Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Safari - Nova página adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Safari - Página atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("Chamadas - Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Chamadas - Atendido");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Chamadas - Iniciando Correio de Voz");
    }
    
}
