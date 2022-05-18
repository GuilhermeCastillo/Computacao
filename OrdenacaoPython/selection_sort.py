def selection_sort(vetor):
    i = 0

    while i < len(vetor) - 1:
        menor = i
        j = i + 1 

        while j < len(vetor):
            if vetor[j] < vetor[menor]:
                menor = j
            j += 1
            
        if menor != i:
            auxiliar = vetor[i]
            vetor[i] = vetor[menor]
            vetor[menor] = auxiliar 
        i += 1
    
    return vetor


if __name__ == "__main__":
    vetor = [10,2,23,22,32,1,2,3,4,4,5,12,2,22,333,32,1,1]
    vetor = selection_sort(vetor)

    print(vetor)
