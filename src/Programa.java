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
			int p=0;
			System.out.println("Informe o nome do funcionario que quer deletar:");
			nome=tc.next();
			
			for(int i=0; i<count; i++){
				if(nome.equals(f[i].getNome())){
					p=i;
				}
				
			}
			
			if(p==count){
				count--;
			}
			else{
				for(int i=p; i<count; i++){
					f[i]=f[i+1];
				}
			}
			
			break;
		}
		
		case 4:{
			int max=0;
			int min =9999999;
			int p=0;
			int pp=0;
			for(int i=0; i<count; i++){
				if(f[i].getSalario()<min){
					p=i;
				}
			}
			System.out.println("O menor salario é do Funcionario: " + f[p].getNome());
			System.out.println("");
			
			for(int i=0; i>max; i++){
				if(f[i].getSalario()>max){
					pp=i;
				}
			}
			System.out.println("O menor salario é do Funcionario: " + f[pp].getNome());
			System.out.println("");
		break;
		}
		
		}
		
	}while(opc!=5);
	

}
	
}
