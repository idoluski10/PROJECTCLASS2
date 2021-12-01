import java.util.Scanner;
public class excrrise3
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a phone number");
        String number=scanner.nextLine();
        System.out.println(checkIfNumberIsInTheFormat(number));
    }
    public static char[] checkIfNumberIsInTheFormat (String receivedString)
    {
        char[] emptyString={};
        char[] fixedNumber=new char[11];
        String numbersAndMinusMark="0123456789-";
        fixedNumber[3]=numbersAndMinusMark.charAt(10);
        fixedNumber[0]=numbersAndMinusMark.charAt(0);
        fixedNumber[1]=numbersAndMinusMark.charAt(5);
        if (receivedString.length()<10 || receivedString.length()>12)
        {
            return emptyString;
        }
        for (int i=0; i<receivedString.length(); i++)
        {
            for (int j = 0; j <= numbersAndMinusMark.length(); j++)
            {
                if (receivedString.charAt(i)== numbersAndMinusMark.charAt(j))
                {
                    break;
                }
                if (j == 10)   // if we reached this line j==10 it means that there is no number or a minus mark so the user typed an illegal char inside the string.
                {
                    return emptyString;
                }
            }
        }
        if (receivedString.length()==10 || receivedString.length()==11)
        {
            if (receivedString.charAt(0)!= numbersAndMinusMark.charAt(0)|| receivedString.charAt(1)!=numbersAndMinusMark.charAt(5))
            {
                return emptyString;
            }
            if (receivedString.length()==11 && receivedString.charAt(3)==numbersAndMinusMark.charAt(10))
            {
                for (int i=0;i<fixedNumber.length;i++)
                {
                    fixedNumber[i]=receivedString.charAt(i);
                }
                return fixedNumber;
            }
            if (receivedString.length() == 10)
            {
                for (int i=2;i<fixedNumber.length-8;i++)
                {
                    fixedNumber[i]=receivedString.charAt(i);
                }
                for (int i=3;i<fixedNumber.length-1;i++)
                {
                    fixedNumber[i+1]=receivedString.charAt(i);
                }
                return fixedNumber;
            }
        }
        if (receivedString.length()==12)
        {
            if (receivedString.charAt(0)!=numbersAndMinusMark.charAt(9) || receivedString.charAt(1)!=numbersAndMinusMark.charAt(7) || receivedString.charAt(2)!=numbersAndMinusMark.charAt(2) )
            {
                return emptyString;
            }
            if (receivedString.charAt(3) !=numbersAndMinusMark.charAt(5))
            {
                return emptyString;
            }
            for (int i=4;i<fixedNumber.length-6;i++)
            {
                fixedNumber[i-2]=receivedString.charAt(i);
            }
            for (int i=4;i<fixedNumber.length;i++)
            {
                fixedNumber[i]=receivedString.charAt(i+1);
            }
            return fixedNumber;
        }
        return emptyString;
    }
}