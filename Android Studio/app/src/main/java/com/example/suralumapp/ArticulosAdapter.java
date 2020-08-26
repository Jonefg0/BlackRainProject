package com.example.suralumapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

import org.w3c.dom.Text;

public class ArticulosAdapter extends FirestoreRecyclerAdapter<Articulo,ArticulosAdapter.ViewHolder> {

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public ArticulosAdapter(@NonNull FirestoreRecyclerOptions<Articulo> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Articulo model) {
        holder.textViewtitulo.setText(model.getArticulo());
        holder.textViewcantidad.setText(model.getCantidad());
        holder.textViewprecio.setText(model.getPrecio());

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_articulos,parent,false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewtitulo;
        TextView textViewcantidad;
        TextView textViewprecio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewtitulo = itemView.findViewById(R.id.textViewtitulo);
            textViewcantidad = itemView.findViewById(R.id.textViewcantidad);
            textViewprecio = itemView.findViewById(R.id.textViewprecio);

        }
    }

}
