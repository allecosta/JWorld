package edu.tutorialspoint.basic.comments;

public class Program {

    /**
     * @param dividend
     * @param divisor
     * @return result
     * @throws IllegalArgumentException
     */
    public double divide(int dividend, int divisor) throws IllegalArgumentException {
        if ((dividend == 0) || (divisor == 0)) {
            throw new IllegalArgumentException("OPS! Não se pode dividir por 0.");
        } 

        double result = dividend / divisor;
        
        return result; 
    }

    public static void main(String[] args) {
        Program program = new Program();
        double result = program.divide(25, 5);

        System.out.println(result);
    }
}
