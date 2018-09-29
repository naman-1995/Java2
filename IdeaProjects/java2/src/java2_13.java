class CustomException extends Exception
{
        CustomException(String message)
        {
        super(message);
        }
}

public class java2_13
{
    public static void main(String[] args) {
        try {
            throw new CustomException("Something went wrong");
        } catch (CustomException e)
        {
            e.printStackTrace();
        }
    }

}
