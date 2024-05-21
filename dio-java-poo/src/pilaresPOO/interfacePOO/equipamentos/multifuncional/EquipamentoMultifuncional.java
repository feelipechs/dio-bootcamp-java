package src.pilaresPOO.interfacePOO.equipamentos.multifuncional;

import src.pilaresPOO.interfacePOO.equipamentos.copiadora.Copiadora;
import src.pilaresPOO.interfacePOO.equipamentos.digitalizadora.Digitalizadora;
import src.pilaresPOO.interfacePOO.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
  
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
