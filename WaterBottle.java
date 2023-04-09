/**
 * The waterbottle class that extends product
 */
public class WaterBottle extends Product
{
    //The capacity of the water bottle
    private int _capacity;

    /**
     *
     * @param id
     * @param desc
     * @param price
     * @param capacity
     */
    public WaterBottle(String id, String desc, double price, int capacity)
    {
        super(id, desc, price);
        _capacity = capacity;
    }

    /**
     *
     * @return the capacity
     */
    public int getCapacity()
    {
        return _capacity;
    }

    /**
     *
     * @return the water bottle stats
     */
    public String toString()
    {
        String bottleStats = super.toString() + " " + _capacity + "oz";
        return bottleStats;
    }
}
