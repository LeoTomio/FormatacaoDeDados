package formatacaodedados;

public class FormatacaodeDados {

    public static void main(String[] args) {

        Mascaras r = new Mascaras();
        String CNPJ = "03795071000116";
        String CEP = "88352490";
        String Telefone = "47256251536";
        String CPF = "69589548810";
        String Placa = "ABC2357";
        String palavra = "Comentarista";
        char letra = 'a';

        System.out.println("======================");
        System.out.println("|                    |");
        System.out.println("|       Dados        |");
        System.out.println("|                    |");
        System.out.println("======================");

        String CnpjFormatado = Mascaras.formataCNPJ(CNPJ);
        System.out.println("CNPJ: " + CnpjFormatado);

        String CepFormatado = Mascaras.formataCep(CEP);
        System.out.println("CEP: " + CepFormatado);

        String TelefoneFormatado = Mascaras.formataTelefone(Telefone);
        System.out.println("Telefone: " + TelefoneFormatado);

        String cpfFormatado = Mascaras.formataCpf(CPF);
        System.out.println("CPF: " + cpfFormatado);
        
        String PlacaCarro = Mascaras.Placa(Placa);
        System.out.println("Placa do carro: " + PlacaCarro);

        int numero = Mascaras.contaLetra(palavra, letra);
        System.out.println("Numero de vezes que '"+ letra + "' aparece: " + numero );
    }   
    
}
