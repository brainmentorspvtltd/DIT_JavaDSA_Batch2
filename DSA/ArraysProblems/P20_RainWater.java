package ArraysProblems;

public class P20_RainWater {
    public static void main(String[] args) {
        int pillars[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = pillars.length;
        if(n == 0) {
            System.out.println("No Pillars Exists...");
            return;
        }
        int pMax[] = new int[n];    // Prefix Max
        int sMax[] = new int[n];    // Suffix Max
        pMax[0] = pillars[0];   // storing 0th index element in prefix max
        sMax[n-1] = pillars[n-1];   // storing last index element in suffix max

        for(int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], pillars[i]);
        }

        for(int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i+1], pillars[i]);
        }

        int amountOfWater = 0;
        for(int i = 0; i < n; i++) {
            int currentPillar = pillars[i];
            int h1 = pMax[i];
            int h2 = sMax[i];
            int decidingHeight = Math.min(h1, h2);
            if(decidingHeight > currentPillar) {
                amountOfWater += decidingHeight - currentPillar;
            }
        }

        System.out.println("Amount of Water is : " + amountOfWater);



    }
}
