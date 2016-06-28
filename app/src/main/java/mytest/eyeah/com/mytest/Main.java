package mytest.eyeah.com.mytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.situ.android.adapter.CommonAdapter;
import com.situ.android.adapter.ViewHolder;

import java.util.List;

public class Main extends Activity
{
	ListView listview;
	String IP = "http://192.168.3.22:8080";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		listview = (ListView) findViewById(R.id.listView1);

		String VersionCheckUrl = IP + "/Recycle/servlet/Test";

		RequestQueue mQueue = Volley.newRequestQueue(Main.this);
		StringRequest stringRequest = new StringRequest(Method.POST, VersionCheckUrl, new Response.Listener<String>()
		{
			@Override
			public void onResponse(String response)
			{
				Log.d("resulttt", response);
				final List<Userinfo> lu = JSON.parseArray(response, Userinfo.class);
				listview.setAdapter(new CommonAdapter(Main.this, R.layout.aa, lu)
				{
					@Override
					public void convert(ViewHolder holder, int position, Object object)
					{
						Userinfo user = lu.get(position);
						holder.setText(R.id.textView1, user.getUsername());
						ImageView imageView = holder.getView(R.id.imageView1);
						Glide.with(mContext).load(IP + user.getUsertouxiang()).placeholder(R.drawable.ic_launcher).crossFade().into(imageView);
						// Glide.with(mContext).load(IP +user.getUsertouxiang()).placeholder(R.drawable.ic_launcher).bitmapTransform(new CropCircleTransformation(Main.this)).into(imageView);
					}
				});
			}
		}, new Response.ErrorListener()
		{
			@Override
			public void onErrorResponse(VolleyError error)
			{
				Log.e("resulttt", error.getMessage(), error);
			}
		})
		{
			// @Override
			// protected Map<String, String> getParams() throws AuthFailureError
			// {
			// Map<String, String> map = new HashMap<String, String>();
			// map.put("recyclerid", "161H7B9KJM9");
			// return map;
			// }
		};
		mQueue.add(stringRequest);
	}
}
