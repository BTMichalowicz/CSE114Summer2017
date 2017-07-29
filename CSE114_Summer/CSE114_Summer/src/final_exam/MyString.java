package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class MyString {

    private char[] value;
    private int length;

    public char[] getValue() {
        return value;
    }

    public void setValue(char[] value) {
        this.value = value;
    }

    public MyString() {
        this.length = 0;
        this.value = new char[1];
        value[0] = ' ';
    }

    public MyString(char[] value) {
        this.value = value;
        this.length = value.length;
        for (char c : value) {
            c = ' ';
        }
    }

    public int getLength() {
        return this.length;
    }

    public char charAt(int idx) {
        try {
            return this.value[idx];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Bad index");
        }

    }

    public MyString substring(int start, int end) {
        char[] res = new char[end - start];

        for (int i = 0, j = start; i < res.length && j <= end; j++, i++) {

            res[i] = this.value[j];
        }

        return new MyString(res);
    }

    public int indexOf(MyString ms) {

        if (this.value.length == 0 || ms.value.length == 0) {
            return -1;
        }

        /* If subarray is larger than large array then not found */
        if (ms.value.length > this.value.length) {
            return -1;
        }

        boolean subFound;

        int i, j;
        for (i = 0, j = 0; i < this.value.length; i++) {
            if (this.value[i] == ms.value[0]) {
                subFound = true;
                for (; j < ms.value.length; j++) {
                    if (this.value.length <= i + j || ms.value[j] != this.value[i + j]) {
                        subFound = false;
                        break;

                    }
                }
                if (subFound) {
                    return i;
                }
            }
        }

        return -1;
    }
    
    
    
    public int indexOf(MyString ms, int offset){
        
        if (this.value.length == 0 || ms.value.length == 0) {
            return -1;
        }

        /* If subarray is larger than large array then not found */
        if (ms.value.length > this.value.length) {
            return -1;
        }

        boolean subFound;

        int i, j;
        for (i = offset, j = 0; i < this.value.length; i++) {
            if (this.value[i] == ms.value[0]) {
                subFound = true;
                for (; j < ms.value.length; j++) {
                    if (this.value.length <= i + j || ms.value[j] != this.value[i + j]) {
                        subFound = false;
                        break;

                    }
                }
                if (subFound) {
                    return i;
                }
            }
        }

        return -1;
        
    }
    
    
    
    public  void concatEnd(MyString ms){
        
        char[] res = new char[this.value.length + ms.value.length];
        
        System.arraycopy(this.value, 0, res, 0, this.value.length);
        
        for(int i = this.value.length, j = 0; i<res.length && j<ms.value.length; i++, j++){
            res[i] = ms.value[j];
        }
        
        this.setValue(res);
        this.length = res.length;
        
        
    }
    
    
    public void concatBeg(MyString ms){
        
        char[] res = new char[this.value.length + ms.value.length];
        
        for(int i = 0; i<ms.value.length; i++){
            res[i] = ms.value[i];
        }
        
        for(int j = ms.value.length, i = 0; j<res.length && i< this.value.length; i++,j++){
            res[j] = this.value[i];
        }
        
        this.setValue(res);
        this.length = res.length;
    }
    
    
    public void print(){
        
        for(char c: this.value){
            System.out.print(c);
        }System.out.println();
    }
    
    public static void main(String[] args) {
        char[] chars = {'H','e','l','l','o','W','o','r','l','d','!'};
        
        MyString test = new MyString(chars);
        
        System.out.println(test.getLength());
        
        test.print();
        
        
        test.concatBeg(new MyString(new char[]{'D','r','u','m','s','.','.','.'}));
        test.print();
    }

}
