package ge.edu.btu.calculator.service;

public interface CalculatorService {

    default void sum(int x, int y){
        int summ = x + y;
    }
    default void sum(double x, double y){
        double summ = x+y;
    }
    default void divide(int x, int y){
        try{
            int  answer = x/y;
        } catch (Throwable exc){
            System.out.println("cant divide on zero");
        };
    }
    default void divide(double x, double y){
        try{
            double  answer = x/y;
        } catch (Throwable exc){
            System.out.println("cant divide on zero");
        };
    }
}
