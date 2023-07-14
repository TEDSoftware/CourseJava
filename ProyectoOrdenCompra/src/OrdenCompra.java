import java.util.Date;

public class OrdenCompra {
    private static int contadorId = 0;
    private Integer identificador;
    private String descripcion ;
    private Date fecha;

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;


    public Integer getIdentificador() {
        return identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public OrdenCompra(String descripcion) {

        this.descripcion = descripcion;
        this.identificador = ++contadorId;
        this.productos = new Producto[4];
        this.indiceProductos = 0;
    }
    public int granTotal() {
        int sumP = 0;
        for (Producto x : productos) {
            sumP += x.getPrecio();
        }
        return sumP;
    }
    public void addProducto(Producto producto) {
        if (indiceProductos < 3) {
            productos[indiceProductos] = producto;
            indiceProductos++;
            }else{
            System.out.printf("imposible agregar producto {addProducto}");
        }
    }

    /*
       public void addProducto(Producto producto) {
        if (indiceProductos < 4) {
            productos[indiceProductos] = producto;
            indiceProductos++;
        } else {
            System.out.println("No se pueden agregar más productos a esta orden de compra.");
        }
    }
        Producto[] producto = {
                new Producto("KLIM", "leche", 2000),
                new Producto("Huggies", "Pañales", 1000),
                new Producto("Diana", "Arroz", 3000),
                new Producto("Dell", "PC", 1500)
        };
*/




}
