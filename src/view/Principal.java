package view;

import controller.ControllerBMQSort;

public class Principal {

	public static void main(String[] args) {
		ControllerBMQSort bmqSortEx06 = new ControllerBMQSort();
		
		bmqSortEx06.ordenaVetorBubbleSort();
		bmqSortEx06.ordenaVetorMergSort();
		bmqSortEx06.ordenaVetorQuickSort();
	}
}
