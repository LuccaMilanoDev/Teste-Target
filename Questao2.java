public class Questao2 {
    public static void main(String[] args) {
        String teste = "testando";
        containsA(teste);
    }

    public static void containsA(String word){
        word =word.toLowerCase();
        int amountOfA = 0;
        boolean containsA = word.contains("a");
        for(int i=0;i <word.length(); i++){
            if(word.charAt(i) == 'a'){
                amountOfA++;
            }
        }
        if(containsA){
            System.out.println("A palavra: "+word+ " contem a letra A "+amountOfA+" vezes");
        }else{
            System.out.println("A palavra: "+word+ " não contem a letra A");
        }
    }
}
