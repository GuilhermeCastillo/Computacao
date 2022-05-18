def shell_sort(vetor):
    h = len(vetor) // 2
    while h > 0: 
        i = h
        while i < len(vetor):
            temp = vetor[i]
            trocou = False
            j = i - h
            while j >= 0 and vetor[j] > temp:
                vetor[j+h] = vetor[j]
                trocou = True
                j -= h

            if trocou:
                vetor[j+h] = temp

            i += 1
        
        h = h // 2

    return vetor

if __name__ == "__main__":
    vetor = [30,2,2,3]
    vetor = shell_sort(vetor)

    print(vetor)
