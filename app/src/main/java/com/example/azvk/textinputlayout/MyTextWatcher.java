package com.example.azvk.textinputlayout;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

public class MyTextWatcher implements TextWatcher {

    View view;

    public MyTextWatcher(View view) {
        this.view = view;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        switch (view.getId()){
            case R.id.input_name:

        }

    }
}
