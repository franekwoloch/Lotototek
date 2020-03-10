import seed.RandomSeedCreator;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello in Lotototek!");
        int result;
        RandomSeedCreator randomSeedCreator=new RandomSeedCreator();
        int numberOfDigit=3;
        int seed;
        seed=randomSeedCreator.createRandomSeed();
        System.out.println(seed);
        RandomMachine machine=new RandomMachine(numberOfDigit);
        result=machine.go(seed);
        System.out.println(result);
    }
}
