package App;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contato> agenda;
	int i = 0;
	public Contato contato;
	
	public Agenda(){
		this.agenda = new ArrayList<Contato>();
	}
	
	public ArrayList<Contato> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Contato> agenda) {
		this.agenda = agenda;
	}

	public void armazenarPessoa(Contato c1) { 
       this.agenda.add(c1);
	}
	
	public void imprimeAgenda() {
		 System.out.printf("Lista de Contatos armazenados na Agenda\n");
		    int n = agenda.size();
		    for (i=0; i<n; i++) {
		      System.out.printf("Posição %d - %s\n", i, agenda.get(i));
		    }
	}
	
	public void imprimePessoa(int indice) {
		for(i=0; i<agenda.size(); i++) {
			if (i == indice) {
				System.out.println(agenda.get(i));
				return;
			}
		}
		System.out.println("Não encontrado!");
	}
	
	public void buscarPessoa(String pessoa) {
		
		for(i=0;i<agenda.size(); i++) {
			Contato contato = agenda.get(i);
			if(contato.getNome().equalsIgnoreCase(pessoa)) {
				System.out.println("Posição : " + i + " - " + agenda.get(i));
				return;
			}				
		}
		System.out.println("Nao encontrado!");
	}
	
	public void removePessoa(String pessoa) {
		
		for(i=0;i<agenda.size(); i++) {
			Contato contato = agenda.get(i);
			if(contato.getNome().equalsIgnoreCase(pessoa)) {
				agenda.remove(contato);
				System.out.println("Removido com sucesso!");
				return;
			}				
		}
		System.out.println("Nao encontrado!");
	}
	
}
