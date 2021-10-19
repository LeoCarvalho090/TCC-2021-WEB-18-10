package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the medico database table.
 * 
 */
@Entity
@Table(name="medico")
@NamedQuery(name="Medico.findAll", query="SELECT m FROM Medico m")
public class Medico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_med")
	private int codMed;

	private String cpf;

	@Column(name="data_nasc")
	private Object dataNasc;

	private String email;

	@Column(name="espec_med")
	private String especMed;

	private String nome;

	private String telefone;

	//bi-directional many-to-one association to Consulta
	@OneToMany(mappedBy="medico")
	private List<Consulta> consultas;

	//bi-directional many-to-one association to ClinicaMed
	@OneToMany(mappedBy="medico")
	private List<ClinicaMed> clinicaMeds;

	public Medico() {
	}

	public int getCodMed() {
		return this.codMed;
	}

	public void setCodMed(int codMed) {
		this.codMed = codMed;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getEspecMed() {
		return this.especMed;
	}

	public void setEspecMed(String especMed) {
		this.especMed = especMed;
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
		consulta.setMedico(this);

		return consulta;
	}

	public Consulta removeConsulta(Consulta consulta) {
		getConsultas().remove(consulta);
		consulta.setMedico(null);

		return consulta;
	}

	public List<ClinicaMed> getClinicaMeds() {
		return this.clinicaMeds;
	}

	public void setClinicaMeds(List<ClinicaMed> clinicaMeds) {
		this.clinicaMeds = clinicaMeds;
	}

	public ClinicaMed addClinicaMed(ClinicaMed clinicaMed) {
		getClinicaMeds().add(clinicaMed);
		clinicaMed.setMedico(this);

		return clinicaMed;
	}

	public ClinicaMed removeClinicaMed(ClinicaMed clinicaMed) {
		getClinicaMeds().remove(clinicaMed);
		clinicaMed.setMedico(null);

		return clinicaMed;
	}

}