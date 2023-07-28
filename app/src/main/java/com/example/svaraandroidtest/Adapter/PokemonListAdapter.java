package com.example.svaraandroidtest.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.svaraandroidtest.Model.Pokemon;
import com.example.svaraandroidtest.R;

import java.util.List;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.MyViewHolder> {

    Context context;
    List<Pokemon> pokemonList;

    public PokemonListAdapter(Context context, List<Pokemon> pokemonList) {
        this.context = context;
        pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.pokemon_list_item,parent, false);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Load Pokemon Image
        Glide.with(context).load(pokemonList.get(position).getImg()).into(holder.pokemon_image);
        // Set Pokemon Name
        holder.pokemon_name.setText(pokemonList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        if(pokemonList==null) return 0;
        return pokemonList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView pokemon_image;
        TextView pokemon_name;

        public MyViewHolder(View itemView) {
            super(itemView);

            pokemon_image = itemView.findViewById(R.id.pokemon_image);
            pokemon_name = itemView.findViewById(R.id.text_pokemon_name);
        }
    }
}
