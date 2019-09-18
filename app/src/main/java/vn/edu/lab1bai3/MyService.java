package vn.edu.lab1bai3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String getKytu = intent.getStringExtra("kytu").toLowerCase();
        boolean getA = intent.getBooleanExtra("a", false);
        boolean getB = intent.getBooleanExtra("b", false);
        boolean getC = intent.getBooleanExtra("c", false);
        boolean getSt = intent.getBooleanExtra("st", false);
        boolean getAll = intent.getBooleanExtra("all", false);
        boolean getAll2 = intent.getBooleanExtra("all2", false);
        char charactersA = 'a';
        char charactersB = 'b';
        char charactersC = 'c';

        int count = 0;

        int letterCount = 0;
        int digitCount = 0;



            if (getA == true) {
                for (int i = 0; i < getKytu.length(); i++) {
                    if (getKytu.charAt(i) == charactersA) {
                        count++;
                    }
                }
                String content1 = "Số lượng ký tự " + charactersA + " trong chuỗi " + getKytu + " = " + count;
                Toast.makeText(this, content1, Toast.LENGTH_LONG).show();

            } else if (getB == true) {
                for (int i = 0; i < getKytu.length(); i++) {
                    if (getKytu.charAt(i) == charactersB) {
                        count++;
                    }
                }
                String content2 = "Số lượng ký tự " + charactersB + " trong chuỗi " + getKytu + " = " + count;
                Toast.makeText(this, content2, Toast.LENGTH_LONG).show();

            } else if (getC == true) {
                for (int i = 0; i < getKytu.length(); i++) {
                    if (getKytu.charAt(i) == charactersC) {
                        count++;
                    }
                }
                String content3 = "Số lượng ký tự " + charactersC + " trong chuỗi " + getKytu + " = " + count;
                Toast.makeText(this, content3, Toast.LENGTH_LONG).show();

            } else if (getSt == true) {
                StringTokenizer stringTokenizer = new StringTokenizer(getKytu);
                int sotutrongchuoi = stringTokenizer.countTokens();
                String content4 = "Số từ trong chuỗi " + getKytu + " = " + sotutrongchuoi;
                Toast.makeText(this, content4, Toast.LENGTH_LONG).show();

            } else if (getAll == true) {
                for (int i = 0; i < getKytu.length(); i++) {
                    if (Character.isLetter(getKytu.charAt(i))) {
                        letterCount++;
                        String content5 = "Số ký tự : " + letterCount;
                        Toast.makeText(this, content5, Toast.LENGTH_LONG).show();
                    }
                }
            } else if (getAll2 == true) {
                for (int i = 0; i < getKytu.length(); i++) {
                    if (Character.isDigit(getKytu.charAt(i))) {
                        digitCount++;
                        String content6 = "Số chữ số : " + digitCount;
                        Toast.makeText(this, content6, Toast.LENGTH_LONG).show();
                    }
                }
            } else {
                Toast.makeText(this, "Mời chọn 1 kiểu đếm ", Toast.LENGTH_LONG).show();
            }


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
