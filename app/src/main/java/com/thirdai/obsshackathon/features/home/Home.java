package com.thirdai.obsshackathon.features.home;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.thirdai.obsshackathon.R;
import com.thirdai.obsshackathon.features.adjust.AdjustActivity;
import com.thirdai.obsshackathon.features.adjust.AdjustFragment;
import com.thirdai.obsshackathon.features.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    @OnClick(R.id.ivAdjustButton)
    void onRecordClick() {
        Intent photoPickerIntent = new Intent(this, AdjustActivity.class);
        startActivity(photoPickerIntent);
    }

    /*
    @OnClick(R.id.fab)
    void onFabClick() {
        //;TODO implement start previous datas activity
    }
    */
}
