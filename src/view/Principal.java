package view;

import javax.swing.JOptionPane;

import controller.VetInvertido;

public class Principal {

	public static void main(String[] args) {
		VetInvertido vetinv = new VetInvertido();
		int i;
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
		int [] vet = new int [tamanho];
		for (i = 0; i < tamanho; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao " + i + " do vetor."));			
		}
		i = 0;
		vet = vetinv.inverteVetor(vet, i);
		for (i = 0; i < tamanho; i++) {
			System.out.println(vet[i]);
	}
	} 
}