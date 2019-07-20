package formatacaodedados;

public class Mascaras {

    public static String formataCpf(String cpf) {
        char[] arrayCpf = cpf.toCharArray();
        String cpfFormatado = "";

        for (int i = 0; i < arrayCpf.length; i++) {
            cpfFormatado = cpfFormatado + arrayCpf[i];

            if (i == 2 | i == 5) {
                cpfFormatado = cpfFormatado + ".";

            }
            if (i == 8) {
                cpfFormatado = cpfFormatado + "-";
            }
        }

        return cpfFormatado;
    }

    public static String formataCNPJ(String CNPJ) {
        char[] arrayCNPJ = CNPJ.toCharArray();
        String CnpjFormatado = "";

        for (int i = 0; i < arrayCNPJ.length; i++) {
            CnpjFormatado = CnpjFormatado + arrayCNPJ[i];

            if (i == 1 | i == 4) {
                CnpjFormatado = CnpjFormatado + ".";
            }
            if (i == 7) {
                CnpjFormatado = CnpjFormatado + "/";
            }
            if (i == 11) {
                CnpjFormatado = CnpjFormatado + "-";
            }

        }

        return CnpjFormatado;
    }

    public static String formataCep(String CEP) {

        char[] arrayCEP = CEP.toCharArray();
        String CepFormatado = "";

        for (int i = 0; i < arrayCEP.length; i++) {
            CepFormatado = CepFormatado + arrayCEP[i];

            if (i == 1) {
                CepFormatado = CepFormatado + ".";
            }
            if (i == 4) {
                CepFormatado = CepFormatado + ".";
            }
        }
        return CepFormatado;
    }

    public static String formataTelefone(String Telefone) {

        char[] arrayTelefone = Telefone.toCharArray();
        String TelFormatado = "";

        for (int i = 0; i < arrayTelefone.length; i++) {
            if (i == 0) {
                TelFormatado = TelFormatado + "(";
            }

            TelFormatado = TelFormatado + arrayTelefone[i];

            if (i == 1) {
                TelFormatado = TelFormatado + ") ";
            }
            if (i == 6) {
                TelFormatado = TelFormatado + "-";
            }
        }
        return TelFormatado;
    }

    public static String Placa(String Placa) {

        char[] arrayPlaca = Placa.toCharArray();
        String PlacaCarro = "";

        for (int i = 0; i < arrayPlaca.length; i++) {
            PlacaCarro = PlacaCarro + arrayPlaca[i];

            if (i == 2) {
                PlacaCarro = PlacaCarro + "-";
            }
        }
        return PlacaCarro;
    }

    public static int contaLetra(String palavra, char letra) {

        int cont = 0;

        char[] arrayPalavra = palavra.toCharArray();

        palavra = palavra.toLowerCase();
        letra = Character.toLowerCase(letra);

        for (int i = 0; i < arrayPalavra.length; i++) {
            if (arrayPalavra[i] == letra) {
                cont++;
            }
        }
        /*  for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                cont++;
            }
        }
        */
        return cont;
    }

}
