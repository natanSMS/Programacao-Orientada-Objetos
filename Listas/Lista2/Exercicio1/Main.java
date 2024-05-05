import java.util.*;

public class Main{
    public static final int QUANTIDADE_PERGUNTAS = 3;
    public static String[] respostas = new String[QUANTIDADE_PERGUNTAS];
    public static String[] gabarito = new String[QUANTIDADE_PERGUNTAS];
    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args){
        String nome = receberNome();
        explicarQuiz(nome);
        pergunta1();
        pergunta2();
        pergunta3();
        exibirResultados();
        agradecerParticipacao(nome);    
    }

    public static String formatarNome(String nome){
        nome = nome.trim();
        String primeiraLetra = String.valueOf(nome.charAt(0));
        String nomeSemInicial = nome.substring(1);
        return primeiraLetra.toUpperCase() + nomeSemInicial.toLowerCase();
    }

    public static String receberNome(){
        System.out.println("Digite seu nome:");
        return formatarNome(SCAN.nextLine());
    }

    public static void explicarQuiz(String nome){
        System.out.println(String.format(
            """

            Olá, %s
            Você está prestes a relizar um quiz de matemática!
            Serão 3 perguntas de 3 alternativas cada.
            Aperte enter para começar, e boa sorte :)
            """,
            nome
        ));
        SCAN.nextLine();
    }

    public static void pergunta1(){
        String resposta;
        do{
            System.out.println(String.format(
                """
                Qual é o resultado da seguinte expressão matemática: 8/2(2+2)?
                A) 1
                B) 10
                C) 16   
                """
            ));
        
            resposta = SCAN.nextLine();
        } while (!validarResposta(resposta));

        respostas[0] = resposta.toUpperCase();
        gabarito[0] = "C";
    }

    public static void pergunta2(){
        String resposta;
        do{
            System.out.println(String.format(
                """

                Qual é o nome da figura geométrica que a soma do seus ângulos internos resulta em 180?
                A) Quadrado
                B) Triângulo
                C) Hexágono
                """
            ));
        
            resposta = SCAN.nextLine();
        } while (!validarResposta(resposta));

        respostas[1] = resposta.toUpperCase();
        gabarito[1] = "B";
    }

    public static void pergunta3(){
        String resposta;
        do{
            System.out.println(String.format(
                """

                Qual é o resultado da seguinte expressão matemática: 2X+3=3X-1
                A) X=3
                B) X=4
                C) X=5
                """
            ));
        
            resposta = SCAN.nextLine();
        } while (!validarResposta(resposta));

        respostas[2] = resposta.toUpperCase();
        gabarito[2] = "B";
    }

    public static boolean validarResposta(String resposta){
        if(resposta.isBlank()){
            System.out.println("Digite algo válido!");
            return false;
        } else{
            return true;
        }
    }

    public static void exibirResultados(){
        System.out.println("\nFim do quiz! Confira os resultados:");
        int somatorioAcertos = 0;

        for(int i = 0; i < QUANTIDADE_PERGUNTAS; i++){
            System.out.println(String.format("Pergunta %s | Respondido: %s | Correto: %S", (i+1), respostas[i], gabarito[i]));
            if(respostas[i].equalsIgnoreCase(gabarito[i])){
                somatorioAcertos++;
            }
        }

        System.out.println(String.format("O número total de acertos foi de %s acertos!", somatorioAcertos));
        if(somatorioAcertos == 0){
            System.out.println("Você é péssimo em matemática...");
        } else if(somatorioAcertos == 3){
            System.out.println("Parabéns! Você é um expert em matemática!");
        } else if(somatorioAcertos == 2){
            System.out.println("Nada mal!");
        } else{
            System.out.println("Valeu a tentativa...");
        }
    }

    public static void agradecerParticipacao(String nome){
        System.out.println(String.format(
            """

            Obrigado pela participação no quiz, %s <3Na
            Tchau!! :D
            """,
            nome
        ));
    }
}