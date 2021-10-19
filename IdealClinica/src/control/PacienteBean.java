package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Paciente;
import model.PacienteDAO;

@SessionScoped
@ManagedBean
public class PacienteBean {
	
	private Paciente paciente;
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public PacienteBean() {
		paciente = new Paciente();
	}
	
	public String cadastrar() {
		new PacienteDAO().cadastrar(paciente);
		return "PgDownload.html";
		
	}
	
	
	

}
