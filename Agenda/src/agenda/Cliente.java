package agenda;

abstract class Cliente extends Contactos {
    String tipo_clien;
    String pag_web;

    
    public Cliente(){
        
    }
    
    public Cliente(int clave, String nombre, String empresa, String tipo_clien, String direccion, long tel_part, long tel_ofi, String email, String pag_web) {
        super(clave,nombre,empresa,direccion,tel_part,tel_ofi,email);
        this.tipo_clien = tipo_clien;
        this.pag_web = pag_web;
    }

    public String getTipo_clien() {
        return tipo_clien;
    }

    public void setTipo_clien(String tipo_clien) {
        this.tipo_clien = tipo_clien;
    }

    public String getPag_web() {
        return pag_web;
    }

    public void setPag_web(String pag_web) {
        this.pag_web = pag_web;
    }
    
    @Override
    public String toString() {
        String mensaje=("Clave: "+clave+"  Empresa: "+empresa+" Tel-"+tel_ofi+"  Pag. "+pag_web+
                "\n"+nombre+": Tel-"+tel_part +" (Cliente tipo: "+tipo_clien+")\nDireccion/E-mail :"+direccion+" / "+email+"\n");
        return mensaje;
    }
    
}
