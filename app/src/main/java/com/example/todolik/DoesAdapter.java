package com.example.todolik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder> {

    Context _context;
    ArrayList<Task> _tasks;

    public DoesAdapter(Context context, ArrayList<Task> tasks) {
        _context = context;
        _tasks = tasks;
    }


    // onCreateViewHolder: возвращает объект ViewHolder, который будет хранить данные по одному объекту Task.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(_context).inflate(R.layout.task, parent,false));
    }

    //onBindViewHolder: выполняет привязку объекта ViewHolder к объекту Task по определенной позиции.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tasks.setText(_tasks.get(position).get_content());
    }

    //getItemCount: возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return _tasks.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        CheckBox tasks;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tasks = itemView.findViewById(R.id.task);
        }
    }
}
