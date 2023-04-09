/**
 * InventoryLineItem class implements Comparable
 */
public class InventoryLineItem implements Comparable<InventoryLineItem>
{
    //The number of items in your inventory
    private static long _lineItemCount = 0;

    //The item number
    private long _lineItemNumber;

    //The product type
    private Product _product;

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
        _lineItemNumber = _lineItemCount;
        _product = product;
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
        return _lineItemNumber;
    }

    /**
     *
     * @return the product name
     */
    public Product getProduct()
    {
        return _product;
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
     * @return the total price
     */
    public double calcSubtotal()
    {
        double discountRate = calcDiscountRate();
        double price = _product.getPrice();
        double discountedPrice = price * (1 - discountRate);
        return _quantity * discountedPrice;
    }

    /**
     *
     * @param other This is compared to the current line item
     * @return an integer that determines which one is greater
     */
    public int compareTo(InventoryLineItem other)
    {
        double subtotal = calcSubtotal();
        double otherSubtotal = other.calcSubtotal();
        return (int) (subtotal - otherSubtotal);
    }

    /**
     *
     * @return a string that lists all the line items
     */
    public String toString()
    {
        String lineItemStats = String.format("Line item %d: %s, Quantity: %d, Subtotal: %f.2",
                _lineItemNumber, _product.getDescription(), _quantity, calcSubtotal());
        return lineItemStats;
    }
}