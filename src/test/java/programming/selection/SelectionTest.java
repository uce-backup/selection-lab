package programming.selection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas visibles del laboratorio. No las modifiques: el docente califica con estas y con otras
 * pruebas adicionales. Los reales se comparan con una tolerancia de 0.01.
 */
class SelectionTest {

    private static final double DELTA = 0.01;

    // Parte A

    @Test
    @DisplayName("A1. 8 aprueba y 5 reprueba")
    void passOrFailTypical() {
        assertEquals("Aprobado", Selection.passOrFail(8));
        assertEquals("Reprobado", Selection.passOrFail(5));
    }

    @Test
    @DisplayName("A2. El mayor de 3, 9 y 4 es 9")
    void maxOfThreeTypical() {
        assertEquals(9, Selection.maxOfThree(3, 9, 4));
    }

    @Test
    @DisplayName("A3. 5 es positivo y -2 negativo")
    void signTypical() {
        assertEquals("positivo", Selection.sign(5));
        assertEquals("negativo", Selection.sign(-2));
    }

    @Test
    @DisplayName("A4. El valor absoluto de -3.5 es 3.5")
    void absoluteNegative() {
        assertEquals(3.5, Selection.absolute(-3.5), DELTA);
    }

    // Parte B

    @Test
    @DisplayName("B1. 9.5 es A, 8.2 es B y 3 es F")
    void letterGradeTypical() {
        assertEquals('A', Selection.letterGrade(9.5));
        assertEquals('B', Selection.letterGrade(8.2));
        assertEquals('F', Selection.letterGrade(3));
    }

    @Test
    @DisplayName("B2. 1 es Lunes y 7 es Domingo")
    void dayNameTypical() {
        assertEquals("Lunes", Selection.dayName(1));
        assertEquals("Domingo", Selection.dayName(7));
    }

    @Test
    @DisplayName("B3. Abril tiene 30 días y enero 31")
    void daysInMonthTypical() {
        assertEquals(30, Selection.daysInMonth(4, 2026));
        assertEquals(31, Selection.daysInMonth(1, 2026));
    }

    @Test
    @DisplayName("B4. 0.8 kg normal cuesta 3.00 y 2.3 kg normal 5.40")
    void shippingCostTypical() {
        assertEquals(3.00, Selection.shippingCost(0.8, false), DELTA);
        assertEquals(5.40, Selection.shippingCost(2.3, false), DELTA);
    }

    @Test
    @DisplayName("B5. Un IMC de 22.9 es Normal")
    void bmiCategoryTypical() {
        assertEquals("Normal", Selection.bmiCategory(22.9));
    }

    // Parte C

    @Test
    @DisplayName("C1. 3, 3, 3 es Equilátero y 3, 4, 5 Escaleno")
    void triangleTypeTypical() {
        assertEquals("Equilátero", Selection.triangleType(3, 3, 3));
        assertEquals("Escaleno", Selection.triangleType(3, 4, 5));
    }

    @Test
    @DisplayName("C2. 150 kWh pagan 16.00")
    void electricityBillTypical() {
        assertEquals(16.00, Selection.electricityBill(150), DELTA);
    }

    @Test
    @DisplayName("C3. (2, 3) está en el cuadrante I y (-2, -3) en el III")
    void quadrantTypical() {
        assertEquals("I", Selection.quadrant(2, 3));
        assertEquals("III", Selection.quadrant(-2, -3));
    }
}
