/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IsmaelPC
 */
public class Bubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("vetor não ordenado");
        int vetor[] = {7, 4, 3, 5, 2, 9};
        int num = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);

        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetor[i] < vetor[j]) {
                    num = vetor[j];
                    vetor[i] = vetor[j];
                    vetor[j] = num;
                }
            }
        }
        System.out.println("vetor ordenado");
    }

}
