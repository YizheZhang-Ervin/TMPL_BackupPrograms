 class SumException extends Exception{
 	public SumException(){}
 	public SumException(String msg){super(msg);}
 }

public class arrayloopexceptiontest{
	public static void test(int x) throws SumException{
		if(x==4) throw new SumException("ahaha");
	}
	public static void main(String[] args){
		try{
			int[] i={1,2,3,4,5};
			for(int x=0;x<8;x++)
			{
				System.out.print(i[x]);
				test(x);
			}

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("IndexBoundsError");
		}catch(SumException s){
			System.out.print("SumError");
		}finally{
		System.out.print("????");
		}
	}
}