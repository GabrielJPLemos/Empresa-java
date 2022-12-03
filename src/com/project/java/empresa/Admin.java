package empresa;

public class Admin extends Pessoa{
	Empresa empresa;
	
	public Admin() {
		
	}
	
	public Admin(String nome, Empresa empresa) {
		super(nome);
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
