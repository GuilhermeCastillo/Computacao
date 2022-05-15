public class SelecaoDireta {

  public static int[] Ordena(int[] vetor) {

    for (int i = 0; i < vetor.length -1; i++) {
      int menor = i;

      for (int j = i + 1; j < vetor.length; j++) {
        if (vetor[j] <  vetor[menor]) {
          menor = j;
        }
      }

      if (menor != i) {
        int aux = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor] = aux;
      }
    }
    return  vetor;
  }
}