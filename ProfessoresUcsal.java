package ProfessoresUcsal;

public class ProfessoresUcsal {
	private String[] nome;
	private String email;
	private String telefone;



//construtor
public ProfessoresUcsal(String[] nome, String email, String telefone) {
super();
this.nome = nome;
this.email = email;
this.telefone = telefone;

}

public boolean add(String nome,String email, String telefone ) {
	return true;
	
}

public String[] getNome() {  // para obter informações
	return nome;
}

public void setNome(String[] nome) {  // para definir valores
	this.nome = nome;
}

public String getEmail() {   //para obter informações
	return email;
}

public void setEmail(String email) { //Set Alterar
	this.email = email;
}

public String getTelefone() { //Consulta
	return telefone;
}

public void setTelefone(String telefone) { //Alterar
	this.telefone = telefone;
}

public void remocao(String[] nome, String email, String telefone) {
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
}
public void retornoQuantidadeProfessores(String telefone) {
	this.nome = nome;

}
public void limparLista(String telefone) {
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	
}
	public void consultar(String[] nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;

}

