package br.com.developer;

public abstract class PedidoResponsability {

    protected PedidoResponsability responsability;

    public void setResponsability(PedidoResponsability responsability) {
        this.responsability = responsability;
    }

    public abstract void calculaDesconto(Pedido pedido);
}
