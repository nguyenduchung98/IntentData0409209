package nguyenduchung.ndh.intentdata04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1: nhan dang string
//        Intent intent = getIntent();
//        String value  = intent.getStringExtra("chuoi");
//        Log.d("BBB",value);
        //2: nhan ve dang array
//        Intent intent = getIntent();
//        String[] arrayName =intent.getStringArrayExtra("arrayname");
//        Log.d("BBB",arrayName.length +"");
        //3: nhan dang Object
//        Intent intent = getIntent();
//        Sinhvien sinhvien =(Sinhvien) intent.getSerializableExtra("object");
//        Log.d("BBB",sinhvien.getTen());
        //4: nhan dang ArrayList Object
        Intent intent = getIntent();
        ArrayList<Sinhvien> sinhvienArrayList = intent.getParcelableArrayListExtra("arrayListObject");
        Log.d("BBB",sinhvienArrayList.size()+"");
    }

}
