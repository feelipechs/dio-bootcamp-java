package pilaresPOO.interfacePOO.estabelecimento;

import pilaresPOO.interfacePOO.equipamentos.copiadora.Copiadora;
import pilaresPOO.interfacePOO.equipamentos.digitalizadora.Digitalizadora;
import pilaresPOO.interfacePOO.equipamentos.impressora.Impressora;
// import pilaresPOO.interfacePOO.equipamentos.impressora.Deskjet;
// import pilaresPOO.interfacePOO.equipamentos.impressora.Laserjet;
import pilaresPOO.interfacePOO.equipamentos.multifuncional.EquipamentoMultifuncional;

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
