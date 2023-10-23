package ListaLigada;

public class Organizer {
	
	public ListaLigada<String> organiazarList(ListaLigada<String> lista){
		ListaLigada<String> organizado = new ListaLigada<String>();
		String [] vet = new String [lista.getTamanho()];
		for(int i = 0; i < vet.length; i++) {
			vet[i] = lista.Get(i).getValor();
		}
		String aux;
		for(int i = 0; i < vet.length; i++) {
			for(int j = 0; j < vet.length; j++) {
				if(vet[i].compareTo(vet[j])>0) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		for(int i = 0; i < vet.length; i++) {
			organizado.adicionar(vet[i]);
		}
		return organizado;
	}
	public ListaTel<Aluno> organiazarList(ListaTel<Aluno> lista){
		ListaTel<Aluno> organizado = new ListaTel<Aluno>();
		Aluno [] vet = new Aluno [lista.getTamanho()];
		for(int i = 0; i < vet.length; i++) {
			vet[i] = lista.Get(i).getValor();
		}
		Aluno aux;
		for(int i = 0; i < vet.length; i++) {
			for(int j = 0; j < vet.length; j++) {
				if(vet[i].getNome().compareTo(vet[j].getNome())>0) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		for(int i = 0; i < vet.length; i++) {
			organizado.adicionar(vet[i]);
		}
		return organizado;
	}
}
