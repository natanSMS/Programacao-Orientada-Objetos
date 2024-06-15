public class Atleta {
    String nome;
    int idade;
    double altura;
    String nacionalidade;
    boolean genero;;

    public void competir(){
        System.out.println(nome + " entrou no jogo");
    }

    public void apresentarSe(){
        System.out.println(String.format("Olá, sou %s, % %", nome, ehHomem, nacionalidade));
    }

    public void imprimirAtributos(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(nacionalidade);
        System.out.println(genero);
    }
}
