import java.util.Stack;

public class Pilha2 {

	public static void main(String[] args) {
		
		Dinossauro rex = new Dinossauro();
		rex.nome = "Rex";
		rex.velocidade = "27 km/h";
		rex.forca = 10;
		
		Dinossauro velo = new Dinossauro();
		velo.nome = "Velociraptor";
		velo.velocidade = "64 km/h";
		velo.forca = 2;
		
		Dinossauro dino = new Dinossauro();
		dino.nome = "Dino";

		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("A pilha est� vazia? " + stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("A pilha est� vazia? --- Resposta: " + stack.isEmpty());
		System.out.println("Tem quantos elementos? --- Resposta: " + stack.size());
		System.out.println("Quem est� nela? --- Resposta: " + stack);
		
		System.out.println("Quem est� no topo da pilha? --- Resposta: " + stack.peek());
		
		System.out.println("Tirando o " + stack.pop() + " da pilha");
		
		System.out.println("Agora quem est� na pilha? --- Resposta: " + stack);
	
	}

}
