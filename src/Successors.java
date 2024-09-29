public class Successors {
    public static Position findPosition(int number, int[][] twoDArray) {
        for (int i=0; i<twoDArray.length; i++) {
            for (int j=0; j<twoDArray[i].length; j++) {
                if (twoDArray[i][j]==number) {
                    return new Position(i,j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] twoDArray) {
        Position[][] positions = new Position[twoDArray.length][twoDArray[0].length];

        for (int i=0; i<twoDArray.length; i++) {
            for (int j=0; j<twoDArray[i].length; j++) {
                // finding and setting the position of successor number
                positions[i][j] = findPosition(twoDArray[i][j]+1, twoDArray);
            }
        }
        return positions;
    }
}
