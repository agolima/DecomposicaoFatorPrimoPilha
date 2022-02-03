
public class Fatoracao {

	public int[] fatoracao(int conteudo){

		int i = 0;
		int j = 0;
		boolean ePrimo;
		int vetor[] = new int[100];

		while(conteudo != 1){
			ePrimo = primos(i);

			if (ePrimo == true && conteudo%i == 0) {

				vetor[j] = i;
				conteudo = (conteudo/i);
				i = 0;
			}
			i++;
			j++;
		}
		return vetor;
	}
	
	public boolean primos(int i){

		int numDivisores = 0;

		for (int j = 1; j <= i; j++) {
			if (i%j == 0) {
				numDivisores++;
			}
		}
		if (numDivisores == 2) {
			return true;
		}
		return false;
	}
}