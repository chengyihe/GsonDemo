package com.example.chengyihe.gsondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Created by chengyihe on 11/30/16.
 */

public class ParseJsonObjectDemoActivity extends AppCompatActivity {
    private static final String TAG = ParseJsonObjectDemoActivity.class.getSimpleName();

    private TextView mNameText;
    private TextView mIdText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parse_jsonobject_demo);
        mNameText = (TextView) findViewById(R.id.name);
        mIdText = (TextView) findViewById(R.id.id);

        String jsonString = "{\"name\":\"chengyihe\",\"id\":32,\"money\":null,\"misc\":[\"leo\",11,\"male\"]}";

        JsonObject jobj = new JsonParser().parse(jsonString).getAsJsonObject();
        String name = jobj.get("name").getAsJsonPrimitive().getAsString();
        int id = jobj.get("id").getAsJsonPrimitive().getAsInt();

        mNameText.setText(name);
        mIdText.setText(new Integer(id).toString());
    }
}
