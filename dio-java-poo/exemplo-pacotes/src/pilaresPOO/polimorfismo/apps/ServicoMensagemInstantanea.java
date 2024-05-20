package pilaresPOO.polimorfismo.apps;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConexaoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}