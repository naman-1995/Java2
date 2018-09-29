import java.util.Scanner;

public class java2_2 {

    public static char[] strSort(String str)
    {
        char[] strToChar=str.toCharArray();

        int strToCharLength=strToChar.length;

        char temp=' ';

        for(int i=0;i<strToCharLength;i++)
        {
            for(int j=0;j<strToCharLength;j++)
            {
               if(strToChar[i]<strToChar[j])
               {
                   temp=strToChar[i];
                   strToChar[i]=strToChar[j];
                   strToChar[j]=temp;
               }
            }
        }
        return strToChar;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str =s.nextLine();
        char[] ans=strSort(str);

        for(int k=0;k<ans.length;k++)
        {
            System.out.print(ans[k]+" ");
        }
    }
}
