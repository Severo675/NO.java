class No {
   int dado;
   No proximo;

   public No(int dado) {
     this.dado = dado;
     this.proximo = null;
    }
}
 // A classe principal da lista
class ListaEncadeada {
   No cabeca; 
   // A cabeça da lista
 
   public void adicionar(int dado) {
     No novoNo = new No(dado);
     if (cabeca == null) {
         cabeca = novoNo;
    } else {
        No atual = cabeca;
        while (atual.proximo != null) {
           atual = atual.proximo;
        }
         atual.proximo = novoNo;
        }
    }
 }
