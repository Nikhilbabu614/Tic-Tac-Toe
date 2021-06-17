package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button key[][] = new Button[3][3];
    TextView result;
    Button res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        key[0][0] = findViewById(R.id.key1);
        key[0][1] = findViewById(R.id.key2);
        key[0][2] = findViewById(R.id.key3);
        key[1][0] = findViewById(R.id.key4);
        key[1][1] = findViewById(R.id.key5);
        key[1][2] = findViewById(R.id.key6);
        key[2][0] = findViewById(R.id.key7);
        key[2][1] = findViewById(R.id.key8);
        key[2][2] = findViewById(R.id.key9);
        result = findViewById(R.id.result);
        res = findViewById(R.id.reset);
    }

    int player=1;
    Boolean end=false;

    public void setKey1(View view){
        Button btn = (Button) view;

        if(player == 1 && btn.getText() == ""){
            btn.setText("X");
            player=0;
        }else if(player == 0 && btn.getText() == ""){
            btn.setText("O");
            player=1;
        }

//        while (!end){
            if(key[0][0].getText() == key[0][1].getText() && key[0][1].getText() == key[0][2].getText() && key[0][1].getText()!="" && key[0][1].getText()!="" && key[0][2].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[1][0].getText() == key[1][1].getText() && key[1][1].getText() == key[1][2].getText() && key[1][0].getText()!="" && key[1][1].getText()!="" && key[1][2].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[2][0].getText() == key[2][1].getText() && key[2][1].getText() == key[2][2].getText() && key[2][0].getText()!="" && key[2][1].getText()!="" && key[2][2].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[0][0].getText() == key[1][0].getText() && key[1][0].getText() == key[2][0].getText() && key[0][0].getText()!="" && key[1][0].getText()!="" && key[2][0].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[0][1].getText() == key[1][1].getText() && key[1][1].getText() == key[2][1].getText() && key[0][1].getText()!="" && key[1][1].getText()!="" && key[2][1].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[0][2].getText() == key[1][2].getText() && key[1][2].getText() == key[2][2].getText() && key[0][2].getText()!="" && key[1][2].getText()!="" && key[2][2].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[0][0].getText() == key[1][1].getText() && key[1][1].getText() == key[2][2].getText() && key[0][0].getText()!="" && key[1][1].getText()!="" && key[2][2].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }else if(key[0][2].getText() == key[1][1].getText() && key[1][1].getText() == key[2][0].getText() && key[0][2].getText()!="" && key[1][1].getText()!="" && key[2][0].getText()!=""){
                result.setText("PLAYER "+(player+1)+" WINS");
                end=true;
            }
//        }
    }

    public void resetdata(View view){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                key[i][j].setText("");
            }
        }
        result.setText("");
    }
}