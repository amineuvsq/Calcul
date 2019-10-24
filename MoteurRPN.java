import java.util.Stack;
/**
 * Write a description of class MoteurRPN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoteurRPN
{
    protected Stack<Double>operandes;
    
    public MoteurRPN () {
        this.operandes = new Stack<Double>();
    }
    public void ajouterOperande( double op) {
        this.operandes.push(op);
    }
    public void operation(Operation o) {
        double y = this.operandes.peek();
        this.operandes.pop();
        double x = this.operandes.peek();
        this.operandes.pop();
        double res = o.eval(x,y);
        this.operandes.push(res);
    }
    public String afficherOperandes() {
        return this.operandes.toString();
    }
    public double RetournerSommet() {return this.operandes.peek();}
}
