package med.voll.api.testes.memoria;

import med.voll.api.domain.consulta.Consulta;

import java.util.ArrayList;
import java.util.List;

public class TestaMemoria {
    public static void main(String[] args) {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta = new Consulta();
        for(int i = 1; i<1000000000; i++){
            consultas.add(consulta);
        }
    }
}
