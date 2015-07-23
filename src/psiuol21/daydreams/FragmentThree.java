package psiuol21.daydreams;

import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FragmentThree extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		TextView tv1,tv2,tv3;
		View v= inflater.inflate(R.layout.fragment_three_layout, container,false);
		RelativeLayout rl=(RelativeLayout)v.findViewById(R.id.frag3);
		Random rnd = new Random(); 
		int r=rnd.nextInt(256);
		int g=rnd.nextInt(256);
		int b=rnd.nextInt(256);
		int color = Color.argb(255,r,g,b );  
		tv1=(TextView)v.findViewById(R.id.tv7);
		tv2=(TextView)v.findViewById(R.id.tv8);
		tv3=(TextView)v.findViewById(R.id.tv9);
		tv1.setText(r+"");
		tv2.setText(g+"");
		tv3.setText(b+"");
 
		rl.setBackgroundColor(color);
		return v;
	}

}
