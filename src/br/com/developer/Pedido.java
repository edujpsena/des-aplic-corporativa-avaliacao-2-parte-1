package br.com.developer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itens;
    private Double desconto;

    public void addItem(List<Item> itens){
        setItens(itens);
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens(){
        return this.itens;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValor(){
        double total = 0;
        for (Item i: itens) {
            total += i.getValor();
        }
        return total;
    }

    public Double getValor(double desconto){
        double total = 0;
        for (Item i: itens) {
            total += i.getValor();
        }
        return total - desconto;
    }
}
