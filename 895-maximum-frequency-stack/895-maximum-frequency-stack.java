class FreqStack {
    HashMap<Integer,LinkedList<Integer>> st;
    HashMap<Integer,Integer> fmap;
    int maxFreq=0;
    public FreqStack() {
        st=new HashMap<>();
        fmap=new HashMap<>();
        maxFreq=0;
    }
    public void push(int val) {
        int cfreq = fmap.getOrDefault(val,0);
        cfreq++;
        fmap.put(val,cfreq);
        if(st.containsKey(cfreq)==false)
        {
            st.put(cfreq,new LinkedList<Integer>());
        }
        st.get(cfreq).addFirst(val);
        maxFreq = Math.max(maxFreq,cfreq);
    }
    public int pop() {
        int ans = st.get(maxFreq).removeFirst();
        int cfreq = fmap.get(ans);
        cfreq--;
        fmap.put(ans,cfreq);
        if(st.get(maxFreq).size()==0)
        {
            maxFreq--;
        }
        return ans; 
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */