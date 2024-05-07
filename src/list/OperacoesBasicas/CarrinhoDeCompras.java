package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void adicionarItem(String name, Double price, Integer quantity) {
        itemList.add(new Item(name, price, quantity));
    }

    public void removerItem(String name) {
        List<Item> itemRemovido = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
                itemRemovido.add(i);
            }
        }
        itemList.removeAll(itemRemovido);
    }

    public double calcularValorTotal() {
        double sum = 0.0;
        for (Item p : itemList) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Computador", 200.0, 1);
        carrinhoDeCompras.adicionarItem("TV", 100.0, 1);
        System.out.println(carrinhoDeCompras.calcularValorTotal());;
    }
}
