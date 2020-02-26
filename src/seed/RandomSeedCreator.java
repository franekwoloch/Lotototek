package seed;

import java.lang.*;


public class RandomSeedCreator {

int randomGrain;

public int createRandomSeed()throws InterruptedException{

        RandomDivider randomDivider=new RandomDivider();
        TimeGrain timeGrain=new TimeGrain();

        randomDivider.createDivider();
        System.out.println(randomDivider.getDivider());
        timeGrain.setGrain();
        System.out.println("Grain of time:"+timeGrain.getGrain());
        randomGrain=timeGrain.getGrain()/randomDivider.getDivider();
        System.out.println("Random grain: "+randomGrain);
        return randomGrain;
        }

}

