package pilaresPOO.polimorfismo;

import pilaresPOO.polimorfismo.apps.FacebookMessenger;
import pilaresPOO.polimorfismo.apps.MSNMessenger;
import pilaresPOO.polimorfismo.apps.ServicoMensagemInstantanea;
import pilaresPOO.polimorfismo.apps.Telegram;

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