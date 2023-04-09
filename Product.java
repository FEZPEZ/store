/**
 * The abstract product class
 */
public abstract class Product implements Comparable<Product>
{
    //The id of the product
    private String _id;

    //The description of the product
    private String _desc;

    //The price of the product
    private double _price;

    /**
     *
     * @param id
     * @param desc
     * @param price
     */
    public Product(String id, String desc, double price)
    {
        _id = id;
        _desc = desc;
        _price = price;
    }

    /**
     *
     * @return the id
     */
    public String getID()
    {
        return _id;
    }

    /**
     *
     * @return the description
     */
    public String getDescription()
    {
        return _desc;
    }

    /**
     *
     * @return the price
     */
    public double getPrice()
    {
        return _price;
    }

    /**
     *
     * @param other compare this to the current item
     * @return
     */
    public int compareTo(Product other)
    {
        return (int) (this.getPrice() - other.getPrice());
    }

    /**
     *
     * @return the product specs
     */
    public String toString()
    {
        String productSpecs = _id + " " + _desc + " $" + _price;
        return productSpecs;
    }
}
