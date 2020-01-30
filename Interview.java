public class Interview{
    int counter = 0;
    Integer passaParaInteger(int entrada){
        return Integer.valueOf(entrada);
    }

    Integer revertNumber(int entrada){
        return entrada*10 + entrada%10;
    }
    Integer inverteNumero(int entrada){
        StringBuffer sb = new StringBuffer();
        Integer result = 0;

        sb.append(entrada);
        result = Integer.parseInt(sb.reverse().toString());
        return result;
    }
    boolean ePalindromo(int entrada){
        boolean result = false;
        if(passaParaInteger(entrada).equals(inverteNumero(entrada))){
            result = true;
        }
        else{
            result = false;
        }
        return result;
   }
    String verificaSomaPalindromo(int entrada){
        String result = "";
        Integer valor = 0;
            while(true){
            counter++;
            valor = passaParaInteger(entrada) + inverteNumero(entrada);
            if(!(ePalindromo(valor))){
                verificaSomaPalindromo(valor);
            }
            break;
        }
         System.out.println(counter + ", " + valor);
        return result;
    }
    public static void main(String[] args) {
        int entrada = 54346;
        Interview numero = new Interview();
        System.out.println(numero.verificaSomaPalindromo(entrada));
    }
}