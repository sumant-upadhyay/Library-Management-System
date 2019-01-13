
 public class Library {
	private int issue;
	private int submit;
	private int renew;
	private int add;
	private String remove;
	Book b = new Book();
	Library(int issue,int submit,int renew,int add,String remove)
	{
		this.issue=issue;
		this.submit=submit;
		this.renew=renew;
		this.add=add;
		this.remove=remove;
	}
	int getUpdate()
	{
		return b.quantity;
	}
	void setUpdate(int Quantity)
	{
		b.quantity=Quantity;
		
    }
	void show()
	{
		System.out.println("book has issues =" +this.issue);
		System.out.println("book has submited =" +this.submit);
		System.out.println("book has renewed =" +this.renew);
		System.out.println("delete book in system=" +this.remove);
	}
}

