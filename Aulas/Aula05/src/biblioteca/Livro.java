public class Livro {
    String nome;
    String classificacaoIndicativa;
    boolean estaEmprestado = false;
    
    public String getNome() {
        return nome;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public boolean getEstaEmprestado() {
        return getEstaEmprestado;
    }

    public void setEstaEmprestado(boolean estaEmprestado) {
        this.estaEmprestado = estaEmprestado;
    }
}
