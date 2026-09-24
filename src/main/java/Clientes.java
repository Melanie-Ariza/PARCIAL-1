public class Clientes {
    private String nombre;
    private int documento;
    private int telefono;
    private String correo;



    //CONSTRUCTOR
    public Clientes(String nombre, int documento, int telefono, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
    }

    //GET-SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //TOSTRING
    @Override
    public String toString() {
        return nombre +
                " documento: " + documento +
                ", telefono: " + telefono +
                ", correo: " + correo;
    }
}
