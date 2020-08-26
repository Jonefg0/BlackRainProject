package com.example.suralumapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class stock extends AppCompatActivity {

    RecyclerView Viewarticulos;
    ArticulosAdapter mAdapter;
    FirebaseFirestore mFirestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        Viewarticulos = findViewById(R.id.recyclerArticulos);
        Viewarticulos.setLayoutManager(new LinearLayoutManager(this));
        mFirestore = FirebaseFirestore.getInstance();


        Query query = mFirestore.collection("suralum");
        FirestoreRecyclerOptions<Articulo> firestoreRecyclerOptions = new FirestoreRecyclerOptions.Builder<Articulo>()
                .setQuery(query,Articulo.class).build();

        mAdapter = new ArticulosAdapter(firestoreRecyclerOptions);
        mAdapter.notifyDataSetChanged();
        Viewarticulos.setAdapter(mAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAdapter.stopListening();
    }
}