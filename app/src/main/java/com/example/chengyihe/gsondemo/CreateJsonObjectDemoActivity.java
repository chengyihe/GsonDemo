package com.example.chengyihe.gsondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.util.Log;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class CreateJsonObjectDemoActivity extends AppCompatActivity {
    private final static String TAG = CreateJsonObjectDemoActivity.class.getSimpleName();
    TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_jsonobject_demo);
        mTextView = (TextView)findViewById(R.id.jsonobject_text);

        JsonObject person = new JsonObject();
        person.add("name", new JsonPrimitive("chengyihe"));
        person.add("id", new JsonPrimitive(32));
        person.add("money", new JsonNull());

        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("leo"));
        array.add(new JsonPrimitive(11));
        array.add(new JsonPrimitive("male"));
        person.add("misc", array);

        Log.d(TAG, "person JsonObject: " + person.toString());
        mTextView.setText(person.toString());
    }
}
