package android.example.com.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;




    public class MainActivity extends AppCompatActivity {
        private int mCount = 0;
        private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void countUp(View view){


        setmCount( getmCount( ) + 1 );
        if (getmShowCount( ) != null)
            getmShowCount( ).setText(Integer.toString( getmCount( ) ));
    }


        public void showToast( View view ) {
            Toast toast = Toast.makeText( this, R.string.toast_message, Toast.LENGTH_LONG );
            toast.show(); }


        public TextView getmShowCount() {
            return mShowCount;
        }

        public void setmShowCount( TextView mShowCount ) {
            this.mShowCount = mShowCount;
        }

        public int getmCount() {
            return mCount;
        }

        public void setmCount( int mCount ) {
            this.mCount = mCount;
        }
    }