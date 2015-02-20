package com.example.daichi.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int a;
    int b;
    String operator;
    TextView textView;
    TextView textView2;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=0;
        b=0;
        operator="";
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);


    }

    public void one(View v){

        if(operator.equals("")){
            a=a*10+1;
            textView.setText(a+"");


        }else{
            b=b*10+1;
            textView3.setText(b+"");
        }

    }

    public void two(View v){

        if(operator.equals("")){
            a=a*10+2;
            textView.setText(a+"");

        }else{
            b=b*10+2;
            textView3.setText(b+"");

        }

    }

    public void three(View v){

        if(operator.equals("")){
            a=a*10+3;
            textView.setText(a+"");


        }else{
            b=b*10+3;
            textView3.setText(b+"");
        }

    }

    public void four(View v){

        if(operator.equals("")){
            a=a*10+4;
            textView.setText(a+"");


        }else{
            b=b*10+4;
            textView3.setText(b+"");
        }

    }

    public void five(View v){

        if(operator.equals("")){
            a=a*10+5;
            textView.setText(a+"");


        }else{
            b=b*10+5;
            textView3.setText(b+"");
        }

    }

    public void six(View v){

        if(operator.equals("")){
            a=a*10+6;
            textView.setText(a+"");

        }else{
            b=b*10+6;
            textView3.setText(b+"");
        }

    }

    public void seven(View v){

        if(operator.equals("")){
            a=a*10+7;
            textView.setText(a+"");
        }else{
            b=b*10+7;
            textView3.setText(b+"");
        }

    }

    public void eight(View v){

        if(operator.equals("")){
            a=a*10+8;
            textView.setText(a+"");
        }else{
            b=b*10+8;
            textView3.setText(b+"");
        }

    }

    public void nine(View v){
        if(operator.equals("")){
            a=a*10+9;
            textView.setText(a+"");
        }else{
            b=b*10+9;
            textView3.setText(b+"");
        }

    }

    public void zero(View v){

        if(operator.equals("")){
            a=a*10+0;
            textView.setText(a+"");
        }else{
            b=b*10+0;
            textView3.setText(b+"");
        }

    }

    public void clear(View v){
        a=0;
        b=0;
        textView.setText("");
        textView2.setText("");
        textView3.setText("");

    }

    public void naname(View v){
        operator="/";
        textView2.setText("/");
    }


    public void kome(View v){
        operator="*";
        textView2.setText("*");
    }


    public void plus(View v){
        operator="+";
        textView2.setText("+");
    }


    public void minus(View v){
        operator="-";
        textView2.setText("-");
    }


    public void equal(View v){
        if(operator.equals("+")){
            int answer;
            answer=a+b;
            textView.setText(a+b+(""));
            a=answer;
            textView.setText(a+"");
            operator="";
            textView2.setText("");
            b=0;
            textView3.setText("");



        }else if(operator.equals("-")){
            int answer=a-b;
            textView.setText(a-b+(""));
            a=answer;
            textView.setText(a+"");
            operator="";
            textView2.setText("");
            b=0;
            textView3.setText("");

        }else if(operator.equals("*")){
            int answer=a*b;
            textView.setText(a*b+(""));
            a=answer;
            textView.setText(a+"");
            operator="";
            textView2.setText("");
            b=0;
            textView3.setText("");

        }else if(operator.equals("/")){
            int answer=a/b;
            textView.setText(a/b+(""));
            a=answer;
            textView.setText(a+"");
            operator="";
            textView2.setText("");
            b=0;
            textView3.setText("");
        }
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
