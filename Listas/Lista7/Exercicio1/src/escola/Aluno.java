package escola;

public class Aluno extends Usuario{
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public void exibirInfo() {
        System.out.println(super.getNome());
        System.out.println(super.getEmail());
        System.out.println(matricula);
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {
        if(exibirNome) {
            System.out.println(super.getNome());
        }

        if(exibirEmail) {
            System.out.println(super.getEmail());
        }

        if(exibirMatricula) {
            System.out.println(this.matricula);
        }
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
