public class Main {
  public static void main(String[] args) {

    GeraVetor CriaVetor = new GeraVetor();

    int[] vetor = CriaVetor.Vetor(5);
    int[] vetor2 = {10,9,8,7,6,5,4,3,2,1};

    // funcionando
    BubbleSort Bubble = new BubbleSort();
    SelecaoDireta Selecao = new SelecaoDireta();
    InsercaoDireta Insercao = new InsercaoDireta();
    QuickSort Quick = new QuickSort();
    MergeSort Merge = new MergeSort();

    // terminando...
    ShakeSort Shake = new ShakeSort();


//    Merge.MergeOrdenacao(vetor);
//    Quick.Quick(vetor, 0);
//    Shake.Ordena(vetor, vetor.length);
//    Insercao.Ordena(vetor, vetor.length);
//    SelecaoDireta.Ordena(vetor);
//    Bubble.Ordena(vetor, vetor.length);

      for(int x = 0; x < vetor.length; x++) {
        System.out.printf("%d,", vetor[x]);
      }
  }
}