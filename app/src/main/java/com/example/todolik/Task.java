package com.example.todolik;

public class Task {

    private String _content;
    private Boolean _status;

    public Task(String content, Boolean status) {
        _content = content;
        _status = status;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public Boolean get_status() {
        return _status;
    }

    public void set_status(Boolean _status) {
        this._status = _status;
    }
}
