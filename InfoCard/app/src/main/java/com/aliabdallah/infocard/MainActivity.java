package com.aliabdallah.infocard;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final String facebookUrl = "http://www.fb.com/AliAbdallahAwad";
        final String githubUrl = "http://www.github.com/ali-abdalla";
        final String linkedinUrl = "http://www.linkedin.com/in/AliAbdallahAwad";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebookImage = (ImageView)findViewById(R.id.facebook_image);
        facebookImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(facebookUrl));
                startActivity(intent);
            }
        });

        ImageView githubImage = (ImageView)findViewById(R.id.github_image);
        githubImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(githubUrl));
                startActivity(intent);
            }
        });

        ImageView linkedinImage = (ImageView)findViewById(R.id.linkedin_image);
        linkedinImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(linkedinUrl));
                startActivity(intent);
            }
        });
    }
}
