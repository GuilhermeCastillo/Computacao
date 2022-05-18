def bubble_sort(vetor):
    fim = len(vetor)

    while fim > 0: 
        i = 0 
        while i < fim -1:
            if vetor[i] > vetor[i+1]:
                auxiliar = vetor[i]
                vetor[i] = vetor[i+1]
                vetor[i+1] = auxiliar
            i += 1
        fim -= 1

    return vetor

if __name__ == "__main__":
    vetor = [5,4,3,2,1] 
    vetor = bubble_sort(vetor)

    print(vetor)
