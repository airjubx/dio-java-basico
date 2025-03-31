public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 20; // 8 bits
        short ano = 2023; // 16 bits
        int cep = 12345678; // 32 bits
        long cpf = 12345678901L; // 64 bits
        final float PI = 3.14f; // 32 bits
        double salario = 2000.00; // 64 bits
        char letra = 'A'; // 16 bits
        boolean verdadeiro = true; // 1 bit
        String nome = "Lucas"; // 16 bits (Unicode)

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Pi: " + PI);
        System.out.println("Salário: " + salario);
        System.out.println("Letra: " + letra);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho do String: " + (nome.length() * 2) + " bytes");
       }
}
