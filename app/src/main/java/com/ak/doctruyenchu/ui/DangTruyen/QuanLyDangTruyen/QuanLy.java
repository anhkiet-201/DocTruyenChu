package com.ak.doctruyenchu.ui.DangTruyen.QuanLyDangTruyen;

import android.content.Intent;
import android.os.Bundle;

import com.ak.doctruyenchu.Constans.Constans;
import com.ak.doctruyenchu.databinding.ActivityQuanLyBinding;
import com.ak.doctruyenchu.ui.DangTruyen.DangTruyen;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.ak.doctruyenchu.ui.DangTruyen.QuanLyDangTruyen.ui.main.SectionsPagerAdapter;
import com.google.firebase.database.DataSnapshot;


public class QuanLy extends AppCompatActivity {

private ActivityQuanLyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityQuanLyBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuanLy.this, DangTruyen.class));
            }
        });

    }
}