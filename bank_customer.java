package bank_details;

public class bank_customer {
    String custname;
    int custid;
    String custaddress;

    public bank_customer(String custname,int custid,String custaddress){
        this.custname=custname;
        this.custid=custid;
        this.custaddress=custaddress;
    }
    public void display(){
        System.out.println("customer name is:"+custname);
        System.out.println("customer id is:"+custid);
        System.out.println("customer name is:"+custaddress);
    }
    public static void main(String[] args) {
        bank_customer cust=new bank_customer("nitra",3588,"hubli");
        cust.display();

        
    }

}
