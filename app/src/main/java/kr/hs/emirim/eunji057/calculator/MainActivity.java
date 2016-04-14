package kr.hs.emirim.eunji057.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button butPlus, butMinus, butMultiply, butDivide;
    EditText editNum1, editNum2;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //activity_main의 요소들을 임플레이션(올려줌)
        butPlus=(Button)findViewById(R.id.but_plus);    //참조변수에 대입
        butMinus=(Button)findViewById(R.id.but_minus);
        butMultiply=(Button)findViewById(R.id.but_multiply);
        butDivide=(Button)findViewById(R.id.but_divide);
        editNum1=(EditText)findViewById(R.id.edit_num1);
        editNum2=(EditText)findViewById(R.id.edit_num2);
        textResult=(TextView)findViewById(R.id.text_result);
        butPlus.setOnClickListener(this);   //이벤트리소스 이벤트핸들러 연결
        butMinus.setOnClickListener(this);
        butMultiply.setOnClickListener(this);
        butDivide.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {        //mainactivity이자 eventhandler
//        2개의 EditText에 입력된 값을 반환받는다.
        String num1Str=editNum1.getText().toString();
        String num2Str=editNum2.getText().toString();
        int num1=Integer.parseInt(num1Str);
        int num2=Integer.parseInt(num2Str);
        double result=0;

        switch (v.getId())
        {
            case R.id.but_plus:
                result=num1+num2;
                break;
            case R.id.but_minus:
                result=num1-num2;
                break;
            case R.id.but_multiply:
                result=num1*num2;
                break;
            case R.id.but_divide:
                result=(double)num1/num2;
                break;
        }
        textResult.setText("계산 결과 : "+result);
    }
}



















