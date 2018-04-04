package com.cice.cajera;

public class Cajero {

    private String name;

    public void procesarCompra(Cliente cliente){
        int [] productos = cliente.getProductos();
        int duracion = 0;
        for (int producto: productos) {

            try{
                System.out.println("El cajero " + name + " procesa el producto del cliente " + cliente.getNombre() + " en " + producto + "seg");
                Thread.sleep(1000L * producto);
                duracion += (producto*1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("El tiempo de proceso del cajero " + name + " es " + (duracion/1000) + " seg");
    }



    public Cajero(String name) {
        this.name = name;
    }
}
