package vn.edu.lab1bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    EditText edtChar;
    Button btnDem;
    CheckBox chkA, chkB, chkC, chkAll,chkSotu,chkAll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtChar = findViewById(R.id.edtChar);
        btnDem = findViewById(R.id.btnDem);
        chkA = findViewById(R.id.chkA);
        chkB=findViewById(R.id.chkB);
        chkC=findViewById(R.id.chkC);
        chkSotu=findViewById(R.id.chkSotu);
        chkAll=findViewById(R.id.chkAll);
        chkAll2=findViewById(R.id.chkAll2);
        intent = new Intent(MainActivity.this, MyService.class);
    }

    public void Character_count(View view) {
        String kytu=edtChar.getText().toString().trim();
        boolean a=chkA.isChecked();
        boolean b=chkB.isChecked();
        boolean c=chkC.isChecked();
        boolean st=chkSotu.isChecked();
        boolean all=chkAll.isChecked();
        boolean all2=chkAll2.isChecked();
        intent.putExtra("kytu",kytu);
        intent.putExtra("a",a);
        intent.putExtra("b",b);
        intent.putExtra("c",c);
        intent.putExtra("st",st);
        intent.putExtra("all",all);
        intent.putExtra("all2",all2);
        startService(intent);
    }
}
