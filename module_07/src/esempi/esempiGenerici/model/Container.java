package esempi.esempiGenerici.model;

public class Container<T,S> {

    private T myTGenericVariable;
    private S mySGenericVariable;

    public Container(T myTGenericVariable, S mySGenericVariable) {
        this.myTGenericVariable = myTGenericVariable;
        this.mySGenericVariable = mySGenericVariable;
    }

    public T getMyTGenericVariable() {
        return myTGenericVariable;
    }

    public void setMyTGenericVariable(T myTGenericVariable) {
        this.myTGenericVariable = myTGenericVariable;
    }

    public S getMySGenericVariable() {
        return mySGenericVariable;
    }

    public void setMySGenericVariable(S mySGenericVariable) {
        this.mySGenericVariable = mySGenericVariable;
    }

    @Override
    public String toString() {
        return "Container{" +
                "myTGenericVariable=" + myTGenericVariable +
                ", mySGenericVariable=" + mySGenericVariable +
                '}';
    }
}
