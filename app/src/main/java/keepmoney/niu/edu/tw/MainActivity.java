package tw.edu.niu.week3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextSex;
    private EditText mEditTextAge;
    private TextView mTextView;
    //private Spinner mSpinner;//基本功一
    Button   mButton;

    private View.OnClickListener btnOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strSex = mEditTextSex.getText().toString();
            int iAge = Integer.parseInt(mEditTextAge.getText().toString());

            //mTextView.setText("結果"+strSex+" "+iAge+"/N");
            String strSug = "建議：";
            if (strSex.equals("男")) {
                if (iAge < 28) {strSug += "不急";} else if(iAge > 33) {strSug += "趕快結婚";} else {strSug += "開始找對象";}
            }
            else if(iAge < 25) {strSug += "不急"; }else if(iAge > 30) {strSug += "趕快結婚";} else {strSug += "開始找對象";}
            mTextView.setText("結果："+strSex+" "+iAge+"\n"+strSug);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextSex = (EditText) findViewById(R.id.edtSex);
        mEditTextAge = (EditText) findViewById(R.id.edtAge);
        mButton      = (Button)   findViewById(R.id.button);
        mTextView   = (TextView) findViewById(R.id.textView4);
        //mSpinner    = (Spinner)  findViewById(R.id.spinner);//基本功二



        //mButton.setOnClickListener(btnOnclick);

        /*mButton.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view){

                String strSex = mEditTextSex.getText().toString();
                int iAge = Integer.parseInt(mEditTextAge.getText().toString());

                //mTextView.setText("結果"+strSex+" "+iAge+"/N");
                String strSug = "建議：";
                if (strSex.equals("男")) {
                    if (iAge < 28) {strSug += "不急";} else if(iAge > 33) {strSug += "趕快結婚";} else {strSug += "開始找對象";}
                }
                else if(iAge < 25) {strSug += "不急"; }else if(iAge > 30) {strSug += "趕快結婚";} else {strSug += "開始找對象";}
                mTextView.setText("結果："+strSex+" "+iAge+"\n"+strSug);

            }
        });*/
    }

    /*public void setBtnOnclick(View view){
        String strSex = mEditTextSex.getText().toString();
        int iAge = Integer.parseInt(mEditTextAge.getText().toString());

        //mTextView.setText("結果"+strSex+" "+iAge+"/N");
        String strSug = "建議：";
        if (strSex.equals("男")) {
            if (iAge < 28) {strSug += "不急";} else if(iAge > 33) {strSug += "趕快結婚";} else {strSug += "開始找對象";}
        }
        else if(iAge < 25) {strSug += "不急"; }else if(iAge > 30) {strSug += "趕快結婚";} else {strSug += "開始找對象";}
        mTextView.setText("結果："+strSex+" "+iAge+"\n"+strSug);
    }*/


}
