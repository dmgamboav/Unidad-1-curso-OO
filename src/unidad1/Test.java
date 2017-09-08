package unidad1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		
		Airplane plane = new Airplane();
		plane.setSpeed(2);
		test.printSpeed(plane);
		
		Jet jet = new Jet();
		jet.setSpeed(2);
		test.printSpeed(jet);
	}
	
	private void printSpeed(Airplane airplane) {
		System.out.println(airplane.getName() + " speed = " + airplane.getSpeed());
	}

}
