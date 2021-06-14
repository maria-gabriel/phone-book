package agenda;

abstract class Contactos {
    int clave;
    String nombre;
    String empresa;
    String direccion;
    long tel_part;
    long tel_ofi;
    String email;
    
    public Contactos siguiente;
    
    public Contactos(){
        siguiente=null;
    }

    public Contactos(int clave, String nombre, String empresa, String direccion, long tel_part, long tel_ofi, String email) {
        this.clave = clave;
        this.nombre = nombre;
        this.empresa = empresa;
        this.direccion = direccion;
        this.tel_part = tel_part;
        this.tel_ofi = tel_ofi;
        this.email = email;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTel_part() {
        return tel_part;
    }

    public void setTel_part(long tel_part) {
        this.tel_part = tel_part;
    }

    public long getTel_ofi() {
        return tel_ofi;
    }

    public void setTel_ofi(long tel_ofi) {
        this.tel_ofi = tel_ofi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Contactos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Contactos siguiente) {
        this.siguiente = siguiente;
    }
    
}
