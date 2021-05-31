package main;

public class BookAdapter extends Book {
    protected IncompatibleBook obj = new IncompatibleBook();
    public void setTitleString(String aString) {obj.setTitle(aString);}
    public String getTitleString() {return obj.getTitle();}
}
