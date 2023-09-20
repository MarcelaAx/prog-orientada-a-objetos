package interfaceExemplos.equipamentos.multifuncional;

import interfaceExemplos.equipamentos.copiadora.Copiadora;
import interfaceExemplos.equipamentos.digitalizadora.Digitalizadora;
import interfaceExemplos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
