package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clinicaMed database table.
 * 
 */
@Entity
@Table(name="clinicaMed")
@NamedQuery(name="ClinicaMed.findAll", query="SELECT c FROM ClinicaMed c")
public class ClinicaMed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cli")
	private int codCli;

	private String email;

	private String endereco;

	@Column(name="nome_cli")
	private String nomeCli;

	private String telefone;

	//bi-directional many-to-one association to Medico
	@ManyToOne
	@JoinColumn(name="cod_med")
	private Medico medico;

	public ClinicaMed() {
	}

	public int getCodCli() {
		return this.codCli;
	}

	public void setCodCli(int codCli) {
		this.codCli = codCli;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeCli() {
		return this.nomeCli;
	}

	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}