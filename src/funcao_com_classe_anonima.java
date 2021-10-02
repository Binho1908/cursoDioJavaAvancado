public class funcao_com_classe_anonima {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. "+valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
    }
}
