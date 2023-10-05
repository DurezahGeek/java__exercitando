public class FormatadorCepExemplo {
    public static void main(String[] args) {
                try {
                    String cepFormatado = formatarCep("23765064");
                    System.out.println(cepFormatado);
                } catch (CepInvalidoException e) {
                    System.out.println("CEP inválido");
                }
            }
        
            public static String formatarCep(String cep) throws CepInvalidoException {
                if (cep.length() != 8)
                    throw new CepInvalidoException();
        
                // Simulando um CEP formatado
                return "23.765-064";
        
    }
}
