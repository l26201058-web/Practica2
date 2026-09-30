import java.util.Scanner; // LIBRERIA PARA EL SCANNER
/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJERCICIO: SENTENCIA IF - COMPRA DE PRODUCTOS
 * JOSÉ LUIS DÍAZ CERÓN, GADIEL RAMÓN ALVAREZ ROFRIGUEZ
 * 30-09-2026
 */
public class Compra_productos { // INICIO CLASE
    public static void main(String[] args) {
        final double MINIMO_DESCUENTO = 1000.0; // CONSTANTE MONTO MINIMO PARA DESCUENTO
        final double PORCENTAJE_DESCUENTO = 0.10; // CONSTANTE PORCENTAJE DE DESCUENTO 10%
        final double COSTO_ENVIO = 80.0; // CONSTANTE COSTO FIJO DE ENVIO
        final double MINIMO_ENVIO_GRATIS = 1500.0; // CONSTANTE MONTO MINIMO PARA ENVIO GRATIS
        double precioProducto; // DECLARACION DE VARIABLE PRECIO PRODUCTO
        int cantidad; // DECLARACION DE VARIABLE CANTIDAD
        double subtotal; // DECLARACION DE VARIABLE SUBTOTAL
        double descuento; // DECLARACION DE VARIABLE DESCUENTO
        double totalConDescuento; // DECLARACION DE VARIABLE TOTAL CON DESCUENTO
        double envio; // DECLARACION DE VARIABLE ENVIO
        double totalFinal; // DECLARACION DE VARIABLE TOTAL FINAL
        Scanner scanner = new Scanner(System.in); // SCANNER PARA OBTENER DATOS
        System.out.print("Ingrese el precio del producto: $"); // SOLICITAR PRECIO
        precioProducto = scanner.nextDouble(); // OBTENER PRECIO
        System.out.print("Ingrese la cantidad de unidades: "); // SOLICITAR CANTIDAD
        cantidad = scanner.nextInt(); // OBTENER CANTIDAD

        subtotal = precioProducto * cantidad; // OPERACION DEL SUBTOTAL

        if (subtotal >= MINIMO_DESCUENTO) { // INICIO IF; SI SUBTOTAL ES >= A 1000 ENTONCES....
            descuento = subtotal * PORCENTAJE_DESCUENTO; // CALCULAR DESCUENTO DEL 10%
        } // FIN IF
        else { // INICIO ELSE; SI ES MENOR A 1000 ENTONCES....
            descuento = 0.0; // SIN DESCUENTO
        } // FIN ELSE

        totalConDescuento = subtotal - descuento; // OPERACION TOTAL CON DESCUENTO

        if (totalConDescuento >= MINIMO_ENVIO_GRATIS) { // INICIO IF; SI TOTAL CON DESCUENTO ES >= A 1500 ENTONCES....
            envio = 0.0; // ENVIO GRATUITO
        } // FIN IF
        else { // INICIO ELSE; SI ES MENOR A 1500 ENTONCES....
            envio = COSTO_ENVIO; // COBRAR COSTO FIJO DE ENVIO
        } // FIN ELSE

        totalFinal = totalConDescuento + envio; // OPERACION TOTAL FINAL

        System.out.println("\n Ticket de Compra "); // IMPRIMIR ENCABEZADO
        System.out.println("Subtotal: $" + subtotal); // MOSTRAR SUBTOTAL
        System.out.println("Descuento: $" + descuento); // MOSTRAR DESCUENTO
        System.out.println("Total con descuento: $" + totalConDescuento); // MOSTRAR TOTAL CON DESCUENTO
        System.out.println("Envío: $" + envio); // MOSTRAR COSTO DE ENVIO
        System.out.println("Total final: $" + totalFinal); // MOSTRAR TOTAL FINAL
    }
} // FIN CLASE