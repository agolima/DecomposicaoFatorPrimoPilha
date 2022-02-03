
public class Elemento {
	private int conteudo;
	private Elemento anterior;


	public Elemento(){

	}

	public Elemento(int conteudo){
		this.conteudo = conteudo;
		this.anterior = anterior;
	}

	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	public Elemento getAnterior() {
		return anterior;
	}
	public void setAnterior(Elemento proximo) {
		this.anterior = proximo;
	}




}
