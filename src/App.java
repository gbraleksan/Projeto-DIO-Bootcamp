import aparelhoTelefonico.AparelhoTelefonico;
import iphone.Iphone;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        AparelhoTelefonico at = iphone;
        NavegadorInternet ni = iphone;
        ReprodutorMusical rm = iphone;

        at.ligar();
        at.atender();
        at.inicarCorreioVoz();

        ni.adicionarNovaAba();
        ni.atualizarPagina();
        ni.exibirPagina();

        rm.selecionarMusica();
        rm.tocar();
        rm.pausar();
    }
}
