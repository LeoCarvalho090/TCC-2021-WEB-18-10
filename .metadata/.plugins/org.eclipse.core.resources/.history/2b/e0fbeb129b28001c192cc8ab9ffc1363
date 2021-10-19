package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the Consulta database table.
 * 
 */
@Entity
@NamedQuery(name="Consulta.findAll", query="SELECT c FROM Consulta c")
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_consulta")
	private int codConsulta;

	@Column(name="data_con")
	private Time dataCon;

	//bi-directional many-to-one association to Medico
	@ManyToOne
	@JoinColumn(name="cod_med")
	private Medico medico;

	//bi-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="cod_pac")
	private Paciente paciente;

	//bi-directional many-to-one association to Prontuario
	@ManyToOne
	@JoinColumn(name="id_prontuario")
	private Prontuario prontuario;

	public Consulta() {
	}

	public int getCodConsulta() {
		return this.codConsulta;
	}

	public void setCodConsulta(int codConsulta) {
		this.codConsulta = codConsulta;
	}

	public Time getDataCon() {
		return this.dataCon;
	}

	public void setDataCon(Time dataCon) {
		this.dataCon = dataCon;
	}

	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Prontuario getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}

}