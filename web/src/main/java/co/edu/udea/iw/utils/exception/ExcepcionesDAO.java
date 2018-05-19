package co.edu.udea.iw.utils.exception;


public class ExcepcionesDAO extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String msgUsuario;
	private String msgTecnico;
	
	public ExcepcionesDAO() {
		super();
	}
	
	public ExcepcionesDAO(String arg0, Throwable arg1) {
		super(arg0, arg1);
		this.msgTecnico = arg0;
		this.msgUsuario = arg0;
	}
	
	public ExcepcionesDAO(String arg0) {
		super(arg0);
		this.msgTecnico = arg0;
		this.msgUsuario = arg0;
	}
	
	public ExcepcionesDAO(Throwable arg0) {
		super(arg0);
	}

	public String getMsgUsuario() {
		return msgUsuario;
	}

	public void setMsgUsuario(String msgUsuario) {
		this.msgUsuario = msgUsuario;
	}

	public String getMsgTecnico() {
		return msgTecnico;
	}

	public void setMsgTecnico(String msgTecnico) {
		this.msgTecnico = msgTecnico;
	}
}
