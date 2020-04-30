package vn.edu.ntu.quangloc.dauquangloc_59131309_simplewidget;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, ST6;
    RadioGroup rdgGT;
    RadioButton rdbGTNa, rdbGTNu;
    Button btnXN;
    CheckBox ST1, ST2, ST3, ST4, ST5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews()
    {
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        ST1 = (CheckBox) findViewById(R.id.ST1);
        ST2 = (CheckBox) findViewById(R.id.ST2);
        ST3 = (CheckBox) findViewById(R.id.ST3);
        ST4 = (CheckBox) findViewById(R.id.ST4);
        ST5 = (CheckBox) findViewById(R.id.ST5);
        ST6 = (EditText) findViewById(R.id.ST6);
        rdgGT = (RadioGroup) findViewById(R.id.rdgGT);
        rdbGTNa = (RadioButton) findViewById(R.id.rdbGTNa);
        rdbGTNu = (RadioButton) findViewById(R.id.rdbGTNu);
        btnXN = (Button) findViewById(R.id.btnXN);
    }

    private void addEvents()
    {
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thongBao();
            }
        });
    }

    private void thongBao()
    {
        String MSG;
        MSG = edt1.getText().toString() + "\n" + "Ngày sinh: " + edt2.getText().toString()
        + "\n" +"Giới tính: ";

        switch (rdgGT.getCheckedRadioButtonId()) {
            case R.id.rdbGTNa:
                MSG += "Nam\n";
                break;
            case R.id.rdbGTNu:
                MSG += "Nữ\n";
                break;
        }
        MSG = MSG + "Sở thích: ";

                if (ST1.isChecked()) {
                    MSG = MSG + ST1.getText().toString() + ", ";
                }
                if (ST2.isChecked()) {
                    MSG = MSG + ST2.getText().toString() + ", ";
                }
                if (ST3.isChecked()) {
                    MSG = MSG + ST3.getText().toString() + ", ";
                }
                if (ST4.isChecked()) {
                    MSG = MSG + ST4.getText().toString() + ", ";
                }
                if (ST5.isChecked()) {
                    MSG = MSG + ST5.getText().toString() + ", ";
                }

        MSG = MSG + ST6.getText().toString();
        Toast.makeText(getApplicationContext(), MSG.toString(), Toast.LENGTH_LONG).show();

    }
}
