import javax.swing.JOptionPane;

public class Main{
	public static void main(String args[]){
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
		Pilha p = new Pilha();

		int resto;

		// Primeira parte - Empilhar os restos 
		while (numero != 0){
			resto = numero % 2;   // pego o resto da divisão deste número por 2 (vale 0 ou 1)
			p.push(resto);        // armazeno na pilha
			numero = numero / 2;  // gero um novo número, resultado da divisão dele por 2
		}

		// Segunda parte - Exibir os restos
		while (!p.isEmpty()){
			resto = p.pop();      // remove da pilha (Sempre o cara que está no topo)
			System.out.print(resto);
		}
		System.out.println("\nFim do programa");
	}
}

// (172)10 = (10101100)2

/*
Um exemplo das divisoes suscessivas
  172 / 2
    0   86 / 2
         0  43 / 2
             1   21 / 2
                  1  10 / 2
                      0   5 / 2
                          1   2 / 2
                              0   1 / 2
                                  1   0
*/