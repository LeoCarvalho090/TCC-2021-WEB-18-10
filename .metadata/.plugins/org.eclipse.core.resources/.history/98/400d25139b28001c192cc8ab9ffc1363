package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Paciente database table.
 * 
 */
@Entity
@NamedQuery(name="Paciente.findAll", query="SELECT p FROM Paciente p")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_pac")
	private int codPac;

	@Column(name="cpf_pac")
	private String cpfPac;

	@Column(name="data_nasc")
	private Object dataNasc;

	private String email;

	private String nome;

	private String telefone;

	//bi-directional many-to-one association to Consulta
	@OneToMany(mappedBy="paciente")
	private List<Consulta> consultas;

	//bi-directional many-to-one association to Prontuario
	@OneToMany(mappedBy="paciente")
	private List<Prontuario> prontuarios;

	public Paciente() {
	}

	public int getCodPac() {
		return this.codPac;
	}

	public void setCodPac(int codPac) {
		this.codPac = codPac;
	}

	public String getCpfPac() {
		return this.cpfPac;
	}

	public void setCpfPac(String cpfPac) {
		this.cpfPac = cpfPac;
	}

	public Object getDataNasc() {
		return this.dataNasc;
	}

	public void setDataNasc(Object dataNasc) {
		this.dataNasc = dataNasc;
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

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Consulta> getConsultas() {
		return this.consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Consulta addConsulta(Consulta consulta) {
		getConsultas().add(consulta);
		consulta.setPaciente(this);

		return consulta;
	}

	public Consulta removeConsulta(Consulta consulta) {
		getConsultas().remove(consulta);
		consulta.setPaciente(null);

		return consulta;
	}

	public List<Prontuario> getProntuarios() {
		return this.prontuarios;
	}

	public void setProntuarios(List<Prontuario> prontuarios) {
		this.prontuarios = prontuarios;
	}

	public Prontuario addProntuario(Prontuario prontuario) {
		getProntuarios().add(prontuario);
		prontuario.setPaciente(this);

		return prontuario;
	}

	public Prontuario removeProntuario(Prontuario prontuario) {
		getProntuarios().remove(prontuario);
		prontuario.setPaciente(null);

		return prontuario;
	}

}