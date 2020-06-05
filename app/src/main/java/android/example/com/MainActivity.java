package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreofTeamA =0;
    int scoreofTeamB =0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointsTeamA(View view){
        scoreofTeamA +=3;
        displayForTeamA(scoreofTeamA);
    }
    public void addTwoPointsTeamA(View view){
        scoreofTeamA +=2;
        displayForTeamA(scoreofTeamA);
    }
    public void addOnePointTeamA(View view){
        scoreofTeamA +=1;
        displayForTeamA(scoreofTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointsTeamB(View view){
        scoreofTeamB +=3;
        displayForTeamB(scoreofTeamB);
    }
    public void addTwoPointsTeamB(View view){
        scoreofTeamB +=2;
        displayForTeamB(scoreofTeamB);
    }
    public void addOnePointTeamB(View view){
        scoreofTeamB +=1;
        displayForTeamB(scoreofTeamB);
    }
    public void reset(View view){
        scoreofTeamA=0;
        scoreofTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
