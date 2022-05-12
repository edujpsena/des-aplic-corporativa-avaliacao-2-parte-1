package br.com.developer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Chain of responsability
        PedidoResponsability vendedor = new Vendedor();
        PedidoResponsability supervisor = new Supervisor();
        PedidoResponsability gerente = new Gerente();

        vendedor.setResponsability(supervisor);
        supervisor.setResponsability(gerente);

        Item i1 = new Item("TV 29 polegadas", 2500.00);
        Item i2 = new Item("Sofa retratil", 4200.00);
        Item i3 = new Item("Notebook Acer", 3500.00);
        Item i4 = new Item("Celular LG", 890.00);

        Pedido pedido = new Pedido();
        List<Item> itens = Arrays.asList(i1, i2, i3, i4, i1, i1, i1, i2, i3, i4, i1, i1);
        pedido.addItem(itens);

        vendedor.calculaDesconto(pedido);

        Double valorTotal = pedido.getValor();
        Double desconto = pedido.getDesconto();
        Double valorComDesconto = pedido.getValor(desconto);

        System.out.println("Valor total do pedido: R$ " + valorTotal);

        System.out.println("O desconto aplicado ao produto foi de: R$" + desconto);

        System.out.println("Valor com desconto: R$ " + valorComDesconto );
    }
}
