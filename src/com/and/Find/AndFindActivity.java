package com.and.Find;

/*
 * andFile
 * MainActivity
 * ThomasK
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class AndFindActivity extends Activity  {
    private Button b_object;
	private Button b_container;
	private Button b_tag;
	private Button b_object_plus;
	private Button b_container_plus;
	private Button b_tag_plus;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /*
         * Defination of Buttons and setting up OnClickListener
         */
        b_object = (Button)findViewById(R.id.b_object);
        b_container = (Button)findViewById(R.id.b_container);
        b_tag = (Button)findViewById(R.id.b_tag);
        b_object_plus = (Button)findViewById(R.id.b_object_plus);
        b_container_plus = (Button)findViewById(R.id.b_container_plus);
        b_tag_plus = (Button)findViewById(R.id.b_tag_plus);
        
        b_object.setOnClickListener(new EventHandler(this));
        b_container.setOnClickListener(new EventHandler(this));
        b_tag.setOnClickListener(new EventHandler(this));
        b_object_plus.setOnClickListener(new EventHandler(this));
        b_container_plus.setOnClickListener(new EventHandler(this));
        b_tag_plus.setOnClickListener(new EventHandler(this));

    }


		
	}