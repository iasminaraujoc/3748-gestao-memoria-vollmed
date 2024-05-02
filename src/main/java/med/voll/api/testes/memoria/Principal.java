package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        System.out.println(paciente);

        Paciente paciente2 = new Paciente();
        System.out.println(paciente == paciente2);

        paciente2 = paciente;
        System.out.println(paciente == paciente2);

        String nome = "Iasmin"; //String é uma classe
    }
}
