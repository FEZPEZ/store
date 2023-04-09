/**
 * The flashdrive class, which extends product
 */
public class FlashDrive extends Product
{

    //Capacity of the flash drive
    private int _capacity;

    /**
     *
     * @param id
     * @param desc
     * @param price
     * @param capacity
     */
    public FlashDrive(String id, String desc, double price, int capacity)
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
     * @return the flash drive stats
     */
    public String toString()
    {
        String flashStats = super.toString() + " " + _capacity + "GB";
        return flashStats;
    }
}
