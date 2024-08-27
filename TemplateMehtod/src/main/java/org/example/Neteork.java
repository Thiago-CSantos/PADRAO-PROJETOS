package org.example;

public abstract class Neteork {
    protected String userName;
    protected String password;

    public Boolean post(String message){
        if(logIn(this.userName, this.password)){
            logOut();
            return sendData(message.getBytes());
        }
        return false;
    }

    public abstract boolean logIn(String userName, String password);
    public abstract boolean sendData(byte data[]);
    public abstract void logOut();
}
