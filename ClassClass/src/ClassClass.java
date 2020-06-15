public class ClassClass {
//static - only 1 for all objects. property of the class, doesn't belong to instance. cookie example - cookie cutter stays same diameter
//for Integer class the min value is ____ - it always stays that
//class with all static methods only provides functionality - wouldn't need to change it
	
	public static void main(String[] args) {
		
		Integer x=2;
		Integer y=7;
		
		//variable. asks one if taller than other
		int answer = x.compareTo(y);
		
		//static. third part guesses height
		int another = Integer.compare(x, y);
		
		Person jack = new Person("Captain","Jack");
		
		
		StringList l1 = new StringList();
		l1.add("apple");
		l1.add("pear");
		
		
		for(int i =0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		
	}

}
