package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Prontuario database table.
 * 
 */
@Entity
@NamedQuery(name="Prontuario.findAll", query="SELECT p FROM Prontuario p")
public class Prontuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prontuario")
	private int idProntuario;

	private String historico;

	private String nome;

	//bi-directional many-to-one association to Consulta
	@OneToMany(mappedBy="prontuario")
	private List<Consulta> consultas;

	//bi-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="cod_pac")
	private Paciente paciente;

	public Prontuario() {
	}

	public int getIdProntuario() {
		return this.idProntuario;
	}

	public void setIdProntuario(int idProntuario) {
		this.idProntuario = idProntuario;
	}

	public String getHistorico() {
		return this.historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Consulta> getConsultas() {
		return this.consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Consulta addConsulta(Consulta consulta) {
		getConsultas().add(consulta);
		consulta.setProntuario(this);

		return consulta;
	}

	public Consulta removeConsulta(Consulta consulta) {
		getConsultas().remove(consulta);
		consulta.setProntuario(null);

		return consulta;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}