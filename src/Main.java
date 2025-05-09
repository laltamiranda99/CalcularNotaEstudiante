//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CONDICIONAL
   // desarrollar un sistema de notas de un estudiante que desea saber su nota  final de cada (materia)
        // el sistema debe pedir nombre del estudiante, documento y programa al que esta matriculado (Menu de opciones:
        // Desarrollo de software, Diseño grafico, Gastronomia)
        //Debe permitir seleccionar la materia (Menu de opciones:
        // Desarrollo: logica, metodologias, introduccion
        // Diseño: Tipografia, Iconografia, Semantica,
        // Gastronomia: Costo, Panaderia dulce, Cocina Internacional)
        //El calculo de notas es de la siguiente manera:
        // Para cada materia hay un hexamen parcial que equivale al 20% de la nota, un taller equivale, el 30% de la nota
        //y un examen final que equivale al 50% de la nota)
        //una ves calculada la nota final tener en cuenta que:
        //si la nota esta entre 0 y 2 el estudiante pierde definitiva mente
        //si la nota  esta entre 2.1 y 2.9 tiene derecho a un plan de mejoramiento
        //si la nota es igual o superior a 3, asi que le queda la materia
        //si el estudiante hace plan de mejoramiento, la nota maxima de la matera sera 3
        //el sistema debew describir la informacion general

        Scanner sc = new Scanner(System.in);
        double notaExamnenParcial = 0, notaTaller = 0, notaFinal = 0, notaMateria = 0;
        System.out.println("Ingrese nombre del estudiante");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese documento del estudiante");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa:\n1 - Desarrollo de Software\n2 - Diseño grafico\n3 - Gastronomia");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Progrma de desarrollo de software");
                System.out.println("Seleccione la materia:\1nlogica de programacion\2nmetodologias\3nintroduccion a la programacion");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("nota de logica de programacion");
                        System.out.print("Nota examen parcial:");
                        notaExamnenParcial = sc.nextDouble();
                        System.out.print("Nota taller:");
                        notaTaller = sc.nextDouble();
                        System.out.print("Nota final");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamnenParcial * 0.2) + (notaTaller *0.3) + (notaFinal *0.5);
                        System.out.println("El estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de logica:" + notaMateria);

                        if (notaMateria < 2 ){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }

                        break;

                    case "2":
                        System.out.println("Nota de metodolias agiles:");
                        System.out.print("Nota examen parcial:");
                        notaExamnenParcial = sc.nextDouble();
                        System.out.print("Nota taller:");
                        notaTaller = sc.nextDouble();
                        System.out.print("Nota final");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamnenParcial * 0.2) + (notaTaller *0.3) + (notaFinal *0.5);
                        System.out.println("la nota final de la materia es:");
                        System.out.println("El estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de logica:" + notaMateria);
                        System.out.println("nota de metodologias");

                        if (notaMateria < 2 ){
                            System.out.println("Perdio definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;

                    case "3":
                        System.out.println("nota de introduccion a la programacion");
                        break;

                }

                break;
            case "2":
                System.out.println("Programa de diseño grafico");
                break;
            case "3":
                System.out.println("Programa de gastronomia");
                break;

        }



    }
}