package aplication;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.text.SimpleAttributeSet;

public class Servidor extends UnicastRemoteObject implements Servico {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Servidor() throws RemoteException {
		super();
	}

	public static void main(String[] args) {
		
		try {
			Servidor servidor = new Servidor();
			String localizacao = "//localhos/servico";
			Naming.rebind(localizacao, servidor);
			
		} catch (MalformedURLException ex) {
			System.out.println("Erro de url mal formada: "+ex.getMessage());	
		} catch (RemoteException ex) {
			System.out.println("Erro: "+ex.getMessage());
		}
		
	}

	@Override
	public String getDataHora() throws RemoteException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return sdf.format(Calendar.getInstance().getTime());
	}

	@Override
	public String inverterString(String string) throws RemoteException {
		String retorno = "";
		StringBuffer strb = new StringBuffer(string);
		retorno = strb.reverse().toString();
		return retorno;
	}

}
