//
//public abstract class Price1 {
//		abstract int getPriceCode();
//		//子类都可能用到这个方法，那么在变量定义的时候就定成这个抽象类，就都可以使用这个getCharge方法了。
//		double getCharge(int daysRented){
//			
//			double result=0;
//			switch(getPriceCode()){
//			case Movie.REGULAR:
//				result+=2;
//			 if(daysRented>2)
//				 result+=(daysRented-2)*1.5;
//			  break;
//			case Movie.NEW_RELEASE:
//				result+=daysRented*3;
//				break;
//			case Movie.CHILDRENS:
//				result+=1.5;
//				if(daysRented>3)
//					result+=(daysRented-3)*1.5;
//				break;
//			
//		     }
//			
//			return result;
//		   }//
//}
//
//class ChildrensPrice extends Price1{
//	
//	int getPriceCode(){
//		
//		return Movie1.CHILDRENS;
//	}
//	
//	
//	
//}
//
//class NewReleasePrice extends Price1{
//	
//	int getPriceCode(){
//		return Movie1.NEW_RELEASE;
//	}
//}
//
//class RegularPrice extends Price1{
//	int getPriceCode(){
//		return Movie1.REGULAR;
//	}
//}
