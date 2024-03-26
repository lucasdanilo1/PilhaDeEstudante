package uniceplac.programacao.estruturada.controller;

import uniceplac.programacao.estruturada.model.Estudante;

public class Pilha {

    private int tamanhoPilha;
    private Estudante[] estudantes;
    private int ponteiro;

    public Pilha(int tamanhoPilha){
        this.tamanhoPilha = tamanhoPilha;
        this.estudantes = new Estudante[tamanhoPilha];
        this.ponteiro = 0;
    }

    public void empilhar(Estudante estudante) {
        if (ponteiro < tamanhoPilha) {
            estudantes[ponteiro++] = estudante;
        } else {
            System.out.println("A pilha está cheia, não é possível empilhar mais elementos.");
        }
    }

    public void movimentarPilha() {
        if (ponteiro > 0) {
            for (int i = ponteiro - 1; i > 0; i--) {
                estudantes[i] = estudantes[i - 1];
            }
            estudantes[0] = null;
            ponteiro--;
        } else {
            System.out.println("A pilha está vazia, não é possível movimentar elementos.");
        }
    }

    public String  printEstudantes() {
        String retorno = "";
        for (int i = 0; i < estudantes.length; i++) {
            retorno += String.format("\t\t [%s] => %s", i, estudantes[i] != null ? estudantes[i].getNome() : "");
        }
        return retorno;
    }
}

