public class bank_transation {
    String accountname;
    String accountholder;
    String accounttype;
    int accountnumber;
    double balance;
    

    public bank_transation(String accountname,String accountholder,String accounttype,int accountnumber,double balance){
        this.accountname=accountname;
        this.accountholder=accountholder;
        this.accounttype=accounttype;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public void display(){
        System.out.println("account name is:"+accountname);
        System.out.println("account holder name:"+accountholder);
        System.out.println("account type:"+accounttype);
        System.out.println("account number:"+accountnumber);
        System.out.println("account balance:"+balance);
    }
    public static void main(String[] args) {
        bank_transation transation=new bank_transation("canara","kavya","saving",3588,85858.85);
        transation.display();

}

}
