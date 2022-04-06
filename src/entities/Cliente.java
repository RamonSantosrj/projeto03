package entities;

public class Cliente extends Pessoa {

	private String cpf;
	private String email;
	private Endereco endereco;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer id, String nome, String cpf, String email) {
		super(id, nome);
		this.cpf = cpf;
		this.email = email;
	}

	public Cliente(Integer id, String nome, String cpf, String email, Endereco endereco) {
		super(id, nome);
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + super.getId() + ", nome=" + super.getNome() + ", cpf=" + cpf + ", email=" + email +"]" + endereco.toString();
	}

}
