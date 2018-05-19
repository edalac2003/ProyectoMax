package co.edu.udea.iw.utils.exception;

public class ExcepcionesNGC extends Exception {
	private static final long serialVersionUID = 1L;

	private String msgUsuario;
	private String msgTecnico;
	
	public ExcepcionesNGC() {
		super();
	}
	
	public ExcepcionesNGC(String message, Throwable cause) {
		super(message, cause);
		this.msgTecnico = message;
		this.msgUsuario = message;
	}
	
	public ExcepcionesNGC(String message) {
		super(message);
		this.msgTecnico = message;
		this.msgUsuario = message;
	}
	
	public ExcepcionesNGC(Throwable cause) {
		super(cause);
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
