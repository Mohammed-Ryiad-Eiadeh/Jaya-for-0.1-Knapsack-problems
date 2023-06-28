package discretion;

import java.util.function.DoubleUnaryOperator;

import static org.apache.commons.math3.special.Erf.erf;

/**
 * enumeration contains four V-Transfer functions
 * */

public enum TFUN implements DoubleUnaryOperator {
    VTF1, VTF2, VTF3, VTF4;

    /**
     * This method is used to covert continuous a certain value to binary one
     * @param operand refers to the given continuous value
     * @return The result as binary value
     */
    @Override
    public double applyAsDouble(double operand) {
            return switch (this) {
                case VTF1 -> Math.abs(erf(Math.sqrt(Math.PI) / 2 * operand)) >= 0.5 ? 1 : 0;
                case VTF2 -> Math.abs(Math.tanh(operand)) >= 0.5 ? 1 : 0;
                case VTF3 -> Math.abs(operand / (Math.sqrt(1 + Math.pow(operand, 2)))) >= 0.5 ? 1 : 0;
                case VTF4 -> Math.abs((2 / Math.PI) * Math.atan((Math.PI / 2) * operand)) >= 0.5 ? 1 : 0;
            };
    }
}
