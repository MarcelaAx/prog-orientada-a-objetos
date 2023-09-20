package interfaceExemplos.equipamentos.estabelecimento;

import interfaceExemplos.equipamentos.copiadora.Copiadora;
import interfaceExemplos.equipamentos.digitalizadora.Digitalizadora;
import interfaceExemplos.equipamentos.impressora.DeskJet;
import interfaceExemplos.equipamentos.impressora.Impressora;
import interfaceExemplos.equipamentos.impressora.LaserJet;
import interfaceExemplos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
