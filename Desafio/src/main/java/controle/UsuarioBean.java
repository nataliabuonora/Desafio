package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entidade.Usuario;
import util.JpaUtil;

@ManagedBean(name="UsuarioBean")
@SessionScoped
public class UsuarioBean {

	private Usuario usuario;
	private List<Usuario> listaUsuario;

	private UsuarioDAO usuarioDAO;

	public UsuarioBean(){
		this.usuario = new Usuario();
		this.listaUsuario = new ArrayList<Usuario>();
		this.usuarioDAO = new UsuarioDAOImpl(JpaUtil.getEntityManager());
	}
	
	public void salvar(){
		this.usuarioDAO.criarUsuario(this.usuario);
		System.out.println("Salvou Usuario!!");
	}
	
	public void alterar(){
		this.usuarioDAO.alterar(this.usuario);
		System.out.println("Alterou Usuario!!");
	}
	
	public void remover(){
		this.usuarioDAO.remover(this.usuario);
		System.out.println("Removeu Usuario!!");
	}
	
	public Usuario pesquisar(){
		this.usuarioDAO.remover(this.usuario); 
		return usuario;
	}
	
	
	public void listar(){
	this.listaUsuario = this.usuarioDAO.listarTodos();
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}


	
	
}
