package view;

import javax.swing.JOptionPane;

import controller.VetInvertido;

public class Principal {

	public static void main(String[] args) {
		VetInvertido vetinv = new VetInvertido();
		int i;
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamnho do vetor?"));
		int [] vet1 = new int [tamanho];
		int [] vet2 = new int [tamanho];
		for (i = 0; i < tamanho; i++) {
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao " + i + " do vetor."));			
		}
		i = 0;
		vet2 = vetinv.RecebeVetor(vet1, vet2, i);
		for (i = 0; i < tamanho; i++) {
			System.out.println(vet2[i]);
	}
	} 
}