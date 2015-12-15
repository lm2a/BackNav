package com.lm2a.backnav;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    FragmentManager mFragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mFragmentManager = getFragmentManager();
        FragmentA fa = new FragmentA();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fa, "A");
        fragmentTransaction.addToBackStack("addA");
        fragmentTransaction.commit();
    }




    public void irAFragB(View v){
        FragmentB fb = new FragmentB();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fb, "B");
        fragmentTransaction.addToBackStack("addB");
        fragmentTransaction.commit();
    }

    public void irAFragC(View v){
        FragmentC fc = new FragmentC();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fc, "C");
        fragmentTransaction.addToBackStack("addC");
        fragmentTransaction.commit();
    }

    //---------------  descomenta para habilitar la navegacion hacia atras
    /*
    @Override
    public void onBackPressed() {
        // your code.
        int t = mFragmentManager.getBackStackEntryCount();
        if(t > 1){
            FragmentManager.BackStackEntry bse = mFragmentManager.getBackStackEntryAt(t-1);
            Log.i("MAIN2","Estaba en: "+bse.getName());
            mFragmentManager.popBackStack();//retrocede en la pila
        }else{
            super.onBackPressed();//como si apretaran el back entre actividades
        }
    }
    */

}
