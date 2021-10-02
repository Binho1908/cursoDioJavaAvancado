import java.util.function.UnaryOperator;

public class paradgma_funcional_e_imperativo {
    
    //IMPERATIVA
    public static void main(String[] args){
        //IMPERATIVO
        /*int valor = 10;
        int resultado = valor * 3;
        System.out.println(resultado);
        */

        //FUNCIONAL
        UnaryOperator<Integer> calculaValorVezes3 = valor -> valor *3; // já esta falando para passar o esse valor mesmo não tendo o valor declarado;
        int valor = 10;
        System.out.println("O resultado é: "+calculaValorVezes3.apply(10));
    }

    
    
    
    
    
}
