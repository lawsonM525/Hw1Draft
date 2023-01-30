public class App2 {
    
    public static int[][] friendRelations = new int[10][];

    public static boolean isFriends(int id1, int id2) {
        return friendRelations[id1][id2] == 1;
    }

    public static int[] friends(int id){
        return friendRelations[id];
    }

    public static int mostFriends(){
        int max = 0;
        for (int i = 0; i < friendRelations.length; i++) {
            if (friendRelations[i].length > max) {
                max = friendRelations[i].length;
            }
        }
        return max;
    }

    public static boolean noFriends(){
        for (int i = 0; i < friendRelations.length; i++) {
            if (friendRelations[i].length == 0) {
                return true;
            }
        }
        return false;
    }

    public static void pairing(){
        for (int i = 0; i < friendRelations.length; i++) {
            for (int j = 0; j < friendRelations[i].length; j++) {
                if (friendRelations[i][j] == 1) {
                    System.out.println("Student " + i + " is friends with " + j);
                }
            }
        }
    }


}
