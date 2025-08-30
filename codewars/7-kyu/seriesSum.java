public class NthSeries {
	public static String seriesSum(int n) {
	float result = 0f;
        for (int i = 0; i < n; i++) {
            result += 1.0f / (1 + i * 3);  // Use 1.0f for float division
        }
        return String.format("%.2f", result); // Format directly as float
	
  }
}