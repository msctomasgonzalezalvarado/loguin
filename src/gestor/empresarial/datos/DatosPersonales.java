package gestor.empresarial.datos;

public class DatosPersonales { //Esta clase no ofrece instancia, solo puede ofrecer herencia
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellidos() {

        return apellidos;
    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    public String getCorreo() {

        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = correo;
    }

    public String getWhatsApp() {

        return whatsapp;
    }

    public void setWhatsApp(String whatsapp) {

        this.whatsapp = whatsapp;
    }
}
