package code;
public class CountWater {
    public int measureWater(int mapProfile [] )  {

        int[] potentialWater;
        potentialWater = new int[10];
        int currentMaxHeight = 0;
        int trappedWater = 0;

        for(int thiscolumnHeight: mapProfile)
            { int depth = 1;
                while(depth<=thiscolumnHeight)
                { trappedWater=trappedWater+potentialWater[depth];
                    potentialWater[depth]=0;
                    depth++;
                }
                if (thiscolumnHeight < currentMaxHeight) {
                    for (int depthAbove = thiscolumnHeight + 1; depthAbove <= currentMaxHeight; depthAbove++) {
                        potentialWater [depthAbove]++;
                    }
                }
                else {
                    currentMaxHeight = thiscolumnHeight;
                }
            }
        return trappedWater;
     }
}
