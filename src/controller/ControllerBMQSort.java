package controller;

import br.edu.fateczl.BubbleSort.OrdenacaoBubbleSort;
import br.edu.fateczl.MergeSort.OrdenacaoMergeSort;
import br.edu.fateczl.QuickSort.OrdenacaoQuickSort;

public class ControllerBMQSort {

	public ControllerBMQSort() {
		super();
	}
	
	public void ordenaVetorBubbleSort() {
		OrdenacaoBubbleSort bubbleSortEx06 = new OrdenacaoBubbleSort();
		
		int[] vetor = new int[1500];
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = 1499 - i;
		}
		
		long tempoInicialBubbleSort = System.nanoTime();		
		vetor = bubbleSortEx06.ordenacaoBubbleSort(vetor);
		long tempoFinalBubbleSort = System.nanoTime();
		
		long tempoExecucaoBubbleSort = tempoFinalBubbleSort - tempoInicialBubbleSort;
		
		System.out.println("O tempo de execução para ordenar o vetor utilizando BubbleSort é de: " + tempoExecucaoBubbleSort);
	}
	
	public void ordenaVetorMergSort() {
		OrdenacaoMergeSort mergeSortEx06 = new OrdenacaoMergeSort();
		
		int[] vetor = new int[1500];
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = 1499 - i;
		}
		
		long tempoInicialMergeSort = System.nanoTime();
		vetor = mergeSortEx06.ordenarMergeSort(vetor);
		long tempoFinalMergeSort = System.nanoTime();
		
		long tempoExecucaoMergeSort = tempoFinalMergeSort - tempoInicialMergeSort;
		
		System.out.println("O tempo de execução para ordenar o vetor utilizando MergeSort é de: " + tempoExecucaoMergeSort);
	}
	
	public void ordenaVetorQuickSort() {
		OrdenacaoQuickSort quickSortEx06 = new OrdenacaoQuickSort();
		
		int[] vetor = new int[1500];
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = 1499 - i;
		}
		
		long tempoInicialQuickSort = System.nanoTime();
		vetor = quickSortEx06.quickSort(vetor, 0, vetor.length - 1);
		long tempoFinalQuickSort = System.nanoTime();
		
		long tempoExecucaoQuickSort = tempoFinalQuickSort - tempoInicialQuickSort;
		
		System.out.println("O tempo de execução para ordenar o vetor utilizando QuickSort é de: " + tempoExecucaoQuickSort);
	}
}
