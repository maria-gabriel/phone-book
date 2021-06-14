package agenda;
import java.io.Serializable;

abstract class Lista implements Serializable {
    Contactos p;
    int n;
    
    public Lista(){
       p=null;
       n=0;
   }
    
    public Lista(Contactos p) {
        this.p = p;
    }

    public Contactos getP() {
        return p;
    }
    public void setP(Contactos p) {
        this.p = p;
    }

   public void insertarClien(int clave, String nombre, String empresa, String tipo_clien, String direccion, long tel_part, long tel_ofi, String email, String pag_web){
        Contactos act = p;
        Contactos ant = null;
        Cliente nuevo = new Cliente() {};
            
                nuevo.setClave(clave);
                nuevo.setNombre(nombre);
                nuevo.setEmpresa(empresa);
                nuevo.setTipo_clien(tipo_clien);
                nuevo.setDireccion(direccion);
                nuevo.setTel_part(tel_part);
                nuevo.setTel_ofi(tel_ofi);
                nuevo.setEmail(email);
                nuevo.setPag_web(pag_web);
        
		if (isEmpty()) {
			p = nuevo;
			n++;
		} else {
			for (int i = 0; i < n; i++) {
			String[] N1 = act.getNombre().split(" ");
			String[] N2 = nuevo.getNombre().split(" ");

			int result = N1[N1.length-1].compareToIgnoreCase(N2[N2.length-1]);

			if (result > 0) {
				if (ant == null) {
					nuevo.setSiguiente(act);
					p = nuevo;
					n++;
					break;
                                    }
                                
					ant.setSiguiente(nuevo);
					nuevo.setSiguiente(act);
					n++;
					break;
				}else{
					if (act.getSiguiente() == null) {
						act.setSiguiente(nuevo);
						nuevo.setSiguiente(null);
						n++;
						break;
					}
					ant = act;
					act = act.getSiguiente();
				}
			}
		}   
   }
   
   public void insertarProv(int clave, String nombre, String empresa, String giro_emp,String direccion, long tel_part, long tel_ofi, String email, String web){
       Contactos act = p;
        Contactos ant = null;
	Proveedor nuevo = new Proveedor() {};
        
                nuevo.setClave(clave);
                nuevo.setNombre(nombre);
                nuevo.setEmpresa(empresa);
                nuevo.setGiro_emp(giro_emp);
                nuevo.setDireccion(direccion);
                nuevo.setTel_part(tel_part);
                nuevo.setTel_ofi(tel_ofi);
                nuevo.setEmail(email);
                nuevo.setWeb(web);
        
		if (isEmpty()) {
			p = nuevo;
			n++;
		} else {
			for (int i = 0; i < n; i++) {
			String[] N1 = act.getNombre().split(" ");
			String[] N2 = nuevo.getNombre().split(" ");

			int result = N1[N1.length-1].compareToIgnoreCase(N2[N2.length-1]);

			if (result > 0) {
				if (ant == null) {
					nuevo.setSiguiente(act);
					p = nuevo;
					n++;
					break;
                                    }
                                
					ant.setSiguiente(nuevo);
					nuevo.setSiguiente(act);
					n++;
					break;
				}else{
					if (act.getSiguiente() == null) {
						act.setSiguiente(nuevo);
						nuevo.setSiguiente(null);
						n++;
						break;
					}
					ant = act;
					act = act.getSiguiente();
				}
			}
		}        
   }
   
   public void insertarEmp(int clave, String nombre, String area, String puesto, String empresa, String direccion, long tel_part, long tel_ofi, String email){
       Contactos act = p;
        Contactos ant = null;
	Empleado nuevo = new Empleado() {};
        
                nuevo.setClave(clave);
                nuevo.setNombre(nombre);
                nuevo.setArea(area);
                nuevo.setPuesto(puesto);
                nuevo.setEmpresa(empresa);
                nuevo.setDireccion(direccion);
                nuevo.setTel_part(tel_part);
                nuevo.setTel_ofi(tel_ofi);
                nuevo.setEmail(email);
        
		if (isEmpty()) {
			p = nuevo;
			n++;
		} else {
			for (int i = 0; i < n; i++) {
			String[] N1 = act.getNombre().split(" ");
			String[] N2 = nuevo.getNombre().split(" ");

			int result = N1[N1.length-1].compareToIgnoreCase(N2[N2.length-1]);

			if (result > 0) {
				if (ant == null) {
					nuevo.setSiguiente(act);
					p = nuevo;
					n++;
					break;
                                    }
                                
					ant.setSiguiente(nuevo);
					nuevo.setSiguiente(act);
					n++;
					break;
				}else{
					if (act.getSiguiente() == null) {
						act.setSiguiente(nuevo);
						nuevo.setSiguiente(null);
						n++;
						break;
					}
					ant = act;
					act = act.getSiguiente();
				}
			}
		}        
   }
   
   
   public boolean isEmpty() {
		return (n == 0);
	}
   
   public void mostrar() {
		Contactos temp = p;
		if (p == null) {
			System.out.println("La agenda esta vacia.");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print("Contacto [" + (i+1) + "]\n");
				System.out.println(temp);
				temp = temp.getSiguiente();
			}
		}
		System.out.println();
	}
   
   public int obtener(String nomb){
       Contactos act = p;
        int x=0;
        if (isEmpty()) {
			System.out.println("La agenda esta vacia. Agrega un nuevo contacto");
                        x=0;
		}else {
            for (int i = 0; i < n; i++) {
                    if (act.getNombre().toLowerCase().contains(nomb.toLowerCase())) {
                        System.out.print(" ");
                        x=i+1;
                    }
                }
            }
                return x;
   }
   
   public void buscar(String nom) {
		Contactos act = p;
		boolean v = true;

		if (isEmpty()) {
			System.out.println("La agenda esta vacia. ");
		}else {
			for (int i = 0; i < n; i++) {
				if (act.getNombre().toLowerCase().contains(nom.toLowerCase())) {
					System.out.print("Contacto [" + (i+1) + "]\n");
					System.out.println(act);
					v = false;

				}
				act = act.getSiguiente();
			}
			if (v){
				System.out.println("No se encontro ese contacto.");
			}
		}
	}
   
   public boolean verificar(String nom){
            Contactos act = p;
            boolean existe=false;

		for (int i = 0; i < n; i++) {
			if (act.getNombre().toLowerCase().contains(nom.toLowerCase())) {
				System.out.print("El contacto ya existe\n");
                                existe=true;
		}
			act = act.getSiguiente();
	}
                return existe;
    }
   
   public void eliminar (int numero) {
		Contactos act = p;
		Contactos ant = null;
		boolean v = true;

		if (isEmpty()) {
			System.out.println("La agenda esta vacia.");
		} else {
			for (int i = 0; i < n; i++) {
				if ((numero-1) == i) {
					if (ant == null) {
						p = p.getSiguiente();
						n--;
						v = false;
						break;
					}else if (act.getSiguiente() == null){
						ant.setSiguiente(null);
						n--;
						v = false;
						break;
					}else{
						ant.setSiguiente(act.getSiguiente());
						n--;
						v = false;
						break;
					}
				}else{
					ant = act;
					act = act.getSiguiente();
				}
			}
			if (v){
				System.out.println("No se encontro registro.");
			}else{
				System.out.println("Contacto "+numero+" eliminado correctamente ");
			}
		}
	}
   
   public void borrar(int numero){
       Contactos act = p;
		Contactos ant = null;
		boolean v = true;

		if (isEmpty()) {
			//System.out.println("La agenda esta vacia.");
		} else {
			for (int i = 0; i < n; i++) {
				if ((numero-1) == i) {
					if (ant == null) {
						p = p.getSiguiente();
						n--;
						v = false;
						break;
					}else if (act.getSiguiente() == null){
						ant.setSiguiente(null);
						n--;
						v = false;
						break;
					}else{
						ant.setSiguiente(act.getSiguiente());
						n--;
						v = false;
						break;
					}
				}else{
					ant = act;
					act = act.getSiguiente();
				}
			}
			if (v){
				//System.out.println("No se encontro registro.");
			}else{
				//System.out.println("Contacto "+numero+" eliminado correctamente ");
			}
		}
        }
}
