public class MergeSort {

  public static void Merge(int[] vetor, int[] vetorAux, int inf, int med, int sup) {
    for (int k = inf; k <= sup; k++) {
      vetorAux[k] = vetor[k];
    }
    int i = inf, j = med + 1;

    for (int k = inf; k<= sup; k++) {
      if (i > med) {
        vetor[k] = vetorAux[j++];
      } else if (j > sup) {
        vetor[k] = vetorAux[i++];
      } else if (vetorAux[j] < vetorAux[i]) {
        vetor[k] = vetorAux[j++];
      } else {
        vetor[k] = vetorAux[i++];
      }
    }
  }

  public static int[] Ordenacao(int[] vetor, int[] aux, int inf, int sup) {
    if (sup <= inf) {
      return vetor;
    }
    int med = inf + (sup - inf) /2;

    Ordenacao(vetor, aux, inf, med);
    Ordenacao(vetor, aux, med+1, sup);
    Merge(vetor, aux, inf, med, sup);

    return vetor;
  }

  public static int[] MergeOrdenacao(int[] vetor) {
    int aux[] = new int[vetor.length];

    return Ordenacao(vetor, aux, 0, vetor.length -1);
  }

}
