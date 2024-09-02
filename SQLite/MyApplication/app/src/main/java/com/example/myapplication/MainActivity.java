package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDao userDao;
    private EditText nameEditText, emailEditText, idEditText;
    private TextView usersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        usersTextView = findViewById(R.id.usersTextView);
        idEditText = findViewById(R.id.idEditText);

        userDao = new UserDao(this);
        userDao.open();
    }

    public void addLista(View view){
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        User user = new User(0, name, email);
        userDao.addUser(user);
        nameEditText.setText("");
        emailEditText.setText("");
    }

    public void removeList(View view){
        int id = Integer.parseInt(idEditText.getText().toString());
        userDao.deleteUser(id);
        idEditText.setText("");
    }


    public void verLista(View view){
        List<User> users = userDao.getAllUsers();
        StringBuilder userList = new StringBuilder();
        for (User user : users) {
            userList.append("ID: ").append(user.getId())
                    .append(", Name: ").append(user.getName())
                    .append(", Email: ").append(user.getEmail())
                    .append("\n");
        }
        usersTextView.setText(userList.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        userDao.close();
    }
}
