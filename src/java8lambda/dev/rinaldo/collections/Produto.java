package java8lambda.dev.rinaldo.collections;

public class Produto implements Comparable<Produto> {
	private Long serialNumber;
	private String nome;
	private double preco;

	public Produto(Long serialNumber, String nome, double preco) {
		super();
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int compareTo(Produto produto) {
		// negativo se this.Object < outroObject
		// zero as this.object == outroObject
		// positivo se this.object > outroObject
		return this.serialNumber.compareTo(produto.getSerialNumber());
	}

}
