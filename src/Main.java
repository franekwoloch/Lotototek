import seed.RandomSeedCreator;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello in Lotototek!");
        String result;
        RandomSeedCreator randomSeedCreator=new RandomSeedCreator();
        int seed;
        seed=randomSeedCreator.createRandomSeed();
        System.out.println(seed);
        RandomMachine machine=new RandomMachine(seed);
        result=machine.go();
        System.out.println(result);
    }
}
