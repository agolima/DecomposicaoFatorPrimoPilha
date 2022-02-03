
public class Principal {
	public static void main(String[] args){
		Pilha f = new Pilha();
		Fatoracao r = new Fatoracao();
		Elemento e = new Elemento(3960);

		int vetor[] = r.fatoracao(e.getConteudo());


		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {

				f.push(vetor[i]);
			}
		}
		
		f.listar();
	}
}