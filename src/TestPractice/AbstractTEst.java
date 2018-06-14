package TestPractice;

  public class AbstractTEst 
{
	
		int k;
		int l;
	
		static AbstractTEst abs = null; 
	 	 
		 private AbstractTEst(int i, int j)
		 {
			 k=i;
			 l=j;
		 }
	 
		 static  public AbstractTEst getName()
		 {
			 if(abs==null)
			 {
				 abs = new AbstractTEst(10,20);
			 }
			 return abs;
		 }
	 
	 
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		AbstractTEst a = AbstractTEst.getName();
		System.out.println(a.l);
		System.out.println(a.k);
		
		AbstractTEst b = AbstractTEst.getName();
		System.out.println(b.l);
		System.out.println(b.k);

	}

}
 
