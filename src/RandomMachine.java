public class RandomMachine {
    private int numberOfDigit;
    int numberOfStartIndex;
    int numberOfStopIndex;
    private int result;
    int squareSeed;


    public RandomMachine(int numberOfDigit) {
        this.numberOfDigit=numberOfDigit;
    }

    public int go(int seed){
        squareSeed=seed*seed;
        result=squareSeed;
        startPeriod();
        stopPeriod();
        result=reduce(squareSeed);
        return result;
    }

    private int reduce(int squareSeed){
        int reducedNumber;
        StringBuilder numberToString=new StringBuilder();
        StringBuilder newNemberToString = new StringBuilder();
        numberToString.append(squareSeed);
        for (int i=numberOfStartIndex;i<numberOfStopIndex;i++){
            newNemberToString.append(numberToString.charAt(i));
        }
        reducedNumber=Integer.parseInt(newNemberToString.toString());
        return reducedNumber;
    }

    private void startPeriod(){
        int subtrahend=numberOfDigit/2;
        numberOfStartIndex=5-subtrahend;
    }

    private void stopPeriod(){
        int element=numberOfDigit/2;
        numberOfStopIndex=5+element;
    }
}
