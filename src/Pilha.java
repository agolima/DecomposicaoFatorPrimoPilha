
public class Pilha {
	private Elemento topo;
	private int qnt;

	public Pilha(){
		this.setTopo(null);
		this.qnt = 0;
	}


	public void push(int i){

		if (qnt == 0) {
			this.topo = new Elemento();
			Elemento e = new Elemento();
			
			e.setConteudo(i);
			e.setAnterior(null);

			this.topo.setConteudo(e.getConteudo());;
			this.topo.setAnterior(null);
			this.topo = e;
			qnt++;
		}else{
			Elemento e = new Elemento();
			
			e.setConteudo(i);
			e.setAnterior(this.topo);
			this.topo = e;
			qnt++;
		}
	}

	public void listar(){
		Elemento e = this.topo;

		while (e != null) {
			System.out.print(e.getConteudo());
			if (e.getAnterior() != null) {
				System.out.print("*");
			}
			e = e.getAnterior();
		}

	}

	public int getQnt() {
		return qnt;
	}
	
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public Elemento getTopo() {
		return topo;
	}

	public void setTopo(Elemento topo) {
		this.topo = topo;
	}


}