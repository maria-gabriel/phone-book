package agenda;

abstract class Empleado extends Contactos {
    String area;
    String puesto;

    public Empleado(){
        
    }
    
    public Empleado(int clave, String nombre, String area, String puesto, String empresa, String direccion, long tel_part, long tel_ofi, String email) {
        super(clave,nombre,empresa,direccion,tel_part,tel_ofi,email);
        this.area = area;
        this.puesto = puesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String toString() {
        String mensaje=("Clave: "+clave+"  Empresa: "+empresa+" Tel-"+tel_ofi+" Puesto: "+puesto+
                "\n"+nombre+": Tel-"+tel_part +" (Area: "+area+")\nDireccion/E-mail: "+direccion+" / "+email+"\n");
        return mensaje;
    }
}
