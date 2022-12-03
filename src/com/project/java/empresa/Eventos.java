package empresa;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Eventos implements MetodosMenu {
	static Scanner sc = new Scanner(System.in);
	
	public ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	
	public  void menuInicial() {
		int choice;
		while (true) {
		System.out.println("Escolha uma opção");	
		System.out.println("1 - Admin");
		System.out.println("2 - Funcionario");
		System.out.println("0 - Sair");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			menuAdmin();
			break;
		case 2:
			menuFuncionario();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção invalida!");
			
			
		}
		if (choice ==0) {
			break;
		}
		
		}
	
	}
	
	public void menuAdmin() {
		int choice;
		while (true) {
		System.out.println("**Menu Admin**");
		System.out.println("1 - Novo Projeto");
		System.out.println("2 - Cadastrar Funcionario");
		System.out.println("3 - Demitir Funcionario");
		System.out.println("0 - Sair");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			cadastrarProjeto();
			break;
		case 2: 
			cadastrarFuncionario();
			break;
		case 3:
			demitirFuncionario();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção invalida!");
			}
		if (choice == 0) {
			break;
		}	
	}

  }
	
	public void cadastrarProjeto() {
		for (int x = 0; x<funcionarios.size();x++) {
			System.out.println("["+x+"]"+" "+funcionarios.get(x).getNome());
		}
		System.out.println("Selecione o index do funcionario: ");
		int index = sc.nextInt();
		sc.nextLine();
		try {
			funcionarios.get(index);
			System.out.println("Adicione o novo projeto: ");
			String projeto = sc.nextLine();
			funcionarios.get(index).setProjeto(new Projeto(projeto));		
			System.out.println("Projeto adicionado ao funcionario: "+funcionarios.get(index).getNome());
			System.out.println("Projeto: "+funcionarios.get(index).getProjeto().getProjeto());
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Index incorreto!");
		}
		
	}	
	
	
	public void cadastrarFuncionario() {
		System.out.println("Digite o nome do Funcionario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Digite a senha: ");
		String senha = sc.nextLine();
		
		funcionarios.add(new Funcionario(nome,senha));
	}
	
	public void demitirFuncionario() {
		for (int x = 0; x<funcionarios.size();x++) {
			System.out.println("["+x+"]"+" "+funcionarios.get(x).getNome());
		}
		System.out.println("Digite o index do funcionario que será demitido: ");
		int index = sc.nextInt();
		
		try {
			System.out.println(funcionarios.get(index).getNome()+" Foi demitido");
			funcionarios.remove(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index invalido!");
		}
			
		
	}
	
	public void menuFuncionario() {
		sc.nextLine();
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite  sua senha:");
		String senha = sc.nextLine();
		
		for(int index=0;index<funcionarios.size();index++) {
			if(nome.equals(funcionarios.get(index).getNome()) & senha.equals(funcionarios.get(index).getSenha())) {
				System.out.println("Nome: "+funcionarios.get(index).getNome());
				System.out.println("Projeto: "+funcionarios.get(index).getProjeto().getProjeto());
			}
		}
		
		
	}

}	