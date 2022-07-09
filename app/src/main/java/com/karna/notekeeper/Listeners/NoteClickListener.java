package com.karna.notekeeper.Listeners;

import androidx.cardview.widget.CardView;

import com.karna.notekeeper.Models.Notes;

public interface NoteClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
