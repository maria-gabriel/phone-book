package agenda;
import java.util.*;

public class Agenda {
    
    public static void main(String[] args) {    
       menu(); 
    }    
    
    public static void menu(){
        Scanner sn = new Scanner (System.in); 
        Lista contacto = new Lista() {};
        String aux = null;
        int op,op2=0;
        
        do{  
            op = menuPrincipal();
            switch (op) {            
               
                case 1:
                    System.out.print("\nAgregar un nuevo contacto\n");
                    int op3;
                    System.out.print("\n1.-Cliente\n2.-Proveedor\n3.-Empleado\n\nOpcion: ");
                    op3 = sn.nextInt();
                    switch (op3) {
                        case 1:
                            long tel = 0;
                            int clav = 0;
                            System.out.print("\nIngrese los datos \n");
                            try{
                            System.out.print("Clave: ");
                            clav =sn.nextInt();
                            clave(clav);
                                }catch(ExcepcionClave e){
                               System.err.println("Error:"+e);
                            }
                            System.out.print("Nombre: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String nom = sn.nextLine();
                            if(contacto.verificar(nom)==true){
                            System.out.print("Desea Actualizarlo? 1/si 2/no: ");
                            int o=sn.nextInt();
                            if(o==1){
                                int ob = contacto.obtener(nom);
                                contacto.borrar(ob);
                                if (op>0){
                                 aux=sn.nextLine();}
                                System.out.print("Empresa: ");
                                String emp = sn.nextLine();
                                System.out.print("Tipo Cliente: ");
                                String tip = sn.nextLine();
                                System.out.print("Direccion: ");
                                String dir = sn.nextLine();
                                try{
                                System.out.print("Telefóno particular: ");
                                tel = sn.nextLong();
                                digitos(tel);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                                System.out.print("Telefono oficina: ");
                                long ofi = sn.nextLong();
                                System.out.print("E-mail: ");
                                if (op>0){
                                aux=sn.nextLine();}
                                String ema = sn.nextLine();
                                System.out.print("Pagina web: ");
                                String pag = sn.nextLine();
                                contacto.insertarClien(clav, nom, emp, tip, dir, tel, ofi, ema, pag);
                                System.out.print("Modificado correctamente\n");
                            }
                        }else{
                            System.out.print("Empresa: ");
                            String emp = sn.nextLine();
                            System.out.print("Tipo Cliente: ");
                            String tip = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            tel = sn.nextLong();
                            digitos(tel);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema = sn.nextLine();
                            System.out.print("Pagina web: ");
                            String pag = sn.nextLine();
                            contacto.insertarClien(clav, nom, emp, tip, dir, tel, ofi, ema, pag);
                            System.out.print("Contacto agregado correctamente\n");
                            }
                        
                            break;
                        case 2:
                            long tel2 = 0;
                            int clav2 = 0;
                            System.out.print("\nIngrese los datos \n");
                            try{
                            System.out.print("Clave: ");
                            clav2 =sn.nextInt();
                            clave(clav2);
                                }catch(ExcepcionClave e){
                               System.err.println("Error:"+e);
                            }
                            System.out.print("Nombre: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String nom2 = sn.nextLine();
                            if(contacto.verificar(nom2)==true){
                            System.out.print("Desea Actualizarlo? 1/si 2/no: ");
                            int o=sn.nextInt();
                            if(o==1){
                                int ob = contacto.obtener(nom2);
                                contacto.borrar(ob);
                                if (op>0){
                                 aux=sn.nextLine();}
                                System.out.print("Empresa: ");
                            String emp2 = sn.nextLine();
                            System.out.print("Giro empresarial: ");
                            String gir2 = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir2 = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            if (op>0){
                                 aux=sn.nextLine();}
                            tel2 = sn.nextLong();
                            digitos(tel2);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi2 = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema2 = sn.nextLine();
                            System.out.print("Pagina web: ");
                            String pag2 = sn.nextLine();
                            contacto.insertarProv(clav2, nom2, emp2, gir2, dir2, tel2, ofi2, ema2, pag2);
                            System.out.print("Modificado correctamente\n");
                            }
                        }else{
                            System.out.print("Empresa: ");
                            String emp2 = sn.nextLine();
                            System.out.print("Giro empresarial: ");
                            String gir2 = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir2 = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            tel2 = sn.nextLong();
                            digitos(tel2);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi2 = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema2 = sn.nextLine();
                            System.out.print("Pagina web: ");
                            String pag2 = sn.nextLine();
                            contacto.insertarProv(clav2, nom2, emp2, gir2, dir2, tel2, ofi2, ema2, pag2);
                            System.out.print("Contacto agregado correctamente\n");
                            break;
                            }
                        
                        case 3:
                            long tel3 = 0;
                            int clav3 = 0;
                            System.out.print("\nIngrese los datos \n");
                            try{
                            System.out.print("Clave: ");
                            clav3 =sn.nextInt();
                            clave(clav3);
                                }catch(ExcepcionClave e){
                               System.err.println("Error:"+e);
                            }
                            System.out.print("Nombre: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String nom3 = sn.nextLine();
                            if(contacto.verificar(nom3)==true){
                            System.out.print("Desea Actualizarlo? 1/si 2/no: ");
                            int o=sn.nextInt();
                            if(o==1){
                                int ob = contacto.obtener(nom3);
                                contacto.borrar(ob);
                                if (op>0){
                                 aux=sn.nextLine();}
                            System.out.print("Area: ");
                            String ar3 = sn.nextLine();
                            System.out.print("Puesto: ");
                            String pu3 = sn.nextLine();
                            System.out.print("Empresa: ");
                            String emp3 = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir3 = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            tel3 = sn.nextLong();
                            digitos(tel3);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi3 = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema3 = sn.nextLine();
                            contacto.insertarEmp(clav3, nom3, ar3, pu3, emp3, dir3, tel3, ofi3, ema3);
                            System.out.print("Modificado correctamente\n");
                            }
                        }else{
                            System.out.print("Area: ");
                            String ar3 = sn.nextLine();
                            System.out.print("Puesto: ");
                            String pu3 = sn.nextLine();
                            System.out.print("Empresa: ");
                            String emp3 = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir3 = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            tel3 = sn.nextLong();
                            digitos(tel3);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi3 = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema3 = sn.nextLine();
                            contacto.insertarEmp(clav3, nom3, ar3, pu3, emp3, dir3, tel3, ofi3, ema3);
                            System.out.print("Contacto agregado correctamente\n");
                            break;
                            }
                        default: System.out.println("Seleccione una opcion. ");
                    }     

                    break;
                case 2: 
                    System.out.println("\nContactos en la agenda telefonica:\n");
                        contacto.mostrar();
                    break;
                    
                case 3: 
                    System.out.print("\nBuscar un contacto\n");                   
                    System.out.print("Ingrese el nombre del contacto: ");
                   // if (op>0){
                     //       aux=sn.nextLine();}
			String Nombre = sn.nextLine();
			contacto.buscar(Nombre);
                break;
                case 4: 
                    System.out.print("\nModificar contacto\n"); 
                    int op4;
                    System.out.print("\n1.-Cliente\n2.-Proveedor\n3.-Empleado\n\nOpcion: ");
                    op4 = sn.nextInt();
                    switch (op4) {
                        case 1:
                            long tel = 0;
                            int clav = 0;
                            System.out.print("\nIngrese el nombre del cliente a modificar: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String nom = sn.nextLine();
                                int ob = contacto.obtener(nom);
                                    contacto.borrar(ob);
                                System.out.print("Ingresa los nuevos datos: \n");
                            try{
                            System.out.print("Clave: ");
                            clav =sn.nextInt();
                            clave(clav);
                                }catch(ExcepcionClave e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                    aux=sn.nextLine();}
                            }
                            if (op>0){
                                    aux=sn.nextLine();}
                                System.out.print("Empresa: ");
                                String emp = sn.nextLine();
                                System.out.print("Tipo Cliente: ");
                                String tip = sn.nextLine();
                                System.out.print("Direccion: ");
                                String dir = sn.nextLine();
                                try{
                                System.out.print("Telefóno particular: ");
                                tel = sn.nextLong();
                                digitos(tel);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                    aux=sn.nextLine();}
                            }
                                System.out.print("Telefono oficina: ");
                                long ofi = sn.nextLong();
                                System.out.print("E-mail: ");
                                if (op>0){
                                aux=sn.nextLine();}
                                String ema = sn.nextLine();
                                System.out.print("Pagina web: ");
                                String pag = sn.nextLine();
                                contacto.insertarClien(clav, nom, emp, tip, dir, tel, ofi, ema, pag);
                                System.out.print("Modificado correctamente\n");
                            
                            break;
                        case 2:
                            long tel2 = 0;
                            int clav2 = 0;
                            System.out.print("\nIngrese el nombre del proveedor a modificar: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String nom2 = sn.nextLine();
                                int ob2 = contacto.obtener(nom2);
                                    contacto.borrar(ob2);
                                System.out.print("Ingresa los nuevos datos:\n ");
                            try{
                            System.out.print("Clave: ");
                            clav2 =sn.nextInt();
                            clave(clav2);
                                }catch(ExcepcionClave e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            if (op>0){
                                    aux=sn.nextLine();}
                                System.out.print("Empresa: ");
                            String emp2 = sn.nextLine();
                            System.out.print("Giro empresarial: ");
                            String gir2 = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir2 = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            tel2 = sn.nextLong();
                            digitos(tel2);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                    aux=sn.nextLine();}
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi2 = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema2 = sn.nextLine();
                            System.out.print("Pagina web: ");
                            String pag2 = sn.nextLine();
                            contacto.insertarProv(clav2, nom2, emp2, gir2, dir2, tel2, ofi2, ema2, pag2);
                            System.out.print("Modificado correctamente\n");
                            break;
                        case 3:
                            long tel3 = 0;
                            int clav3 = 0;
                            System.out.print("\nIngrese el nombre del empleado a modificar: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String nom3 = sn.nextLine();
                                int ob3 = contacto.obtener(nom3);
                                    contacto.borrar(ob3);
                                System.out.print("Ingresa los nuevos datos:\n ");
                            try{
                            System.out.print("Clave: ");
                            clav3 =sn.nextInt();
                            clave(clav3);
                                }catch(ExcepcionClave e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            if (op>0){
                                    aux=sn.nextLine();}
                            System.out.print("Area: ");
                            String ar3 = sn.nextLine();
                            System.out.print("Puesto: ");
                            String pu3 = sn.nextLine();
                            System.out.print("Empresa: ");
                            String emp3 = sn.nextLine();
                            System.out.print("Direccion: ");
                            String dir3 = sn.nextLine();
                            try{
                            System.out.print("Telefóno particular: ");
                            tel3 = sn.nextLong();
                            digitos(tel3);
                                }catch(ExcepcionDigitos e){
                               System.err.println("Error:"+e);
                               if (op>0){
                                 aux=sn.nextLine();}
                            }
                            System.out.print("Telefono oficina: ");
                            long ofi3 = sn.nextLong();
                            System.out.print("E-mail: ");
                            if (op>0){
                            aux=sn.nextLine();}
                            String ema3 = sn.nextLine();
                            contacto.insertarEmp(clav3, nom3, ar3, pu3, emp3, dir3, tel3, ofi3, ema3);
                            System.out.print("Modificado correctamente\n");
                            break;
                                
                        default: System.out.println("Seleccione una opcion. ");
                    }     
                break;
                    
                case 5:
                    System.out.print("\nEliminar un contacto\n"); 
                    System.out.print("Ingrese el No. de contacto a borrar: ");
			int num = sn.nextInt();
			contacto.eliminar(num);
                    break;
                case 6:
                    System.out.print("Desea terminar? 1/si  2/no: ");          
                 op2 = sn.nextInt();
                 if(op2==1)
                     System.out.print("\nHasta luego :)\n");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida. ");
            }
                op=2;
        }while(op==2 && op2!=1);

    }
    
    public static int menuPrincipal() {
        Scanner sn = new Scanner (System.in); 
        
            System.out.println("\n\t BIENVENIDO\nMi agenda telefónica en Java :) \n");
            System.out.println("1.- Registrar contacto");
            System.out.println("2.- Ver los contactos");
            System.out.println("3.- Buscar un contacto");
            System.out.println("4.- Modificar un contacto");
            System.out.println("5.- Eliminar un contacto");
            System.out.println("6.- SALIR");
            System.out.print("\nOpcion: ");
            int op = sn.nextInt();
            sn.nextLine();
            return op;
        }

        static void digitos(long num) throws ExcepcionDigitos{
            long digitos = (int)(Math.log10(num)+1);
               if (digitos!=10){
                   throw new ExcepcionDigitos("(Advertencia: El numero esta fuera del tamaño de 10 digitos)");
               }
        }
        
        static void clave(int num) throws ExcepcionClave{
               if ((num<0)||(num==' ')){
                   throw new ExcepcionClave("(Advertencia: La clave debe ser numerica y no negativa)");
               }
        }

}