package bank_details;

public class bank_transation {
    String accountname;
    String accountholder;
    String accounttype;
    int accountnum;
    double balance;

    public bank_transation(String accountname,String accountholder,String accounttype,int accountnum,double balance){
      this.accountname=accountname;
      this.accountholder=accountholder;
      this.accounttype=accounttype;
      this.accountnum=accountnum;
      this.balance=balance;
    }
    public void display(){
        System.out.println("account name:"+accountname);
        System.out.println("account holdername:"+accountholder);
        System.out.println("account type:"+accounttype);
        System.out.println("account number:"+accountnum);
        System.out.println("account balance:"+balance);
    }
    public static void main(String[] args) {
        bank_transation transation=new bank_transation("canara","kavya","saving",3588, 53488.90);
        transation.display();
    }


    }

    


