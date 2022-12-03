package empresa;

public class Funcionario extends Pessoa {
	private Projeto projeto;
	private String senha;

	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String senha) {
		super(nome);
		this.senha = senha;
	}
	
	
	public Funcionario(String nome, String senha, Projeto projeto) {
		super(nome);
		this.senha = senha;
		this.projeto = projeto;
		
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
	
