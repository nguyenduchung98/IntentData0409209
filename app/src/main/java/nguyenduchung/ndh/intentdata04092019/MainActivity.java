package nguyenduchung.ndh.intentdata04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button mBtnIntentString,mBtnIntentArray,mBtnIntentObject,mBtnIntentArrayListObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnIntentString=findViewById(R.id.buttonIntentString);
        mBtnIntentArray=findViewById(R.id.buttonIntentArray);
        mBtnIntentObject=findViewById(R.id.buttonIntentObject);
        mBtnIntentArrayListObject=findViewById(R.id.buttonIntentArrayListObject);


        mBtnIntentString.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("chuoi","Hello main");
            startActivity(intent);
        });
        mBtnIntentArray.setOnClickListener(v -> {
            String[] arrayName = {"Teo","Ty","Lan","Hoa"};
//            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//            intent.putExtra("arrayname",arrayName);
//            startActivity(intent);
            sendDataByIntent("arrayname",arrayName);
        });
        mBtnIntentObject.setOnClickListener(v -> {
            Sinhvien sinhvien =new Sinhvien("NDH",21);
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("object",sinhvien);
            startActivity(intent);
        });
        mBtnIntentArrayListObject.setOnClickListener(v -> {
            ArrayList<Sinhvien> sinhvienArrayList = new ArrayList<>();
            sinhvienArrayList.add(new Sinhvien("NDH",21));
            sinhvienArrayList.add(new Sinhvien("DNH",16));
            sinhvienArrayList.add(new Sinhvien("PQT",22));
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("arrayListObject",sinhvienArrayList);
            startActivity(intent);
        });

        //showToast(1);
    }
    public <T> void showToast(T value){
        if(value instanceof Integer ){
            Toast.makeText(this, value +"", Toast.LENGTH_SHORT).show();
        }
    }
    public <T extends Serializable> void sendDataByIntent(String key , T value){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra(key,value);
        startActivity(intent);
    }
}
