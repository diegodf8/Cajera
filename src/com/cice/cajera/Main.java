package com.cice.cajera;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1" , new int [] {2,5,1,2,4});
        Cliente cliente2 = new Cliente("Cliente 2" , new int [] {1,2,1,1,4});

        Cajero cajero1 = new Cajero ("Cajera 1");
        Cajero cajero2 = new Cajero ("Cajera 2");

        long init = System.currentTimeMillis();

        //cajero1.procesarCompra(cliente1);
        //cajero2.procesarCompra(cliente2);

        CajeroPro cajeropro1 = new CajeroPro("Cajero 1 Pro", cliente1);
        CajeroPro cajeropro2 = new CajeroPro("Cajero 2 Pro", cliente2);

        cajeropro1.start();
        cajeropro2.start();
        long fin = System.currentTimeMillis();

        System.out.println("Tiempo total de proceso: " + ((fin-init)/1000));
    }
}
