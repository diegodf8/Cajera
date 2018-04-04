package com.cice.cajera;

public class CajeroPro extends Thread {

    private String nombre;
    private Cliente cliente;

    public CajeroPro(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }


    @Override
    public void run() {

        int [] productos = this.cliente.getProductos();
        int duracion = 0;
        System.out.println("Hora inicio" + this.nombre +" " + System.currentTimeMillis());

        for (int producto: productos) {

            try{
                System.out.println("El cajero " + nombre + " procesa el producto del cliente " + cliente.getNombre() + " en " + producto + "seg");
                Thread.sleep(1000L * producto);
                duracion += (producto*1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("El tiempo de proceso del cajero " + this.nombre + " es " + (duracion/1000) + " seg");
        System.out.println("Hora fin " + this.nombre +" " + System.currentTimeMillis());
    }
}
