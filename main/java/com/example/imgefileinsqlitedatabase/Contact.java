package com.example.imgefileinsqlitedatabase;

public class Contact {

    int _id;
    String _fname;
    byte[] _img;

    public Contact(String _fname, byte[] _img) {
        this._fname = _fname;
        this._img = _img;
    }

    public Contact(int _id, String _fname, byte[] _img) {
        this._id = _id;
        this._fname = _fname;
        this._img = _img;
    }

    public Contact() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_fname() {
        return _fname;
    }

    public void set_fname(String _fname) {
        this._fname = _fname;
    }

    public byte[] get_img() {
        return _img;
    }

    public void set_img(byte[] _img) {
        this._img = _img;
    }
}
