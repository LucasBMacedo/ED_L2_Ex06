package controller;

public class VetInvertido {

	public VetInvertido() {
		super ();
	}
	public int[] RecebeVetor(int [] vet1, int [] vet2, int i){ // vet1 carregado e vet2 vazio.
		if (i == vet2.length) {
			return vet2;
		}
		else {
			vet2[i] = vet1[vet1.length - 1 - i];
			return RecebeVetor(vet1, vet2, i + 1);
		}
	}
}