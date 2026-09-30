import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - CÁLCULO DE SALARIO
 * JOSÉ LUIS DÍAZ CERÓN,
 * 30-09-2026
 */
public class Calculo_Salario { // INICIO CLASE
    public static void main(String[] args) {
        final int HORAS_LIMITE = 40; // CONSTANTE DE HORAS NORMALES LIMITE
        final double MULTIPLICADOR_EXTRA = 2.0; // CONSTANTE PAGO DOBLE PARA HORAS EXTRA
        String nombre; // DECLARACION DE VARIABLE NOMBRE
        int horasTrabajadas; // DECLARACION DE VARIABLE HORAS TRABAJADAS
        double pagoPorHora; // DECLARACION DE VARIABLE PAGO POR HORA
        int horasNormales; // DECLARACION DE VARIABLE HORAS NORMALES
        int horasExtra; // DECLARACION DE VARIABLE HORAS EXTRA
        double pagoNormal; // DECLARACION DE VARIABLE PAGO NORMAL
        double pagoExtra; // DECLARACION DE VARIABLE PAGO EXTRA
        double salarioTotal; // DECLARACION DE VARIABLE SALARIO TOTAL
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS
        System.out.print("Ingrese el nombre del empleado: "); // SOLICITAR NOMBRE
        nombre = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas: "); // SOLICITAR HORAS TRABAJADAS
        horasTrabajadas = scanner.nextInt(); // OBTENER HORAS TRABAJADAS
        System.out.print("Ingrese el pago por hora: $"); // SOLICITAR PAGO POR HORA
        pagoPorHora = scanner.nextDouble(); // OBTENER PAGO POR HORA
        if (horasTrabajadas <= HORAS_LIMITE) { // INICIO IF; SI TRABAJO 40 HORAS O MENOS ENTONCES....
            horasNormales = horasTrabajadas; // ASIGNAR HORAS NORMALES
            horasExtra = 0; // ASIGNAR 0 HORAS EXTRA
            pagoNormal = horasNormales * pagoPorHora; // OPERACION PAGO NORMAL
            pagoExtra = 0.0; // PAGO EXTRA ES CERO
            salarioTotal = pagoNormal; // OPERACION SALARIO TOTAL
        } // FIN IF
        else { // INICIO ELSE; SI TRABAJO MAS DE 40 HORAS ENTONCES....
            horasNormales = HORAS_LIMITE; // ASIGNAR MAXIMO DE HORAS NORMALES
            horasExtra = horasTrabajadas - HORAS_LIMITE; // CALCULAR HORAS EXTRA
            pagoNormal = horasNormales * pagoPorHora; // OPERACION PAGO NORMAL
            pagoExtra = horasExtra * (pagoPorHora * MULTIPLICADOR_EXTRA); // OPERACION PAGO EXTRA AL DOBLE
            salarioTotal = pagoNormal + pagoExtra; // OPERACION SALARIO TOTAL
        } // FIN ELSE
        System.out.println("\n Resumen de Nomina "); // IMPRIMIR ENCABEZADO
        System.out.println("\n Nombre: " + nombre); // MOSTRAR NOMBRE
        System.out.println("Horas trabajadas: " + horasTrabajadas); // MOSTRAR HORAS TRABAJADAS
        System.out.println("Horas normales: " + horasNormales); // MOSTRAR HORAS NORMALES
        System.out.println("Horas extra: " + horasExtra); // MOSTRAR HORAS EXTRA
        System.out.println("Pago normal: $" + pagoNormal); // MOSTRAR PAGO NORMAL
        System.out.println("Pago por horas extra: $" + pagoExtra); // MOSTRAR PAGO EXTRA
        System.out.println("Salario total: $" + salarioTotal); // MOSTRAR SALARIO TOTAL
    }
} // FIN CLASE