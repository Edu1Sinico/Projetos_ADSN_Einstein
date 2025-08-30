public class InformarNumero {

    // Método de validação para verificar se o parâmetro recebido é número ou não.
    public String ValidarParametro(String num){
        int numero = 0;
        try{
            numero = Integer.parseInt(num);
            if(numero >= 0){
                return "O número é positivo.";
            } else {
                return "O número é negativo.";
            }
        } catch (NumberFormatException e){
            return "O parâmetro recebido não é um número.";
        }
    }

}
