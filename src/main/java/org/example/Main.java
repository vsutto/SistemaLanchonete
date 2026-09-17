package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Pastel de carne", 7.99, 1);
        Item item2 = new Item("Pastel de frango", 8.99, 2);
        Item item3 = new Item("Coca-Cola", 5.99, 3);
        Item item4 = new Item("Guaraná", 4.99, 4);

        Carrinho C = new Carrinho();

        C.adicionarItem(item1);
        C.adicionarItem(item2);
        C.adicionarItem(item3);
        C.adicionarItem(item4); //suponhamos que minha esposa tenha pedido e resolveu trocar pra coca

        C.removerItem(4); //guaraná removido
        C.adicionarItem(item3); //coca adicionada

        C.calcularPreco();
    }
}