
public class Bubblesort {

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
