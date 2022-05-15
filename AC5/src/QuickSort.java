import java.util.Random;

public class QuickSort {

  public static int[] Embaralhar(int[] vetor) {
    Random r = new Random(System.currentTimeMillis());

    int aux;

    // desordena um elemento por vez
    for (int i = 0; i < vetor.length; i++) {
      int ir = r.nextInt(i + 1); // sorteio aleatŕio

      aux = vetor[i];
      vetor[i] = vetor[ir];
      vetor[ir] = aux;
    }
    return vetor;
  }

  public static int Particao(int[] vetor, int inf, int sup) {
    int i = inf, j = sup + 1, aux;

    while (true) {
      while (vetor[++i] < vetor[inf]) {
        if (i == sup) {
          break;
        }
      }
      while (vetor[inf] < vetor[--j]) {
        if (j == inf) {
          break;
        }
      }
      if (i >= j) {
        break;
      }
      aux = vetor[i];
      vetor[i] = vetor[j];
      vetor[j] = aux;
    }

    aux = vetor[inf];
    vetor[inf] = vetor[j];
    vetor[j] = aux;

    return j;
  }

  public static  int[] Ordena(int[] vetor, int inf, int sup) {
    if (inf >= sup) {
      return vetor;
    } else {
      int j = Particao(vetor, inf, sup);
      Ordena(vetor, inf, j-1);
      Ordena(vetor, j+1, sup);
    }
    return vetor;
  }

  public static int[] Quick(int[] vetor, int n) {
    vetor = Embaralhar(vetor);

    return Ordena(vetor, 0, vetor.length-1);

  }
}
