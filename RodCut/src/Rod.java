
public class Rod {

	double[] revenues;
	public Rod(int n)
	{
		this.revenues = new double[n+1];
	}
	
	public double RecursiveCutRod(int[] prices, int n)
	{
		if(n == 0)
		{
			return 0.0;
		}
		
		double q = -999999.99;
		for(int i = 1; i <= n; i++)
		{
			q = Math.max(q, prices[i-1] + RecursiveCutRod(prices, n-i));
		}
		return q;
	}
	
	public double MemoizedCutRodAux(int[] prices, int n)
	{
		double q = 0.0;
		if(this.revenues[n] > 0)
		{
			return revenues[n];
		}
		if(n==0)
		{
			q = 0.0;
		}
		else
		{
			q = -999999.99;
			for(int i = 1; i <= n; i++)
			{
				q = Math.max(q, prices[i-1] + MemoizedCutRodAux(prices,n-i));
			}
		}
		this.revenues[n] = q;
		return q;
	}
	
	public double MemoizedCutRod(int[] prices, int n)
	{
		double[] revenues = new double[n];
		for(int i = 0; i < n; i++)
		{
			revenues[i] = -999999.99;
		}
		return MemoizedCutRodAux(prices, n);
	}
	
	
}
