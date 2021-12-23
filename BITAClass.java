class BITAClass
{
    public void displayMessage()
    {
        System.out.println("Hello Message");
    }
    public int calculateSum(int n1,int n2)
    {
        return n1+n2;
    }

    //constructor
    public BITAClass()
    {
        
    }

    public static void main(String [] args)
    {
        BITAClass bit = new BITAClass();
        bit.displayMessage();
        System.out.println(bit.calculateSum(40, 20));
    }

}