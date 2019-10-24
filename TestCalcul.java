import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalcul {

	
   @Test
	void TestOperationPLUS()
	{
	   MoteurRPN m=new MoteurRPN();
	   m.ajouterOperande(2);
	   m.ajouterOperande(3);
	   m.operation(Operation.PLUS);
	   
	   assertEquals(m.RetournerSommet(),5);
	   
	   }
	
   @Test
	void TestOperationMOINS()
	{
		MoteurRPN m=new MoteurRPN();
		   m.ajouterOperande(2);
		   m.ajouterOperande(3);
		   m.operation(Operation.MINUS);
		   
		   assertEquals(m.RetournerSommet(),-1);
		
	}
 
   @Test
	void TestOperationMULT()
	{
		MoteurRPN m=new MoteurRPN();
		   m.ajouterOperande(2);
		   m.ajouterOperande(3);
		   m.operation(Operation.TIMES);
		   
		   assertEquals(m.RetournerSommet(),6);
		
	}
  @Test
  void TestDivisionInvalide()
  {
	  Assertions.assertThrows(IllegalArgumentException.class, () ->
			{
				MoteurRPN m=new MoteurRPN();
			
			   m.ajouterOperande(6);
			   m.ajouterOperande(0);
			   m.operation(Operation.DIVIDE);
			});
			   
			   //assertFalse(m.RetournerSommet(),2);
			
	}
}
   

