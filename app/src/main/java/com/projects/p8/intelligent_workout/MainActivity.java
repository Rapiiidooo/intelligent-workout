package com.projects.p8.intelligent_workout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class MainActivity extends Activity
{
    private IntelligentWorkoutMenu mIntelligentWorkoutMenu;
    ServiceManager MyServiceManager;
    boolean ServiceBound = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        final Intent myIntent = new Intent(MainActivity.this, Menulevel.class);

        mIntelligentWorkoutMenu = findViewById(R.id.IntelligentWorkoutMenu);
        mIntelligentWorkoutMenu.setVisibility(View.VISIBLE);

        mIntelligentWorkoutMenu.setEventListener(new IntelligentWorkoutMenu.IMyEventListener() {
            @Override
            public void onEventAccured()
            {
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
