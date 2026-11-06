package programming.selection;

/**
 * Programa de consola que usa los métodos de Selection, con un menú hecho con switch.
 * Ya está completo: no lo modifiques. Ejecútalo cuando completes los métodos.
 */
public class SelectionApp {

    /**
     * Opciones del menú en el mismo orden que los case del switch: la opción n está en la posición n - 1.
     */
    private final String[] menuOptions = {
            "Nota en letras", "Día de la semana", "Días del mes",
            "Costo de envío", "Tipo de triángulo", "Planilla de luz"
    };

    void main() {
        printMenu();
        int option = Integer.parseInt(IO.readln("Opción: ").trim());

        switch (option) {
            case 1 -> {
                double grade = Double.parseDouble(IO.readln("Nota: ").trim());
                IO.println("Letra: " + Selection.letterGrade(grade));
            }
            case 2 -> {
                int day = Integer.parseInt(IO.readln("Día (1-7): ").trim());
                IO.println(Selection.dayName(day));
            }
            case 3 -> {
                int month = Integer.parseInt(IO.readln("Mes: ").trim());
                int year = Integer.parseInt(IO.readln("Año: ").trim());
                IO.println("Días: " + Selection.daysInMonth(month, year));
            }
            case 4 -> {
                double weightKg = Double.parseDouble(IO.readln("Peso (kg): ").trim());
                boolean urgent = Boolean.parseBoolean(IO.readln("¿Urgente? (true/false): ").trim());
                IO.println("Costo: %.2f".formatted(Selection.shippingCost(weightKg, urgent)));
            }
            case 5 -> {
                double sideA = Double.parseDouble(IO.readln("Lado A: ").trim());
                double sideB = Double.parseDouble(IO.readln("Lado B: ").trim());
                double sideC = Double.parseDouble(IO.readln("Lado C: ").trim());
                IO.println(Selection.triangleType(sideA, sideB, sideC));
            }
            case 6 -> {
                int kwh = Integer.parseInt(IO.readln("Consumo (kWh): ").trim());
                IO.println("Total: %.2f".formatted(Selection.electricityBill(kwh)));
            }
            default -> IO.println("Opción inválida");
        }
    }

    /**
     * Imprime cada opción del menú en su propia línea, precedida de su número.
     */
    private void printMenu() {
        for (int i = 0; i < menuOptions.length; i++) {
            int optionNumber = i + 1;
            IO.println(optionNumber + ". " + menuOptions[i]);
        }
    }
}
