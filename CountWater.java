package code;
public class CountWater {
    public int measureWater(int mapProfile [] )  {

        int[] potentialWater;
        potentialWater = new int[10]; // User to track squares that may contain water - each cell represents a horizontal level
        int currentMaxHeight = 0;
        int trappedWater = 0;
//
//  walk through each column - as you go keep track of the maximum column height and accumulating
//  what could be water or air up to that height
//
        for(int thiscolumnHeight: mapProfile)
            { if (thiscolumnHeight < currentMaxHeight) {
                    for (int depthAbove = thiscolumnHeight + 1; depthAbove <= currentMaxHeight; depthAbove++) {
                        potentialWater [depthAbove]++;
                    }
                }
                else {
                    currentMaxHeight = thiscolumnHeight;
                }
                int depth = 1;
                while(depth<=thiscolumnHeight)
                { trappedWater=trappedWater+potentialWater[depth];
                    potentialWater[depth]=0;
                    depth++;
                }
            }
        return trappedWater;
     }
}
