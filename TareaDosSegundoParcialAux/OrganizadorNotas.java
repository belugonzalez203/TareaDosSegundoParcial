import java.util.Scanner;
/**
 * Write a description of class Estudiantes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrganizadorNotas{
    private int cantEst, i = 0, j = 1; 
    private double [] notas;
    private Scanner anadirNota = new Scanner(System.in);
    public OrganizadorNotas(int nroEstudiantes){
        cantEst = nroEstudiantes;
        notas = new double[cantEst];
    }
    
    public String anadirNotas(){
        String respuesta = "Nro." + "\t" + "Nota" + "\n";
        System.out.println("Ingrese las notas por numero de lista(solo notas)");
        while(i < notas.length){
            notas[i] = anadirNota.nextInt();
            respuesta = respuesta + j + ".-" + "\t" + notas[i] + "\n";
            i++;
            j++;
        }
        System.out.println("Obtenga las respuestas de los cuadros y con un " +
                           "'System.out.println' vera la lista");
        System.out.println("Notas de Estudiantes");
        return respuesta;
    }
    
    public String promedioNotas(){
        String promedio;
        double prom, suma = 0;
        for(i = 0; i < notas.length; i++){
            suma = suma + notas[i];
         }
        prom = suma / cantEst;
        promedio = "El promedio de las notas de los " + cantEst + 
                   " estudiantes es: " + prom;
        return promedio;
    }
    
    public String promedioAprobados(){
        String promAprobados;
        double promAp, suma = 0;
        int aux = 0;
        for(i = 0; i < notas.length; i++){
            if(notas[i] > 51){
                suma = suma + notas[i];
                aux++;
            }
        }
        promAp = suma / aux;
        promAprobados = "El promedio de las notas de los " + cantEst + 
                        " aprobados es: " + promAp;
        return promAprobados;
    }
    
    public String cantReprobados(){
        String reprobados;
        double suma = 0;
        int reprob = 0;
        for(i = 0; i < notas.length; i++){
            if(notas[i] <= 51){
                suma = suma + notas[i];
                reprob++;
            }
        }
        reprobados = "De " + cantEst + " estudiantes, " + reprob + 
                     " estan reprobados.";
        return reprobados;
    }
    
    public String cantAprobados(){
        String aprobados;
        double suma = 0;
        int aprob = 0;
        for(i = 0; i < notas.length; i++){
            if(notas[i] > 51){
                suma = suma + notas[i];
                aprob++;
            }
        }
        aprobados = "De " + cantEst + " estudiantes, " + aprob + 
                     " estan aprobados.";
        return aprobados;
    }
    
    public String notaMasAlta(){
        String notaMasAlta;
        double masAlta = 0;
        for(i = 0; i < notas.length; i++){
            if(notas[i] >= masAlta){
                masAlta = notas[i];
            }
        }
        notaMasAlta = "La nota mas alta entre los " + cantEst + " es: " + masAlta;
        return notaMasAlta;
    }
}
