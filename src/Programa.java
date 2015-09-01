import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);

		Funcionario [] f =  new Funcionario[2];
		
		int opc=0;
		int count=0;
		
		do{
			
		System.out.println("1-Cadastrar Funcionario:\n2-Listar Funcionarios:\n3-RemoverFuncionario\n4-ListarFuncionairo com maior e menor salario:\n5-Sair");
		opc=tc.nextInt();
		
		switch(opc){
		
		case 1:{
			
			Funcionario func = new Funcionario();
			func.ler();
			f[count]=func;
			count++;
			break;
		}
		
		case 2:{
			for(int i=0; i<count; i++){
				f[i].mostrar();
				System.out.println("");
			}
			break;
		}
		
		case 3:{
			String nome;
			System.out.println("Informe o nome do funcionario que quer deletar:");
			nome=tc.next();
			
		}
		
		}
		
	}while(opc!=5);
	

}
	
}
