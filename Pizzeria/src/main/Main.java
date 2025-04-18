/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Cliente;
import core.Item;
import core.PedidoOnLine;
import core.PedidoTelefono;
import core.Pizzeria;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Main {

    public static void main(String[] args) {
        // Variables de apoyo
        ArrayList<Item> itemsTemp = new ArrayList<>();

        // Creando clase principal
        Pizzeria pizzeria = new Pizzeria();

        // Creando items
        pizzeria.addItem(new Item("Lasagna", 20000));
        pizzeria.addItem(new Item("Pizza hawaiana", 15000));
        pizzeria.addItem(new Item("Calzone", 12500));
        pizzeria.addItem(new Item("Pasta napolitana", 17200));
        pizzeria.addItem(new Item("Raviolis", 2200));

        // Creando clientes
        pizzeria.addCliente(new Cliente("Pedro"));
        pizzeria.addCliente(new Cliente("Plutarco"));
        pizzeria.addCliente(new Cliente("Carolina"));
        pizzeria.addCliente(new Cliente("Lina"));
        pizzeria.addCliente(new Cliente("Ana"));

        // Creando pedidos
        // Pedido 1
        itemsTemp.add(pizzeria.getItem(0));
        itemsTemp.add(pizzeria.getItem(0));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(3));
        pizzeria.addPedido(new PedidoTelefono(pizzeria.getCliente(0), "3001111110", itemsTemp));

        // Pedido 2
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(0));
        itemsTemp.add(pizzeria.getItem(3));
        itemsTemp.add(pizzeria.getItem(3));
        pizzeria.addPedido(new PedidoTelefono(pizzeria.getCliente(1), "3001111111", itemsTemp));

        // Pedido 3
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(3));
        itemsTemp.add(pizzeria.getItem(4));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(2), "caro@latinmail.com", itemsTemp));

        // Pedido 4
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(0));
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(4));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(3), "lina@altavista.com", itemsTemp));

        // Pedido 5
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(4));
        itemsTemp.add(pizzeria.getItem(4));
        itemsTemp.add(pizzeria.getItem(4));
        itemsTemp.add(pizzeria.getItem(4));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(3), "lina@altavista.com", itemsTemp));

        // Pedido 6
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(4));
        itemsTemp.add(pizzeria.getItem(4));
        itemsTemp.add(pizzeria.getItem(4));
        itemsTemp.add(pizzeria.getItem(4));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(0), "pedro@metacrawler.com", itemsTemp));

        // Pedido 7
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(3));
        itemsTemp.add(pizzeria.getItem(1));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(0), "pedro@metacrawler.com", itemsTemp));

        // Pedido 8
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(2));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(1), "plutarco@terra.com.co", itemsTemp));

        // Pedido 9
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(3));
        itemsTemp.add(pizzeria.getItem(2));
        itemsTemp.add(pizzeria.getItem(2));
        pizzeria.addPedido(new PedidoOnLine(pizzeria.getCliente(1), "plutarco@terra.com.co", itemsTemp));

        // Pedido 10
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(0));
        itemsTemp.add(pizzeria.getItem(0));
        itemsTemp.add(pizzeria.getItem(3));
        pizzeria.addPedido(new PedidoTelefono(pizzeria.getCliente(2), "3001111113", itemsTemp));

        // Pedido 11
        itemsTemp = new ArrayList<>();
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(1));
        itemsTemp.add(pizzeria.getItem(1));
        pizzeria.addPedido(new PedidoTelefono(pizzeria.getCliente(3), "3001111113", itemsTemp));

        // Ejecutar metodos
        for (int numCliente = 0; numCliente < 5; numCliente++) {
            int numProducto = pizzeria.calcProdMasVendidoCliente(numCliente);
            if (numProducto != -1) {
                System.out.println("El producto más vendido del cliente " + pizzeria.getCliente(numCliente).getNombre() + ": " + pizzeria.getItem(numProducto).getNombre() + "\n");
            } else {
                System.out.println("El cliente " + pizzeria.getCliente(numCliente).getNombre() + " no tiene productos\n");
            }
        }
    }
}
