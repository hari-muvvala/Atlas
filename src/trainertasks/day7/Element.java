package day7;

public enum Element{
    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    NE("Neon", 10, 20.180f);

    private final String label;
    private final int atomicNumber;
    private final float atomicWeight;

    Element(String label, int atomicNumber, float atomicWeight){
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getLabel(){
        return label;
    }

    public int getAtomicNumber(){
        return atomicNumber;
    }

    public float getAtomicWeight(){
        return atomicWeight;
    }
}