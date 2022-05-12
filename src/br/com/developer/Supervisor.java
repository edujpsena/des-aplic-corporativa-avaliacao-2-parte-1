package br.com.developer;

public class Supervisor extends PedidoResponsability{

    @Override
    public void calculaDesconto(Pedido pedido) {

        if (pedido.getItens().size() <= 15 ) {
            System.out.println("Supervisor responsável pelo desconto");
            pedido.setDesconto(pedido.getValor() * 0.05);
        } else if (responsability != null) {
            responsability.calculaDesconto(pedido);
        }
    }
}
