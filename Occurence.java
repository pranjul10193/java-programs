class  Occurence{
	public static void main(String[] args) {
		int len=args.length;
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(args[i]=="7")
			{
				count++;
			}
		
		}
		System.out.println("the number of occurence of 7 is" + count);

	}
}