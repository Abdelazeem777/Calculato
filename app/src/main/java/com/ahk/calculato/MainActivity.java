package com.ahk.calculato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button bu0,buDot,buPlus,buEqual,bu1,bu2,bu3,buMinus,bu4,bu5,bu6,buMultiply,bu_one_div_x,bu7,bu8,bu9,buDivision,buPersent,buArrow,buCE,buC,bu_pos_or_Neg,buSQRT,buMC,buMR,buMS,buMplus,buMneg;
TextView txtResult;
String result="",on_screen="";
double res,memory;
boolean result_existed=false,just_opened=true;
ArrayList<Double> numbers;
ArrayList<Character>operand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers=new ArrayList<Double>();
        operand=new ArrayList<Character>();
        txtResult=(TextView)findViewById(R.id.textView) ;
        bu0=(Button)findViewById(R.id.bu0);
        bu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"0";
                on_screen=on_screen+"0";
                txtResult.setText(on_screen);
            }
        });
        bu1=(Button)findViewById(R.id.bu1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"1";
                on_screen=on_screen+"1";
                txtResult.setText(on_screen);
            }
        });
        bu2=(Button)findViewById(R.id.bu2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"2";
                on_screen=on_screen+"2";
                txtResult.setText(on_screen);
            }
        });
        bu3=(Button)findViewById(R.id.bu3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"3";
                on_screen=on_screen+"3";
                txtResult.setText(on_screen);
            }
        });
        bu4=(Button)findViewById(R.id.bu4);
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"4";
                on_screen=on_screen+"4";
                txtResult.setText(on_screen);
            }
        });
        bu5=(Button)findViewById(R.id.bu5);
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"5";
                on_screen=on_screen+"5";
                txtResult.setText(on_screen);
            }
        });
        bu6=(Button)findViewById(R.id.bu6);
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"6";
                on_screen=on_screen+"6";
                txtResult.setText(on_screen);
            }
        });
        bu7=(Button)findViewById(R.id.bu7);
        result_existed=false;
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"7";
                on_screen=on_screen+"7";
                txtResult.setText(on_screen);
            }
        });
        bu8=(Button)findViewById(R.id.bu8);
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"8";
                on_screen=on_screen+"8";
                txtResult.setText(on_screen);
            }
        });
        bu9=(Button)findViewById(R.id.bu9);
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+"9";
                on_screen=on_screen+"9";
                txtResult.setText(on_screen);
            }
        });
        buDot=(Button)findViewById(R.id.buDot);
        buDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                just_opened=false;
                result_existed=false;
                txtResult.setTextSize(35);
                result=result+".";
                on_screen=on_screen+".";
                txtResult.setText(on_screen);

            }
        });
        buPlus=(Button)findViewById(R.id.buPlus);
        buPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result_existed)
                {
                    txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                    just_opened=false;
                    result_existed=false;
                    txtResult.setTextSize(35);
                    numbers.add(Double.parseDouble(txtResult.getText().toString()));
                    operand.add('+');
                    on_screen=txtResult.getText().toString();
                    on_screen=on_screen+"+";
                    txtResult.setText(on_screen);
                }
                else {
                    numbers.add(Double.parseDouble(result));
                    operand.add('+');
                    on_screen = on_screen + "+";
                    txtResult.setText(on_screen);
                    result = "";
                }
            }
        });


        buMinus=(Button)findViewById(R.id.buMinus);
        buMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result_existed)
                {
                    txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                    just_opened=false;
                    result_existed=false;
                    txtResult.setTextSize(35);
                    numbers.add(Double.parseDouble(txtResult.getText().toString()));
                    operand.add('-');
                    on_screen=txtResult.getText().toString();
                    on_screen=on_screen+"-";
                    txtResult.setText(on_screen);
                }
                else {
                    numbers.add(Double.parseDouble(result));
                    operand.add('-');
                    on_screen = on_screen + "-";
                    txtResult.setText(on_screen);
                    result = "";
                }
            }
        });

        buMultiply=(Button)findViewById(R.id.buMultiply);
        buMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result_existed)
                {
                    txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                    just_opened=false;
                    result_existed=false;
                    txtResult.setTextSize(35);
                    numbers.add(Double.parseDouble(txtResult.getText().toString()));
                    operand.add('*');
                    on_screen=txtResult.getText().toString();
                    on_screen=on_screen+"×";
                    txtResult.setText(on_screen);
                }
                else {
                    numbers.add(Double.parseDouble(result));
                    operand.add('*');
                    on_screen = on_screen + "×";
                    txtResult.setText(on_screen);
                    result = "";
                }
            }
        });


        buDivision=(Button)findViewById(R.id.buDivision);
        buDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result_existed)
                {
                    txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                    just_opened=false;
                    result_existed=false;
                    txtResult.setTextSize(35);
                    numbers.add(Double.parseDouble(txtResult.getText().toString()));
                    operand.add('/');
                    on_screen=txtResult.getText().toString();
                    on_screen=on_screen+"/";
                    txtResult.setText(on_screen);
                }
                else {
                numbers.add(Double.parseDouble(result));
                operand.add('/');
                on_screen=on_screen+"÷";
                txtResult.setText(on_screen);
                result="";
                }
            }
        });


        buEqual=(Button)findViewById(R.id.buEqual);
        buEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(just_opened)
                {return;}
                if(result_existed)
                {return;}
                numbers.add(Double.parseDouble(result));
                if(operand.contains('/')) {
                    if (numbers.get(operand.indexOf('/') + 1)==0) {
                        Toast.makeText(MainActivity.this, "Error, Divide by Zero", Toast.LENGTH_SHORT).show();
                        numbers.remove(numbers.size()-1);
                        return;
                    }
                    else
                    {
                        txtResult.setTextSize(45);
                        txtResult.setGravity(Gravity.RIGHT |Gravity.BOTTOM);
                        res=solution.solve(numbers,operand);
                        if(res%1==0)
                        {
                            txtResult.setText(Integer.toString((int)res));
                        }
                        else {
                            txtResult.setText(Double.toString(res));
                        }
                        result="";
                        on_screen="";
                        numbers.clear();
                        operand.clear();
                        result_existed=true;
                        just_opened=false;

                    }
                }
                    else
                    {
                        res=solution.solve(numbers,operand);
                        txtResult.setTextSize(45);
                        if(res%1==0)
                        {
                            txtResult.setText(Integer.toString((int)res));
                        }
                        else {
                            txtResult.setText(Double.toString(res));
                        }
                        txtResult.setGravity(Gravity.RIGHT |Gravity.BOTTOM);
                           result="";
                           on_screen="";
                           numbers.clear();
                           operand.clear();
                           result_existed=true;
                           just_opened=false;
                        }

            }
        });
        buC=(Button)findViewById(R.id.buC);
        buC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!on_screen.equals(""))
                {
                    if(on_screen.charAt(on_screen.length()-1)=='+' || on_screen.charAt(on_screen.length()-1)=='-'||on_screen.charAt(on_screen.length()-1)=='×'||on_screen.charAt(on_screen.length()-1)=='÷') {
                        on_screen = on_screen.substring(0, on_screen.length() - 1);
                        txtResult.setText(on_screen);
                        operand.remove(operand.size()-1);
                        result=String.valueOf(numbers.get(numbers.size()-1).intValue());

                        numbers.remove(numbers.size()-1);

                    }
                    else {
                        on_screen = on_screen.substring(0, on_screen.length() - 1);
                        result=result.substring(0,result.length()-1);
                        txtResult.setText(on_screen);
                    }
                    just_opened=true;
                }

                else{
                    txtResult.setText("");
                    return;
                }
            }
        });

        buMS=(Button)findViewById(R.id.buMS);
        buMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(result_existed) {
                    if (memory!=Double.parseDouble(txtResult.getText().toString())) {
                        memory = Double.parseDouble(txtResult.getText().toString());
                        Toast.makeText(MainActivity.this, "The result stored successfully", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "This number is already stored!!", Toast.LENGTH_SHORT).show();
                    }
                }

                else if(operand.size()==0 && result!="")
                {
                    if (memory!=Double.parseDouble(txtResult.getText().toString())) {
                    memory = Double.parseDouble(txtResult.getText().toString());
                    Toast.makeText(MainActivity.this, "The number stored successfully", Toast.LENGTH_SHORT).show();
                }
                    else {
                        Toast.makeText(MainActivity.this, "This number is already stored!!", Toast.LENGTH_SHORT).show();
                    }
                }

                else if(operand.size()>0 && numbers.size()==operand.size() && result!="")
                {
                    buEqual.performClick();
                    Toast.makeText(MainActivity.this, "The result stored successfully", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please, type a number!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buMC=(Button)findViewById(R.id.buMC);
        buMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(memory!=0.0) {
                    memory = 0.0;
                    Toast.makeText(MainActivity.this, "The stored number deleted successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "There is no numbers stored in memory!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buMR=(Button)findViewById(R.id.buMR);
        buMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(memory!=0.0) {
                    txtResult.setGravity(Gravity.LEFT |Gravity.TOP);
                    just_opened=false;
                    result_existed=false;
                    txtResult.setTextSize(35);
                    if(memory%1==0) {
                        if(operand.size()==0)
                        {
                            on_screen="";
                            on_screen = on_screen + Integer.toString((int)memory);
                            result="";
                            result = result+Integer.toString((int)memory);
                        }
                        else {

                            on_screen=on_screen.substring(0,on_screen.indexOf(operand.get(operand.size()-1))+1);
                            on_screen = on_screen + Integer.toString((int)memory);
                            result="";
                            result = result+Integer.toString((int)memory);
                        }

                    }
                    else
                    {
                        if(operand.size()==0)
                        {
                            on_screen="";
                            on_screen = on_screen + Double.toString(memory);
                            result="";
                            result = result+Double.toString(memory);
                        }
                        else {
                            on_screen=on_screen.substring(0,on_screen.indexOf(operand.get(operand.size()-1))+1);
                            on_screen = on_screen + Double.toString(memory);
                            result="";
                            result = result+Double.toString(memory);
                        }

                    }

                    txtResult.setText(on_screen);
                }
                else {
                    Toast.makeText(MainActivity.this, "Please, Add number to the memory first!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buMplus=(Button)findViewById(R.id.buMplus);
        buMplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (memory != 0.0) {
                    buPlus.performClick();
                    txtResult.setGravity(Gravity.LEFT | Gravity.TOP);
                    just_opened = false;
                    result_existed = false;
                    txtResult.setTextSize(35);
                    on_screen = on_screen + Double.toString(memory);
                    result = Double.toString(memory);
                    buEqual.performClick();

                }
                else{
                    Toast.makeText(MainActivity.this, "Please, Add any number to the memory first!!", Toast.LENGTH_SHORT).show();
                }
            }
            
        });

        buMneg=(Button)findViewById(R.id.buMneg);
        buMneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (memory != 0.0) {
                    buMinus.performClick();
                    txtResult.setGravity(Gravity.LEFT | Gravity.TOP);
                    just_opened = false;
                    result_existed = false;
                    txtResult.setTextSize(35);
                    on_screen = on_screen + Double.toString(memory);
                    result = Double.toString(memory);
                    buEqual.performClick();

                }
                else{
                    Toast.makeText(MainActivity.this, "Please, Add any number to the memory first!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
