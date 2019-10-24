
/**
 * Enumeration class Operation - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Operation
{
   // PLUS, MINUS, TIMES, DIVIDE;        
    
    /*double eval(double x, double y) {
        switch(this) {
         case PLUS      :   return x + y;
         case MINUS     :   return x - y;
         case TIMES     :   return x * y;
         case DIVIDE    :   if (y == 0) throw new IllegalArgumentException(); return x / y; 
        }  
        throw new AssertionError("Unknown op : " + this);
    }*/
	
	PLUS
	{
		@Override
		public double eval(double a, double b)
		{
			return a+b;
		}
	},
	
	MINUS
	{
		
		@Override
		public double eval(double a, double b)
		{
			return a-b;
		}
	},
	
	TIMES
	{
		@Override
		public double eval(double a, double b)
		{
			return a*b;
		}
	},
	
	DIVIDE 
	{
		@Override
		public double eval(double a, double b)
		{
			if (b == 0) throw new IllegalArgumentException();
			return a/b;
		}
	};
	public abstract double eval(double a, double b);
	
	
}
