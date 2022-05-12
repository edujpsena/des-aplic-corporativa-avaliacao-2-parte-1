package br.com.developer;

public class Gerente extends PedidoResponsability{

    @Override
    public void calculaDesconto(Pedido pedido) {

        if (pedido.getItens().size() <= 50 ) {
            System.out.println("Gerente responsável pelo desconto");
            pedido.setDesconto(pedido.getValor() * 0.10);
        } else {
            System.out.println("Não há desconto aplicado");
        }
    }
}
