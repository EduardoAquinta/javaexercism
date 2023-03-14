public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minsInOven){
        return expectedMinutesInOven() - minsInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int amountOfLayers){
        return amountOfLayers * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes( int amountOfLayers, int minsInOven){
        return preparationTimeInMinutes(amountOfLayers) + minsInOven;
    }
}
