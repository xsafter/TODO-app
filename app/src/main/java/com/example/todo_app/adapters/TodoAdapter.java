package com.example.todo_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todo_app.R;
import com.example.todo_app.models.application.User;
import com.example.todo_app.models.domain.Note;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class TodoAdapter extends FirebaseRecyclerAdapter<Note, TodoAdapter.TodoViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public TodoAdapter(@NonNull FirebaseRecyclerOptions<Note> options) {
        super(options);
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout = R.layout.item_todo_element;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo_element, parent, false);
        return new TodoViewHolder(view);
    }

    static class TodoViewHolder extends RecyclerView.ViewHolder {
        ImageButton goBackButton;
        TextView noteName;
        TextView noteTime;
        EditText editNoteName;
        EditText editNoteDescription;
        RadioButton highButton;
        RadioButton mediumButton;
        RadioButton lowButton;
        Button createButton;

        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);

            goBackButton = itemView.findViewById(R.id.goBackButton);
            noteName = itemView.findViewById(R.id.noteName);
            noteTime = itemView.findViewById(R.id.noteTime);
            editNoteName = itemView.findViewById(R.id.editNoteName);
            editNoteDescription = itemView.findViewById(R.id.editNoteDescription);
            highButton = itemView.findViewById(R.id.highButton);
            mediumButton = itemView.findViewById(R.id.mediumButton);
            lowButton = itemView.findViewById(R.id.lowButton);
            createButton = itemView.findViewById(R.id.createButton);
        }
        public void bind(Note noteD, User user){

        }
    }

    @Override
    protected void onBindViewHolder(@NonNull TodoAdapter.TodoViewHolder holder, int position, @NonNull Note model) {
    }
}
