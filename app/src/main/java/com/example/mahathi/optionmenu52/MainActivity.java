package com.example.mahathi.optionmenu52;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int computer = 1;
    private static final int gamepad = 2;
    private static final int camera = 3;
    private static final int video = 4;
    private static final int email = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Addition of menu items to menu */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuItem it1 = menu.add(Menu.NONE, computer, Menu.FIRST, "Computer");
        MenuItem it2 = menu.add(Menu.NONE, gamepad, 2, "gamepad");
        MenuItem it3 = menu.add(Menu.NONE, camera, 3, "camera");
        MenuItem it4 = menu.add(Menu.NONE, video, 4, "video");
        MenuItem it5 = menu.add(Menu.NONE, email, 5, "email");

        it1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        it2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        it3.setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
        it4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        it5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);


        return super.onCreateOptionsMenu(menu);

    }

    //Code for displaying the Toast message on click of Option items selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case computer:
                Toast.makeText(getApplicationContext(), "clicked on computer", Toast.LENGTH_LONG).show();
                return true;
            case gamepad:
                Toast.makeText(getApplicationContext(), "clicked on gamepad", Toast.LENGTH_LONG).show();
                return true;
            case camera:
                Toast.makeText(getApplicationContext(), "clicked on camera", Toast.LENGTH_LONG).show();
                return true;
            case video:
                Toast.makeText(getApplicationContext(), "clicked on video", Toast.LENGTH_LONG).show();
                return true;
            case email:
                Toast.makeText(getApplicationContext(), "clicked on email", Toast.LENGTH_LONG).show();
                return true;
            default:
                return false;
        }

    }

}