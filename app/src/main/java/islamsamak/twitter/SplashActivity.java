package islamsamak.twitter;

import android.os.Bundle;
import android.os.PersistableBundle;

public class SplashActivity extends DefaultActivity {

	@Override
	public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
		super.onCreate(savedInstanceState, persistentState);
		this.setContentView(R.layout.activity_splash);
	}
}
