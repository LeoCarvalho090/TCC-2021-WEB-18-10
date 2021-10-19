package model;



public class PacienteDAO {
	ManagerDAO mDAO;
	
	public PacienteDAO() {
        mDAO = new ManagerDAO();
    }
	
	public Paciente buscarPorId(int id) {
        mDAO.em.getTransaction().begin();
        // find: BUSCAR
        Paciente paciente = mDAO.em.find(Paciente.class, id);
        mDAO.em.getTransaction().commit();
        return paciente;
    }
	
	public void cadastrar(Paciente paciente) {
        mDAO.em.getTransaction().begin();
        

        Paciente pac = new Paciente();
        pac.setCpfPac(pac.getCpfPac());
        pac.setDataNasc(pac.getDataNasc());
        pac.setEmail(pac.getEmail());
        pac.setNome(pac.getNome());
        pac.setTelefone(pac.getTelefone());
        pac.setProntuarios(null);
        pac.setConsultas(null);

        // persist: INSERIR(Salvar/Gravar)
        mDAO.em.persist(pac);
        mDAO.em.getTransaction().commit();
    }
}
