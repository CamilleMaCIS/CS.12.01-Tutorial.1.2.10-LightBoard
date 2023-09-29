public class Main {
    public static void main(String args[]){
        LightBoard lightBoard = new LightBoard(7,5);
        boolean[][] testBoard = new boolean[][] {
                {true, true, false, true, true},
                {true, false, false, true, false},
                {true, false, false, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, false, true, true},
                {false, false, false, false, false}
        };
        lightBoard.setLights(testBoard);
        //Testing the constructor
        lightBoard.print();
        System.out.println();
        //Test result: constructor works

        //Testing method evaluateLight
        for (int i = 0; i < testBoard.length; i++){
            for (int j = 0; j < testBoard[0].length; j++){
                System.out.print(lightBoard.evaluateLight(i,j) + " ");
            }
            System.out.println();
        }
        //Test result: evaluateLight works
    }
}
