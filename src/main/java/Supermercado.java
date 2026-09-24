public class Supermercado {
    //Atributos
    String nombre;
    String direccion;
    int telefono;

    //Constructor
    public Supermercado(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //toString
    @Override
    public String toString() {
        return "Supermercado \n" +
                "Nombre:"+nombre+
                ", Dirección: "+direccion+
                ", Telefono: "+telefono;
    }
}
