package com.algaworks.jm.reservaweb.controle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import com.algaworks.jm.reservaweb.modelo.Curso;
import com.algaworks.jm.reservaweb.modelo.Reserva;

@ManagedBean
@SessionScoped
public class ReservaBean {

	private Logger logger = Logger.getLogger(ReservaBean.class.getName());
	
	private Reserva reserva;

	public String iniciarReserva(Curso curso) {
		this.setReserva(new Reserva());
		this.reserva.setCurso(curso);
		return "reserva";
	}
	
	public String reservar() {
		HttpClient client = new HttpClient();
		String mobicentsIp = System.getProperty("mobicents.ip");
		PostMethod method = new PostMethod("http://" + mobicentsIp + ":8080/mobicents");
		method.addParameter("telefone", this.getReserva().getTelefone());
		method.addParameter("curso", this.getReserva().getCurso().getSigla());
		
		try {
			client.executeMethod(method);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Erro ao solicitar ligação telefônica para confirmação de reserva.", e);
		} finally {
			method.releaseConnection();
		}
		
		return "reservaSucesso";
	}
	
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
}
