package entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="USUARIO")
public class Usuario {
	
	@Id
	@Column(name = "EMAIL")
	private String email;
	
	@Column (name = "NOME")
	private String nome;
	
	@Column (name = "SENHA")
	private String senha;
	
	@JoinColumn(name = "EMAIL", referencedColumnName = "EMAIL")
	@OneToMany
	private List<Telefone> telefones;
	

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
