package com.iphone;

import iphone.funcoes.AparelhoTelefonico;
import iphone.funcoes.NavegadorInternet;
import iphone.funcoes.ReprodutorMusical;



public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);

    }

    @Override
    public void atender() {
        System.out.println("Alo. Com quem eu falo?");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe seu recado após o sinal");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina: " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");

    }

    @Override
    public  void atualizarPagina() {
        System.out.println("Atualizando pagina ");


    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");

    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);

    }
}
