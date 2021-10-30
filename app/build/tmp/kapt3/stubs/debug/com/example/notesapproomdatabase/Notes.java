package com.example.notesapproomdatabase;

import java.lang.System;

@androidx.room.Entity(tableName = "note_table")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/example/notesapproomdatabase/Notes;", "", "text", "", "title1000", "Time", "DateEn", "checkbox", "", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getDateEn", "()Ljava/lang/String;", "getTime", "getCheckbox", "()Z", "setCheckbox", "(Z)V", "getId", "()I", "getText", "getTitle1000", "app_debug"})
public final class Notes {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "text")
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title1000 = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Time")
    private final java.lang.String Time = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cal")
    private final java.lang.String DateEn = null;
    @androidx.room.ColumnInfo(name = "check")
    private boolean checkbox;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    
    public Notes(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String title1000, @org.jetbrains.annotations.NotNull()
    java.lang.String Time, @org.jetbrains.annotations.NotNull()
    java.lang.String DateEn, boolean checkbox, int id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle1000() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateEn() {
        return null;
    }
    
    public final boolean getCheckbox() {
        return false;
    }
    
    public final void setCheckbox(boolean p0) {
    }
    
    public final int getId() {
        return 0;
    }
}