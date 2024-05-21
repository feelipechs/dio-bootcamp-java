package src.pilaresPOO.polimorfismo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}

	public void salvarHistoricoMensagem() {
		
    }
}