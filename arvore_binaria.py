class Arvore_Binaria:
    __conteudo = ''
    __arvore_a_esquerda = None
    __arvore_a_direita = None

    def __init__(self, conteudo):
        self.set_conteudo(conteudo)
    
    def adiciona_vertice_a_esquerda(self, conteudo):
        # Se a árvore à esquerda for vazia, então crie uma nova árvore.
        if self.get_arvore_a_esquerda() == None:
            self.__arvore_a_esquerda = Arvore_Binaria(conteudo)
        else: 
            # Senão, insira o vértice á esquerda da raíz e faz um enxerto com a
            # subárvore à esquerda já existente.
            temp = Arvore_Binaria(conteudo)
            temp.__arvore_a_esquerda = self.get_arvore_a_esquerda()
            self.__arvore_a_esquerda = temp

    def get_arvore_a_esquerda(self):
        return self.__arvore_a_esquerda

    def adiciona_vertice_a_direita(self, conteudo):
         # Se a árvore à direita for vazia, então crie uma nova árvore.
        if self.get_arvore_a_direita() == None:
            self.__arvore_a_direita = Arvore_Binaria(conteudo)
        else:
            # Senão, insira o vértice à direita da raíz e faz um enxerto com a
            # subárvore à direita já existente.
            temp = Arvore_Binaria(conteudo)
            temp.__arvore_a_direita = self.get_arvore_a_esquerda()
            self.__arvore_a_direita = temp

    def get_arvore_a_direita(self):
        return self.__arvore_a_direita
    
    def faz_poda_a_direita(self):
        self.__arvore_a_direita = None

    def faz_poda_a_esquerda(self):
        self.__arvore_a_esquerda = None

    def set_conteudo(self, conteudo):
        self.__conteudo = conteudo

    def get_conteudo(self):
        return self.__conteudo


