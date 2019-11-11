
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("1、添加----------------");
         add();
         System.out.println("2、删除----------------");
         remove();
         System.out.println("3、修改----------------");
         alter();
	}
	public static void add() {
		StringBuffer sb=new StringBuffer();
		sb.append("184805080 周芸芸 女;184805054 李孟可 女;184805079 赵哓哓 女;");
		System.out.println("append添加结果："+sb);
		sb.insert(0,"164801000 张三 男;");
		System.out.println("insert添加结果："+sb);
	}
	public static void remove() {
		StringBuffer sb=new StringBuffer();
		sb.delete(0,8);
		System.out.println("删除指定位置结果："+sb);
		sb.deleteCharAt(5);
		System.out.println("删除指定位置结果："+sb);
		sb.delete(0,sb.length());
		System.out.println("清空缓冲区结果："+sb);
	}
	public static void alter() {
		StringBuffer sb=new StringBuffer();
		sb.setCharAt(1,'7');
		System.out.println("修改指定位置字符结果："+sb);
		sb.replace(4,5,"45");
		System.out.println("替换删除指定位置字符结果："+sb);
		System.out.println("字符串翻转结果："+sb.reverse());
	}

}
