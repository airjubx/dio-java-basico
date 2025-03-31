public class Operadores {

    public static void main(String[] args)  {
        // Operadores Aritméticos
        int a = 10;
        int b = 20;
        System.out.println("Soma: " + (a + b)); // 30
        System.out.println("Subtração: " + (a - b)); // -10
        System.out.println("Multiplicação: " + (a * b)); // 200
        System.out.println("Divisão: " + (b / a)); // 2
        System.out.println("Módulo: " + (b % a)); // 0
        System.out.println("Incremento: " + (++a)); // 11
        System.out.println("Decremento: " + (--b)); // 19
        System.out.println("Incremento pós-fixado: " + (a++)); // 11
        System.out.println("Valor de a após incremento pós-fixado: " + a); // 12
        System.out.println("Decremento pós-fixado: " + (b--)); // 19
        System.out.println("Valor de b após decremento pós-fixado: " + b); // 18
     

        // Operadores Relacionais
        System.out.println("Igualdade: " + (a == b)); // false
        System.out.println("Desigualdade: " + (a != b)); // true
        System.out.println("Maior que: " + (a > b)); // false
        System.out.println("Menor que: " + (a < b)); // true
        System.out.println("Maior ou igual a: " + (a >= b)); // false
        System.out.println("Menor ou igual a: " + (a <= b)); // true

        //Comparando objetos usando relacionais e/ou equals()
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println("Comparando str1 e str2: " + (str1.equals(str2))); // true
        System.out.println("Comparando str1 e str3: " + (str1 == str3)); // false
        System.out.println("Comparando str1 e str3: " + (str1.equals(str3))); // true
        

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("E lógico: " + (x && y)); // false
        System.out.println("Ou lógico: " + (x || y)); // true
        System.out.println("Não lógico: " + (!x)); // false
        System.out.println("Não lógico: " + (!y)); // true
        System.out.println("XOR lógico: " + (x ^ y)); // true

        // Operadores ternários
        int num1 = 10;
        int num2 = 20;
        int maior = (num1 > num2) ? num1 : num2; // Se a for maior que b, maior recebe a, senão recebe b
        System.out.println("Maior entre a e b: " + maior); // 20

        //função Math
        System.out.println("Raiz quadrada de 16: " + Math.sqrt(16)); // 4.0
        System.out.println("Valor absoluto de -10: " + Math.abs(-10)); // 10
        System.out.println("Número aleatório entre 0 e 1: " + Math.random()); // 0.0 a 1.0
        System.out.println("Número aleatório entre 1 e 10: " + (int)(Math.random() * 10) + 1); // 1 a 10
        System.out.println("Modalo de 10 e 20: " + Math.max(10, 20)); // 20
        System.out.println("Mínimo de 10 e 20: " + Math.min(10, 20)); // 10
        System.out.println("Potência de 2^3: " + Math.pow(2, 3)); // 8.0
        System.out.println("Seno de 30 graus: " + Math.round(Math.sin(Math.toRadians(30)) * 10) / 10.0); // 0.5
        System.out.println("Cosseno de 60 graus: " + Math.round(Math.cos(Math.toRadians(60)) * 10)/ 10.0); // 0.5
        System.out.println("Tangente de 45 graus: " + Math.round(Math.tan(Math.toRadians(45))* 10)/ 10.0); // 1.0
        System.out.println("Arco seno de 0.5: " + Math.round(Math.toDegrees(Math.asin(0.5)) * 10)/ 10.0); // 30.0
        System.out.println("Arco cosseno de 0.5: " + Math.round(Math.toDegrees(Math.acos(0.5)) * 10)/ 10.0); // 60.0
        System.out.println("Arco tangente de 1: " + Math.toDegrees(Math.atan(1))); // 45.0
        System.out.println("Arco tangente de 1: " + Math.toDegrees(Math.atan2(1, 1))); // 45.0
        System.out.println("Logaritmo natural de 10: " + Math.log(10)); // 2.302585092994046
        System.out.println("Logaritmo de 10 na base 10: " + Math.log10(10)); // 1.0
           

    }
}
