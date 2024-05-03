package med.voll.api.domain.paciente;

public class ListagemPacienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public ListagemPacienteDTO(Paciente paciente){
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.email = paciente.getEmail();
        this.cpf = paciente.getCpf();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
