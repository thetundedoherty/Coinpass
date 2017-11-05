package com.example.user.coinpass;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TheTundeDoherty on 10/12/2017.
 */

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {

    private ArrayList<Currency> currencyList;


    public CurrencyAdapter( ArrayList<Currency> currencyList) {
        this.currencyList = currencyList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CurrencyAdapter.ViewHolder holder, int position) {
        holder.bitcoinTextView.setText(currencyList.get(position).getmBtc());
        holder.ethereumTextView.setText(currencyList.get(position).getmEth());
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

      public class ViewHolder extends RecyclerView.ViewHolder {

          private  TextView bitcoinTextView, ethereumTextView;

            public ViewHolder(View itemView) {
                super(itemView);
                bitcoinTextView = (TextView) itemView.findViewById(R.id.ethereum_text_view);
                ethereumTextView = (TextView) itemView.findViewById(R.id.bitcoin_text_view);
            }
        }
}
