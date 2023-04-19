/**
 * InventoryLineItem class implements Comparable
 */
public class InventoryLineItem implements Comparable<InventoryLineItem>
{
    //The number of items in your inventory
    private static long _lineItemCount = 0;

    //The item number
    private final long _LINEITEMNUMBER;

    //The product type
    private final Product _PRODUCT;

    //The quantity of items
    private int _quantity;

    /**
     *
     * @param product
     * @param quantity
     */
    public InventoryLineItem(Product product, int quantity)
    {
        _lineItemCount++;
        _LINEITEMNUMBER = _lineItemCount;
        _PRODUCT = product;
        _quantity = quantity;
    }

    /**
     *
     * @param product
     */
    public InventoryLineItem(Product product)
    {
        this(product, 0);
    }

    /**
     *
     * @return the item number
     */
    public long getLineItemNumber()
    {
        return _LINEITEMNUMBER;
    }

    /**
     *
     * @return the product name
     */
    public Product getProduct()
    {
        return _PRODUCT;
    }

    /**
     *
     * @return the quantity
     */
    public int getQuantity()
    {
        return _quantity;
    }

    /**
     *
     * @return the discount rate
     */
    public double calcDiscountRate()
    {
        final double zeroRate = 0.0;
        final double twentyFiveRate = 0.25;
        final double twentyRate = 0.20;
        final double tenRate = 0.10;

        final int fiftyItems = 50;
        final int twentyFiveItems = 25;
        final int tenItems = 10;

        double discountRate = zeroRate;
        if (_quantity >= fiftyItems)
        {
            discountRate = twentyFiveRate;
        }
        else if (_quantity >= twentyFiveItems)
        {
            discountRate = twentyRate;
        }
        else if (_quantity >= tenItems)
        {
            discountRate = tenRate;
        }
        return discountRate;
    }

    /**
     *
     * @return the total price.
     */
    public double calcSubtotal()
    {
        //wow
        double discountRate = calcDiscountRate();
        double price = _PRODUCT.getPrice();
        double discountedPrice = price * (1 - discountRate);
        return _quantity * discountedPrice;
    }

    /**
     *
     * @param other This is compared to the current line item
     * @return an integer that determines which one is greater
     */
    @Override
    /**
     * fkjahdflkjadsflkjhasldkjfh
     */
    public int compareTo(InventoryLineItem other)
    {
        double subtotal = calcSubtotal();
        double otherSubtotal = other.calcSubtotal();
        int thingthing = 0;
        if (subtotal < otherSubtotal)
        {
            thingthing = -1;
        }
        else if (subtotal > otherSubtotal)
        {
            thingthing = 1;
        }
        else
        {
            thingthing = 0;
        }
        return thingthing;
    }

    /**
     *
     * @return a string that lists all the line items
     */
    public String toString()
    {
        String lineItemStats = String.format("Things: %d, Line item %d, Product: %s, Quantity: %d",
                _lineItemCount, getLineItemNumber(), getProduct(), getQuantity());

        return lineItemStats;
    }
}