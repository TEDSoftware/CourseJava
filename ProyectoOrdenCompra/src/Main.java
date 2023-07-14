public class Main {

    public static void main(String[] args) {

        Cliente client01 = new Cliente("Juan","Perez");
        Cliente client02 = new Cliente("Tomas","Ramirez");
        Cliente client03 = new Cliente("Benito", "Montoya");

        Producto product01 = new Producto("KLIM", "leche", 2000);
        Producto product02 = new Producto("Huggies", "Pañales", 1000);
        Producto product03 = new Producto("Diana", "Arroz", 3000);

        OrdenCompra Order01 = new OrdenCompra("Order1");
        OrdenCompra Order02 = new OrdenCompra("Order2");
        OrdenCompra Order03 = new OrdenCompra("Order3");

        Order01.setCliente(client01);
        Order02.setCliente(client02);
        Order03.setCliente(client03);

        Order01.addProducto(product01);
        Order01.addProducto(product02);
        Order01.addProducto(product03);

        Order02.addProducto(product02);
        Order02.addProducto(product01);
        Order02.addProducto(product03);

        Order03.addProducto(product03);
        Order03.addProducto(product02);
        Order03.addProducto(product01);

        System.out.printf(
                    Order01.getDescripcion() + ": \n" +
                    "Identificador: " + Order01.getIdentificador() + "\n" +
                    "Cliente: " + Order01.getCliente().getNombre() + " "+ Order01.getCliente().getApellido() + "\n " );
       System.out.printf("---------------------------------PRODUCTOS-------------------------------------------------------- \n");

        for (Producto producto : Order01.getProductos()) {
            if (producto != null) {
                System.out.println("Fabricante: " + producto.getFabricante());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio() +"\n");
        }
       }
        System.out.printf("\n \n");

        System.out.printf(
                Order02.getDescripcion() + ": \n" +
                        "Identificador: " + Order02.getIdentificador() + "\n" +
                        "Cliente: " + Order02.getCliente().getNombre() + " "+ Order02.getCliente().getApellido() + "\n " );
        System.out.printf("---------------------------------PRODUCTOS-------------------------------------------------------- \n");

        for (Producto producto : Order02.getProductos()) {
            if (producto != null) {
                System.out.println("Fabricante: " + producto.getFabricante());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio() + "\n");
            }
        }
        System.out.printf("\n \n");


        System.out.printf(
                Order03.getDescripcion() + ": \n" +
                        "Identificador: " + Order03.getIdentificador() + "\n" +
                        "Cliente: " + Order03.getCliente().getNombre() + " "+ Order03.getCliente().getApellido() + "\n " );
        System.out.printf("---------------------------------PRODUCTOS-------------------------------------------------------- \n");

        for (Producto producto : Order03.getProductos()) {
            if (producto != null) {
                System.out.println("Fabricante: " + producto.getFabricante());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio() + "\n");
            }
        }
        System.out.printf("\n \n");

    }
}