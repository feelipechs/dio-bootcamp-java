package src.pilaresPOO.interfacePOO.estabelecimento;

import src.pilaresPOO.interfacePOO.equipamentos.copiadora.Copiadora;
import src.pilaresPOO.interfacePOO.equipamentos.digitalizadora.Digitalizadora;
import src.pilaresPOO.interfacePOO.equipamentos.impressora.Impressora;
// import pilaresPOO.interfacePOO.equipamentos.impressora.Deskjet;
// import pilaresPOO.interfacePOO.equipamentos.impressora.Laserjet;
import src.pilaresPOO.interfacePOO.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main (String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
