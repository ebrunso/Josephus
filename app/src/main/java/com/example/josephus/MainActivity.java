package com.example.josephus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int n = 7;
        int k = 4;
        Josephus obj = new Josephus();
        System.out.println(obj.josephus(n, k));

    }

    class Josephus {
        private int josephus(int n, int k)
        {
            int sum = 0;

            // For finding out the removed
            // chairs in each iteration
            for(int i = 2; i <= n; i++)
            {
                sum = (sum + k) % i;
            }

            return sum+1;
        }
    }
}
