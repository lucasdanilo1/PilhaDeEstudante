package uniceplac.programacao.estruturada.view;

import uniceplac.programacao.estruturada.controller.Pilha;
import uniceplac.programacao.estruturada.model.Estudante;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        boolean adicionarMaisEstudantes = true;

        while (adicionarMaisEstudantes) {
            String nome = JOptionPane.showInputDialog("Digite o nome do estudante:");
            String idadeStr = JOptionPane.showInputDialog("Digite a idade do estudante:");
            int idade = Integer.parseInt(idadeStr);

            Estudante estudante = new Estudante(nome, idade);
            pilha.empilhar(estudante);

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais estudantes?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (opcao != JOptionPane.YES_OPTION) {
                adicionarMaisEstudantes = false;
            }
        }

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja mover a pilha?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            pilha.movimentarPilha();
            JOptionPane.showMessageDialog(null, pilha.printEstudantes(), "Estudantes", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}