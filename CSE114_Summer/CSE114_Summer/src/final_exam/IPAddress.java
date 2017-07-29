package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class IPAddress {
    
    private int intIP;
    
    public IPAddress(int intIP)throws Exception{
        setIntIP(intIP);
    }
    
    public int getIntIP(){
        return intIP;
    }
  
    public IPAddress(byte[] bytes) throws Exception{
        
        setIntIP(bytes);
    }
    
    public void setIntIP(int intIP){
        this.intIP = intIP;
        System.out.println("IP As a single int: " + this.intIP);
    }
    
    public void setIntIP(byte[]bytes) throws Exception{
        if(bytes.length!=4){
            throw new IllegalArgumentException("Not a valid IP Address");
            
        }else{
            
            this.intIP= extractIPAsInt(bytes);
            System.out.println("IP As a single int: " + this.intIP);
        }
    }
    
    
    public int extractIPAsInt(byte[] bytes){
        
        int res = ((bytes[0]*256 + bytes[1])*256+bytes[2])*256+bytes[3];
        
        System.out.println("IP As a single int: " + res);
        return res;
        
    }
    
    
    public byte[] getIPAddress(){
        
        byte[] bytes = new byte[4];
        
        bytes[3] = (byte)(intIP%256);
        int rem = intIP/256;
        
        bytes[2] = (byte)(rem%256);
        rem/=256;
        
        bytes[1] = (byte)(rem%256);
        rem/=256;
        bytes[0] = (byte)(rem);
        
        System.out.println("IP Address: " + bytes[0]+"."+bytes[1]+"."+bytes[2]+"."+bytes[3]);
        
        return bytes;
    }
    
    public static void main(String[] args) {
        
        try{
            IPAddress ip1 = new IPAddress(839391569);
            byte[] bs = ip1.getIPAddress();
            
            IPAddress ip2 = new IPAddress(bs);
            ip1.getIPAddress();
            ip2.getIPAddress();
            byte[] bs2 = {50, 8, 25, 82};
            
            ip1.setIntIP(bs2);
            ip2.setIntIP(bs2);
            ip1.getIPAddress();
            ip2.getIPAddress();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
