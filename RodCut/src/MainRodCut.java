
public class MainRodCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		
		Rod r = new Rod(10);
		double revenue = r.RecursiveCutRod(prices, 10);
		System.out.println("Revenue: " + revenue);
		
		Rod r2 = new Rod(10);
		double revenue2 = r2.MemoizedCutRod(prices, 4);
		System.out.println("Revenue: " + revenue2);
		
		Rod r3 = new Rod(10);
		double revenue3 = r3.BottomUpCutRod(prices, 10);
		System.out.println("Revenue: " + revenue3);
	}

}
