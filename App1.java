public class App1 {
    
    public static int [] grades = new int[5];

    public static int studentGrade(int id) {
        return grades[id];
    }

    public static int highestGrade() {
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int lowestGrade() {
        int min = 100;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static int rank(int id) {
        int rank = 1;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > grades[id]) {
                rank++;
            }
        }
        return rank;
    }

    public static void findRank(int rank){
        for (int i = 0; i < grades.length; i++) {
            if (rank(grades[i]) == rank) {
                System.out.println("Student " + i + " has rank " + rank);
            }
        }
    }

    public static int averageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum/grades.length;
    }

    public static void sortGrades() {
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades.length - 1; j++) {
                if (grades[j] > grades[j + 1]) {
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }
    }
}
