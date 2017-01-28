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

        String facebookUrl = "http://www.fb.com/AliAbdallahAwad";
        String githubUrl = "http://www.github.com/ali-abdalla";
        String linkedinUrl = "http://www.linkedin.com/in/AliAbdallahAwad";
        String codeforcesUrl = "http://www.codeforces.com/profile/AliAbdallah";
        String nextechnologyUrl = "http://www.nextechnology.me";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageHandler(R.id.facebook_image, facebookUrl);
        imageHandler(R.id.github_image, githubUrl);
        imageHandler(R.id.linkedin_image, linkedinUrl);
        imageHandler(R.id.codeforces_image, codeforcesUrl);
        imageHandler(R.id.nextechnology_image, nextechnologyUrl);
    }

    private void imageHandler(int imgId, String linkUrl) {
        ImageView img = (ImageView)findViewById(imgId);
        final String url = linkUrl;
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
