import java.util.Random;

public class GeraVetor {

  public static int[] Vetor(int n) {
    Random random = new Random();

    int[] vetor = new int[n];

    for (int x = 0; x < n; x++) {
      int numero  = random.nextInt(40000);
      vetor[x] = numero;
    }
    return vetor;
  }
}
