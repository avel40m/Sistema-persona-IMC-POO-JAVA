
package Personas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Servicios {
    private Scanner leer = new Scanner(System.in);
    private HashSet<Persona> personas = new HashSet();
            
    
    public void crearPersona(){
         boolean band = true;
       Persona persona = new Persona();
        persona.setId(personas.size());
        System.out.println("Ingrese el nombre del usuario");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo: \nM-Masculino\nF-Femenino\nO-otro");
        persona.setSexo(leer.next().charAt(0));
        System.out.println("Ingrese su peso");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        persona.setAltura(leer.nextDouble());
        System.out.println("¿Desea crear otra opción");
        String resp = leer.next();
        resp = resp.toLowerCase();
        if("si".equals(resp))
            otraOpcion(persona);
        System.out.println("Persona creada");
        System.out.println(persona.toString());
        personas.add(persona);
    }
    
    public void mostrarPersonas(){
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
    }
    
    public void buscarPersona(){
        System.out.println("Ingrese el id de la persona");
        int id = leer.nextInt();
        
        Iterator<Persona> it = personas.iterator();
        
       while(it.hasNext()){
           Persona per = it.next();
           if(per.getId() == id){
               System.out.println("Datos de la persona: "+ per.toString());
               break;
           }
       }
    }
    
    public void mayordeEdad(){
        System.out.println("Ingrese el id de la persona");
        int id = leer.nextInt();
        Iterator<Persona> it = personas.iterator();
        while(it.hasNext()){
            Persona per = it.next();
            if(per.getId() == id)
                if(per.getEdad() >= 18)
                    System.out.println("Es mayor de edad");
                else
                    System.out.println("Es menor de edad");
            break;
        }
    }
    
    public void calcularIMC(){
        System.out.println("Ingrese el id de la persona");
        int id = leer.nextInt();
        Iterator<Persona> it = personas.iterator();
        while(it.hasNext()){
            Persona per = it.next();
            if(per.getId() == id){
                System.out.println("El usuario está en: "+ tablaPesaje(per.getPeso(),per.getAltura()));
            }
                
        }
    }
    
    public String tablaPesaje(double kg, double altura){
        double resultado;
        resultado = kg / (altura * altura);
        
        if (resultado < 20) {
            return "Debajo de su peso ideal";
        }else{
        if(resultado >= 20 && resultado < 25){
            return "Peso ideal";
        }else{
            return "Sobrepeso";
            }   
        }
        
    }
    
    public void otraOpcion(Persona persona){
        System.out.println("Ingrese la opción a agregar");
        System.out.println("1. DNI\n2. Ultimo estudio\n3. Titulo");
        int resp = leer.nextInt();
        switch(resp){
            case 1:
                System.out.println("Ingrese su dni: ");
                persona.setOtroAtributo(leer.next());
                break;
            case 2:
                System.out.println("Ingrese su ultimo estudio cursado");
                persona.setOtroAtributo(leer.next());
                break;
            case 3:
                System.out.println("Ingrese su titulo");
                persona.setOtroAtributo(leer.next());
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
