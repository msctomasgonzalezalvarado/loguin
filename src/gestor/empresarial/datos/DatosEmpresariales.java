package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales{ //esta clase no ofrece herencia, solo instancia
    private String adscripcion;
    private String telefonoExtension;
    private String puesto;

    public DatosEmpresariales(int noEmpleado,String nombre, String apellidos, String correo) {
        super.setId(noEmpleado);
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setCorreo(correo);
    }

    public String getAdscripcion() {

        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {

        this.adscripcion = adscripcion;
    }

    public String getTelefonoExtension() {

        return telefonoExtension;
    }

    public void setTelefonoExtension(String telefonoExtension) {

        this.telefonoExtension = telefonoExtension;
    }

    public String getPuesto() {

        return puesto;
    }

    public void setPuesto(String puesto) {

        this.puesto = puesto;
    }
}

