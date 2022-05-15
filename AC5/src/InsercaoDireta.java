public class InsercaoDireta {

  public static int[] Ordena(int[] vetor, int tam) {

    int aux;
    int j;

    for (int i = 1; i < tam; i++) {
      aux = vetor[i];
      j = i - 1;

      while (j >= 0 && aux < vetor[j]) {
        vetor[j + 1] = vetor[j]; // deslocando

        j--;
      }
      vetor[j + 1] = aux; // inserindo
    }
    return vetor;
  }
}

