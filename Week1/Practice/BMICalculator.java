public class BMICalculator {

static String getBmiStatus(double bmi) {
    if (bmi < 18.5) {
        return "Underweight";
    } else if (bmi < 25) {
        return "Normal";
    } else if (bmi < 30) {
        return "Overweight";
    } else {
        return "Obese";
    }
}

static void printWellnessReport(double[] heights, double[] weights) {
    if (heights.length != weights.length) {
        System.out.println("Invalid input arrays.");
        return;
    }

    System.out.printf("%-10s %-15s %-15s %-10s %-15s%n",
            "Person", "Height (m)", "Weight (kg)", "BMI", "Status");

    for (int i = 0; i < heights.length; i++) {
        if (heights[i] <= 0 || weights[i] < 0) {
            System.out.println("Invalid data for Person " + (i + 1));
            continue;
        }

        double bmi = weights[i] / (heights[i] * heights[i]);

        System.out.printf("%-10d %-15.2f %-15.2f %-10.2f %-15s%n",
                i + 1, heights[i], weights[i],
                bmi, getBmiStatus(bmi));
    }
}

public static void main(String[] args) {
    double[] heights = {
        1.75, 1.60, 1.68, 1.80, 1.55,
        1.72, 1.65, 1.78, 1.70, 1.62
    };

    double[] weights = {
        70, 90, 60, 85, 45,
        75, 68, 95, 55, 80
    };

    printWellnessReport(heights, weights);
}


}
