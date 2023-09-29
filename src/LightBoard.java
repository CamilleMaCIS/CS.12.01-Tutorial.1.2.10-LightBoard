public class LightBoard {
    //property
    private boolean[][] lights;

    //constructor
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < lights.length; i++){
            for (int j = 0; j < lights[i].length; j++){
                int random = (int)(Math.random() * 5);
                //random integers 0, 1, 2, 3, 4
                //if picked 0 or 1, that is 40% possibility
                if (random < 2){
                    lights[i][j] = true;
                }
                else{
                    lights[i][j] = false;
                }
            }
        }
    }

    //methods
    public boolean evaluateLight(int row, int col)
    {
        //the method evaluates a light at row "row" and column "col"

        //boolean status is the light’s current status
        // True = on  False = off
        boolean status = lights[row][col];
        //int count is the number of turned-on lights in column "col"
        int count = 0;
        //iterating through lights.length means iterating through the column
        for (int i = 0; i < lights.length; i++){
            //if light at row i and column provided by parameter is true, a.k.a. is turned on
            if (lights[i][col]){
                count++;
            }
        }

        //If the light is on, return false if the number of lights in its column that are on is even, including the current light
        if (status && (count % 2 == 0)){
            return false;
        }
        //If the light is off, return true if the number of lights in its column that are on is divisible by three
        if (!(status) && (count % 3 == 0)){
            return true;
        }
        return status;
    }

    //getter and setter
    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }

    //used in testing in my own Main.java class, to test if the constructor worked
    public void print(){
        for (boolean[] r : lights){
            for (boolean c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
