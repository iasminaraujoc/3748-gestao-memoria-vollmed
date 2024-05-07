package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.http.HttpClient;
import java.util.Scanner;

public class TestaJVM {
    public static void main(String[] args) {
        System.out.println(Paciente.class.getClassLoader());
        System.out.println(JpaRepository.class.getClassLoader());
        System.out.println(HttpClient.class.getClassLoader());
        System.out.println(Scanner.class.getClassLoader());
        System.out.println(ClassLoader.class.getClassLoader());
    }
}
