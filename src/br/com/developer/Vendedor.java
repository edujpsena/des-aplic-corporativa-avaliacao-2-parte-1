package br.com.developer;

public class Vendedor extends PedidoResponsability{

    @Override
    public void calculaDesconto(Pedido pedido) {

        if (pedido.getItens().size() <= 5) {
            System.out.println("Vendedor responsável pelo desconto");
            pedido.setDesconto(pedido.getValor() * 0.02);
        } else if (responsability != null) {
            responsability.calculaDesconto(pedido);
        }
    }


}
