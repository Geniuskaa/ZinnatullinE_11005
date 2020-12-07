package TransportProject;

public abstract class Transport {
    public TypeOfTransport typeOfTransport;

    Transport(TypeOfTransport typeOfTransport){
        this.typeOfTransport = typeOfTransport;
    }
    public abstract void display();

    public abstract int getSpeed();

    public abstract void setStatus(boolean value);

}
