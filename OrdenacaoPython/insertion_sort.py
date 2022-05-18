def insertion_sort(vetor):
    i = 1
    while i < len(vetor):
        temp = vetor[i]
        trocou = False
        j = i - 1
        while j >= 0 and vetor[j] > temp:
            vetor[j+1] = vetor[j]
            trocou = True
            j -= 1

        if trocou:
            vetor[j+1] = temp

        i += 1

    return vetor

if __name__ == "__main__":
    vetor = [30,2,2,3,4,2,34,1,48,32,21]
    vetor = insertion_sort(vetor)

    print(vetor)
