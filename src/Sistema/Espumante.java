package Sistema;

public class Espumante {
	private String nome;
	private String tipo;
	private String uva;
	private String regiao;
	private int qntd;
	private double preco;

	public Espumante(String nome, String tipo, String uva, String regiao, int qntd, double preco) {
		this.nome = nome;
		this.tipo = tipo;
		this.uva = uva;
		this.regiao = regiao;
		this.qntd = qntd;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getUva() {
		return uva;
	}

	public String getRegiao() {
		return regiao;
	}

	public int getQntd() {
		return qntd;
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setUva(String uva) {
		this.uva = uva;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void exibir() {
		System.out.println("Espumante: " + nome + " | Tipo: " + tipo + " | Uva: " + uva + " | Região: " + regiao
				+ " | Quantidade: " + qntd + " | Preco: R$ " + preco);
	}

	public void servir() {
		if (qntd > 0) {
			qntd--;
			System.out.println("Uma garrafa de " + nome + " foi servida!");
		} else {
			System.out.println("Estoque insuficiente");
		}
	}
}