
public class InsectDemo {

	public static void main(String[] args) {
		Grasshopper g = new Grasshopper();
		Beetle b = new Beetle(true);
		
		g.setLifeSpanDays(10);
		
		g.setJumpDist(12.370);
		
		b.setLifeSpanDays(12);
		
		b.setStink(3);
		
		System.out.println("The grasshopper can jump "+g.getJumpDist()+"cm.");
		System.out.println("She has a life span of "+g.getLifeSpan()+" days.");
		System.out.println("She has "+g.getNumLegs()+" legs.");
		System.out.println("The beetle has a life span of "+b.getLifeSpan()+"cm.");
		System.out.println("He has "+b.getNumLegs()+" legs.");
		System.out.println("Is he a big stinker? "+b.getIsABigStink());
	}

}
