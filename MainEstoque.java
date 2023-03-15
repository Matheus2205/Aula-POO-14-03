import br.com.estoque.Estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinimo(5);

        System.out.println(e1.mostra());

        Estoque e2 = new Estoque(1,"Caderno",10,30 );
        e2.DarBaixa(10);
        System.out.println("Estoque Atual: " + e2.getQtdAtual());
        e2.DarBaixa(1000);
        System.out.println(e2.precisaRepor());

        System.out.println(e2.mostra());


    }
}
