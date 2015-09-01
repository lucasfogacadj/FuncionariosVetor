import java.util.Scanner;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private float salario;
	private int idade;
	
	Scanner tc = new Scanner(System.in);
	
	public void ler(){
		System.out.println("Digite o nome:");
		this.setNome(tc.next());
		System.out.println("Informe o departamento");
		this.setDepartamento(tc.next());
		System.out.println("Informe o salario");
		this.setSalario(tc.nextFloat());
		System.out.println("Informe a idade:");
		this.setIdade(tc.nextInt());
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public void mostrar(){
		System.out.println(this.getNome());
		System.out.println(this.getDepartamento());
		System.out.println(this.getSalario());
		System.out.println(this.getIdade());
	}
	
	public String getNome() {
		return nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public float getSalario() {
		return salario;
	}

	public int getIdade() {
		return idade;
	}

	public Scanner getTc() {
		return tc;
	}
	
		

}
