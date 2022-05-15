public class BubbleSort {
  public static int[] Ordena(int[] vetor, int tamanho) {
    int i, fim, aux;

    for (fim = tamanho - 1; fim > 0; --fim) {
      for(i = 0; i < fim; ++i) {
        if (vetor[i] > vetor[i + 1]) {
          aux = vetor[i];
          vetor[i] = vetor[i+1];
          vetor[i+1] = aux;
        }
      }
    }

    return vetor;
  }

}
