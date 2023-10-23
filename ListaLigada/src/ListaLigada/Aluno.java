package ListaLigada;

public class Aluno {
	private String nome;
	private String numeroTel;
	public Aluno() {
		
	}
	public Aluno(String nome, String numero) {
		this.nome = nome;
		this.numeroTel = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	
}
