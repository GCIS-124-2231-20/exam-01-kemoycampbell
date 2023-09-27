package summation;
public class StringParser extends Parser
{
    private String intString;

    public StringParser(String intString)
    {
        this.intString = intString;
    }

    @Override
    public int[] getInts()
    {
        int[] ints = new int[1000];
        for(int i = 0; i < this.intString.length(); i++)
        {
            try{
                ints[i] = Integer.parseInt(this.intString.charAt(i) + "");
            }catch(Exception e)
            {
                continue;
            }
            
        }

        return ints;
    }




}