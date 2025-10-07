package com.zzok.codeleaf;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.zzok.codeleaf.databinding.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeActivity extends AppCompatActivity {
	
	private HomeBinding binding;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		binding = HomeBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		binding.linearHtml.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), HtmlActivity.class);
				startActivity(intent);
			}
		});
		
		binding.linearCss.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), CssActivity.class);
				startActivity(intent);
			}
		});
		
		binding.linearPhp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), PhpActivity.class);
				startActivity(intent);
			}
		});
		
		binding.linearSql.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), SqlActivity.class);
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		binding.codeleafText.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/display_bold.ttf"), 0);
		binding.catalog.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_bold.ttf"), 0);
		binding.htmlTitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_bold.ttf"), 0);
		binding.htmlSubtitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_regular.ttf"), 0);
		binding.cssTitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_bold.ttf"), 0);
		binding.cssSubtitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_regular.ttf"), 0);
		binding.phpTitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_bold.ttf"), 0);
		binding.phpSubtitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_regular.ttf"), 0);
		binding.sqlTitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_bold.ttf"), 0);
		binding.sqlSubtitle.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bangla_regular.ttf"), 0);
	}
	
}