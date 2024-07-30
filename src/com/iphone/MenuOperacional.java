package com.iphone;

public class MenuOperacional {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("2195869586");
        iphone.atender();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Paradise");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("github");
        iphone.iniciarCorreioVoz();
        iphone.atualizarPagina();

    }
}
