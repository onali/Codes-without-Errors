package com.example;
import java.util.Collection;
import java.util.Iterator;

public class GenericListVersion2 implements Iterable{

    private static final int DEFAULT_CAP = 10;
    private Object[] iValues;
    private int iSize;

    private class GenericListIterator implements Iterator{
        private int position;
        private boolean removeOK;

        private GenericListIterator(){
            position = 0;
            removeOK = false;
        }

        public boolean hasNext(){
            return position < iSize;
        }

        public Object next(){
            Object result = iValues[position];
            position++;
            removeOK = true;
            return result;
        }

        public void remove(){
            if( !removeOK )
                throw new IllegalStateException();
            // which element should be removed??
            removeOK = false;
            GenericListVersion2.this.remove(position - 1);
            position--;
        }
    }

    public Iterator iterator(){
        return new GenericListIterator();
    }

    public void addAll(Collection c){
        // for each loop
        for(Object obj : c){
            this.add(obj);
        }
    }

    public void add(Object x){
        insert(iSize, x);
    }

    public Object get(int pos){
        return iValues[pos];
    }

   
    public void insert(int pos, Object obj){
        ensureCapcity();
        for(int i = iSize; i > pos; i--){
            iValues[i] = iValues[i - 1];
        }
        iValues[pos] = obj;
        iSize++;
    }

    public Object remove(int pos){
        Object removedValue = iValues[pos];
        for(int i = pos; i < iSize - 1; i++)
            iValues[i] = iValues[i + 1];
        iValues[iSize - 1] = null;
        iSize--;
        return removedValue;
    }

    private void ensureCapcity(){
        // is there extra capacity available?
        // if not, resize
        if(iSize == iValues.length)
            resize();
    }

    public int size(){
        return iSize;
    }

    // resize internal storage container by a factor of 2
    private void resize() {
        Object[] temp = new Object[iValues.length * 2];
        System.arraycopy(iValues, 0, temp, 0, iValues.length);
        iValues = temp;
    }

    public String toString(){
        // we could make this more effecient by using a StringBuffer.
        // See alternative version
        String result = "size: " + iSize + ", elements: [";
        for(int i = 0; i < iSize - 1; i++)
            result += iValues[i].toString() + ", ";
        if(iSize > 0 )
            result += iValues[iSize - 1];
        result += "]";
        return result;
    }

    // Would not really have this and toString available
    // both included just for testing
    public String toStringUsingStringBuffer(){
        StringBuffer result = new StringBuffer();
        result.append( "size: " );
        result.append( iSize );
        result.append(", elements: [");
        for(int i = 0; i < iSize - 1; i++){
            result.append(iValues[i]);
            result.append(", ");
        }
        if( iSize > 0 )
            result.append(iValues[iSize - 1]);
        result.append("]");
        return result.toString();
    }

   
    public GenericListVersion2(){
        //redirect to single int constructor
        this(DEFAULT_CAP);
        //other statments could go here.
    }

    
    public GenericListVersion2(int initialCap) {
        assert initialCap > 0 : "Violation of precondition. IntListVer1(int initialCap):"
                + "initialCap must be greater than 0. Value of initialCap: " + initialCap;
        iValues = new Object[initialCap];
        iSize = 0;
    }

  
    public boolean equals(Object other){
        boolean result;
        if(other == null)
            // we know this is not null so can't be equal
            result = false;
        else if(this == other)
            // quick check if this and other refer to same IntList object
            result = true;
        else if( this.getClass() != other.getClass() )
            // other is not an IntList they can't be equal
            result = false;
        else{
            // other is not null and refers to an IntList
            GenericListVersion2 otherList = (GenericListVersion2)other;
            result = this.size() == otherList.size();
            int i = 0;
            while(i < iSize && result){
                result = this.iValues[i].equals( otherList.iValues[i] );
                i++;
            }
        }
        return result;
    }

}

