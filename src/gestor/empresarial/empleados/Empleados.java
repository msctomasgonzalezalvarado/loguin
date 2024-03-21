package gestor.empresarial.empleados;
import gestor.empresarial.datos.*;
import gestor.empresarial.contrato.*;


public final class Empleados implements iEmpleados { //esta clase no ofrece herencia, solo instancia
    private DatosEmpresariales[] datosRH;
    private Contrato[] contratosRH;
    private int i;
    private int j;

    public Empleados() {
        this.i=0;
        datosRH= new DatosEmpresariales[100];
        contratosRH= new Contrato[100];
    }

    /*private ArregloInformacion() {
        this.i=0;
        datosRH= new DatosEmpresariales[100];
        contratosRH= new Contato[100];
    }
*/
   /* public static ArregloInformacion creandoInstanciaPrivada8349(){
        return new ArregloInformacion();
    }*/

    public void addContrato(int id, int annio){
        if (i < 100) {
            int i=findEmpleado(id);
            if (i>-1) {
                contratosRH[j] = new Contrato(i, 10+j, annio);
                this.j++;
            }
        }
        else {
            System.out.println("Ya no hay vacantes");
        }
    }

    public void addDatosPersonales(String nombre, String apellidos, String correo){
        if (i < 100) {
            datosRH[i] = new DatosEmpresariales((100+i),nombre,apellidos,correo);
            this.i++;
        }
        else {
            System.out.println("Ya no hay vacantes");
        }
    }

    private int findEmpleado(int id){
        int indiceI=-1;

        for (int j=0; j < this.i ; j++){
            //System.out.println(datosRH[j].getId());
            if (datosRH[j].getId()==id)
                indiceI=j;
        }

        return indiceI;
    }

    private int findEmpleado(String nombre){
        int indiceI=-1;

        for (int j=0; j < this.i ; j++){
            //System.out.println(datosRH[j].getId());
            if (datosRH[j].getNombre().equals(nombre))
                indiceI=j;
        }

        return indiceI;
    }

    public void setWhatsApp(int id,String whats){
        int i=findEmpleado(id);
        if (i>-1){
            datosRH[i].setWhatsApp(whats);
        }
        System.out.println("Error al asignar WhatsApp: Número de empleado no existente");
    }

    private String datosPersonales(int i){
        String datos="";

        if (i > -1){
            datos += "Id: " + this.datosRH[i].getId() + "\n";
            datos += "Nombre: " + this.datosRH[i].getNombre() + "\n";
            datos += "Apellidos: " + this.datosRH[i].getApellidos() + "\n";
            datos += "Correo: " + this.datosRH[i].getCorreo() + "\n";
            datos += "WhatsApp: " + (this.datosRH[i].getWhatsApp()!=null ? this.datosRH[i].getWhatsApp() : "No registrado") + "\n";
            datos += "Adscripción: " + (this.datosRH[i].getAdscripcion() != null ? this.datosRH[i].getAdscripcion() : "No Registrado") + "\n";
            datos += "Puesto: " + (this.datosRH[i].getPuesto() != null ? this.datosRH[i].getPuesto() : "No Registrado") + "\n";
            datos += "  Tipo de Puesto: " + (this.contratosRH[0].getCargo() != null ? this.contratosRH[0].getCargo() : "No Registrado") + "\n";
        }
        return datos;
    }

    public String getInfoEmpleado(int id) {
        int i=findEmpleado(id);

        if (i<0) {
            System.out.println("Error al buscar por ID: Número de empleado no existente");
            return "";
        }
        else
            return datosPersonales(i);
    }

    public String getInfoEmpleado(String nombre) {
        int i=findEmpleado(nombre);

        if (i<0) {
            System.out.println("Error al buscar por Nombre: Número de empleado no existente");
            return "";
        }
        else
            return datosPersonales(i);
    }


    public void setAdscripcion(int id, String adscripcion) {
        int i=findEmpleado(id);
        if (i > -1) {
            datosRH[i].setAdscripcion(adscripcion);
        }
        else
            System.out.println("Error al registrar Adscripción: Número de empleado no existente");
    }

    public void setTelefonoExtension(int id, String telefonoExtension) {
        int i=findEmpleado(id);
        if (i > -1) {
            datosRH[i].setTelefonoExtension(telefonoExtension);
        }
        else
            System.out.println("Error al registrar número de extensión de oficina: Número de empleado no existente");
    }

    public void setPuesto(int id, String puesto) {
        int i=findEmpleado(id);
        if (i > -1) {
            datosRH[i].setPuesto(puesto);
        }
        else
            System.out.println("Error al registrar puesto: Número de empleado no existente");
    }

    public void showContratosEmpleado(int id){
        //For para mostrar todos los contratos de un empleado
    }

    public void showDatosEmpleados(){
        if (this.i >0) {
            for (int j = 0; j < this.i; j++)
                System.out.println(datosPersonales(j));
        }
        else
            System.out.println("Error al mostrar todos los empleados: No hay empleados registrados");
    }

    public int getAntiguedad(int id){
        return 0;
    }

    public void setCargo(int id, Cargos cargo) {
        int i=findEmpleado(id);
        if (i > -1) {
            contratosRH[i].setCargo(cargo);
        }
        else
            System.out.println("Error al registrar cargo: Número de empleado no existente");
    }
}

