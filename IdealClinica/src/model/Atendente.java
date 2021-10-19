package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the atendente database table.
 * 
 */
@Entity
@Table(name="atendente")
@NamedQuery(name="Atendente.findAll", query="SELECT a FROM Atendente a")
public class Atendente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_atendente")
	private int codAtendente;

	private String cpf;

	private String email;

	private String nome;

	private String tel;

	public Atendente() {
	}

	public int getCodAtendente() {
		return this.codAtendente;
	}

	public void setCodAtendente(int codAtendente) {
		this.codAtendente = codAtendente;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}