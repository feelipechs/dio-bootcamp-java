package src.pilaresPOO.polimorfismo;

import src.pilaresPOO.polimorfismo.apps.FacebookMessenger;
import src.pilaresPOO.polimorfismo.apps.MSNMessenger;
import src.pilaresPOO.polimorfismo.apps.ServicoMensagemInstantanea;
import src.pilaresPOO.polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}