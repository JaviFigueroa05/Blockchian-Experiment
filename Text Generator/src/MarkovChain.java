import java.util.HashMap;
import java.util.Map;

public class MarkovChain {

	private Map<String, Integer> elementFrequency;
	private Double[][] transitionMatrix;
	
	public MarkovChain() {
		elementFrequency = new HashMap<String, Integer>();
	}
}
