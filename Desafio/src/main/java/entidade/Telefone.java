package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="TELEFONE")
public class Telefone {
	
	@Id
	@Column(name = "ID_TELEFONE")
	@GeneratedValue(generator = "S_ID_TELEFONE")
	@SequenceGenerator(name = "S_ID_TELEFONE", sequenceName = "S_ID_TELEFONE", allocationSize = 5)
	private int id;
	
	@Column (name = "NUMERO")
	private String numero;
	
	@Column (name = "DDD")
	private int ddd;
	
	@Column (name = "TIPO")
	private String tipo;
	
	@JoinColumn ( name = "EMAIL", referencedColumnName = "EMAIL" )
	@OneToOne
	private Usuario usuario;

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
