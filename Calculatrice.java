
public class Calculatrice {

	public static void main(String[] args) {
		
		/**
		 * Write a description of class Calculatrice here.
		 *
		 * @author (your name)
		 * @version (a version number or a date)
		 */
		
		        SaisieRPN saisie = new SaisieRPN();
		        double operande;
		        boolean isDouble;
		        MoteurRPN moteur = new MoteurRPN();
		        while (true) {
		            System.out.printf("%s\n", moteur.afficherOperandes());
		            saisie.getLine();
		            if (saisie.expression.contentEquals("exit"))
		                System.exit(0);
		            isDouble = true;
		            try {
		                Double op = Double.parseDouble(saisie.expression);
		            } catch (NumberFormatException e) {
		                isDouble = false;
		            }
		            if (isDouble) {
		                operande = Double.parseDouble(saisie.expression);
		                moteur.ajouterOperande(operande);
		            }
		            else {
		                saisie.operation(moteur);  
		            }
		            
		            //System.out.printf("%s\n", moteur.afficherOperandes());
		        }
		        
		       
	}
		    }

