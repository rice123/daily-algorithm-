package chenQingwu;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: chenqw
 * Date: 14-7-9
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public class SortMoney {
    public static void main(String[] args) {
        //钱币整理，输入一个数字，使其输出对应的汉字大写
        Scanner s=new Scanner(System.in);
        String money=s.nextLine();
        try{
            Double.parseDouble(money);
        }
        catch(Exception e)
        {
            System.out.println("请输入正确的数字");
            return;
        }
        String [] money_arr;
        if(money.split("\\.").length<2)
        {
            money_arr=(money+".00").split("\\.");
        }
        else
            money_arr=money.split("\\.");
        if(money_arr[1].length()>2)
        {
             System.out.println("请输入不超过两位的小数");
            return;
        }
        StringBuilder Big=new StringBuilder();
        if(Long.parseLong(money_arr[0])==0)
        {
            if(Long.parseLong(money_arr[1])==0)
            {
                System.out.println("零元");
                return;
            }
        }
        for(int i=0;i<money_arr[1].length();i++)
        {
            if(money_arr[1].charAt(i)==0)
                continue;
            if(i==0)
            {
                if(Long.parseLong(String.valueOf(money_arr[1].charAt(0)))!=0)
                    Big.insert(0,(ConvertToBig(money_arr[1].charAt(0))+"角"));
            }
            else
            {
                if(Long.parseLong(String.valueOf(money_arr[1].charAt(1)))!=0)
                    Big.insert(Big.length(),(ConvertToBig(money_arr[1].charAt(1))+"分"));
            }
        }
            if(Integer.parseInt(money_arr[1])==0)
                Big.insert(0,"元整");
            else if(Long.parseLong(String.valueOf(money_arr[0]))!=0)
                Big.insert(0,"元");
            int length=money_arr[0].length();
        for(int i=0;i<=(length-1)/4;i++)
        {
            if(i!=(length-1)/4)
            {
            if(Integer.parseInt(money_arr[0].substring(length-4-(i*4),length-1-(i*4)))!=0)
            {
                Big.insert(0,Return(i));
            }
            }
            else
            {
                Big.insert(0,Return(i));
            }
            for(int j=0;j<4;j++)
            {
                   if(j!=0)
                   {
                       if(Long.parseLong(String.valueOf(money_arr[0].charAt(length-1-j-i*4)))==0)
                       {
                           if(Long.parseLong(String.valueOf(money_arr[0].charAt(length-j-i*4)))==0)
                               continue;
                           else
                               Big.insert(0,"零");
                       }
                       else
                       {
                           Big.insert(0,(ConvertToBig(money_arr[0].charAt(length-1-j-i*4))+ReturnWei(j)));
                       }
                   }
                else
                   {
                       if(Long.parseLong(String.valueOf(money_arr[0].charAt(length-1-j-i*4)))!=0)
                       {
                           Big.insert(0,(ConvertToBig(money_arr[0].charAt(length-1-j-i*4))+ReturnWei(j)));
                       }
                   }
                if(length-1==j+i*4)
                {
                    System.out.println(Big);
                    break;
                }
            }
        }

    }

    public static String ConvertToBig(char num)
    {
        switch(num)
        {
            case '0': return "零";
            case '1': return "壹";
            case '2': return "贰";
            case '3': return "叁";
            case '4': return "肆";
            case '5': return "伍";
            case '6': return "陆";
            case '7': return "柒";
            case '8': return "捌";
            case '9': return "玖";
            default: return "";
        }
    }

    public static String ReturnWei(int num)
    {
        switch(num)
        {
            case 1: return "十";
            case 2: return "佰";
            case 3: return "仟";
            default: return "";
        }
    }

    public static String Return(int num)
    {
        switch(num)
        {
            case 1: return "萬";
            case 2: return "亿";
            default: return "";
        }
    }
}
