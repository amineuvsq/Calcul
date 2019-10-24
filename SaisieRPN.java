import java.util.Scanner;
/**
 * Write a description of class SaisieRPN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaisieRPN
{
    protected Scanner scan;
    protected String expression;
    
    public SaisieRPN() {
        this.scan = new Scanner(System.in);
        this.expression = new String();
    }
    public void ajoutOperande(MoteurRPN m) {
        m.ajouterOperande(this.scan.nextDouble());
    }
    public void operation(MoteurRPN m) {
        switch(this.expression.charAt(0)) {
         case '+' :    m.operation(Operation.PLUS); break;
         case '-' :    m.operation(Operation.MINUS); break;
         case '*' :     m.operation(Operation.TIMES); break;
         case '/' :     m.operation(Operation.DIVIDE); break;
         default : throw new IllegalArgumentException();
        }
    }   
    public String getLine() {
        expression = this.scan.next();
        return expression;
    }
}
