package com.example.comteknokratmobile2019if17fx17312261apkprofil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView myPict;
    Button editph, save;
    Animation atg, atg2, atg3;
    private Button  btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //animation

        //animation declaration
        atg = AnimationUtils.loadAnimation(this,R.anim.atg);
        atg2 = AnimationUtils.loadAnimation(this,R.anim.atg2);
        atg3 = AnimationUtils.loadAnimation(this,R.anim.atg3);

        //animation Pict
        myPict = findViewById(R.id.myPict);
        myPict.startAnimation(atg);



        //end.animation

        btn2 = (Button) findViewById(R.id.btn2);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                addFragment(new fragmentone(), false, "one");
//            }
//        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new mapfragment(), false, "one");
            }
        });

    }

    public void addFragment(Fragment fragment, boolean addToBackStack, String tag) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        if (addToBackStack) {
            ft.addToBackStack(tag);
        }
        ft.replace(R.id.container_frame_back, fragment, tag);
        ft.commitAllowingStateLoss();
    }


}
