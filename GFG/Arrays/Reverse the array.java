class Reverse
{
    public static String reverseWord(String str)
    {
        StringBuilder s = new StringBuilder("");
       s.append(str);
       s.reverse();
       return s.toString();
    }
}