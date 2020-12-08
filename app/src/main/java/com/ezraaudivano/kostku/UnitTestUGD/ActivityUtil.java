package com.ezraaudivano.kostku.UnitTestUGD;

import android.content.Context;
import android.content.Intent;

import com.ezraaudivano.kostku.MenuActivity;

public class ActivityUtil {
    private Context context;
    public ActivityUtil(Context context) {
        this.context = context;
    }
    public void startMainActivity() {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
    public void startUserProfile() {
        Intent i = new Intent(context, MenuActivity.class);
        context.startActivity(i);
    }

}
