package ListaLigada;

public class ListaTel<tipo> extends ListaLigada<tipo> {
	Organizer sort;
	
	public ListaTel(){
		sort = new Organizer();
	}
	
	public void mostrarTel(ListaTel<Aluno> lista, String nome) {
		lista = sort.organiazarList(lista);
		Aluno [] alunos = new Aluno [lista.getTamanho()];
		
		for(int i = 0; i < alunos.length ; i++) {
			alunos[i] = lista.Get(i).getValor();
		}
		 int meio,inicio,fim;
		 inicio = 0;
		 fim = alunos.length-1;
		 while(inicio < fim) {
			 meio = (int)((inicio+fim)/2);
			 if(alunos[meio].getNome().compareTo(nome) == 0){
				 System.out.println("o numero telefonico do aluno: " + nome + " é: " + alunos[meio].getNumeroTel());
				 break;
			 }else if(alunos[meio].getNome().compareTo(nome) < 0) {
				 fim = meio -1;
			 }else inicio = meio +1;
		 }
	}
}
