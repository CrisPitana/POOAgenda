package App;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		int i  = 0;
		String continuar = "";
		
		Scanner sc = new Scanner(System.in);
		Agenda  a1 = new Agenda();
	
		System.out.println("____ AGENDA DE CONTATOS ___");
		
		do {
			System.out.println("\nDigite opção desejada:\n");
			System.out.println(" 1 - Armazenar Contato");
			System.out.println(" 2 - Remover   Contato");
			System.out.println(" 3 - Buscar    Contato por nome");
			System.out.println(" 4 - Buscar    Contato por código");
			System.out.println(" 5 - Ver todos Contatos");
			System.out.println(" 0 - Finalizar");			
			
			op = sc.nextInt();
			
			switch (op) {
				case 1:     		//ARMAZENAR CONTATO
					do {
						Contato c1 = new Contato();
						System.out.println("\nDigite Nome : "); 
						sc.nextLine();
						c1.setNome(sc.nextLine());
						
						System.out.println("\nDigite Idade : "); 
						c1.setIdade(sc.nextInt());
						
						System.out.println("\nDigite Altura : "); 
						c1.setAltura(sc.nextFloat());
						
						a1.armazenarPessoa(c1);
						System.out.println("\nArmazenado com Sucesso!");
						System.out.println("\nAdicionar mais registros ? S - sim  / N = não");
						sc.nextLine();
						continuar = sc.nextLine();
					    
					    } while (continuar.equalsIgnoreCase("s"));	
				break;

			    case 2: 		//REMOVER CONTATO POR NOME
			    	System.out.println("Nome do contato à excluir :");
			    	sc.nextLine();
			    	a1.removePessoa(sc.nextLine());
			    break;
				
			    case 3:			 //BUSCAR CONTATO POR NOME
			    	System.out.println("Nome do contato à buscar :");
			    	sc.nextLine();
			    	a1.buscarPessoa(sc.nextLine());
			    break;
				
			    case 4:          //BUSCAR CONTATO POR CODIGO (INDEX)
					System.out.println("Digite o Codigo / Indice que deseja visualizar ");
					i = sc.nextInt();
			    	a1.imprimePessoa(i);
			    break;

			    case 5: //VER TODOS IMPRIMIR AGENDA
			    	
			    	if(a1.getAgenda().isEmpty()) System.out.println("Não há contatos");
					else a1.imprimeAgenda();		    	
			    break;
			    
			    case 0: 
					//FINALIZAR
			    	System.out.println("Sistema Finalizado");
			    	return;
			    
			default:
				System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");
			}
			
		} while(op != 0);
				
		sc.close();
	}

}
