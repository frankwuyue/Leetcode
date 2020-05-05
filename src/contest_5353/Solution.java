package contest_5353;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int numTimesAllBlue(int[] light) {
        int momentCount = 0;
        int[] allLights = new int[light.length];
        for (int i = 0; i < allLights.length; i++) {
            allLights[i] = 0;
        }

        int biggest = 0;
        for (int i = 0; i < light.length; i++) {
            if (biggest < (light[i] - 1)) {
                biggest = light[i] - 1;
            }
            allLights[light[i] - 1] = 1;
            boolean isAllOn = checkIsAllOn(allLights, biggest);
            if (isAllOn) {
                momentCount++;
            }
        }
        return momentCount;
    }

    private boolean checkIsAllOn(int[] allLights, int biggest) {
        boolean isAllOn = true;
        for (int i = biggest - 1; i >= 0; i--) {
            if (allLights[i] == 0) {
                isAllOn = false;
                break;
            }
        }
        return isAllOn;
    }
}


