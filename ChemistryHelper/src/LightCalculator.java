import java.util.HashMap;
import java.util.Map;

public class LightCalculator {

	private static Map<Character, Double> metricConverter;
	
	private final static double PLANK_CONSTANT = 6.6027 * Math.pow(10, -12);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metricConverter = new HashMap<Character, Double>();
		// creates conversion table
		metricConverter.put(new Character('p'), Math.pow(10, -12));
		metricConverter.put(new Character('n'), Math.pow(10, -9));
		metricConverter.put(new Character('u'), Math.pow(10, -6));
		metricConverter.put(new Character('m'), Math.pow(10, -3));
		metricConverter.put(new Character('c'), Math.pow(10, -2));
		metricConverter.put(new Character('d'), Math.pow(10, -1));
		metricConverter.put(new Character('/'), Math.pow(10, 0));
		metricConverter.put(new Character('D'), Math.pow(10, 1));
		metricConverter.put(new Character('h'), Math.pow(10, 2));
		metricConverter.put(new Character('k'), Math.pow(10, 3));
		metricConverter.put(new Character('M'), Math.pow(10, 6));
		
		//System.out.println(convert(453.0, "km", "nm"));
	}

	private static double deBrogileWavelength(double mass, double velocity) {
		
		double lamnda = PLANK_CONSTANT / (mass * velocity);
		return lamnda;
	}
	
	// not finished yet
	private static double convert(double measurment, String originalUnit, String finalUnit){
		finalUnit.trim();
		originalUnit.trim();
		Character originalUnitPrefix = new Character(originalUnit.charAt(0));
		Character finalUnitPrefix = new Character(finalUnit.charAt(0));
		
		double inBase = measurment * (metricConverter.get(originalUnitPrefix));
		double finalResult = inBase * (1 / metricConverter.get(finalUnitPrefix));
		
		return finalResult;
	}
	
	/*
	private static double convertMass(double measurment, String originalUnit, String finalUnit) {
		finalUnit.trim();
		originalUnit.trim();
		Character originalUnitPrefix = new Character(originalUnit.charAt(0));
		Character finalUnitPrefix = new Character(finalUnit.charAt(0));
		
		double inBase = measurment * (metricConverter.get(originalUnitPrefix));
		double finalResult = 0;
		
		return finalResult;
	}
	*/
	
	private static void convertUnit(double n, String unit) {
		
	}
}
