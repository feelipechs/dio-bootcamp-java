package src.pilaresPOO.polimorfismo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

	public void salvarHistoricoMensagem() {

	}
}