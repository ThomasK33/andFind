package com.and.Find;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EventHandler implements OnClickListener{
	
	public Context context;
	private Button b_tag;
	private Button b_tag_send;
	private Button et_tag_name;
	private Button et_tag_description;
	
	public EventHandler(Context context){
		this.context=context;
	}
	
	public void onClick(View v) {
		/*
		 * Getting the Buttons and doing action
		 */
		b_tag = (Button)((Activity) this.context).findViewById(R.id.b_tag);
		b_tag_send = (Button) ((Activity) this.context).findViewById(R.id.b_tag_send);
		if (v.equals(b_tag)) {
			Intent intent = new Intent(this.context, tag.class); //Start a new Intent
			this.context.startActivity(intent);
		}
		if (v.equals(b_tag_send)) {
			et_tag_name = (Button)((Activity) this.context).findViewById(R.id.et_tag_name);
			et_tag_description = (Button)((Activity) this.context).findViewById(R.id.et_tag_description);
			//TODO:
		}
	}

	
}
