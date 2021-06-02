
class Monster{
	private String name;
	
	public Monster(String n) {
		name = n;
	}
	public String attack() {
	      return "nothing";
	}
}
class FireMonster extends Monster{
	
	public FireMonster(String name) {
		super(name);
	}
	public String attack() {
	      return "Monster is attacking with fire";}
}
class WaterMonster extends Monster{
	public WaterMonster(String name) {
		super(name);
	}
	 public String attack() {
	      return "Monster attacking with water!";
	   }
}

class StoneMonster extends Monster{
	public StoneMonster(String name) {
		super(name);
	}
	public String attack() {
	      return "Monster attacking with stones!";
	   }
	
}

public class Q2 {

	public static void main(String[] args) {
		  Monster obj1 = new FireMonster("Ramus");  
	      Monster obj2 = new WaterMonster("Cesaro");  
	      Monster obj3 = new StoneMonster("Badmus"); 

	      System.out.println(obj1.attack());
	      System.out.println(obj2.attack());
	      System.out.println(obj3.attack());

	}

}
