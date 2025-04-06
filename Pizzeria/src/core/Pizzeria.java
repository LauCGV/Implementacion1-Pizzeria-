/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Pizzeria {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        this.nombre = "Default name";
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        if (!this.items.contains(item)) {
            this.items.add(item);
            return true;
        }
        return false;
    }

    public boolean addCliente(Cliente cliente) {
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public boolean addPedido(Pedido pedido) {
        if (!this.pedidos.contains(pedido)) {
            pedidos.add(pedido);
            return true;
        }
        return false;
    }

    public int calcProdMasVendidoCliente(int numCliente) {
        int producto[][] = new int[100][100];
        int i;
        for (Pedido pedido : clientes.get(numCliente).getPedidos()) {
            for (Item item : pedido.getItems()) {
                for (i = 0; i < 5; i++) {
                    if (item.getNombre().equals(this.items.get(i).getNombre())) {
                        producto[1][i] = producto[1][i] += 1;
                    }
                }
            }
        }
        System.out.println("num_Cliente " + numCliente);
        for (i = 0; i < 5; i++) {
            System.out.println("El producto " + items.get(i) + " se vendio " + producto[1][i]);
        }
        int mayor = 0;
        int mayorProducto = 0;
        int productosEnCero=0;
        for (i = 0; i < 5; i++) {
            if (producto[1][i] ==0) {
                productosEnCero+=1;
            }
        }
        if(productosEnCero==5){
            return -1;
        }
        for (i = 0; i < 5; i++) {
            if (producto[1][i] > mayor) {
                mayor = producto[1][i];
                mayorProducto = i;
            }
        }
        return mayorProducto;
    }
}
