package controller;

public class VetInvertido {

	public VetInvertido() {
		super ();
	}
	
	public int[] inverteVetor (int [] vet,  int i){ 
		if (i >= vet.length/2) {
			return vet;
		}
		int temp = vet[i];
		vet[i] = vet[vet.length - 1 - i];
		vet[vet.length - 1 - i] = temp;
		return inverteVetor (vet, i + 1);
		}
	}