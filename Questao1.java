class Questao1{
    public static void main(String[] args) {
        int numberTeste = 54;
        fibonacci(numberTeste);
    }

    public static void fibonacci(int numberFibo){
        int a = 0, b = 1;
        int next = a + b;
        if (numberFibo == 0 || numberFibo == 1) {
            System.out.println("O número " + numberFibo + " pertence à sequência de Fibonacci.");
            return;
        }
        while (next < numberFibo) {
            a = b;
            b = next;
            next = a + b;
        }
        if (next == numberFibo) {
            System.out.println("O número " + numberFibo + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numberFibo + " não pertence à sequência de Fibonacci.");
        }
    }
}