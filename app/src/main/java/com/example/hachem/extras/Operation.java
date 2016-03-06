package com.example.hachem.extras;

/**
 * Created by Hachem on 07/02/2016.
 */
public class Operation
{
    float a;
    float b;
    char op;

    public static float addition(float a,float b)
    {
        return a+b;
    }
    public static float multiplication(float a,float b)
    {
        return a*b;
    }
    public static float soustraction(float a,float b)
    {
        return a-b;
    }
    public static float div(float a,float b)
    {
        return a/b;
    }
    public static float mod(int a,int b)
    {
        return a%b;
    }
    public static boolean verifEntier(String ch)
    {
        for(int i=0;i<ch.length();i++)
        {
            if(ch.charAt(i)<'0'||ch.charAt(i)>'9')
            {
                return false;
            }

        }
        return true;
    }
    public static boolean verifFloat(String ch)
    {int nb=0;
        for(int i=0;i<ch.length();i++)
        {
            if((ch.charAt(i)<'0'||ch.charAt(i)>'9')&&ch.charAt(i)!='.')
            {
                if(ch.charAt(i)=='.')
                {
                    nb++;
                }
                    else
                {
                    return false;
                }

            }

        }
        if(nb<=1)
            return true;
        else
            return false;
    }
    public static int transfEntier(String ch)
    {
         return Integer.parseInt(ch);
    }
    public static float transfFloat(String ch)
    {
        return Float.parseFloat(ch);
    }

    public static String calculer(String ch1,String ch2,char op)
    {
        int a=0,b=0,r=0;
     float f1=0,f2=0,f3=0;
        if(Operation.verifEntier(ch1)&&Operation.verifEntier(ch2))
        {
           a=Operation.transfEntier(ch1);
            b=Operation.transfEntier(ch2);
            switch(op)
            {
                case '+':r=(int)Operation.addition((int)a,(int)b);break;
                    case '-':r=(int)Operation.soustraction((int) a, (int) b);break;
                        case '*':r=(int)Operation.multiplication((int) a, (int) b);break;
                            case '/':r=(int)Operation.div((int) a, (int) b);break;
                                case '%':r=(int)Operation.mod((int)a,(int)b);break;

            }
            return r+"";
        }
        else if (Operation.verifFloat(ch1)||Operation.verifFloat(ch2)||Operation.verifEntier(ch1)||Operation.verifEntier(ch2))
        {
            f1=Operation.transfFloat(ch1);
            f2=Operation.transfFloat(ch2);
            switch(op)
            {
                case '+':f3=Operation.addition(a,b);break;
                case '-':f3=Operation.soustraction(a,b);break;
                case '*':f3=Operation.multiplication(a,b);break;
                case '/':f3=Operation.div(a,b);break;
                case '%':f3=Operation.mod(a,b);break;

            }
            return f3+"";

        }
        return "";
    }
}
