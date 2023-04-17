/**
 * The book class, which extends product
 */
public class Book extends Product
{

    //The name of the author
    private String _author;

    //The name of the publisher
    private String _publisher;

    /**
     *
     * @param id
     * @param desc
     * @param price
     * @param author
     * @param publisher
     */
    public Book(String id, String desc, double price, String author, String publisher)
    {
        super(id, desc, price);
        _author = author;
        _publisher = publisher;
    }

    /**
     *
     * @return author name
     */
    public String getAuthor()
    {
        return _author;
    }

    /**
     *
     * @return publisher name
     */
    public String getPublisher()
    {
        return _publisher;
    }

    /**
     *
     * @return book stats
     */
    public String toString()
    {
        String bookStats = getID() + getDescription() + getPrice() + " " + _author + " " + _publisher;
        return bookStats;
    }
}
