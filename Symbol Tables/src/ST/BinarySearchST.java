package ST;
class BinarySearchST<String, Integer>{
	private String[] keys;
    private Integer[] vals;
    private int n;
    public int size() {
        return n;
    }
    public void put(String key, Integer val) {
        int i = rank(key);
        if (i < n && ((Comparable) keys[i]).compareTo(key) == 0) {
            vals[i] = val;
            return;
        }
        for (int j = n; j > i; j--) {
            keys[j] = keys[j - 1];
            vals[j] = vals[j - 1];
        }
        keys[i] = key;
        vals[i] = val;
        n++;
    }
    public int rank(String key) {
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = ((Comparable) key).compareTo(keys[mid]);
            if (cmp < 0) {
                hi = mid - 1;
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public Integer get(String key) {
        if (isEmpty()) {
            return null;
        }
        int i = rank(key);
        if (i < n && ((Comparable) keys[i]).compareTo(key) == 0) {
            return vals[i];
        } else {
            return null;
        }
    }
    public String floor(String key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        int i = rank(key);
        if (i < n && ((Comparable) key).compareTo(keys[i]) == 0) {
            return keys[i];
        }
        if (i == 0) {
            return null;
        } else {
            return keys[i - 1];
        }
    }
    
    public String max() {
        return keys[n - 1];
    }
    public boolean contains(String key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }
    public String key;
   
	public String[] keys() {
		// TODO Auto-generated method stub
		return keys;
	}
	public void delete(String key) {
		if(key==null) throw new IllegalArgumentException("not found");
		int i=rank(key);
		if(i==n||((Comparable) keys[i]).compareTo(key)!=0) {
			return;
		}
		for(int j=i;j<n-1;j++) {
			keys[j]=keys[j+1];
			vals[j]=vals[j+1];
			
		}
		n--;
		keys[n]=null;
		vals[n]=null;
		
	}
	public void deleteMin() {
		return ;
	}
	public void deleteMax() {
		return ;
		
	}
}
