package com.proyecto.pruebas.test.models;

public class DatosUsuario {
	
	private String usuario;
	private String contrasena;
	private String confirmarcontrasena;
	
	
	public DatosUsuario(String usuario, String contrasena, String confirmarcontrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.confirmarcontrasena = confirmarcontrasena;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getConfirmarcontrasena() {
		return confirmarcontrasena;
	}
	public void setConfirmarcontrasena(String confirmarcontrasena) {
		this.confirmarcontrasena = confirmarcontrasena;
	}
	
	

}
