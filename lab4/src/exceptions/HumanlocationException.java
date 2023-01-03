package exceptions;

public class HumanlocationException extends Exception{
    private String name;
    public String getName(){
        return name;
    }
    public HumanlocationException(String message, String name){
        super(message);
        this.name = name;
    }
}
