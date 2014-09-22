

/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author (rohitrastogi) 
 * @version (9/12/14)
 */
public class Car
{
    /** fuel efficiency of the car measured in miles per gallon (mpg)*/
    private double fuelEfficiency;
    /** amount of fuel in gas tank measured in gallons */
    private double fuelInTank;
    

    /**
     * Constructor that specifies the feul efficiency of this car.
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * the drive method reduces the fuel in the tank based on the
     * specified miles and the fuel efficiency of this car.
     *    
     *
     * @pre       this method is never invoked with a value for miles that consumes more 
     *            than the available gas in the tank.
     * @param     miles     number of miles driven.
     */
    public void drive(int miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;        
    }
    

    /**
     * Adds the specified amount of gas in gallons to this car's tank.
     *
     * @pre     the specified amount of gas doesn't exceed the capacity of this cars tank.
     * 
     * @param   gallons      number of gallons of gas to add to this car's tank.
     */
    public void addGas(int gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }
    

    /**
     * Returns the number of gallons of gas remaining in this car's tank.
     *
     * @return  number of gallons of gas remaining in this car's tank/
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }

}
