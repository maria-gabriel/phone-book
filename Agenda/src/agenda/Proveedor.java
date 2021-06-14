package agenda;

abstract class Proveedor extends Contactos {
    String giro_emp;
    String web;

    public Proveedor(){
        
    }
    
    public Proveedor(int clave, String nombre, String empresa, String giro_emp,String direccion, long tel_part, long tel_ofi, String email, String web) {
        super(clave,nombre,empresa,direccion,tel_part,tel_ofi,email);
        this.giro_emp = giro_emp;
        this.web = web;
    }

    public String getGiro_emp() {
        return giro_emp;
    }

    public void setGiro_emp(String giro_emp) {
        this.giro_emp = giro_emp;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    
    @Override
    public String toString() {
        String mensaje=("Clave: "+clave+"  Empresa: "+empresa+" Tel-"+tel_ofi+"  Pag. "+web+
                "\n"+nombre+": Tel-"+tel_part +" (Giro empresarial: "+giro_emp+")\nDireccion/E-mail: "+direccion+" / "+email+"\n");
        return mensaje;
    }
}
