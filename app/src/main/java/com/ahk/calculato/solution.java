package com.ahk.calculato;

import java.util.ArrayList;

public class solution {


    public static double solve(ArrayList<Double> numbers,  ArrayList<Character>operand)
    {double result=numbers.get(0);
    for(int i=0;i<operand.size();i++)
    {
        if(operand.get(i).equals('+'))
        {
        result = result + numbers.get(i+1);
        }
        else if (operand.get(i).equals('-'))
        {
        result=result-numbers.get(i+1);
        }
        else if(operand.get(i).equals('*')){
            result=result*numbers.get(i+1);
        }
        else if(operand.get(i).equals('/')){


            result=result/numbers.get(i+1);

        }
    }

        return result;
    }
}
