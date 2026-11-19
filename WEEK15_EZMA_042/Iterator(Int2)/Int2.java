class Int2 {
    private int i;
    
    public Int2(int i) { 
        this.i = i; 
    }
    
    public void increment() { 
        this.i++; 
    }
    
    @Override
    public String toString() { 
        return "i = " + i; 
    }
}